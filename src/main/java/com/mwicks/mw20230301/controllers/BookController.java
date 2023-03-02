package com.mwicks.mw20230301.controllers;

import com.mwicks.mw20230301.entities.Book;
import com.mwicks.mw20230301.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("books")
public class BookController {

    @Autowired
    BookService bookService;

    // get all books
    @RequestMapping(value = "", method = {RequestMethod.GET, RequestMethod.POST})
    public String displayAllBooks(Model model) {
        model.addAttribute("library", bookService.getAllBooks());
        return "books";
    }

    //public List<Book> displayAllBooks() {
    //    return bookService.getAllBooks();
    //}

    // display one book by ID
    @GetMapping("id/{id}")
    @ResponseBody
    public Book displayBookById(@PathVariable String id) {
        return bookService.getBookById(Integer.parseInt(id));
        //TODO combine PathVariable function to include conditional for id OR name ?
    }

    // display one book by Name
    @GetMapping("name/{name}")
    @ResponseBody
    public Book displayBookByName(@PathVariable String name) {
        return bookService.getBookByName(name);
    }

    // display add books form
    @GetMapping("add")
    public String displayAddBookForm() {
        return "form";
    }

    // add a book via post
    // TODO add via post
    @PostMapping("add")
    public String addBook(String bookName) { // must use same variable name as template
        System.out.println("addBook trigger controller");
        bookService.addBook(bookName);
        return "redirect:";
    }

    // update a book
    // TODO update

    // delete a book
    // TODO delete

}
