
package com.emati.teacherservice.clients;

//import com.emati.securityservice.entities.Users;
import com.emati.teacherservice.models.Users;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
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
@CircuitBreaker(name="userservice", fallbackMethod="getDefaultUser")
public Users usersById(@PathVariable Long id) ; 


default Users getDefaultUser(Long id, Exception exception){
    Users user = new Users();
    //      user.setId(id);
          user.setRole(1);
          user.setUsername("username");
          user.setPassword("password");
    return user;
 } 



}   


        
        
        
    
}