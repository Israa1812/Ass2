package com.example.demo.resource;


import com.example.demo.Rooms.BookRoomRepository;
import com.example.demo.model.Book;
import com.example.demo.model.room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/rest/BookRoom")
public class BookRoomresource {

    @Autowired
    BookRoomRepository bookRoomRepository;
    @GetMapping(value = "/all")
    public List<Book> getAll() {

        return  bookRoomRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Book> persits(@RequestBody final  Book book){
        bookRoomRepository.save(book);
        return bookRoomRepository.findAll();
    }
}
