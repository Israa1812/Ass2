package com.example.demo.Rooms;

import com.example.demo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRoomRepository extends JpaRepository<Book,Integer> {
}
