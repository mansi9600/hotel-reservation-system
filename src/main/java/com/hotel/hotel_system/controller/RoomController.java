package com.hotel.hotel_system.controller;

import com.hotel.hotel_system.model.Room;
import com.hotel.hotel_system.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService service;

    @PostMapping
    public Room addRoom(@RequestBody Room room) {
        return service.addRoom(room);
    }
    @GetMapping
    public List<Room> getRooms() {
        List<Room> rooms = service.getAllRooms();
        System.out.println("Rooms count = " + rooms.size());
        return rooms;
    }

    @GetMapping("/test")
    public String test() {
        System.out.println("TEST METHOD HIT");
        return "Room Controller Working";
    }
    @PutMapping("/{id}")
    public Room updateRoom(@PathVariable Long id, @RequestBody Room room) {
        return service.updateRoom(id, room);
    }
    @DeleteMapping("/{id}")
    public String deleteRoom(@PathVariable Long id) {
        service.deleteRoom(id);
        return "Room deleted successfully";
    }
    @GetMapping("/update-test")
    public Room testUpdate() {
        Room room = new Room();
        room.setRoomType("Updated Deluxe");
        room.setPrice(3000);
        room.setAvailable(true);

        return service.updateRoom(1L, room);
    }
    @GetMapping("/delete-test")
    public String testDelete() {
        service.deleteRoom(2L);
        return "Deleted Room 2";
    }
}
