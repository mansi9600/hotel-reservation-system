package com.hotel.hotel_system.service;

import com.hotel.hotel_system.model.Reservation;
import com.hotel.hotel_system.repository.ReservationRepository;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hotel.hotel_system.model.ReservationStatus;
import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    @Autowired
    private RedissonClient redissonClient;

    public Reservation saveReservation(Reservation reservation) {

        reservation.setStatus(ReservationStatus.HELD);
        String lockName = "room_lock_" + reservation.getRoom().getId();
        RLock lock = redissonClient.getLock(lockName);

        lock.lock();

        try {
            return repository.save(reservation);
        } finally {
            lock.unlock();
        }
    }

    public List<Reservation> getAllReservations() {
        return repository.findAll();
    }

    public boolean isRoomAvailable(
            Long roomId,
            String checkInDate,
            String checkOutDate
    ) {
        return !repository.existsOverlappingReservation(
                roomId,
                checkInDate,
                checkOutDate
        );
    }
}