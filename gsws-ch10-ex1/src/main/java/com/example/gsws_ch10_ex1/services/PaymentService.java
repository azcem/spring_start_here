package com.example.gsws_ch10_ex1.services;

import com.example.gsws_ch10_ex1.exceptions.NotEnoughMoneyException;
import com.example.gsws_ch10_ex1.models.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
