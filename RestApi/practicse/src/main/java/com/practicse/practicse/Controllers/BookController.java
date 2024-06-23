package com.practicse.practicse.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.practicse.practicse.Entites.Book;
import com.practicse.practicse.Services.BookService;

@RestController
public class BookController {

    // used the BookService class
    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public List<Book> getBooks() {

        // Book book = new Book();
        // book.setId(12);
        // book.setAuthor("Bhupal");
        // book.setTitle("Mero Book");

        return this.bookService.getAllBooks();
    }

    // to call one books at a time
    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable("id") int id) {
        return bookService.getBooK(id);
    }
}
