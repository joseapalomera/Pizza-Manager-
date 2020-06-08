package ingredients;

import mainClasses.Money;

	/**
	 * Subclass of the ingredient superclass that also calls the consturctor 
	 * of the superclass to help initialize the instance variables
	 * @author josea.palomera
	 *
	 */
public class Cheese extends Ingredient{

	public Cheese(String description, Money cost, int calorieCount) {
		super(description, cost, calorieCount);
		// TODO Auto-generated constructor stub
	}

}
