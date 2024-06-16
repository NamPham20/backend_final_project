package com.example.manageuser.controller;


import com.example.manageuser.dto.UserCreationRequest;
import com.example.manageuser.dto.UserUpdateRequest;
import com.example.manageuser.entity.User;
import com.example.manageuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    User createUser(@RequestBody UserCreationRequest request){
        if(userService.isUserExists(request.getUserName())){
            return null;
        }
        return userService.createRequest(request);
    }

    @GetMapping("users/{userName}")
    User getUserByUserName(@PathVariable("userName") String userName){
        return userService.getUserByUsername(userName);
    }

    @GetMapping("/users")
    List<User> getAllUser(){
        return userService.getAllUser();
    }

    @PutMapping("/users/{userName}")
    User updateUserById(@PathVariable("userName") String userName,@RequestBody UserUpdateRequest request){
        return userService.updateUser(userName,request);
    }

    @DeleteMapping("*/{id}")
    void deleteUser(@PathVariable("id") String id){
        userService.deleteUser(id);
    }
}
