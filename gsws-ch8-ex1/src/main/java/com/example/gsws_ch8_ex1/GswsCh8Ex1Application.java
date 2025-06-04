package com.example.gsws_ch8_ex1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.gsws_ch8_ex1.controllers", "com.example.gsws_ch8_ex1.services"})
public class GswsCh8Ex1Application {

	public static void main(String[] args) {
		SpringApplication.run(GswsCh8Ex1Application.class, args);
	}

}
