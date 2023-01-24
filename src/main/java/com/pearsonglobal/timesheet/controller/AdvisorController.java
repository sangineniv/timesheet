package com.pearsonglobal.timesheet.controller;

import com.pearsonglobal.timesheet.dao.AdvisorDao;
import com.pearsonglobal.timesheet.dto.AdvisorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvisorController {
    @Autowired
    AdvisorDao advisorDao;
   @GetMapping(value = {"/advisor"},path = {"/advisor"})

    public AdvisorDto advisor(@RequestParam int advisorId){
      AdvisorDto advisorDto = advisorDao.search(advisorId);
      return advisorDto;
  }
    @GetMapping(value = {"/advisorname"})
  public AdvisorDto searchByName(@RequestParam String advisorName){
       AdvisorDto advisorDto = advisorDao.search(advisorName);
       return advisorDto;
  }


}