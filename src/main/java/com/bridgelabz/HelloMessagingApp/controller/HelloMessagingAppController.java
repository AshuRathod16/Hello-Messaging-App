package com.bridgelabz.HelloMessagingApp.controller;

import org.springframework.web.bind.annotation.*;
import com.bridgelabz.HelloMessagingApp.controller.dto.User;

@RestController
@RequestMapping("/hello")
public class HelloMessagingAppController {

    //Url : http://localhost:8083/hello/getdata
    @GetMapping("/getdata")
    public String hello() {
        return "Hello World";
    }

    //Url : http://localhost:8083/hello/query?name=Ashu
    @GetMapping("/query")
    public String queryParam(@RequestParam String name) {
        return "Hello" + " " + name + " " + "from Bridgelabz";
    }

    //Url :  http://localhost:8083/hello/adduser
    @PostMapping("/adduser")
    public String adduser(@RequestBody User user) {
        return user.toString();
    }

    //Url : http://localhost:8083/hello/adduserwithrequestparam?firstName=Ashwini&lastName=Rathod
    @PostMapping("/adduserwithrequestparam")
    public String adduserwithrequestparam(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();
    }

    //Url : http://localhost:8083/hello/path/Ashu
    @GetMapping("/path/{name}")
    public String name(@PathVariable String name) {
        return name;
    }

    //Url : http://localhost:8083/hello/updated?firstName=Kittu&lastName=Jadhav
    @PutMapping("/updated")
    public String update(@RequestParam String firstName, @RequestParam String lastName) {
        User user = new User();
        user.setFirstName("Ashwini");
        user.setLastName("Rathod");
        user.setFirstName(firstName);
        user.setLastName(lastName);
        return user.toString();
    }

}


