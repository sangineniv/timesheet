package com.pearsonglobal.timesheet.controller;

import com.pearsonglobal.timesheet.dao.ClassroomDao;
import com.pearsonglobal.timesheet.dto.ClassroomDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassroomController {
    @Autowired
    ClassroomDao classroomdao;
        @GetMapping(value = {"/classroom",""},path = {"/classroom",""})
        public ClassroomDto classroom(){
        ClassroomDto classroomdto = classroomdao.search();
            return classroomdto;
    }
}
