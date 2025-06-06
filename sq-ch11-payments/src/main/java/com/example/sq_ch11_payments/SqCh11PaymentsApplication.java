package com.example.sq_ch11_payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.sq_ch11_payments.controllers"})
public class SqCh11PaymentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SqCh11PaymentsApplication.class, args);
	}

}
