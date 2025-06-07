package com.example.sq_ch14_ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.sq_ch14_ex1.controllers", "com.example.sq_ch14_ex1.repositories", "com.example.sq_ch14_ex1.services"})
public class SqCh14Ex1Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh14Ex1Application.class, args);
	}

}
