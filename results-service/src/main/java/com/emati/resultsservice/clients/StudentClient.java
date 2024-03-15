
package com.emati.resultsservice.clients;

import com.emati.resultsservice.entities.Results;
import com.emati.resultsservice.models.Student;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author emati
 */
@FeignClient(name="STUDENT-SERVICE")
public interface StudentClient {
    
@GetMapping("/students") 
public List<Student> studentList();

@GetMapping("/students/{id}") 
public Results studentById(@PathVariable Long id) ; 
    
}
