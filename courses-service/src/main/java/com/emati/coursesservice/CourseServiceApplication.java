package com.emati.coursesservice;

import com.emati.coursesservice.entities.Course;
import com.emati.coursesservice.entities.Section;
import com.emati.coursesservice.entities.Module;
import com.emati.coursesservice.repository.CourseRepository;
import com.emati.coursesservice.repository.ModuleRepository;
import com.emati.coursesservice.repository.SectionRepository;
import java.util.Date;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseServiceApplication.class, args);
	}

 @Bean
 CommandLineRunner commamdLineRunner(CourseRepository courseRepository, 
         SectionRepository sectionRepository,ModuleRepository moduleRepository)  {
     
        return arg -> {
                
            List<Course> courseList=List.of(
                    
                Course.builder()              
                    .nom("Docker and docker-compose")
                    .nb_personne(15)
                    .build(),    
                Course.builder()              
                    .nom("Kumbernetes")
                    .nb_personne(21)
                    .build(),
                Course.builder()              
                    .nom("Java")
                    .nb_personne(22)
                    .build(),                 
                Course.builder()              
                    .nom("POO")
                    .nb_personne(25)
                    .build()                
                
            );
            
            courseRepository.saveAll(courseList);
            
            
                List<Section> sectionList=List.of(                             
                Section.builder()              
                     .course(courseRepository.getById(Long.valueOf(1)))
                    .build(),    
                Section.builder()              
                     .course(courseRepository.getById(Long.valueOf(2)))
                    .build(),    
                Section.builder()              
                     .course(courseRepository.getById(Long.valueOf(3)))
                    .build(),      
                Section.builder()              
                     .course(courseRepository.getById(Long.valueOf(4)))
                    .build()                 
            );
            
            sectionRepository.saveAll(sectionList);        
            
            List<Module> moduleList=List.of(   
                        
                Module.builder() 
                     .date_debut(new Date())
                     .date_fin(new Date())
                     .moment(0)
                     .teacherid(1)
                     .courseid(Long.valueOf(1))
                    .build(),    
                Module.builder()              
                     .date_debut(new Date())
                     .date_fin(new Date())
                     .moment(0)
                     .teacherid(2)
                     .courseid(Long.valueOf(2))
                    .build(),
                Module.builder()              
                     .date_debut(new Date())
                     .date_fin(new Date())
                     .moment(0)
                     .teacherid(3)
                     .courseid(Long.valueOf(3))
                    .build(),    
                Module.builder()              
                     .date_debut(new Date())
                     .date_fin(new Date())
                     .moment(0)
                     .teacherid(4)
                     .courseid(Long.valueOf(4))
                    .build()                   
            );
            
            moduleRepository.saveAll(moduleList);      
             
            
            
      
            
            };
        } 
                
        
        
        
}
