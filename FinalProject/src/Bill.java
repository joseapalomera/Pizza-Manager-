import java.io.Serializable;

import mainClasses.Money;
import timeStamp.Date;

/**
 * The purpose for this bill class is to represent a bill that will hole
 * an amount that is owed, a date that when the bill is due, the name of 
 * who the bill is from, and also the date of when the bill was paid, if may be.
 * @author josea.palomera
 *
 */
public class Bill implements Comparable<Bill>, Cloneable, Serializable{
	private Money amount;
	private Date dueDate;
	private Date paidDate;
	private String originator;
	
	/**
	 * This constructor is used to initialize the parameters to the instance variables
	 * for the class. No invariants will be checked since we are assuming that someone
	 * is beginning to make a bill
	 * @param amount - represents an amount owed
	 * @param dueDate - represents the due date of the bill
	 * @param originator - represents the person/company who made the bill
	 */
	public Bill(Money amount, Date dueDate, String originator) {
		this.amount = new Money(amount);
		this.dueDate = new Date(dueDate);
		this.originator = originator;
		//PaidDate is null because we are only constructing a bill still
		paidDate = null;
	}
	
	/**
	 * This copy constructor takes the values from another bill object, and copies
	 * those values to the current instance variables.
	 * @param toCopy - represents another Bill object
	 */
	public Bill(Bill toCopy) {	
		this.amount = new Money(toCopy.amount);
		this.dueDate = new Date(toCopy.dueDate);
		this.paidDate = toCopy.paidDate;
		this.originator = toCopy.originator;
		
	}
	
	/**
	 * This is a simple getter method that returns a copy of the amount 
	 * variable to avoid privacy leaks. 
	 * @return - returns a new copy of the amount for the bill
	 */
	public Money getAmount() {
		return new Money(this.amount);
	}
	
	/**
	 * This is a simple getter method that returns a copy of the dueDate 
	 * variable to avoid privacy leaks. 
	 * @return - returns a new copy of the dueDate for the bill
	 */
	public Date getDueDate() {
		return new Date(this.dueDate);
	}
	
	/**
	 * This is a simple getter method that returns the name of the originator 
	 * @return - returns the name of the originator for the bill
	 */
	public String getOriginator() {
		return this.originator;
	}
	
	/**
	 * This boolean method will return whether or not the current bill has been payed. 
	 * @return - returns true or false if there is a date that the bill was paid for
	 */
	public boolean isPaid() {
		if(paidDate != null) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * This method helps set a day that the bill is payed for. 
	 * It will take in a date object and check to see if it is after the dueDate that was
	 * set for the class, if it wasn't, the parameter passed in will be the 
	 * new paidDate meaning that the bill has been paid for.
	 * @param onDay - represents the date that the current bill was paid for
	 */
	public void setPaid(Date onDay) {
		if(onDay != null) {
			
		//If the date passed in is before the due date, then the paidDate is set to 
		//the parameters that was passed in
		if(onDay.isAfter(dueDate) == false) {
			this.paidDate = new Date(onDay);
		} else {
			System.out.println("Cannot pay after the due date");
			System.exit(0);
		}
		}
	}
	
	/**
	 * This method will set the paid date to null, which just 
	 * represents that the bill hasn't been paid for yet. 
	 */
	public void setUnpaid() {
		this.paidDate = null;
	}
	
	/**
	 * This method will be used to set a new Due date for the bill if all invariants are
	 * checked. This method will want to make sure if the due date isn't being set before the 
	 * bill has already been paid for, so if the due date is before the bill 
	 * is actually paid, then the parameter will be the new due date for the bill. 
	 * @param nextDate - represents a date that the bill will be due on
	 */
	public void setDueDate(Date nextDate) {
		if(nextDate != null) {
		//Checks to see if the date we want is after the paidDate or not, if it is
		// then we are allowed to set the due date to the parameter that is passed in
		if(nextDate.isAfter(this.paidDate) == true || this.paidDate == null) {
			//This will set the due date to a copy of another due date from the same Date class
			this.dueDate = new Date(nextDate);
		} else {
			System.out.println("Cannot set due date after the bill is paid.");
			System.exit(0);
		}
		}
	}
	
	/**
	 * This method will be used to set an amount for the bill, through the use of 
	 * a parameter, if possible, then the amount for the bill be a copy
	 * of the amount being passed in to avoid privacy leaks. 
	 * @param amount - represents an amount that we want to set out bill to
	 */
	public void setAmount(Money amount) {
		if(amount != null) {
			this.amount = new Money(amount);
		}
		
	}
	
	/**
	 * This setter takes in a string that will be used to set the originator
	 * variable to. 
	 * @param originator - represents the name that the bill is coming from. 
	 */
	public void setOriginator(String originator) {
		if(originator != null) {
			this.originator = originator;
		}
		
	}
	
	@Override
	/**
	 * This is a toString method that will make sure there is a visual representation for the bill
	 * class. It will always print out the basic amount owed, a due date, and the people the bill
	 * comes from. But if the bill was paid for, the it will also print out the date the bill
	 * was paid.
	 */
	public String toString() {
		
		String s = "";
		
		s= "Amount: " + getAmount() + "\n"
				+ "Due Date: " + getDueDate() + "\n"
				+ "Originator: " + getOriginator();
		
		
		if(this.paidDate != null) {
			s += " \nPaid?: No \n Date Paid: " + this.paidDate;
		} else {
			s += "\nPaid?: No";
				
		}
		
		return s;
	}
	
	/**
	 * This equals method compares to different objects of the same class by making sure
	 * if the object being passed in is not null and if it is an instance of the bill class.
	 * @param toCompare
	 * @return - returns true or false depending if the two bills are the same
	 */
	public boolean equals(Bill toCompare) {
		if(toCompare == null || !(toCompare instanceof Bill)) {
			return false;
		}
		
		Bill that = (Bill) toCompare;
		
		return ((this.amount == that.amount) && (this.dueDate == that.dueDate)
			&& (this.paidDate == that.paidDate) && (this.originator ==that.originator));
	}

	@Override
	public int compareTo(Bill o) {
		
		int amo = this.amount.compareTo(o.amount);
		int paidd = this.dueDate.compareTo(o.dueDate);
		int dued = this.paidDate.compareTo(o.paidDate);
		
		if(amo == -1 || paidd == -1 || dued == -1) {
			return -1;
		}
		
		if(amo == 1 || paidd == 1 || dued == 1) {
			return 1;
		}
		
		return 0;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	
}
