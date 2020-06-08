import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import mainClasses.Fraction;

/**
 * This driver method is going to take in the Fraction, 
 * and FractionCounter classes so it can do some work with the classes. 
 * First, a file will be read that will count how many
 * lines are in the file to set a new String array. 
 * Then the file will be read again so that each element in the String
 * array has a line from the file. Once this is done, 
 * the fractions from the String will then be parsed 
 * and then passed in as arguments through a new
 * Fraction object. This Fraction object will then be stored
 * into a Fraction array so that we can then use the FractionCounter
 * class to compare Fractions. Once this is done, the program will
 * take in the toStrings from each FractionCounter and store them into 
 * a new String array. Using just strings now, the program will print
 * out the representation for the FractionCounter class through
 * a string array.
 * @author josea.palomera
 *
 */
public class FDriver {
public static void main(String[] args) {
		
		Scanner lines = null;	//This scanner is used to read the file the first time
		Scanner scnr = null;	//This scanner will read the file for a second time
		
		try {
			
			lines = new Scanner(new FileInputStream("fractionsv2.txt"));
			scnr = new Scanner(new FileInputStream("fractionsv2.txt"));
			
			
		} catch(FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		}

		int counter = 0;	//This counter counts how many lines are in the file
		String tempf;	//This variable just helps the compiler to store something
						//This variable also doesn't do anything except store a line
		
		while(lines.hasNextLine()) {
			tempf = lines.nextLine();
			counter++;
			
		}
		
		lines.close();
		
		String[] set = new String[counter];
		
		/*This for loop make help store a string into 
		 * the string array, and if there is a black string,
		 * them the scanner will go to the next line
		 * to see if there is still string to store. */
		for(int i = 0; i < set.length; i++) {
			set[i] = scnr.nextLine();
			if(set[i].isEmpty()) {
				set[i] = scnr.nextLine();
			}
		}
		
		scnr.close();
		
		double num;
		double denom;
		Fraction[] fractions = new Fraction[counter];
		
		/*
		 * This for loop will go through each string in the
		 * array so that it can then parse the fractions into
		 * numbers. Which will then be used to create a new
		 * Fraction object, and after that, the new Fraction
		 * will be stored into a Fraction array. 
		 */
		for(int j = 0; j < set.length; j++) {
			
			try {
				
			String[] temp = set[j].split("/");
			num = Double.parseDouble(temp[0]);
			denom = Double.parseDouble(temp[1]);
				
			Fraction f = new Fraction(num, denom);
			fractions[j] = f;
			
			} catch(NumberFormatException e) {
				System.exit(0);
			}
		
		}
		
		FractionCounter fc = null;
		String[] fcStrings = new String[fractions.length];
		
		/*
		 * Here, every fraction will be compared to each other
		 * through the FractionCounter class so that after a 
		 * fraction object goes through the compareAndIncrement 
		 * method, then the toString from the FractionCounter 
		 * class will stored into a string array.
		 */
		for(int i = 0; i < fractions.length; i++) {
			fc = new FractionCounter(fractions[i]);
		
			for(int j = 0; j < fractions.length; j++) {
				if(fc.compareAndIncrement(fractions[j])) {
					continue;
				}
			}
			
			fcStrings[i] = fc.toString();
			
		}
		
		/*
		 * Here this for loop will be used to make 
		 * elements in the string array into empty 
		 * strings if on of the toStrings from a FractionCounter
		 * object is the same as another toString.
		 */
		for(int i = 0; i < fcStrings.length; i++) {
			for(int k = i + 1; k < fcStrings.length; k++) {
				if(fcStrings[i].equals(fcStrings[k])) {
					fcStrings[k] = "";
				}
			}
		}
		
		/*
		 * Once we have defined our string array, we will
		 * then print out the representation every FractionCounter
		 * for each unique fraction 
		 */
			for(String element: fcStrings) {
				if(element != "") {
				System.out.println(element);
				}
			
		}

		//This is where the main method ends.
	}
	
}
