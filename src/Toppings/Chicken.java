package Toppings;

/**
 * Concrete class named Chicken which implements MeatToppings interface.
 * @author prateeksahoo
 * @version 30/03/2024
 */
public class Chicken implements MeatToppings{

	/**
	 * Default constructor used when no parameter is passed.
	 */
	public Chicken() {
		
	}
	@Override
	public String getToppingName() {
		// TODO Auto-generated method stub
		return "Chicken";
	}

}
