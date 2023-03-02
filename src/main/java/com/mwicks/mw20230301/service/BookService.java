package com.mwicks.mw20230301.service;

import com.mwicks.mw20230301.entities.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    List<Book> library = new ArrayList<>(Arrays.asList(
        new Book("The Hundred-Foot Journey", "novel"),
        new Book("Kanji & Kana", "textbook"),
        new Book("Bible", "historical fiction")
    ));

    public List<Book> getAllBooks() {
        System.out.println("getAllBooks trigger");
        return library;
    }

    public Book getBookById(int id) {
        System.out.println("getBookById trigger");
        return library.stream().filter(book -> book.getBookId() == id).findFirst().get();
    }

    public Book getBookByName(String name) {
        System.out.println("getBookByName trigger");
        return library.stream().filter(e -> (e.getBookName().toLowerCase().equals(name.toLowerCase()))).findFirst().get();
    }

    public void addBook(String name, String description) {
        System.out.println("addBook trigger");
        library.add(new Book(name, description));
    }

    public void deleteBook(int bookId) {
        library.remove(getBookById(bookId));
    }
}
