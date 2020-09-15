import static org.junit.Assert.*;

import org.junit.Test;

/*
Alexandre Luís Nunes Cardiga 
Testes para a classe CarrinhoDeCompras
*/

public class TesteCarrinhoDeCompras {
	/*
	 * Teste se o preço das pizzas são somados corretamente.
	 */
	@Test
	public void testVerificarPreco() {
		Pizza Pizza1 = new Pizza();

		Pizza1.adicionaIngrediente("Queijo");
		Pizza1.adicionaIngrediente("Cebola");
		Pizza1.adicionaIngrediente("Orégano");
		Pizza1.adicionaIngrediente("Presunto");
		Pizza1.adicionaIngrediente("Bacon");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaCarrinho(Pizza1);

		assertEquals(20.0, carrinho.getPrecoTotal(), 0);
	}

	/*Testa pizza sem ingredientes */
	@Test
	public void testIngredientesVazio() {
		Pizza pedidoPizza1 = new Pizza();

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionaCarrinho(pedidoPizza1);

		assertEquals(0, carrinho.getPrecoTotal(), 0);
	}

	
	

}
