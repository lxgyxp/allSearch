package com.xupeng.allsearch.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginContorller {

    @RequestMapping(value = "/login")
    public String login(){
        return "Hello World!";
    }
}
