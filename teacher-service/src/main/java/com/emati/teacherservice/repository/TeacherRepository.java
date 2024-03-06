
package com.emati.teacherservice.repository;

import com.emati.teacherservice.entities.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author emati
 */
@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    
}
