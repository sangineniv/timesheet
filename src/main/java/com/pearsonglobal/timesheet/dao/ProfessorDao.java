package com.pearsonglobal.timesheet.dao;

import com.pearsonglobal.timesheet.dto.ProfessorDto;
import org.springframework.stereotype.Repository;

@Repository
public class ProfessorDao {

    public ProfessorDto find(){
        ProfessorDto professorDto = new ProfessorDto();
        professorDto.setId(100);
        professorDto.setName("taibul");
        return professorDto;
    }
}
