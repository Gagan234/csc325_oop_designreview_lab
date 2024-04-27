package com.mycompany.csc325_oop_designreview_lab;

//This is the Senior class, it extends Student
public class Senior extends Student
{

    //This is a Constructor with name, age, gpa and credits
    public Senior(String name, short age, double gpa, int credits)
    {
        super(name, age, gpa);
        if (credits < 85)
        {
            throw new IllegalArgumentException("Senior students must have at least 85 credits.");
        }

    }

    //This is a Constructor with name, age, and gpa
    public Senior(String name, short age, int gpa)
    {
        super(name, age, gpa);
    }

    //This is the toString method
    @Override
    public String toString()
    {
        return "Senior: " + getName() + ", Age: " + getAge() + ", GPA: " + getGpa();
    }
}