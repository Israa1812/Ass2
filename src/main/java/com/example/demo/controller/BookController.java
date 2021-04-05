package com.example.demo.controller;


import com.example.demo.entity.Book;
import com.example.demo.servace.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/BookRoom")
public class BookController {
    @Autowired
    BookService  bookService;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return bookService.saveBook(book);
    }

    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody  List<Book> books){
        return bookService.saveBook(books);
    }
    @GetMapping("/Books")
    public List<Book> findAllBook(){
        return bookService.getBook();
    }
    @GetMapping("/Books/{id}")
    public Book findBookById( @PathVariable int id){
        return bookService.getBookById(id);
    }

}
