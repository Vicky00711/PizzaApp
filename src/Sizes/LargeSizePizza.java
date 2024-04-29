package Sizes;

/**
 * Concrete class named LargeSizePizza which implements SizeOfPizza interface.
 * @author prateeksahoo
 * @version 30/03/2024
 */
public class LargeSizePizza implements SizeOfPizza{

	/**
	 * Default constructor used when no parameter is passed.
	 */
	public LargeSizePizza() {
		
	}
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Large-12inch";
	}

}
