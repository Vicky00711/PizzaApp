package PizzaTypes;

import java.util.ArrayList;
import java.util.List;

import Sauce.Sauces;
import Sizes.SizeOfPizza;
import Toppings.Toppings;

/**
 * Abstract class created named PizzaType
 * @author prateeksahoo
 * @version 30/03/2024
 */
public abstract class PizzaType {
	protected List<Toppings> topping = new ArrayList<>();
	 protected SizeOfPizza size;
	 protected Sauces sauce;
	
	
	
	/**
	 * Constructor which takes three parameters list of toppings, toppingStyle and the type of sauce.
	 * @param topping determines what kind of toppings the user wants.
	 * @param size determines the size of the pizza
	 * @param sauce determines what kind of sauce the user wants.
	 */
	public PizzaType(List<Toppings> topping, SizeOfPizza size, Sauces sauce) {
		this.topping = topping;
		this.size=size;
		this.sauce = sauce;
	}
	
	
	/**
	 * Constructor which takes one parameter which is toppingStyle.
	 * @param size determines the size of the pizza
	 */
	public PizzaType(SizeOfPizza size) {
		
		this.size=size;
	}
	
	/**
	 * Constructor which takes two parameters list of toppings and toppingStyle.
	 * @param topping determines what kind of toppings the user wants.
	 * @param size determines the size of the pizza.
	 */
	public PizzaType(List<Toppings> topping, SizeOfPizza size) {
		this.topping = topping;
		this.size=size;
	}
	
	/**
	 * Constructor which takes in two parameters size and sauce.
	 * @param size size determines the size of the pizza
	 * @param sauce determines what kind of sauce the user wants.
	 */
	public PizzaType(SizeOfPizza size, Sauces sauce) {
		this.sauce=sauce;
		this.size=size;
	}
	
	/**
	 * Constructor which takes one parameter which is list of toppings.
	 * @param topping determines what kind of toppings the user wants.
	 */
	public PizzaType(List<Toppings> topping) {
		this.topping = topping;
		
	}
	/**
	 * Constructor which takes only one parameter which is sauce.
	 * @param sauce determines what kind of sauce the user wants.
	 */
	public PizzaType(Sauces sauce) {
		this.sauce = sauce;
		
	}
	
	/**
	 * Constructor which takes two parameters one is list of toppings and other is the sauce.
	 * @param topping determines what kind of toppings the user wants.
	 * @param sauce determines what kind of sauce the user wants.
	 */
	public PizzaType(List<Toppings> topping, Sauces sauce) {
		this.topping = topping;
		this.sauce=sauce;
	}
	/**
	 * Returns a string size of the pizza.
	 * @return String 
	 */
	public String getSizeOfPizza() {
		if (size==null) {
			throw new IllegalArgumentException( "No size of pizza specified");
		}
		return size.getSize();
	};
	
	/**
	 * Returns a string sauce.
	 * @return String
	 */
	public String getSauce() {
		// TODO Auto-generated method stub
		if (sauce==null) {
			throw new IllegalArgumentException( "No sauce specified");
		}
		return sauce.getSauce();
	}
	
	/**
	 * Returns a list of Toppings.
	 * @return List
	 */
	public List<Toppings> getToppings() {
		// TODO Auto-generated method stub
		if (topping==null || topping.isEmpty()) {
			throw new IllegalArgumentException( "No toppings specified");
		}
		return topping;
	}
	
	/**
	 * Returns a String name of the pizza type.
	 * @return String
	 */
	 public String getNameofPizza() {
		 return null;
	 };
	
	/**
	 * Returns a String type of dough.
	 * @return String 
	 */
	 public String getNameOfDough() {
		 return null;
	 };
}
