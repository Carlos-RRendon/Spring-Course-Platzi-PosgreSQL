package com.platzi.posgresql.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class InitController {

    @GetMapping
    public String saludar(){
        return "Hello from the other side";
    }

}
