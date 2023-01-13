package com.pearsonglobal.timesheet.dao;

import com.pearsonglobal.timesheet.dto.StudentDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentDaoTest {
    @InjectMocks
    StudentDao studentDao;
    @Mock
    EntityManager entityManager;
    @Mock
    TypedQuery query;



    @Test
    public void testFindWithName(){
        StudentDto student =new StudentDto();
        student.setName("John");
        student.setId(10);
        student.setUniversityName("University of Maryland");
        Mockito.when(entityManager.createQuery(ArgumentMatchers.anyString(), ArgumentMatchers.any())).thenReturn(query);
        Mockito.when(query.getSingleResult()).thenReturn(student);
        StudentDto student1=studentDao.find("John");
        Assertions.assertEquals("John",student1.getName());
        System.out.println(student1);

    }
    @Test
    public void testFindWithNameFalse(){
        StudentDto student =new StudentDto();
        student.setName("Vishnu");
        student.setId(10);
        student.setUniversityName("University of Maryland");
        Mockito.when(entityManager.createQuery(ArgumentMatchers.anyString(), ArgumentMatchers.any())).thenReturn(query);
        Mockito.when(query.getSingleResult()).thenReturn(student);
        StudentDto student1=studentDao.find("John");
        Assertions.assertNotEquals("John",student1.getName());
        System.out.println(student1);

    }
}
