package com.emati.teacherservice.entities;

import com.emati.teacherservice.models.Users;
import jakarta.persistence.Entity;
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
@Entity
@Getter @Setter @ToString @Builder @NoArgsConstructor @AllArgsConstructor
public class Teacher implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String nom;
    private String prenom;  
    @Transient
    private Users users;
    private int usersid;   
}
