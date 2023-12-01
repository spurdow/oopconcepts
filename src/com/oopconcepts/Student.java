package com.oopconcepts;

public class Student extends User{
    public Student(String name, long ID) {
        super(name, ID);
    }

    @Override
    public boolean Verify() {
        // add function to verify if  this is a student
        // return true when student otherwise false
        return this.getClass().getName().equals("Student");
    }

    @Override
    public String CheckAccount() {
        // add function to check account
        return "Your ID is " + getName() + "\nYour name is " + getID() + "\nYour type is " + Student.class.getName();
    }


}
