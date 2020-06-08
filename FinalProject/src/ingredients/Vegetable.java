package ingredients;

import java.awt.Color;

import mainClasses.Money;

/**
 * A subclass of the Ingredient superclass that also calls from the 
 * superclass constructor to help initialize variables, and also 
 * give the vegetables a certain color
 * @author josea.palomera
 *
 */
public class Vegetable extends Ingredient{

	private Color veggieColor;
	
	/**
	 * Constructor that calls the superclass constructor to initialize
	 * basic variables
	 * @param description
	 * @param cost
	 * @param calorieCount
	 */
	public Vegetable(String description, Money cost, int calorieCount) {
		super(description, cost, calorieCount);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Also a basic constructor that does the same function as the one above, except
	 * by adding a color to the vegetable
	 * @param description
	 * @param cost
	 * @param calorieCount
	 * @param veggieColor
	 */
	public Vegetable(String description, Money cost, int calorieCount, Color veggieColor) {
		super(description, cost, calorieCount);
		setColor(veggieColor);
	}
	
	/**
	 * Setter for the color of the vegetable
	 * @param veggieColor
	 */
	public void setColor(Color veggieColor) {
		this.veggieColor = veggieColor;
	}
	
	/**
	 * Getter for the color of the vegetable
	 * @return
	 */
	public Color getColor() {
		return this.veggieColor;
	}
	
	/**
	 * Basic equals method that compares the colors of the vegetables
	 * to see if they are the same
	 */
	public boolean equals(Object o) {
		
		if(!(o instanceof Color) || o == null) {
			return false;
		}
		
		Vegetable other = (Vegetable) o;
		
		if(this.veggieColor == other.veggieColor) {
			return super.equals(other);
		}
		
		return false;
		
	}
	
	@Override
	/**
	 * Basic string representation of the vegetable that also prints
	 * out the color, plus the toString from the super class
	 */
	public String toString() {
		
		Color current = getColor();
		String colorWord = " ";
		
		//If else statements help establish which color of the vegetable it will be
		if(Color.BLACK.equals(current)) {
			colorWord = "Black";
		}else if(Color.RED.equals(current)) {
			colorWord = "Red";
		}else if(Color.YELLOW.equals(current)) {
			colorWord = "Yellow";
		}else if(Color.GREEN.equals(current)) {
			colorWord = "Green";
		}
		
		return ("Veggie Color: " + colorWord + " " + super.toString());
	}
	
	/*
	public static void main(String[] args) {
		Vegetable green = new Vegetable("Pepper", new Money(0,69), 50, Color.GREEN);
		System.out.println(green);
	}
	*/
	
}
