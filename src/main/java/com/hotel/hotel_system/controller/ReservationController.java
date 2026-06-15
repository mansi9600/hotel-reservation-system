package com.hotel.hotel_system.controller;

import com.hotel.hotel_system.model.Reservation;
import com.hotel.hotel_system.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService service;

    @PostMapping
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return service.saveReservation(reservation);
    }

    @GetMapping
    public List<Reservation> getAllReservations() {
        return service.getAllReservations();
    }
}
