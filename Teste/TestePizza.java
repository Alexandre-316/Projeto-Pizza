import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import org.junit.Before;
/*
 Alexandre Luís Nunes Cardiga 
 Testes para a classe Pizza
 */

public class TestePizza {
	/*zera o registro dos ingredientes */
	@Before
	public void limparRegPizza() {
		Pizza.zeraIngredientes();
	}

	/*verificar valor da pizza está OK cfe a qtd dos ingredientes*/
	@Test
	public void test() {
		Pizza Pizza1 = new Pizza();
		
		Pizza1.adicionaIngrediente("Queijo");
		Pizza1.adicionaIngrediente("Cebola");
		Pizza1.adicionaIngrediente("Orégano");
		Pizza1.adicionaIngrediente("Presunto");
		Pizza1.adicionaIngrediente("Bacon");
		
		assertEquals(5, Pizza1.getIngrediente().size());
	}
	
	/*Verificar tbm se registro de ingredientes está OK */
	@Test
	public void testIngredientes() {
		Pizza Pizza2 = new Pizza();
		
		Pizza2.adicionaIngrediente("Queijo");
		Pizza2.adicionaIngrediente("Cebola");
		Pizza2.adicionaIngrediente("Orégano");
		Pizza2.adicionaIngrediente("Presunto");
		Pizza2.adicionaIngrediente("Bacon");
		
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.addAll(Pizza2.getIngrediente());
		
		assertEquals(ingredientes, Pizza2.getIngrediente());
	}
	

}
