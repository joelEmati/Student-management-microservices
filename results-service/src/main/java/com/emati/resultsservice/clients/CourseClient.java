package com.emati.resultsservice.clients;

import com.emati.resultsservice.models.Course;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author emati
 */
public interface CourseClient {
    
@FeignClient(name="COURSES-SERVICE")
public interface CoursesClient {
    
@GetMapping("/courses") 
public List<Course> coursesList();

@GetMapping("/courses/{id}") 
public Course coursesById(@PathVariable Long id) ; 
    
}   
    
}
