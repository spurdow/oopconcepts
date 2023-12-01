package com.oopconcepts;

public abstract class User {
    private String Name;
    private long ID;

    public User(String name, long ID) {
        Name = name;
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public abstract boolean Verify();

    public abstract String CheckAccount();

    public String get_book_info(){
        return Name + " get a book";
    }


}
