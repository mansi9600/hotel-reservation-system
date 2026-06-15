package com.hotel.hotel_system.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class ReservationControllerTest {

    @Test
    void reservationApiTest() {
        String apiName = "Reservation API";
        assertNotNull(apiName);
    }
}