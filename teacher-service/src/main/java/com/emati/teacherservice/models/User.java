package com.emati.teacherservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 *
 * @author emati
 */
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id 
    private String username;
    private String password;    
    private  int role;    
}
    
    
    
    
    
    
  