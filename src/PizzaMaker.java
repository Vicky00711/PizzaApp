import java.util.ArrayList;
import java.util.List;

import PizzaTypes.PizzaType;
import Toppings.Toppings;

/**
 * Class named PizzaMaker which has a single responsibility of creating pizza.
 * @author prateeksahoo
 * @version 30/03/2024
 */
public class PizzaMaker {
	protected PizzaType pizzaTypes;
	/**
	 * Constructor used when pizzaTypes is passed as a parameter.
	 * @param pizzaTypes type of pizza (NeapolitanPizzaStyle, SicilianPizzaStyle, NewYorkStylePizza)
	 */
	public PizzaMaker(PizzaType pizzaTypes) {
		this.pizzaTypes=pizzaTypes;
	}
	
	
	
	/**
	 * Method for creating the pizza.
	 */
	public void createPizza() {
		
	
		List<Toppings> topping= new ArrayList<>();
		System.out.println("Order received for " + pizzaTypes.getNameofPizza() + " with " );
		System.out.println();
		System.out.println("Toppings:");
		
		topping=pizzaTypes.getToppings();
		for(Toppings t:topping) {
			System.out.println(t.getToppingName());
		}
		
		System.out.println("\nSauce:");
		System.out.println(pizzaTypes.getSauce());	
		
		System.out.println("\nSize:");
		System.out.println(pizzaTypes.getSizeOfPizza());
		
		System.out.println("\nDough:");
		System.out.println(pizzaTypes.getNameOfDough());
		
		System.out.println("\nOrder ready:\n " +pizzaTypes.getNameofPizza()  + " pizza with variety of toppings." + "\n------------"  );
		
		
		}
}
