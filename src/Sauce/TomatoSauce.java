package Sauce;

/**
 * Concrete class created as tomato Sauce which implements the interface class sauces.
 * @author prateeksahoo
 * @version 30/03/2024
 */
public class TomatoSauce implements Sauces {

	/**
	 * Default constructor used when no parameter is used.
	 */
	public TomatoSauce() {
		
	}
	/**
	 * 
	 * @return it returns String tomato sauce.
	 */
	
	@Override
	public String getSauce() {
		// TODO Auto-generated method stub
		return "Tomato";
	}
	
}
