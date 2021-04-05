package com.example.demo.Repository;

import com.example.demo.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRoomRepository extends JpaRepository<Book,Integer> {
}
