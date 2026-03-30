package com.example.TD4.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping("/search")
    public List<String> search(@RequestParam String title) {
        return List.of(
                "Java Basics",
                "Spring Boot Guide",
                "Clean Code");
    }

    @PostMapping("/feedback")
    public Map<String, String> feedback(@RequestBody Map<String, String> body) {
        return Map.of("status", "received");
    }
}