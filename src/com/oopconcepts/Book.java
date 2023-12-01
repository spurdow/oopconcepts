package com.oopconcepts;

import java.util.Date;

public class Book {
    private String Title;
    private String Author;
    private String ISBN;
    private String Publication;

    public Book(String title, String author, String ISBN, String publication) {
        Title = title;
        Author = author;
        this.ISBN = ISBN;
        Publication = publication;
    }

    // 0 - closed
    // 1 - open
    private int reservation_status;

    private Date dueDate;
    private Date renewDate;

    private String feedback;

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    private String Show_duedt(){
        // add due date?
        return dueDate.toString();
    }

    public void setReservation_status(int status){
        this.reservation_status = status;
    }

    public int Reservation_status(){
        return reservation_status;
    }

    public String Feedback(){
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public void setRenewDate(Date renewDate) {
        this.renewDate = renewDate;
    }

    public String Renw_info(){
        return renewDate.toString();
    }


    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublication() {
        return Publication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + Title + '\'' +
                ", Author='" + Author + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", Publication='" + Publication + '\'' +
                ", reservation_status=" + reservation_status +
                ", dueDate=" + dueDate +
                ", renewDate=" + renewDate +
                ", feedback='" + feedback + '\'' +
                '}';
    }
}
