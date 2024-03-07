package com.emati.teacherservice.controller;

import com.emati.teacherservice.entities.Teacher;
import com.emati.teacherservice.repository.TeacherRepository;
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
public class TeacherRestController {
    private TeacherRepository  teacherRepository;

    public TeacherRestController(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }
    
    
    
  @GetMapping("/teachers") 
  public List<Teacher> teacherList() {
        return teacherRepository.findAll();
    }
  
  @GetMapping("/teachers/{id}") 
   public Teacher teacherById(@PathVariable Long id) {
        return teacherRepository.findById(id).get();
    }
  
  
   @PostMapping("/teachers/{id}") 
   public void removeById(@PathVariable Long id) {
       teacherRepository.deleteById(id);
    } 
  
  
   @PostMapping("/uteachers") 
    public void updateTeacher(Teacher teacher) {
       teacherRepository.save(teacher);
    } 
  
    
    
}


