package com.sm.springbootsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    String login(){
        return "login";
    }

    @GetMapping("/success")
    String success(){
        return "success";
    }

    @GetMapping("/index")
    String logout(){
        return "index";
    }

}
