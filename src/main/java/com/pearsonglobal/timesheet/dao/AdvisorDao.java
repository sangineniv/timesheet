package com.pearsonglobal.timesheet.dao;

import com.pearsonglobal.timesheet.dto.AdvisorDto;
import com.pearsonglobal.timesheet.dto.PersonDto;
import org.springframework.stereotype.Repository;

@Repository
public class AdvisorDao {
    public AdvisorDto search(){
        AdvisorDto advisorDto=new AdvisorDto();
        advisorDto.setId(1);
        advisorDto.setName("nikhitha");
        advisorDto.setCourse("java");
        return advisorDto;
    }
}
