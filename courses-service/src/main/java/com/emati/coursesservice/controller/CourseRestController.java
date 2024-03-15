
package com.emati.coursesservice.controller;

import com.emati.coursesservice.entities.Course;
import com.emati.coursesservice.repository.CourseRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author emati
 */
@RestController
public class CourseRestController {
    private CourseRepository  courseRepository;

    public CourseRestController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    
    
    
  @GetMapping("/courses") 
  public List<Course> courseList() {
        return courseRepository.findAll();
    }
  
  @GetMapping("/courses/{id}") 
   public Course courseById(@PathVariable Long code) {
        return courseRepository.findById(code).get();
    }
  
  
   @PostMapping("/courses/{id}") 
   public void removeById(@PathVariable Long code) {
       courseRepository.deleteById(code);
    } 
  
  
   @PostMapping("/ucourses/") 
    public void updateCourse(Course course) {
       courseRepository.save(course);
    } 
  
    
    
}
