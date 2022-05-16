package com.health.healthsys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
        @RequestMapping("hello")
public class HelloController {

    @GetMapping("/dunya")
    public String merhaba() {
        return "Merhaba Dünya!";
        //System.out.println("Merhaba Dünya!");
    }
}
