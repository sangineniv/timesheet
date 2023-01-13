package com.pearsonglobal.timesheet.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "student")
@Setter
@Getter
public class StudentDto {
    @Id
    private int id;
    private String name;
    private String universityName;


}

