package ingredients;

import mainClasses.*;
/**
 * This is a basic Ingredient superclass that holds a string representation,
 * cost and calorie count for the ingredient.
 * @author josea.palomera
 *
 */
public class Ingredient implements Comparable{

	public final String description;
	public final Money cost;
	public final int calorieCount;
	
	/**
	 * Basic constructor that initializes the description, cost, and calorie count
	 * of the class
	 * @param description
	 * @param cost
	 * @param calorieCount
	 */
	public Ingredient(String description, Money cost, int calorieCount) {
		this.description = description;
		this.cost = new Money(cost);
		this.calorieCount = calorieCount;
	}

	@Override
	/**
	 * This method compares two ingredient objects by the cost of each
	 * and returns which ingredient is worth more
	 */
	public int compareTo(Object o) throws PizzaException{
		// TODO Auto-generated method stub
		if(!(o instanceof Ingredient) || o == null) {
			throw new PizzaException("Not an ingredient");
		}
		
		Ingredient other = (Ingredient) o;
		
		return this.cost.compareTo(other.cost);
	} //based on cost

	/**
	 * Basic toString that prints out the description, then cost, and then calorie count of the ingredient
	 */
	public String toString() {
		return "[Ingredient: " + this.description + ": " + this.cost + ": " + this.calorieCount + " calories]";
	}
	
}
