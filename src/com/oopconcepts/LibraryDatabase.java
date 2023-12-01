package com.oopconcepts;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {

    private final List<Book> List_of_Books;

    public LibraryDatabase() {
        List_of_Books = new ArrayList<>();
    }

    public void Add(Book e){
        List_of_Books.add(e);
    }

    public void Delete(Book e){
        List_of_Books.remove(e);
    }

    public void Delete(int index){
        List_of_Books.remove(index);
    }

    public void Update(int index, Book e){
        List_of_Books.set(index, e);
    }

    public void Display(){
        for(Book eachBook : List_of_Books){
            System.out.println(eachBook);
        }
    }

    public void Search(String keyword){
        boolean bookFound = false;
        Book sampleSearchBook = null;
        for(Book eachBook : List_of_Books){
            if(keyword.equalsIgnoreCase(eachBook.getTitle()) || keyword.equalsIgnoreCase(eachBook.getAuthor()) || keyword.equalsIgnoreCase(eachBook.getISBN()) || keyword.equalsIgnoreCase(eachBook.getPublication()) ){
                bookFound = true;
                sampleSearchBook = eachBook;
                break;
            }
        }

        if(!bookFound){
            System.out.println("Book not found ! ");
        }else {
            System.out.println("Book found ! " + sampleSearchBook);
        }
    }
}
