package Sauce;




/**
 * Concrete class created as alfredo Sauce which implements the interface class sauces.
 * @author Prateek
 * @version 30/03/2024
 * 
 
 */
public class AlfredoSauce implements Sauces{
	
	/**
	 * Default constructor used when no parameter is passed.
	 */
	public AlfredoSauce() {
		
	}
/*
 * Method created called get Sauce, which returns the string Alfredo Sauce.
 * @return Name of the sauce. 
 * 
 */
	@Override
	public String getSauce() {
		// TODO Auto-generated method stub
		return "Alfredo";
	}

}
