package com.pearsonglobal.timesheet.dao;


import com.pearsonglobal.timesheet.dto.PersonDto;
import org.springframework.stereotype.Repository;

@Repository
public class AddressDao {

    public PersonDto find(){
        PersonDto personDto1=new PersonDto();
        personDto1.setId(3);
        personDto1.setName("alan");
        return personDto1;
    }
        }
