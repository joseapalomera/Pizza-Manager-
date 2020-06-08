package ingredients;

import mainClasses.Money;

/**
 * Child class of the Cheese subclass that also calls the constructor 
 * of the superclass to help initialize the instance variables
 * @author josea.palomera
 *
 */
public class Mozzarella extends Cheese{

	public Mozzarella(String description, Money cost, int calorieCount) {
		super(description, cost, calorieCount);
		// TODO Auto-generated constructor stub
	}

}
