package com.emati.studentservice.controller;

import com.emati.studentservice.entities.Student;
import com.emati.studentservice.repository.StudentRepository;
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
public class StudentRestController {
    private StudentRepository  studentRepository;

    public StudentRestController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
    
    
    
  @GetMapping("/students") 
  public List<Student> studentList() {
        return studentRepository.findAll();
    }
  
  @GetMapping("/students/{id}") 
   public Student studentById(@PathVariable Long id) {
        return studentRepository.findById(id).get();
    }
  
  
   @PostMapping("/students/{id}") 
   public void removeById(@PathVariable Long id) {
       studentRepository.deleteById(id);
    } 
  
  
   @PostMapping("/ustudents") 
    public void updateStudent(Student student) {
       studentRepository.save(student);
    } 
  
    
    
}


