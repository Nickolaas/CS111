//***********************************************************
// BoxTest.java
//
// Author: Hawk Weisman
// Course: CS111: Introduction to Computer Science I
// Fall Semester 2012-2013
// Laboratory #6
//
// Instantiates and updates three Box objects.
//***********************************************************

public class BoxTest {
    public static void main (String[] argv){

	// print out the program header
	System.out.println ("BoxTest.Java\n\nAuthor: Hawk Weisman");
	System.out.println ("Course: CS111: Introduction to Computer Science I");
	System.out.println ("Fall Semester 2012-2013\nLaboratory #6");
	System.out.println ("\nInstantiates and updates three Box objects.\n");
	
	// instantiate some Boxes
	Box box1 = new Box (5, 4.5, 7);
	Box box2 = new Box (4.75, 3.5, 6.25);
	Box box3 = new Box (6, 4.25, 7.5);

	// print out the status of our Boxes
	System.out.println ("Box 1: " + box1.toString());
	System.out.println ("Box 2: " + box2.toString());
	System.out.println ("Box 3: " + box3.toString());
	System.out.println();

	// let's see if box2 fits inside box1
	if (box2.fitsInside(box1) == true){
	    System.out.println ("Box 2 fits inside Box 1.");
	} else {
	    System.out.println ("Box 2 does not fit inside Box 1.");
	}

	// now let's see if box3 fits inside box1
	if (box3.fitsInside(box1) == true){
	    System.out.println ("Box 3 fits inside Box 1.");
	} else {
	    System.out.println ("Box 3 does not fit inside Box 1.");
	}
	System.out.println();

	// use mutators to change the dimensions of the boxes
	box1.setDepth(8);
	box2.setWidth(4.75);
	box3.setHeight(4);

	// rerun the fits tests
	if (box2.fitsInside(box1) == true){
	    System.out.println ("Box 2 fits inside Box 1.");
	} else {
	    System.out.println ("Box 2 does not fit inside Box 1.");
	}
	if (box3.fitsInside(box1) == true){
	    System.out.println ("Box 3 fits inside Box 1.");
	} else {
	    System.out.println ("Box 3 does not fit inside Box 1.");
	}
	System.out.println();
	
	// print the width of the second box
	System.out.println ("Box 2 is " + box2.getWidth() + " units wide.");

	// empty the third box
	box3.setFull(false);
	
	// print out the third box's status one more time
	System.out.println ("Box 3: " + box3.toString());
    }
}