package com.example.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WelcomeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WelcomeAppApplication.class, args);
    }

    @GetMapping("/")
    public String welcome() {
        return "Welcome to 2025!";
    }
}