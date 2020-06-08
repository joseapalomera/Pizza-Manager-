package timeStamp;
import java.io.Serializable;

/**
 * The purpose of this class is to represent a date that contains the day, 
 * month and year. Each variable contains a basic getter and setter, an equals 
 * method and toString for the class, and also another method called isAfter that
 * checks to see if another date being passed in is after the current instance of
 * the date class.
 * @author josea.palomera
 *
 */
public class Date implements Comparable<Date>, Cloneable, Serializable{
	private int day;
	private int month;
	private int year;
	
	/**
	 * This is a constructor that takes in a day, month, and year, and then
	 * uses setter methods that invariants are checked. 
	 * @param day - represents a day
	 * @param month - represents a month
	 * @param year - represents a specific year
	 */
	public Date( int day, int month, int year) {
		setDay(day);
		setMonth(month);
		setYear(year);
	}

	/**
	 * This copy constructor is used to copy the values of another Date object
	 * to the current instance of the class
	 * @param other - represents another instance of the Date class
	 */
	public Date(Date other) {
		this.day = other.day;
		this.month = other.month;
		this.year = other.year;
	}

	/**
	 * This is a simple getter for the day variable
	 * @return - returns the day for the current instance
	 */
	public int getDay() {
		return this.day;
	}

	/**
	 * This is a simple setter that will check to see if the day is in the 
	 * range of 1-31, if it is, then it will set the day passed in to the 
	 * current instance variable
	 * @param day - represents a day that is being passed in
	 */
	public void setDay(int day) {
		if(day >= 1 && day <= 31) {
			this.day = day;
			
		} else {
			this.day = 1;
		}
		
	}

	/**
	 * This is a simple getter for the month variable
	 * @return - returns the month for the current instance
	 */
	public int getMonth() {
		return this.month;
	}

	/**
	 * This is a simple setter that will check to see if the day is in the 
	 * range of 1-12, if it is, then it will set the month passed in to the 
	 * current instance variable
	 * @param month - represents a month that is being passed in
	 */
	public void setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
			
		} else {			
			this.month = 1;
		}
		
	}

	/**
	 * This is a simple getter for the year variable
	 * @return - returns the year for the current instance
	 */
	public int getYear() {
		return this.year;
	}

	/**
	 *  This is a simple setter that will check to see if the day is in the 
	 * range of 2014 - 2024, if it is, then it will set the year passed in to the 
	 * current instance variable
	 * @param year - represents a year that is being passed in
	 */
	public void setYear(int year) {
		if(year >= 2014 && year <= 2024) {
			this.year = year;
			
		} else {
			this.year = 2014;
		}
	}
	
	/*
	 * Checks to see if another date being passed in is
	 * after the current instance of the Date class
	 */
	public boolean isAfter(Date other) {
		//First checks to see if the object passed in doesn't equal to null
		if(other != null) {
			//If not, the instance variables are compared 
			//Returns true if the other object is after the current instance of the class
			if((this.year > other.year) && (this.month > other.month)
					&& (this.day > other.day)) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	/**
	 * This is a simple equals method that will compare the instance
	 * variables between two objects if they are from the same class. 
	 * If both objects are the same when it comes to the values of the
	 * variables, then it will return true, otherwise false.
	 */
	public boolean equals(Object o) {
		if(o == null || !( o instanceof Date)) {
		return false;
		}
		Date that = (Date) o;
		
		return (this.day == that.day && this.month == that.month && this.year == that.year);
	
	}
	@Override
	/**
	 * This is a simple representation of the Date class in the form of m/d/year
	 */
	public String toString() {
		return this.month + "/" + this.day + "/" + this.year;
	}

	@Override
	/*
	 * This is a basic compareTo method that first compares the years, then months, and
	 * then days
	 */
	public int compareTo(Date o) {
		// Checks to see if the current year is either greater than or less than the other year
		if(this.getYear() > o.getYear()) {
			return 1;
		}else if(this.getYear() < o.getYear()) {
			return -1;
		}
		//If the years are the same, then check for the months
		if(this.getMonth() > o.getMonth()) {
			return 1;
		}else if(this.getMonth() < o.getMonth()) {
			return -1;
		}
		//If the months are the same, then compare the days
		if(this.getDay() > o.getDay()) {
			return 1;
		}else if(this.getDay() < o.getDay()) {
			return -1;
		}
		//If all else fails, then the Dates are the same
		return 0;
	}

	/*
	 * This is basic clone method that when needed, clones the instance of the
	 * current Date class
	 */
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
}
