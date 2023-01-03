package com.pearsonglobal.timesheet.controller;

import com.pearsonglobal.timesheet.dao.AdvisorDao;
import com.pearsonglobal.timesheet.dto.AdvisorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvisorController {
    @Autowired
    AdvisorDao advisorDao;
   @GetMapping(value = {"/advisor",""},path = {"/advisor",""})
    public AdvisorDto advisor(){
      AdvisorDto advisorDto = advisorDao.search();
      return advisorDto;
  }


}