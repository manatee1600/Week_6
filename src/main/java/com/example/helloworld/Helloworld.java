package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class Helloworld {

    @GetMapping("/hello")
    public String hello(){
        Date date = new Date();
        return "hello world" + date;
    }
}
