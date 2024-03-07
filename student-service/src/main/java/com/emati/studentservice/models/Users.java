package com.emati.studentservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/**
 *
 * @author emati
 */
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class Users {
    @Id 
    private String username;
    private String password;    
    private  int role;    
}
    
    
    
    
    
    
  