//**************************************************************************
// problem1.java
//
// Author: Hawk Weisman
// Course: CS111: Introduction to Computer Science I, Fall Semester 2012-2013
// Lab 2
// 
// Computes the sum, difference, product, quotient, remainder, average and square of the sum of two integers.
//
//**************************************************************************

import java.util.Scanner;

public class problem1 {
    public static void main (String[] args) {
	int int1, int2;   // int1 & int2 store the two integers to be computed
	Scanner scan = new Scanner (System.in); 

	// prompt the user for integers

	System.out.println ("Please enter the first integer.");
	int1 = scan.nextInt();

	System.out.println ("Please enter the second integer.");
	int2 = scan.nextInt();

	// compute the values

	int sum = int1 + int2;
	int difference = int1 - int2;
	int product = int1 * int2;
	double quotient = int1 /(int2+0.0);
	double remainder = int1 % int2;
	double average = (int1 + int2) / 2;
	int square = (int1 + int2) * (int1 + int2);

	// print out the results
       
	System.out.println ("The integers are " + int1 + " and " + int2 +".");
	System.out.println ("The sum is " + sum + ".");
	System.out.println ("The difference is " + difference + ".");
	System.out.println ("The product is " + product + ".");
	System.out.println ("The quotient is " + quotient + ".");
	System.out.println ("The remainder is " + remainder + ".");
	System.out.println ("The average is " + average + ".");
	System.out.println ("The square is " + square + ".");
	System.out.println ("Have a nice day!");

	    }
}