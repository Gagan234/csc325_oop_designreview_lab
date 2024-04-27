/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
 class Student extends Human
{
    //This is a variable
    private double gpa;

    //This is the Constructor
    public Student(String name, short age, double gpa)
    {
        super(name,age);
        this.gpa = gpa;
    }

    //This is the getter method for GPA
    public double getGpa()
    {
        return gpa;
    }

    //This is the setter method for GPA
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    //This is the getter method for address
    @Override
    public String getAddress()
    {
        return null;
    }

    //This is the setter method for address
    @Override
    public void setAddress(String address)
    {

    }


    //This is the toString Method
    @Override
    public String toString()
    {
        return "Student: " + getName() + ", Age: " + getAge() + ", GPA: " + getGpa();
    }
}
	// ToDo 1: Make this class a child of Human

	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create a setter and a getter
	
	// ToDo 4: Add comments to your code

