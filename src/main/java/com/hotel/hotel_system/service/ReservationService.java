package com.hotel.hotel_system.service;

import com.hotel.hotel_system.model.Reservation;
import com.hotel.hotel_system.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepository repository;

    public Reservation saveReservation(Reservation reservation) {
        return repository.save(reservation);
    }

    public List<Reservation> getAllReservations() {
        return repository.findAll();
    }
}
