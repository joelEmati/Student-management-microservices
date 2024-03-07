
package com.emati.coursesservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import lombok.*;

/**
 *
 * @author emati
 */
@Entity
@Getter @Setter @Builder @NoArgsConstructor @AllArgsConstructor
public class Section {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long section;
    @Transient
    private Course course;
    private Long courseid;
}
