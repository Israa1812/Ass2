package com.example.demo.servace;


import com.example.demo.Repository.BookRoomRepository;
import com.example.demo.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRoomRepository bookRoomRepository;

    //post method//

    public Book saveBook(Book book){
        return bookRoomRepository.save(book);
    }

    public List<Book> saveBook(List<Book> books){
        return bookRoomRepository.saveAll(books);
    }


    //get method//
    public List<Book> getBook(){
        return bookRoomRepository.findAll();
    }

    public Book getBookById(int id){
        return bookRoomRepository.findById(id).orElse(null);
    }


}
