package ingredients;

import mainClasses.*;

/**
 * Subclass of the ingredient superclass that also calls the consturctor 
 * of the superclass to help initialize the instance variables
 * @author josea.palomera
 *
 */
public class Base extends Ingredient{

	public Base(String description, Money cost, int calorieCount) {
		super(description, cost, calorieCount);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
	}	
}
