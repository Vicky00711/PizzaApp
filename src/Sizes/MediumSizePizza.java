package Sizes;

/**
 * Concrete class named MediumSizePizza which implements SizeOfPizza interface.
 * @author prateeksahoo
 * @version 30/03/2024
 */
public class MediumSizePizza implements SizeOfPizza {
	
	
	/**
	 * Default constructor used when no parameter is passed.
	 */
	public MediumSizePizza() {
		
	}
	
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Medium-10inch";
	}

}
