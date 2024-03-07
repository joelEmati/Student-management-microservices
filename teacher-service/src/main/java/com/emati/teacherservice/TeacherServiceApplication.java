package com.emati.teacherservice;

import com.emati.teacherservice.entities.Teacher;
import com.emati.teacherservice.repository.TeacherRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TeacherServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeacherServiceApplication.class, args);
	}
 @Bean
 CommandLineRunner commamdLineRunner(TeacherRepository teacherRepository)  {
     
        return arg -> {
                
            List<Teacher> teacherList=List.of(
                    
                Teacher.builder()
                    .nom("Tesla")
                    .prenom("Nicolas")
                    .usersid(1)
                    .build(),    
                    
                Teacher.builder()
                    .nom("Einstein")
                    .prenom("Albert")
                    .usersid(2)
                    .build(),
                    
                 Teacher.builder()
                    .nom("Galileo")
                    .prenom("Galille")
                    .usersid(3)
                    .build()                                          
            );
            
            teacherRepository.saveAll(teacherList);
            
            };
        } 
        
        
        
}
