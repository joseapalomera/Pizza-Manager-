package timeStamp;

/**
 * This is a Time class that takes in the hours, mintues, and seconds
 * of a certain time and holds those times in variable that when needed, 
 * prints out the current time through the toString method
 * @author josea.palomera
 *
 */
public class Time {

	private int hour, minute, second;

	/**
	 * Basic constuctor that initializes hour, minutes, and seconds
	 * @param h
	 * @param m
	 * @param s
	 */
	public Time(int h, int m, int s) {
		setHour(h);
		setMinute(m);
		setSecond(s);
	}

	/**
	 * Copy consturctor that also initializes hour, minutes, and seconds
	 * from another Time object
	 * @param time
	 */
	public Time(Time time) {
		this(time.hour, time.minute, time.second);
	}

	/**
	 * Getter for hour
	 * @return
	 */
	public int getHour() {
		return hour;
	}

	/**
	 * Setter for hour
	 * @param hour
	 */
	public void setHour(int hour) {
		this.hour = hour;
	}

	/**
	 * Getter for minutes
	 * @return
	 */
	public int getMinute() {
		return minute;
	}

	/**
	 * Setter for minutes
	 * @param minute
	 */
	public void setMinute(int minute) {
		this.minute = minute;
	}

	/**
	 * Getter for seconds
	 * @return
	 */
	public int getSecond() {
		return second;
	}

	/**
	 * Setter for seconds
	 * @param second
	 */
	public void setSecond(int second) {
		this.second = second;
	}

	@Override
	/**
	 * Basic toString which puts hour, minute, and second in a line
	 */
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second="
				+ second + "]";
	}

	@Override
	/**
	 * Basic equals method that checks to see if the object being passed
	 * in is equals to the current Time object
	 */
	public boolean equals(Object obj) {
		
		if(obj == null) {
			return false;
		}
		
		if(!(obj instanceof Time)) {
			return false;
			
		}
		
		Time other = (Time) obj;
		
		return this.hour == other.hour && this.minute == other.minute && this.second == other.second;
	}
	
	
}
