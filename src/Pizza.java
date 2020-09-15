import java.util.HashMap;
import java.util.Map;
/*Alexandre Luís Nunes Cardiga */

import java.util.ArrayList;

public class Pizza {
	private double preco;
	public static int totalIngredientes=0;
	private ArrayList <String>  ingrediente = new ArrayList<String>();
	public static Map <String, Integer> mapaIngredientes = new HashMap <String, Integer> ();
	
	public ArrayList<String> getIngrediente()
	{
		return ingrediente;
	}
	
	public static Map<String, Integer>  getListaIngredientes()
	{
		return   mapaIngredientes;
	}
	
	public static void contabilizaIngrediente(String ingrediente)
	{  // System.out.println(ingrediente);
	
		   if (mapaIngredientes.containsKey(ingrediente))
		    {
			  int value = mapaIngredientes.get(ingrediente);
			  mapaIngredientes.put(ingrediente, value+1);	
			}
		   else
		    {
			  mapaIngredientes.put(ingrediente, 1);
		    }
		   totalIngredientes++;		   
				 
	}
	
	public void adicionaIngrediente (String ingrediente)
	{   if (ingrediente != "")
	       {
		    this.ingrediente.add(ingrediente);
		    contabilizaIngrediente(ingrediente);
	       }
	    else
	       {
	    	System.out.println("ATENÇÃO: Não foi informado ingrediente  ");
	    	
	       }
		
	}
	
	public double getPreco ()
	{   double numero_ingredientes = ingrediente.size();
	    if (numero_ingredientes > 5)
	       {preco = 23;}
	    else if (numero_ingredientes >= 3)
	       {preco = 20;}
	    else if (numero_ingredientes <= 2)
	       {preco = 15;}	
	
	return preco;
	}
	
	public static void zeraIngredientes(){
		totalIngredientes = 0;
	}
}
