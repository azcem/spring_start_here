package com.example.gsws_ch10_ex1.controllers;

import com.example.gsws_ch10_ex1.models.Country;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @GetMapping("/france")
    public ResponseEntity<Country> france() {
        Country c = Country.of("France", 666);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent", "Europe")
                .header("capital", "Paris")
                .header("favorite_food", "cheese and wine")
                .body(c);
    }

    @GetMapping("/all")
    public List<Country> countries() {
        Country c1 = Country.of("Italy", 1000);
        Country c2 = Country.of("Spain", 2000);
        return List.of(c1, c2);
    }
}
