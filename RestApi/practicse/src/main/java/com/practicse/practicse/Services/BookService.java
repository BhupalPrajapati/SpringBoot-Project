package com.practicse.practicse.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.practicse.practicse.Entites.Book;

@Service
public class BookService {
    private static List<Book> list = new ArrayList<>();
    static {
        list.add(new Book(12, "java Documentation", "XYZ"));
        list.add(new Book(13, "Rust Documentation", "Rust Developer"));
        list.add(new Book(14, "Spring Documentation", "Spring Developer"));
    }

    // new getAllBooks
    public List<Book> getAllBooks() {
        return list;
    }

    // if you want to find only one book at a time then you can use book id by using
    // stream api in java

    public Book getBooK(int id) {
        Book book = null;
        book = list.stream().filter(e -> e.getId() == id).findFirst().get();
        return book;
    }

    // make another handler to call only book

}
