package com.pearsonglobal.timesheet.controller;

import com.pearsonglobal.timesheet.dto.ProfessorDto;
import com.pearsonglobal.timesheet.dao.ProfessorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProfessorController {
    @Autowired
    ProfessorDao professorDao;
    @GetMapping(value = {"/professor", ""}, path = {"/professor", ""}, produces = {"application/xml"})
    public ProfessorDto retrieve() {
        return professorDao.find();
    }
}
