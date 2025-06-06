package com.example.sq_ch12_ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.sq_ch12_ex1", "com.example.sq_ch12_ex1.controllers", "com.example.sq_ch12_ex1.repositories"})
public class SqCh12Ex1Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh12Ex1Application.class, args);
	}

}
