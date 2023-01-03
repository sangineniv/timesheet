package com.pearsonglobal.timesheet.dao;

import com.pearsonglobal.timesheet.dto.ClassroomDto;
import org.springframework.stereotype.Repository;

@Repository
public class ClassroomDao {
        public ClassroomDto search(){
            ClassroomDto classroomdto = new ClassroomDto();
            classroomdto.setNumberOfStudents(50);
            classroomdto.setNumberOfProfessors(10);
            classroomdto.setNumberOfAdvisors(5);
            return classroomdto;
    }
}
