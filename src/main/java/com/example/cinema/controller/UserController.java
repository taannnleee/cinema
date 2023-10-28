package com.example.cinema.controller;

import com.example.cinema.entity.User;
import com.example.cinema.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userservice;
//    @GetMapping("")
//    public ResponseEntity<?> addUser(){
//        userservice.addUser()
//        ArrayList<User> users = userservice.addUser();
//        return  ResponseEntity.ok(users);
//    }

    @PostMapping("")
    public User add (@RequestBody User user){
        return userservice.addUser(user);
    }

}
