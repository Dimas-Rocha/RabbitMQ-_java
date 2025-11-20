package com.rmq.example.publisher.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class publisher {
    @PostMapping("/publish/text")
    public void publishText(@RequestBody String text){
     System.out.println("Sending message : " + text);

    }



}
