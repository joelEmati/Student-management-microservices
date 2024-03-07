package com.emati.studentservice.repository;

import com.emati.studentservice.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emati
 */
public interface StudentRepository extends JpaRepository <Student, Long>{
    
}
