
package com.emati.coursesservice.entities;

import com.emati.coursesservice.entities.models.Teacher;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long code;
    private Date date_debut;
    private Date date_fin;    
    private int moment;   
    @Transient
    private Course course;
    private Long courseid;
    private int teacherid;
    @Transient  
    private Teacher teacher;   
}
