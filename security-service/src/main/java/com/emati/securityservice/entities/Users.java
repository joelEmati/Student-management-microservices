package com.emati.securityservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;


/**
 *
 * @author emati
 */
@Entity
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class Users {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password; 
    @Enumerated(EnumType.ORDINAL)
    private  Role role;    
}
    
    
    
    
    
    
  