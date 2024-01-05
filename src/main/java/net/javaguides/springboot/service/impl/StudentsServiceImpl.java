package net.javaguides.springboot.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.springboot.entity.Students;
import net.javaguides.springboot.repository.StudentsRepository;
import net.javaguides.springboot.service.StudentsService;

@Service
public class StudentsServiceImpl implements StudentsService {

	private StudentsRepository studentsRepository;
	
	public StudentsServiceImpl(StudentsRepository studentsRepository) {
		super();
		this.studentsRepository = studentsRepository;
	}

	@Override
	public List<Students> getAllStudents()
	{
		return studentsRepository.findAll();
	}
	@Override 
	public Students saveStudents(Students students) {
		return studentsRepository.save(students);
	}

	@Override
	public Students getStudentsById(Long id) {
		// TODO Auto-generated method stub
		return  studentsRepository.findById(id).get();
	}

	@Override
	public Students updateStudents(Students students) {
		// TODO Auto-generated method stub
		return studentsRepository.save(students);
	}

	@Override
	public void deleteStudentsById(Long id) {
		// TODO Auto-generated method stub
		studentsRepository.deleteById(id);
	}

	
}
