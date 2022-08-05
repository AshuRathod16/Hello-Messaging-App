package com.bridgelabz.HelloMessagingApp.controller;

import com.bridgelabz.HelloMessagingApp.controller.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloMessagingAppController {
    @GetMapping("/getdata")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/path/{name}")
    public String name(@PathVariable String name) {
        return name;
    }
}

