package Toppings;

/**
 * Concrete class named Bacon which implements MeatToppings interface.
 * @author prateeksahoo
 * @version 30/03/2024
 */
public class Bacon implements MeatToppings{

	/**
	 * Default constructor used when no parameter is passed.
	 */
	public Bacon() {
		
	}
	
	@Override
	public String getToppingName() {
		// TODO Auto-generated method stub
		return "Bacon";
	}

}
