package com.springboot.part3.controller;

import com.springboot.part3.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    ArrayList<User> users = new ArrayList<>();
    @Autowired
    FakeRepoInterface fakeRepoInterface;
    @PostMapping("/adduser")
    public User newUser(@RequestBody User user){
        return fakeRepoInterface.insertUser(user);
    }
    @GetMapping("/getUser/{id}")
    public ResponseEntity<User> getUser(@PathVariable(value = "id")long userId){
        return new ResponseEntity(fakeRepoInterface.findUserById(userId), HttpStatus.OK);
    }
//    @DeleteMapping("/{id}")//    public ResponseEntity<String> deleteUser(@PathVariable(value = "id")long userId){
//        fakeRepoInterface.deleteUser(userId);
//        return new ResponseEntity("Success!", HttpStatus.OK);
//    }
}