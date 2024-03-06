package com.emati.resultsservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import java.io.Serializable;
import lombok.*;

/**
 *
 * @author emati
 */

@Getter @Setter @ToString @Builder @NoArgsConstructor @AllArgsConstructor
public class Student implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String nom;
    private String prenom;  
    private String tel;      
    @Transient
    private User user;
    private int userid; 
}
