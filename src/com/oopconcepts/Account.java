package com.oopconcepts;

import java.util.ArrayList;
import java.util.List;

public class Account extends User{

    private final List<Book> books_borrowed = new ArrayList<Book>();

    public Account(String name, long ID) {
        super(name, ID);
    }


    public void no_of_books_borrowed(){
        System.out.println("No of borrowed books " + books_borrowed.size());
    }

    public void no_of_reserved_books(){
        int count = 0;
        for(Book b: books_borrowed){
            if(b.Reservation_status() == 1){
                count++;
            }
        }
        System.out.println("No of reserved books " + count);
    }

    public void no_of_books_returned(){
        int count = 0;
        for(Book b: books_borrowed){
            if(b.Reservation_status() == 0){
                count++;
            }
        }
        System.out.println("No of reserved returned " + count);
    }

    // not sure how to calculate lost books


    public Double CalculateFine(){
        int count = 0;
        final int fine = 20;
        for(Book b: books_borrowed){
            if(b.Reservation_status() == 1){
                count++;
            }
        }

        return (double) (count * fine);
    }


    @Override
    public boolean Verify() {
        return this.getClass().getName().equals("Account");
    }

    @Override
    public String CheckAccount() {
        return "Your ID is " + getName() + "\nYour name is " + getID() + "\nYour type is " + Account.class.getName();
    }
}
