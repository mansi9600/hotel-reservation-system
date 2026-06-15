package com.hotel.hotel_system.repository;

import com.hotel.hotel_system.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}