package com.example.demo.resource;

import com.example.demo.Rooms.RoomRepository;
import com.example.demo.model.room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/rest/Room")
public class Roomsresource {

    @Autowired
    RoomRepository roomRepository;
    @GetMapping(value = "/all")
    public List<room> getAll() {

        return  roomRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<room> persits(@RequestBody final  room rooms){
        roomRepository.save(rooms);
        return roomRepository.findAll();
    }




}
