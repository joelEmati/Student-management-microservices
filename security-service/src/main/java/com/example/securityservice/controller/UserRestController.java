
package com.example.securityservice.controller;


import com.example.securityservice.entities.User;
import com.example.securityservice.repository.UserRepository;
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
public class UserRestController {
    private UserRepository  userRepository;

    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    
    
  @GetMapping("/users") 
  public List<User> userList() {
        return userRepository.findAll();
    }
  
  @GetMapping("/users/{id}") 
   public User userById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }
  
  
   @PostMapping("/users/{id}") 
   public void removeById(@PathVariable Long id) {
       userRepository.deleteById(id);
    } 
  
  
   @PostMapping("/uusers") 
    public void updateUser(User User) {
       userRepository.save(User);
    } 
  
    
    
}
