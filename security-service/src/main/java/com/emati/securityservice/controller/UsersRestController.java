
package com.emati.securityservice.controller;


import com.emati.securityservice.entities.Users;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.emati.securityservice.repository.UsersRepository;

/**
 *
 * @author emati
 */

@RestController
public class UsersRestController {
    private UsersRepository  userRepository;

    public UsersRestController(UsersRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
    
  @GetMapping("/users") 
  public List<Users> userList() {
        return userRepository.findAll();
    }
  
  @GetMapping("/users/{id}") 
   public Users userById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }
  
  
   @PostMapping("/users/{id}") 
   public void removeById(@PathVariable Long id) {
       userRepository.deleteById(id);
    } 
  
  
   @PostMapping("/uusers") 
    public void updateUser(Users User) {
       userRepository.save(User);
    } 
  
    
    
}
