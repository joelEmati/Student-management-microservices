package com.example.securityservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;


/**
 *
 * @author emati
 */
@Entity
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class User {
    @Id 
    private String username;
    private String password; 
    @Enumerated(EnumType.ORDINAL)
    private  Role role;    
}
    
    
    
    
    
    
  