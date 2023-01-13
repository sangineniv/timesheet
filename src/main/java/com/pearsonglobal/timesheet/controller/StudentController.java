package com.pearsonglobal.timesheet.controller;

import com.pearsonglobal.timesheet.dao.StudentDao;
import com.pearsonglobal.timesheet.dto.StudentDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
   private StudentDao studentDao;

    @GetMapping("/getStudent")
    public StudentDto getStudent(@RequestParam int studentId) {
        return studentDao.find(studentId);
    }
    @GetMapping("/findStudent")
    public StudentDto findStudent(@RequestParam String name) {
        return studentDao.find(name);
    }

}
