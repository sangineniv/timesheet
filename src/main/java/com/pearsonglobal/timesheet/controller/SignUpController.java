package com.pearsonglobal.timesheet.controller;

import com.pearsonglobal.timesheet.dao.SignUpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SignUpController {
    @Autowired
    SignUpDao signUp;

    @GetMapping("/get")
    public String getCall() {

        //signUp.signup();
        return "This is a GET call";
    }

    @PostMapping("/post")
    public String postCall() {

        //signUp.signup();
        return "This is a POST call";
    }
}
