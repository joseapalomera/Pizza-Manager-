package shapes;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * This is a basic Circle class that extends from the shape class
 * and has all the necessary components of a Sqaure, like 
 * the radius and more
 * @author josea.palomera
 *
 */
public class Square extends Shape{
	
	private double side;	//Measured in inches
	private int height;	//Represents the height of the square (For JFrame)
	private int weight; //Represents the weight of the square (For JFrame)
	
	/**
	 * Basic constructor that initializes the side length, 
	 * and the x and y for the Square class
	 * @param x
	 * @param y
	 */
	public Square(int x, int y) {
		super(x,y);	
		this.height = 8;
		this.weight = 8;
		setSideLength(8);
	}
	
	/**
	 * Getter for the area of the sqaure
	 */
	public double getArea() {
		return this.side * this.side;
	}
	
	/**
	 * This is a basic draw function that when used in the JFrame, will 
	 * draw out a Sqaure
	 */
	public void draw(Graphics g) {
		Graphics g2d = (Graphics2D)g;
		
		g2d.setColor(Color.CYAN);
		for(int i = 0; i < 20; i++) {
			g2d.draw3DRect(10, 10, height, weight, false);	//drawing square using x, y, and side length, no raising
	}
		
	}
	
	/**
	 * Getter for the sideLenght of the Square
	 * @return
	 */
	public double getSidelength() {
		return this.side;
	}
	
	/**
	 * Setter for the sideLength of the Square
	 * @param side
	 */
	public void setSideLength(int side) {
		this.side = side;
	}

	@Override
	/**
	 * Basic clone method that returns a deep copy of the current
	 * Square class
	 */
	public Object clone() {
		// TODO Auto-generated method stub
		return new Square(super.getX(), super.getY());
	}
	
	@Override
	/**
	 * Basic toString method that shows the string representation of the class
	 */
	public String toString() {
		return "Square";
	}
}
