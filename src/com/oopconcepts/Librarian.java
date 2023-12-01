package com.oopconcepts;

public class Librarian extends User {
    public Librarian(String name, long ID) {
        super(name, ID);
    }

    @Override
    public boolean Verify() {
        return this.getClass().getName().equals("Librarian");
    }

    @Override
    public String CheckAccount() {
        return "Your ID is " + getName() + "\nYour name is " + getID() + "\nYour type is " + Librarian.class.getName();
    }
}
