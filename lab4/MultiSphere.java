//**************************************************************************************************************
// MultiSphere.java
//
// Author: Hawk Weisman
// Course: CS111: Intro to Computer Science I, Fall Semester 2012-2013
// Laboratory #4 problem 3
//
// Instantiates and updates several Sphere objects.
// Last modified: September 26th 2012
//**************************************************************************************************************

import java.text.DecimalFormat;

public class MultiSphere {
    public static void main (String[] args){

	DecimalFormat outputFormat = new DecimalFormat ("0.###"); // DecimalFormat object for output with 3 decimal points

	//------------------------------------------------------------------
	// instantiate the spheres
	//------------------------------------------------------------------

	Sphere sphere1 = new Sphere (5.3);      // create sphere1 with a diameter of 5.3
	Sphere sphere2 = new Sphere (24.32);    // create sphere2 with a diameter of 24.32
	Sphere sphere3 = new Sphere (12.471);   // create sphere3 with a diameter of 12.471

	//-----------------------------------------------------------------
	// print a bunch of data
	//-----------------------------------------------------------------

	// print the program header so that I don't lose points

	System.out.println("MultiSphere.java \n \n" + "Author: Hawk Weisman \n" 
			   + "Course: CS111; Intro to Computer Science I, Fall Semester 2012-2013 \n"
			   + "Laboratory #4 problem 3 \n \n" + "Instantiates and updates several Sphere objects. \n");

	// print the Spheres' diameter, volume, and surface area

	System.out.println("Sphere1's diameter is " + sphere1.toString() + ", its volume is " +
			   outputFormat.format(sphere1.calcVolume()) +  " and its surface area is " +
			   outputFormat.format(sphere1.calcSurfaceArea()) + ".");
	System.out.println("Sphere2's diameter is " + sphere2.toString() + ", its volume is " +
			   outputFormat.format(sphere2.calcVolume()) +  " and its surface area is " +
			   outputFormat.format(sphere2.calcSurfaceArea()) + ".");
	System.out.println("Sphere3's diameter is " + sphere3.toString() + ", its volume is " +
			   outputFormat.format(sphere3.calcVolume()) +  " and its surface area is " +
			   outputFormat.format(sphere3.calcSurfaceArea()) + ". \n");
	
	// print out Sphere #2's diameter using getDiameter
	System.out.println("Sphere 2's diameter is "+ outputFormat.format(sphere2.getDiameter()) + "\n");

	//-----------------------------------------------------------------
	// Change Sphere #1's diameter and print the diameter, volume,
	// and surface area of all the spheres.
	//-----------------------------------------------------------------

	// set Sphere1's diameter to 32.74
	sphere1.setDiameter(32.74);

	System.out.println("Sphere1's diameter is " + sphere1.toString() + ", its volume is " +
			   outputFormat.format(sphere1.calcVolume()) +  " and its surface area is " +
			   outputFormat.format(sphere1.calcSurfaceArea()) + ".");
	System.out.println("Sphere2's diameter is " + sphere2.toString() + ", its volume is " +
			   outputFormat.format(sphere2.calcVolume()) +  " and its surface area is " +
			   outputFormat.format(sphere2.calcSurfaceArea()) + ".");
	System.out.println("Sphere3's diameter is " + sphere3.toString() + ", its volume is " +
			   outputFormat.format(sphere3.calcVolume()) +  " and its surface area is " +
			   outputFormat.format(sphere3.calcSurfaceArea()) + ". \n");
	
    }
}
			   
			   
			   
       
	
	
