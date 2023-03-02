package com.mwicks.mw20230301.service;

import com.mwicks.mw20230301.entities.Book;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookService {

    Map<Integer, Book> libraryMap = new HashMap<>();

    /*List<Book> library = new ArrayList<>(Arrays.asList(
        new Book("The Hundred-Foot Journey", "novel", "jane@doe.com"),
        new Book("Kanji & Kana", "textbook", "rei@netzero.com"),
        new Book("Bible", "historical fiction", "john@baptist.net")
    ));*/

    public Map<Integer, Book> getAllBooks() {
        System.out.println("getAllBooks trigger");
        return libraryMap;
    }

    public Book getBookById(int id) {
        System.out.println("getBookById trigger");
        return libraryMap.stream().filter(book -> book.getBookId() == id).findFirst().get();
    }

    public Book getBookByName(String name) {
        System.out.println("getBookByName trigger");
        return libraryMap.stream().filter(e -> (e.getBookName().toLowerCase().equals(name.toLowerCase()))).findFirst().get();
    }

    public void addBook(String name, String description, String email) {
        System.out.println("addBook trigger");
        Book newBook = new Book(name,description,email);
        libraryMap.put(newBook.getBookId(), newBook);
    }

    public void deleteBook(int bookId) {
        libraryMap.remove(getBookById(bookId));
    }
}
