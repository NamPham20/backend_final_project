package com.example.manageuser.controller;

import com.example.manageuser.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ListStringController {
    @Autowired
    private StringService service;

    @GetMapping("/strings")
    List<String> getStrings (){
        return service.getListString();
    }


}
