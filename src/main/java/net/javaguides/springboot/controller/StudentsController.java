package net.javaguides.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springboot.entity.Students;
import net.javaguides.springboot.service.StudentsService;

@Controller
public class StudentsController {
	
	private StudentsService studentsService ;

	public StudentsController(StudentsService studentsService) {
		super();
		this.studentsService = studentsService;
	}

	// Handler method to handle list students and return mode and view 
	@GetMapping("/students")
	public  String listStudents(Model model)
	{
	 model.addAttribute("students",studentsService.getAllStudents());
	 return "students";
	}
	@GetMapping("/students/new")
	public String craeteStudentsForm(Model model) {
		//create students object to hold students form data
		Students students=new Students();
		model.addAttribute("students", students);
		return "create_students";
	}
	@PostMapping("/students")
	public String saveStudents(@ModelAttribute("students")Students students) {
		studentsService.saveStudents(students);
		return "redirect:/students";
	}
	@GetMapping("/students/edit/{id}")
	public String editStudentsForm(@PathVariable Long id,Model model) {
		
		model.addAttribute("students", studentsService.getStudentsById(id));
		 return "edit_students";
	}
	@PostMapping("/students/{id}")
    public String updateStudents(@PathVariable Long id, @ModelAttribute("students") Students students,
    		Model  model) {
		
		// get  students from database by id 
		Students existingStudents=studentsService.getStudentsById(id);
		existingStudents.setId(id);
		existingStudents.setFirstName(students.getFirstName());
		existingStudents.setLastName(students.getLastName());
		existingStudents.setEmail(students.getEmail());
		existingStudents.setMobileNo(students.getMobileNo());
		
		// save update students object
		
		studentsService.updateStudents(existingStudents);
		
		return "redirect:/students";
		
		 }
	  
	// Handler method to handler delete students request
	@GetMapping("/students/{id}")
	 public String deteleStudents(@PathVariable Long id) {
		
		studentsService.deleteStudentsById(id);
		return "redirect:/students";
		 
	 }
}
