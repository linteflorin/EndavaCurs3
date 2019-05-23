package com.example.security.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Contoller+@ResponseBody !!!
public class HelloController {
    //curl -u user:(parola aici) http://localhost:8080/hello (in git)
    @GetMapping("/hello")
    public String Hello(){
        return "HELLO";

    }

    @GetMapping("/world")
    public String world(){
        return "WORLD";
    }
}
