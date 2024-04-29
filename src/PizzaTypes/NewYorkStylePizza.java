package PizzaTypes;

import java.util.List;

import Sauce.Sauces;
import Sizes.SizeOfPizza;
import Toppings.Toppings;

/**
 * Concrete class named NewYorkStylePizza which extends PizzaType abstract class.
 * @author prateeksahoo
 * @version 30/03/2024
 */
public class NewYorkStylePizza extends PizzaType{

	/**
	 * Constructor which takes two parameters list of toppings and toppingStyle.
	 * @param topping determines what kind of toppings the user wants.
	 * @param size determines the size of pizza
	 */
	public NewYorkStylePizza(List<Toppings> topping, SizeOfPizza size) {
		super(topping, size);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor which takes in two parameters size and sauce.
	 * @param size size determines the size of the pizza
	 * @param sauce determines what kind of sauce the user wants.
	 */
	public NewYorkStylePizza(SizeOfPizza size, Sauces sauce) {
		super(size, sauce);
	}
	
	/**
	 * Constructor which takes three parameters list of toppings, toppingStyle and the type of sauce.
	 * @param topping determines what kind of toppings the user wants.
	 * @param size determines the size of pizza
	 * @param sauce determines what kind of sauce the user wants.
	 */
	public NewYorkStylePizza(List<Toppings> topping, SizeOfPizza size, Sauces sauce) {
		super(topping, size, sauce);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor which takes one parameter which is toppingStyle.
	 * @param size determines the size of pizza.
	 */
	public NewYorkStylePizza( SizeOfPizza size) {
		super(size);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor which takes one parameter which is list of toppings.
	 * @param topping determines what kind of toppings the user wants.
	 */
	public NewYorkStylePizza(List<Toppings> topping) {
		super(topping);
		
	}
	/**
	 * Constructor which takes only one parameter which is sauce.
	 * @param sauce determines what kind of sauce the user wants.
	 */
	public NewYorkStylePizza(Sauces sauce) {
		super(sauce);
		
	}
	
	/**
	 * Constructor which takes two parameters one is list of toppings and other is the sauce.
	 * @param topping determines what kind of toppings the user wants.
	 * @param sauce determines what kind of sauce the user wants.
	 */
	public NewYorkStylePizza(List<Toppings> topping, Sauces sauce) {
		super(topping,sauce);
	}

	@Override
	public String getNameofPizza() {
		// TODO Auto-generated method stub
		return "New york-style";
	}
	public String getNameOfDough() {
		return "Thin crust";
	}
	

	
	

}
