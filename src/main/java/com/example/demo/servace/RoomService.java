package com.example.demo.servace;

import com.example.demo.Repository.RoomRepository;
import com.example.demo.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    RoomRepository roomRepository;

    //post method//

    public Room saveRoom(Room room){
        return roomRepository.save(room);
    }

    public List<Room> saveRoom(List<Room> rooms){
        return roomRepository.saveAll(rooms);
    }


    //get method//
    public List<Room> getRoom(){
        return roomRepository.findAll();
    }

    public Room getRoomById(int id){
        return roomRepository.findById(id).orElse(null);
    }


}
