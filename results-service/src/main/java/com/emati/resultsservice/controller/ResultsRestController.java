package com.emati.resultsservice.controller;

import com.emati.resultsservice.entities.Results;
import com.emati.resultsservice.repository.ResultsRepository;
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
public class ResultsRestController {
    private ResultsRepository  resultsRepository;

    public ResultsRestController(ResultsRepository resultsRepository) {
        this.resultsRepository = resultsRepository;
    }
    
    
    
  @GetMapping("/results") 
  public List<Results> resultsList() {
        return resultsRepository.findAll();
    }
  
  @GetMapping("/results/{id}") 
   public Results resultsById(@PathVariable Long id) {
        return resultsRepository.findById(id).get();
    }
  
  
   @PostMapping("/results/{id}") 
   public void removeById(@PathVariable Long id) {
       resultsRepository.deleteById(id);
    } 
  
  
   @PostMapping("/uresults") 
    public void updateResult(Results results) {
       resultsRepository.save(results);
    }
  
    
    
}

