
package com.emati.coursesservice.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int code;
    private int nb_personne;
    private String nom;
    
}
