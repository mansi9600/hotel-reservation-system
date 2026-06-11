
package com.hotel.hotel_system.service;

import com.hotel.hotel_system.model.Room;
import com.hotel.hotel_system.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    private RoomRepository repository;

    public Room addRoom(Room room) {
        return repository.save(room);
    }

    public List<Room> getAllRooms() {
        return repository.findAll();
    }
}