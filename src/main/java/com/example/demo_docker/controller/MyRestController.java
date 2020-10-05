package com.example.demo_docker.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/demo")
public class MyRestController {

    @GetMapping("/get")
    public String helloString()
    {
        return "Hai";
    }
}
