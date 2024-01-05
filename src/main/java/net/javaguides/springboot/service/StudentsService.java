package net.javaguides.springboot.service;
import java.util.List;

import net.javaguides.springboot.entity.Students;
public interface StudentsService {
	
 List <Students> getAllStudents();
 
 Students saveStudents(Students students);
 
 Students getStudentsById(Long id);
 
 Students updateStudents(Students students);
 
 void deleteStudentsById(Long id);

}
