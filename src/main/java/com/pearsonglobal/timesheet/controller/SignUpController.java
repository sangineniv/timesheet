package com.pearsonglobal.timesheet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SignUpController {

    @GetMapping("/get")
    public String getCall() {
        return "This is a GET call";
    }

    @PostMapping("/post")
    public String postCall() {
        return "This is a POST call";
    }
}
