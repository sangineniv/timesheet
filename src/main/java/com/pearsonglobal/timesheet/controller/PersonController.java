package com.pearsonglobal.timesheet.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 public class PersonController {
    @GetMapping(value = {"/call",""},path = {"/call",""})
    public String retrieve(){
        return "1";
    }
}
