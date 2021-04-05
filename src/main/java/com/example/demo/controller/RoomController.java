package com.example.demo.controller;


import com.example.demo.entity.Room;
import com.example.demo.servace.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/Room")
public class RoomController {

    @Autowired
    RoomService roomService;

    @PostMapping("/addRoom")
    public Room addRoom( @RequestBody  Room room){
        return roomService.saveRoom(room);
    }

    @PostMapping("/addRooms")
    public List<Room> addRooms(@RequestBody  List<Room> room){
        return roomService.saveRoom(room);
    }
    @GetMapping("/Rooms")
    public List<Room> findAllRoom(){
        return roomService.getRoom();
    }
    @GetMapping("/Rooms/{id}")
    public Room findRoomById( @PathVariable int id){
        return roomService.getRoomById(id);
    }




}
