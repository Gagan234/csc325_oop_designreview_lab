/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
//This is the main Class
public class MainClass
{

 public static void main(String[] args)
 {
		// ToDo 5: Fix the error

		// ToDo 6: Fix the constructor of the Student class

	    // Todo 7: Create two classes for Freshman and Senior

	     // ToDo 8: The senior class should have a minimum of 85 credits

		// ToDo 9: Add a toString method for the Student class
		// ToDo 10: Add a toString method for the Freshman class

	 //Creates a Student
		Student std1= new Student("James", (short) 20, 0.0);
		// ToDo 11: Add a toString method for the Senior class

	 //Creates a Freshmen
		Freshman std2=  new Freshman("Don", (short) 21, 3.5);

		//Creates a Senior
	    Senior std3 =  new Senior ("Ton", (short) 31, 90);

		// ToDo 12: Set the gpa of the student using the scanner and user
		// input and then print the output.

	 //gets the input
	 	Scanner scanner = new Scanner(System.in);
	 	System.out.print("Enter GPA for " + std1.getName() + ": ");
	 	double gpa = scanner.nextDouble();
	 	std1.setGpa(gpa);

		 //prints it out
		System.out.println(std1);

		System.out.println(std2);

		 System.out.println(std3);
		// ToDo 13: add comments and explain your code
	 	//Test


	}



}






