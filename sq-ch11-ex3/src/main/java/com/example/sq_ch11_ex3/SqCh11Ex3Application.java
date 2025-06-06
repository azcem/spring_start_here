package com.example.sq_ch11_ex3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.sq_ch11_ex3",
"com.example.sq_ch11_ex3.controllers", "com.example.sq_ch11_ex3.proxies"})
public class SqCh11Ex3Application {

	public static void main(String[] args) {
		SpringApplication.run(SqCh11Ex3Application.class, args);
	}

}
