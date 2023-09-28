package com.example.smarthomeifpi.rooms.api;

import com.example.smarthomeifpi.places.app.Dtos.PlaceDto;
import com.example.smarthomeifpi.rooms.app.dtos.RoomDto;
import com.example.smarthomeifpi.rooms.app.entities.Room;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RoomsController {
    public List<Room> listAllRooms(){
        return null;
    }

    @PostMapping("/rooms")
    @ResponseStatus(HttpStatus.CREATED)
    public void createNewRoom(){}

    @PutMapping("/rooms/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateRoom(@PathVariable Long id, RoomDto roomDto){}

    @DeleteMapping("/rooms/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteRoom(@PathVariable Long id){}
}
