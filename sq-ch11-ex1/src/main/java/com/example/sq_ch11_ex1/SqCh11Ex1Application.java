package com.example.sq_ch11_ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.sq_ch11_ex1.clients", "com.example.sq_ch11_ex1.controllers", "com.example.sq_ch11_ex1"})
public class SqCh11Ex1Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh11Ex1Application.class, args);
	}

}
