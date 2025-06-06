package com.example.sq_ch11_payments.controllers;

import com.example.sq_ch11_payments.models.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
import java.util.logging.Logger;

@RestController
public class PaymentsController {

    private static Logger logger = Logger.getLogger(PaymentsController.class.getName());

    @PostMapping("/payments")
    public ResponseEntity<Payment> createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment
    ) {
        logger.info("Received payment request with id: " + requestId + " ;Payment amount: " + payment.getAmount());
        payment.setId(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.OK).header("requestId", requestId).body(payment);
    }
}
