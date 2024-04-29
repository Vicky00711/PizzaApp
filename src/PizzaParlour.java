import java.util.ArrayList;
import java.util.List;

import PizzaTypes.NeapolitanPizzaStyle;
import Sauce.AlfredoSauce;
import Sizes.LargeSizePizza;
import Sizes.SmallSizePizza;
import Toppings.Margherita;
import Toppings.Onions;
import Toppings.Toppings;
import Toppings.VeganMozarella;

/**
 * Class named pizza parlour where user gives order to create pizza
 */
public class PizzaParlour {
	
	/**
	 * Default parameter used when no parameter is passed.
	 */
	public PizzaParlour() {
		
	}

	/**
	 * Main method which takes array of Strings as an argument.
	 * @param args determines the String array.
	 */
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		 List<Toppings> topping1 = new ArrayList<>();
	        topping1.add(new VeganMozarella());
	        topping1.add(new Onions());

	        NeapolitanPizzaStyle pizza1 = new NeapolitanPizzaStyle(topping1, new LargeSizePizza(), new AlfredoSauce());
	        PizzaMaker pizzamake1 = new PizzaMaker(pizza1);
	        pizzamake1.createPizza();

	        List<Toppings> topping2 = new ArrayList<>();
	        topping2.add(new Margherita());
	        topping2.add(new Onions());

	        NeapolitanPizzaStyle pizza2 = new NeapolitanPizzaStyle(topping2, new SmallSizePizza(), new AlfredoSauce());
	        PizzaMaker pizzamake2 = new PizzaMaker(pizza2);
	        pizzamake2.createPizza();
		
		
		
		
		
		

	}

}
