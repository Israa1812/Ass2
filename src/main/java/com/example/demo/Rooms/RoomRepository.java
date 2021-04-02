package com.example.demo.Rooms;

import com.example.demo.model.room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository <room,Integer> {
}
