package com.example.manageuser.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class StringService {

    public List<String> getListString(){
        return getStrings();
    }

    public static List<String> getStrings() {
        List<String> stringList = new ArrayList<>();
        stringList.add("String1");
        stringList.add("String2");
        stringList.add("String3");
        stringList.add("String4");
        stringList.add("String5");
        stringList.add("String6");
        return stringList;
    }

    public static List<String> createString(String string){
        List<String> stringList = getStrings();
        stringList.add(string);
        return stringList;
    }
}
