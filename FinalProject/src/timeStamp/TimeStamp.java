package timeStamp;

//import mainClasses.PizzaManager;
/*
 * This class IS a Date and HAS a time
 * You can call the getters for either, but no setters
 * Also a good candidate for a class with final data items.
 * @Jose palomera
 */
public class TimeStamp extends Date{
	
	private Time time;

	/**
	 * Basic constructor that takes in a current time, and date
	 * @param d
	 * @param t
	 */
	public TimeStamp(Date d, Time t) {
		super(d);
		time = t;
	}
	
	/**
	 * Getter for the current Time
	 * @return
	 */
	public Time getTime() { 
		return new Time(time);
	}
	
	/**
	 * Getter for the current date
	 * @return
	 */
	public Date getDate() {
		return new Date(this);
	}
	
	/**
	 * Basic toString that puts the date and time as a time stamp in a string representation
	 */
	public String toString() {
		return "TimeStamp at: " + time.getHour() + ":" + time.getMinute()+":"+ time.getSecond() + " and " + super.toString();
	}
}
