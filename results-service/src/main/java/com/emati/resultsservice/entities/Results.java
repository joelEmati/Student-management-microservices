package com.emati.resultsservice.entities;

import com.emati.resultsservice.models.Course;
import com.emati.resultsservice.models.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.*;

/**
 *
 * @author emati
 */
@Entity
@Getter @Setter @ToString @Builder @NoArgsConstructor @AllArgsConstructor
public class Results implements Serializable {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;    
    @Transient
    private Student student;
    @Transient
    private Course course;
    private Long studentid;
    private String courseid;
}
