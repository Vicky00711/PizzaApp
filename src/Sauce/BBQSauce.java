package Sauce;

/**
 * Class represents BBQ sauce, which implements Sauce interface.
 * @author prateeksahoo
 * @version 30/03/2024
 */


public class BBQSauce implements Sauces {
	
	/**
	 * Default constructor used when no paramter is passed.
	 */
	public BBQSauce() {
		
	}
	
	/**
	 * 
	 * @return it returns String BBQ sauce.
	 */
	
	@Override
	public String getSauce() {
		// TODO Auto-generated method stub
		return "BBQ";
	}
	
}
