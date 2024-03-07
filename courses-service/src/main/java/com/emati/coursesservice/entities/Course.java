
package com.emati.coursesservice.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.*;

/**
 *
 * @author emati
 */
@Entity
@Getter @Setter @ToString @Builder @NoArgsConstructor @AllArgsConstructor
public class Course implements Serializable {
    @Id 
    private String code;
    private int nb_personne;
    private String nom;
    
}
