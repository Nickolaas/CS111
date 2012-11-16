//*****************************************************************************
// problem2.java
// Based on "TempConverter.java" by Lewis/Loftus
// 
// Author: Hawk Weisman
// Course: CS111: Introduction to Computer Science I, Fall Semester 2012-2013
// Lab 3, Problem 2
//
// Converts a Fahrenheit temperature to a Celcius temperature.
//*****************************************************************************

import java.util.Scanner;

public class problem2 {
    public static void main (String[] args) {



	// define the constants used in the conversion
	// the formula used is C = (F - 32) / (9/5)

	final int BASE = 32;
	final double CONVERSION_FACTOR = 9.0 / 5.0;

	// define the variables used in the conversion (in double-precision) and the scanner to collect data from the user

	double degreesF; // value to convert
 	double degreesC; // value to output
	Scanner tempInput = new Scanner (System.in);

	// print out the program header
	
	System.out.println("problem2.java \n Based on \"TempConverter.java\" by Lewis/Loftus \n \n Author: Hawk Weisman" + 
			   "\n Course: CS111: Introduction to Computer Science I, Fall Semester 2012-2013 \n Lab 3 Problem"
			   + "\n \n Converts a Fahrenheit temperature to a Celcius temperature. \n");

	// prompt the user for data

	System.out.println("Please enter the Fahrenheit temperature to be converted.");
	degreesF = tempInput.nextDouble();

	// conduct the conversion

	degreesC = (degreesF - BASE) / CONVERSION_FACTOR;

	// print out the results

	System.out.println("Fahrenheit temperature: " + degreesF + "\n" + "Celcius equivalent: " + degreesC);
    }
}