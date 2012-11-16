//**************************************************************
// GradeBook.java
// Author: Hawk Weisman    Based on: GradeBook.java by Dr. Cupper
// Course: CS111: Introduction to Computer Science I
// Fall Semester 2012-2013
// Laboratory #5
//
// Uses Student class to get lab and exam scores for two
// students and to compute and print out averages.
//*************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeBook 
{
    public static void main (String[] args)
    {
	Scanner scan = new Scanner (System.in);
	DecimalFormat outputFormat = new DecimalFormat ("0.#");
	
	Student student1, student2;

	// print out the program header

	System.out.println ("GradeBook.java");
	System.out.println ("Author: Hawk Weisman\tBased on: GradeBook.java by Dr. Cupper.");
	System.out.println ("Course: CS111: Introduction to Computer Science I\nFall Semester 2012-2013");
	System.out.println ("Laboratory #5\n");
	System.out.println ("Uses Student class to get lab and exam scores\nfor two students and to compute and print out averages.\n");

	// Prompt for data for student 1
	
	System.out.println ("Please input Student 1's name.");
	String name = scan.nextLine();
	
	System.out.println ("Please input Student 1's major.");
	String major = scan.nextLine();

	System.out.println ("Please input Student 1's ID number.");
	int ID = scan.nextInt();

	System.out.println ("Please input Student 1's score on Lab 1.");
	double lab1 = scan.nextDouble();

	System.out.println ("Please input Student 1's score on Lab 2.");
	double lab2 = scan.nextDouble();

	System.out.println ("Please input Student 1's score on Exam 1.");
	double exam1 = scan.nextDouble();

	System.out.println ("Please input Student 1's score on Exam 2.");
	double exam2 = scan.nextDouble();
	scan.nextLine();

	// instantiate Student 1

	student1 = new Student (name, ID, major);
	
	// fill in the rest of the data for Student 1
	student1.setLab1(lab1);
	student1.setLab2(lab2);
	student1.setExam1(exam1);
	student1.setExam2(exam2);

	// Prompt for data for student 2
	
	System.out.println ("Please input Student 2's name.");
	name = scan.nextLine();
	
	System.out.println ("Please input Student 2's major.");
	major = scan.nextLine();

	System.out.println ("Please input Student 2's ID number.");
	ID = scan.nextInt();

	System.out.println ("Please input Student 2's score on Lab 1.");
	lab1 = scan.nextDouble();

	System.out.println ("Please input Student 2's score on Lab 2.");
	lab2 = scan.nextDouble();

	System.out.println ("Please input Student 2's score on Exam 1.");
	exam1 = scan.nextDouble();

	System.out.println ("Please input Student 2's score on Exam 2.");
	exam2 = scan.nextDouble();
	scan.nextLine();

	// instantiate Student 2

	student2 = new Student (name, ID, major);
	
	// fill in the rest of the data for Student 2
	student2.setLab1(lab1);
	student2.setLab2(lab2);
	student2.setExam1(exam1);
	student2.setExam2(exam2);

	// print out the status of the students
	System.out.println ("Student Name\tID Number\tMajor\t\tLab1\tLab2\tExam1\tExam2");
	System.out.println (student1.toString());
	System.out.println (student2.toString());

	// print the name, lab scores, and lab average for student1 and student2
	System.out.println ("Laboratory work:");
	System.out.println ("Student Name\tLab1\tLab2\tLab Average");
	System.out.println (student1.getName() + "\t" + outputFormat.format(student1.getLab1()) + "\t" +
			    outputFormat.format(student1.getLab2()) + "\t" + outputFormat.format(student1.labAverage()));
       	System.out.println (student2.getName() + "\t" + outputFormat.format(student2.getLab1()) + "\t" +
			    outputFormat.format(student2.getLab2()) + "\t" + outputFormat.format(student2.labAverage()));

	// print the name, exam scores, and exam average for student1 and student2
	System.out.println ("Exam work:");
	System.out.println ("Student Name\tExam1\tExam1\tExam Average");
	System.out.println (student1.getName() + "\t" + outputFormat.format(student1.getExam1()) + "\t" +
			    outputFormat.format(student1.getExam2()) + "\t" + outputFormat.format(student1.examAverage()));
       	System.out.println (student2.getName() + "\t" + outputFormat.format(student2.getExam1()) + "\t" +
			    outputFormat.format(student2.getExam2()) + "\t" + outputFormat.format(student2.examAverage()));
    }
}


	
	
