package com.pearsonglobal.timesheet.dao;

import com.pearsonglobal.timesheet.dto.AdvisorDto;
import com.pearsonglobal.timesheet.dto.PersonDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdvisorDao {
    @Autowired
    EntityManager entityManager;
    public AdvisorDto search(int advisorId){
       AdvisorDto advisorDto= entityManager.find(AdvisorDto.class, advisorId);
        return advisorDto;
    }
    public AdvisorDto search(String advisorName){
        Query query = entityManager.createQuery("select * from AdvisorDto where name= ?");
        query.setParameter(0,advisorName);
        AdvisorDto object=(AdvisorDto)query.getSingleResult();

        return object;
    }
}
