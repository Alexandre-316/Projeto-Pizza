/*Alexandre Luís Nunes Cardiga */

import java.util.ArrayList;

public class CarrinhoDeCompras {
	private double precoTotal =0;	
	private ArrayList <Pizza> ListaPizzas = new ArrayList <Pizza>();
	
	public void adicionaCarrinho(Pizza pizza)
 	{
 		if (pizza.getIngrediente().isEmpty()){}
 		else
 		ListaPizzas.add(pizza);
 		
	}
	
	public int totalPizzas()
	{
	
		return ListaPizzas.size();
	}
	
	public double getPrecoTotal()
	{
		for(int j=0; j< ListaPizzas.size(); j++)
		{
			precoTotal += ListaPizzas.get(j).getPreco();	
		}
		return precoTotal;
	}
}
