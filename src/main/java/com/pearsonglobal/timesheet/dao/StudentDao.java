package com.pearsonglobal.timesheet.dao;

import com.pearsonglobal.timesheet.dto.StudentDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

    @Autowired
    EntityManager entityManager;

    public StudentDto find(int studentId) {
        return entityManager.find(StudentDto.class, studentId);
    }

    public StudentDto find(String name) {
        //TypedQuery<StudentDto> student =entityManager.createQuery("SELECT s FROM student s WHERE s.name='"+name + "'",StudentDto.class);
        Query query = entityManager.createQuery("SELECT s FROM student s WHERE s.name=:name", StudentDto.class);
        query.setParameter("name", name);
        StudentDto object = (StudentDto) query.getSingleResult();
        return object;
    }
}
