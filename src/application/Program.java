package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		// Comparator, Expressão lambida
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		
		// expressão lambida (função anonima)
		/* o comp sera uma função que recebe  parametros de 2 argumentos(p1,p2) que recebe implementação(->) a função após
		 * a chave({), neste caso é o return  */
		Comparator<Product> comp = (p1,p2) ->{ // p1 e p2 leva (->) a implementação da função de return.
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) ;
		};
		/*OUTRA MANEIRA RESUMIDA
		 * Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) ;
		};*/
           
	     list.sort(comp);// sort() ordena elementos de uma  coleção e Arrays, 
                                       // em ordem natural ou a escolhadefinida por compatoTo(0).
	     /* MAIS RESUMIDA
	      * list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) ;);
	       e apaga Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()) ; */
		for (Product p : list) {
			System.out.println(p);
		}
   }
}

// SAÍDA
/*  Product [name=Notebook, price=1200.0]
    Product [name=Tablet, price=450.0]
    Product [name=TV, price=900.0]  */
