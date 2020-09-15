/* Alexandre Luís Nunes Cardiga */

public class Principal {

	public static void main(String[] args) {
		Pizza pizza1 = new Pizza();
		Pizza pizza2 = new Pizza();
		Pizza pizza3 = new Pizza();	
		// Cria 3 pizzas com ingredientes diferentes
//		pizza1.adicionaIngrediente("Rucula");
//		pizza1.adicionaIngrediente("4 Queijos");
//		pizza1.adicionaIngrediente("Milho");

		
		pizza1.adicionaIngrediente("Tomate");
		pizza1.adicionaIngrediente("Atum");
		pizza1.adicionaIngrediente("Chocolate");
		pizza1.adicionaIngrediente("Milho");
		
		pizza2.adicionaIngrediente("Lombo Canadense");
		pizza2.adicionaIngrediente("Catupiry");
		pizza2.adicionaIngrediente("Muzarela");
		pizza2.adicionaIngrediente("Tomate");
		pizza2.adicionaIngrediente("Rucula");
		pizza2.adicionaIngrediente("Batata Palha");
		
		pizza3.adicionaIngrediente("");
		pizza3.adicionaIngrediente("");
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		// Adiciona essas Pizzas em um CarrinhoDeCompra
		carrinho.adicionaCarrinho(pizza1);
		carrinho.adicionaCarrinho(pizza2);
		carrinho.adicionaCarrinho(pizza3);
	
		// Imprimir total do CarrinhoDeCompra
		System.out.println("Total de pizzas no Carrinho de Compras: " +carrinho.totalPizzas());
		System.out.println("Total da compra: R$ " + carrinho.getPrecoTotal());
				
		// Imprimir quantidade utilizada de cada ingrediente
		System.out.println("Lista de ingredientes utilizados: \n" +Pizza.getListaIngredientes());
		

	}

}
