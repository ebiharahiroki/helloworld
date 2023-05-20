package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloWorldController {
    @GetMapping("/Bonjour")
    public String Bonjour(){
        List<String> names = List.of("hello", "bonjour", "guten tag", "buon giorno", "ciao");
        List<String> result = names.stream().filter(name -> name.contains("a")).toList();
        return result.toString();
    }
}
