import mainClasses.Fraction;

/**
 * The purpose for this class is to take in a 
 * fraction object that will then be used to compare to
 * other fraction objects. If they are equal, 
 * a counter variable will be incremented however many
 * times the fraction object passed in is equal to another 
 * fraction object. 
 * @author josea.palomera
 *
 */
public class FractionCounter {

	private Fraction f = null;
	private int counter = 0;
	
	/**
	 * This constructor will be used to help initialize
	 * the Fraction instance variable for the class so that
	 * it can be used when comparing other Fraction
	 * objects to it. 
	 * 
	 * @param theFraction - represents a Fraction object
	 * that will initialize the instance variable f
	 */
	public FractionCounter(Fraction theFraction){
		
		f = theFraction;
	}
	
	/**
	 * This boolean method helps compare another Fraction
	 * object to the current one. If both objects are the 
	 * same, then a counter will increment by one every time
	 * the current fraction is equal to another fraction. 
	 * 
	 * @param newFraction - represents a different Fraction
	 * object
	 * @return - returns whether or not the Fraction object
	 * is equal to the current Fraction object
	 */
	public boolean compareAndIncrement(Fraction newFraction) {
		
		if(newFraction.equals(this.f)) {
			counter++;
			return true;
		}
		return false;
	}
	
	/**
	 * This toString method is used to create a visual
	 * representation for the FractionCounter class
	 * 
	 * @return - returns a String for FractionCounter
	 */
	@Override
	public String toString() {
		
		return f + " has a count of " + counter;
	}
	
	
}
