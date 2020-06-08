package shapes;
import java.awt.*;

/* Class Shape
 *
 * By Rob Nash
 * 
 * This is the superclass in a hierarchy of shapes that you have to construct
 */

//the superclass in our inheritance hierarchy
//all "common" features, functions and data should go here
//for example, all shapes in Java2D have a x,y that declares their position
//and many of the shapes exposed have a width and a height (but not all, so we didn't put width and height here)
//note that this class is mostly empty, as there is no algorithm generic enough to guess an arbitrary shape's area (future subclasses must override getArea() to provide something reasonable)
//also, the draw method is empty too, as we don't know what shape to draw here! (again, our subclasses will need to replace this method with one that actually draws things)

public abstract class Shape extends Object implements Cloneable{
	
	private int x = 0;	//These variables should be private so that we don't modify them in any other class
	private int y = 0;	//other than one of the child classes. 
	
	public Shape( int x, int y ) {
		this.x= x;
		this.y= y;
	}
	
	public double getArea(){ 
		return -1; 
		}
	
	public void draw( Graphics g ){
		
	}
	
	public int getX() { 
		return x; 
		}
	
	public int getY() { 
		return y; 
		}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public abstract Object clone();
	public abstract String toString();
}
