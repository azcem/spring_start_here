package com.example.gsws_ch10_ex1.controllers;

import com.example.gsws_ch10_ex1.exceptions.NotEnoughMoneyException;
import com.example.gsws_ch10_ex1.models.ErrorDetails;
import com.example.gsws_ch10_ex1.models.PaymentDetails;
import com.example.gsws_ch10_ex1.services.PaymentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.logging.Logger;



@RestController
public class PaymentController {
    private final PaymentService paymentService;
    private static final Logger logger = Logger.getLogger(PaymentController.class.getName());

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payment")
    public ResponseEntity<PaymentDetails> makePayment(
            @RequestBody PaymentDetails paymentDetails
    ) {
        logger.info("Received payment " + paymentDetails.getAmount());
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .body(paymentDetails);

    }
}
