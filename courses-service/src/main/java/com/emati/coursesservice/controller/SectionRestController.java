package com.emati.coursesservice.controller;

import com.emati.coursesservice.entities.Section;
import com.emati.coursesservice.repository.SectionRepository;
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
public class SectionRestController {
    private SectionRepository  sectionRepository;

    public SectionRestController(SectionRepository sectionRepository) {
        this.sectionRepository = sectionRepository;
    }
    
    
    
  @GetMapping("/sections") 
  public List<Section> sectionList() {
        return sectionRepository.findAll();
    }
  
  @GetMapping("/sections/{id}") 
   public Section sectionById(@PathVariable Long id) {
        return sectionRepository.findById(id).get();
    }
  
  
   @PostMapping("/sections/{id}") 
   public void removeById(@PathVariable Long id) {
       sectionRepository.deleteById(id);
    } 
  
  
   @PostMapping("/usections") 
    public void updateSection(Section section) {
       sectionRepository.save(section);
    } 
  
    
    
}
