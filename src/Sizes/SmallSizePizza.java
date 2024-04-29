package Sizes;

/**
 * Cocnrete class named SmallSizePizza which implements SizeOfPizza interface.
 * @author prateeksahoo
 * @version 30/03/2024
 */
public class SmallSizePizza implements SizeOfPizza{

	/**
	 * Default constructor used when no parameter is passed.
	 */
	public SmallSizePizza() {
		
	}
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "Small-7inch";
	}

}
