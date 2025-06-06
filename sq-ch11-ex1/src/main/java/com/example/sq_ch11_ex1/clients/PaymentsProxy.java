package com.example.sq_ch11_ex1.clients;

import com.example.sq_ch11_ex1.models.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "payments",
url = "${name.service.url}")
public interface PaymentsProxy {

    @PostMapping("/payments")
    Payment createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment
    );
}
