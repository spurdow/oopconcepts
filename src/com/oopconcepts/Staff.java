package com.oopconcepts;

public class Staff extends User{
    public Staff(String name, long ID) {
        super(name, ID);
    }

    @Override
    public boolean Verify() {
        return this.getClass().getName().equals("Staff");
    }

    @Override
    public String CheckAccount() {
        return "Your ID is " + getName() + "\nYour name is " + getID() + "\nYour type is " + Staff.class.getName();
    }
}
