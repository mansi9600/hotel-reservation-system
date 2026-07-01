
package com.hotel.hotel_system.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping("/success/{reservationId}")
    public String paymentSuccess(@PathVariable Long reservationId) {
        return "Payment successful for reservation " + reservationId;
    }

    @PostMapping("/fail/{reservationId}")
    public String paymentFail(@PathVariable Long reservationId) {
        return "Payment failed for reservation " + reservationId;
    }
}