package com.yarisingu.pgman.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/allusers")
    public String allUsers()
    {
        return "This is users data";
    }
    
}
