
package com.emati.studentservice.clients;

import com.emati.studentservice.models.Users;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author emati
 */
public interface UserClient {
    
@FeignClient(name="USER-SERVICE")
public interface usersClient {
    
@GetMapping("/users") 
public List<Users> usersList();

@GetMapping("/users/{id}") 
public Users usersById(@PathVariable Long id) ; 
    
}   
    
}