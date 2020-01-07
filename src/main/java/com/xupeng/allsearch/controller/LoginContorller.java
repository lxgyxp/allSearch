package com.xupeng.allsearch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginContorller {

    @RequestMapping(value = "/login")
    public String login() {
        return "/index";
    }
}
