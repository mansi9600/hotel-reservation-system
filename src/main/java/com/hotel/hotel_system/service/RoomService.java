
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
    public Room updateRoom(Long id, Room newRoom) {
        Room existing = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Room not found"));

        existing.setRoomType(newRoom.getRoomType());
        existing.setPrice(newRoom.getPrice());
        existing.setAvailable(newRoom.isAvailable());

        return repository.save(existing);
    }
    public void deleteRoom(Long id) {
        repository.deleteById(id);
    }
}