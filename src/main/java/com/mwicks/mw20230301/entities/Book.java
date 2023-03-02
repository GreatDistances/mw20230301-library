package com.mwicks.mw20230301.entities;

public class Book {

    private int bookId;
    private static int NEXT_ID = 1;
    private String bookName;

    public Book(String bookName) {
        this.bookId = NEXT_ID;
        this.bookName = bookName;
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
}
