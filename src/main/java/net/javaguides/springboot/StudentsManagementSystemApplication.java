package net.javaguides.springboot;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import net.javaguides.springboot.repository.StudentsRepository;

@SpringBootApplication
public class StudentsManagementSystemApplication implements CommandLineRunner {

    StudentsManagementSystemApplication(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

	public static void main(String[] args) {
		SpringApplication.run(StudentsManagementSystemApplication.class, args);
	}
	private final StudentsRepository studentsRepository;
	@Override
	public void run(String ...args)throws Exception{
		
	/*	Students students1= new Students("Kundan","Sharma","Kundan.sharma52017@gmail.com","7492072522");
		studentsRepository.save(students1);
		
		Students students2= new Students("Kunal","Sharma","nkunalsharma009@gmail.com","8077267317");
		studentsRepository.save(students2);
		
		Students students3= new Students("Shweeta","Kumari","Shweeta93@gmail.com","9304153840");
		studentsRepository.save(students3);
		
	}
	
*/
		 
	    
	}

	public StudentsRepository getStudentsRepository() {
		return studentsRepository;
	}}
