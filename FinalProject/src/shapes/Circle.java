package shapes;
import java.awt.*;
import java.awt.geom.Ellipse2D;

/**
 * This is a basic Circle class that extends from the shape class
 * and has all the necessary components of a Circle, like 
 * the radius and more
 * @author josea.palomera
 *
 */
public class Circle extends Shape{
	
	private double radius;	//Measured in inches
	
	/**
	 * Basic constructor that initializes the x and y for the Circle class
	 * @param x
	 * @param y
	 */
	public Circle(int x, int y) {
		super(x,y);	
		setRadius(4);
	}
	
	/**
	 * Getter for the area of the circle
	 */
	public double getArea() {
		return (radius * radius * Math.PI);
	}
	
	/**
	 * This is a basic draw function that when used in the JFrame, will 
	 * draw out a circle
	 */
	public void draw(Graphics g) {
		
		Graphics2D g2d = (Graphics2D)g;
		
		final int x = getX();
		final int y = getY();
		
		g2d.setColor(Color.GREEN);
		g2d.setPaint(new GradientPaint(x,y, Color.GREEN, x + (int) radius / 4, y + (int) radius/4, Color.BLUE, true));
		
		int xOffset = 0;
		int yOffset= 0;
		
		for(int i = 0; i < 20; i++) {
			 xOffset = (int) (Math.random() * radius);
			 yOffset = (int) (Math.random() * radius);
			 g2d.draw(new Ellipse2D.Double(xOffset + x, yOffset + y, xOffset + x + 3, yOffset + y + 3));
		}
		
		
	}
	
	/**
	 * Getter for the radius of the circle
	 * @return
	 */
	public double getRadius() {
		return this.radius;
	}
	
	/**
	 * Setter for the radius
	 * @param radius
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	/**
	 * Basic clone method that makes a deep copy of a Circle
	 * object with the same data
	 */
	public Object clone() {
		// TODO Auto-generated method stub
		return new Circle(super.getX(), super.getY());
	}
	
	@Override
	/**
	 * Basic string representation of the circle class
	 */
	public String toString() {
		return "Circular";
	}
	
}
