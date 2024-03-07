package com.emati.studentservice;

import com.emati.studentservice.entities.Student;
import com.emati.studentservice.repository.StudentRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StudentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceApplication.class, args);
	}

 @Bean
 CommandLineRunner commamdLineRunner(StudentRepository studentRepository)  {
     
        return arg -> {
                
            List<Student> studentList=List.of(
                    
                Student.builder()
                    .nom("john")
                    .prenom("doe")
                    .tel("77777777777")
                    .email("john@ms.sb")
                    .usersid(4)
                    .build(),    
                    
                Student.builder()
                    .nom("lockbit")
                    .prenom("supp")
                    .email("lockbit@ms.sb")                        
                    .tel("8888888888888")                        
                    .usersid(5)
                    .build(),
                    
                 Student.builder()
                    .nom("kali")
                    .prenom("linux")
                    .email("kali@ms.sb")
                    .tel("999999999999999")                         
                    .usersid(6)
                    .build()                                          
            );
            
            studentRepository.saveAll(studentList);
            
            };
        } 
                
        
}
