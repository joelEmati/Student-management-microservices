
package com.emati.coursesservice.controller;

import com.emati.coursesservice.repository.ModuleRepository;
import java.util.List;
import com.emati.coursesservice.entities.Module;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author emati
 */
@RestController
public class ModuleRestController {
    
    private ModuleRepository  moduleRepository;

    public ModuleRestController(ModuleRepository moduleRepository) {
        this.moduleRepository = moduleRepository;
    }
    
    
    
  @GetMapping("/modules") 
  public List<Module> moduleeList() {
        return moduleRepository.findAll();
    }
  
  @GetMapping("/modules/{id}") 
   public Module moduleeById(@PathVariable String code) {
        return moduleRepository.findById(code).get();
    }
  
  
   @PostMapping("/modules/{id}") 
   public void removeById(@PathVariable String code) {
       moduleRepository.deleteById(code);
    } 
  
  
   @PostMapping("/umodules") 
    public void updateModule(Module module) {
       moduleRepository.save(module);
    } 
  
    
    
}
