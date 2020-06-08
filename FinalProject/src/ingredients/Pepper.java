package ingredients;

import java.awt.Color;

import mainClasses.Money;

/**
 * Child class of the Vegetable subclass that also calls from the 
 * superclass constructor to help initialize variables
 * @author josea.palomera
 *
 */
public class Pepper extends Vegetable{

	public Pepper(String description, Money cost, int calorieCount) {
		super(description, cost, calorieCount);
		// TODO Auto-generated constructor stub
	}

	public Pepper(String description, Money cost, int calorieCount, Color color) {
		super(description, cost, calorieCount, color);
	}
	
}
