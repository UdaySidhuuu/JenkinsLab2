package com.example.demo;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

	@GetMapping("/")
    public String greet(Model model) {
        String name = "Uday Partap Singh"; // Replace with logic to get the user's name
        String greeting = generateGreeting();
        String mainGreeting = greeting + ", " + name + ", Welcome to COMP367";
        model.addAttribute("greeting", mainGreeting);
        return "index";
    }

    private String generateGreeting() {
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isBefore(LocalTime.NOON)) {
            return "Good morning";
        } else {
            return "Good afternoon";
        }
    }
}
