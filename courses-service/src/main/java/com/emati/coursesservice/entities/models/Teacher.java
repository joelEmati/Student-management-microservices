
package com.emati.coursesservice.entities.models;

import jakarta.persistence.Id;
import lombok.*;

/**
 *
 * @author emati
 */
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class Teacher {
    @Id 
    private int id;
    private String email;
    private String nom;
    private String prenom;  
    private String user;    
}
