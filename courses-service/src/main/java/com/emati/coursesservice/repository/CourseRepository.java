
package com.emati.coursesservice.repository;

import com.emati.coursesservice.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
/**
 *
 * @author emati
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
