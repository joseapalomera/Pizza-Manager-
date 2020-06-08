package ingredients;

import mainClasses.Money;

/**
 * Child class of the Meat subclass that also calls from the 
 * superclass constructor to help initialize variables
 * @author josea.palomera
 *
 */
public class Sausage extends Meat{

	public Sausage(String description, Money cost, int calorieCount) {
		super(description, cost, calorieCount);
		// TODO Auto-generated constructor stub
	}

}
