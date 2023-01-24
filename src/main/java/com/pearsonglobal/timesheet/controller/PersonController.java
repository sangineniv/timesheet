package com.pearsonglobal.timesheet.controller;


import com.pearsonglobal.timesheet.dao.AddressDao;
import com.pearsonglobal.timesheet.dto.PersonDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

 public class PersonController {
    @Autowired
    AddressDao addressDao;
//    @GetMapping(value = {"/call",""},path = {"/call",""},produces = {"application/xml"})
    public PersonDto retrieve(){
//        PersonDto personDto=new PersonDto();
//        personDto.setId(1);
//        personDto.setName("Nikhitha");
//        AddressDao addressDao = new AddressDao();
        PersonDto personDto = addressDao.find();

        return personDto;
    }
    @GetMapping(value = {"/call",""},path = {"/call",""},produces = {"application/xml"})
    public PersonDto update(){
//        PersonDto personDto=new PersonDto();
//        personDto.setId(1);
//        personDto.setName("Nikhitha");
//        AddressDao addressDao = new AddressDao();
        PersonDto personDto = addressDao.find();

        return personDto;
    }
}
