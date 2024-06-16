package com.example.manageuser.service;

import com.example.manageuser.dto.UserCreationRequest;
import com.example.manageuser.dto.UserUpdateRequest;
import com.example.manageuser.entity.User;
import com.example.manageuser.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
     private UserRepository userRepository;

    public User createRequest(UserCreationRequest request){
        User user = new User();
        user.setUserName(request.getUserName());
        user.setPassword(request.getPassword());
        user.setFullName(request.getFullName());
        user.setPosition(request.getPosition());
        return userRepository.save(user);
    }

    public User updateUser (String userName, UserUpdateRequest request){
        User user = getUserByUsername(userName);
        user.setPassword(request.getPassword());
        user.setFullName(request.getFullName());
        user.setPosition(request.getPosition());

        return userRepository.save(user);
    }

    public boolean isUserExists(String userName) {
        return userRepository.findByUserName(userName) != null;
    }

    public User getUserByUsername(String userName){
        return userRepository.findByUserName(userName);
    }
    public User getUserById(String id){
        return userRepository.findById(id).orElseThrow(()-> new RuntimeException("User not found"));
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }

}
