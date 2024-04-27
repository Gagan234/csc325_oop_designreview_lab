package com.mycompany.csc325_oop_designreview_lab;

//This is the Freshmen class that extends Student
public class Freshman extends Student
{
    //This is a Constructor
    public Freshman(String name, short age, double gpa)
    {
        super(name, age, gpa);
    }

    //This is the toStirng method
    @Override
    public String toString()
    {
        return "Freshman: " + getName() + ", Age: " + getAge() + ", GPA: " + getGpa();
    }
}
