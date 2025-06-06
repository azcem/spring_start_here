package com.example.sq_ch13_ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.sq_ch13_ex1.controllers", "com.example.sq_ch13_ex1.services", "com.example.sq_ch13_ex1.repositories"})
public class SqCh13Ex1Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh13Ex1Application.class, args);
	}

}
