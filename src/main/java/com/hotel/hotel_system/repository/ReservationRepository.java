package com.hotel.hotel_system.repository;

import com.hotel.hotel_system.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    @Query("""
        SELECT COUNT(r) > 0
        FROM Reservation r
        WHERE r.room.id = :roomId
        AND r.checkInDate <= :checkOutDate
        AND r.checkOutDate >= :checkInDate
    """)
    boolean existsOverlappingReservation(
            @Param("roomId") Long roomId,
            @Param("checkInDate") String checkInDate,
            @Param("checkOutDate") String checkOutDate
    );
}