package com.example.demo.Repository;

import com.example.demo.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository <Room,Integer> {
}
