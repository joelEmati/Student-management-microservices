
package com.emati.coursesservice.entities;

import com.emati.coursesservice.entities.models.Teacher;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import java.util.Date;
import lombok.*;

/**
 *
 * @author emati
 */
@Entity
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class Module {
    @Id 
    private String code;
    private Date date_debut;
    private Date date_fin;    
    private int moment;   
    private Course course;
    private int teacherid;
    @Transient  
    private Teacher teacher;


    
}
