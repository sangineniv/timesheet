package com.pearsonglobal.timesheet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AddressController {

    @GetMapping(value = {"/addition",""},path = {"/addition",""})
    public String retrieve(){
       return "1";
    }

}
