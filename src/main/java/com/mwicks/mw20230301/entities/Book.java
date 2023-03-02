package com.mwicks.mw20230301.entities;

public class Book {

    private int bookId;
    private static int NEXT_ID = 1;
    private String bookName;
    private String bookDescription;
    private String email;

    public Book(String bookName, String bookDescription, String email) {
        this.bookId = NEXT_ID;
        this.bookName = bookName;
        this.bookDescription = bookDescription;
        this.email = email;
        NEXT_ID++;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
