package com.pearsonglobal.timesheet.dao;

import com.pearsonglobal.timesheet.dto.StudentDto;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    public StudentDto find(){
        StudentDto studentDto =new StudentDto();
        studentDto.setStudentId(700);
        studentDto.setStudentName("John");
        studentDto.setUniversityName("University of Maryland");
        return studentDto;
    }
}
