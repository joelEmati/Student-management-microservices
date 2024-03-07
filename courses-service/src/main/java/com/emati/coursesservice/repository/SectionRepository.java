
package com.emati.coursesservice.repository;

import com.emati.coursesservice.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
/**
 *
 * @author emati
 */
@Repository
public interface SectionRepository extends JpaRepository<Section, Long> {
    
}
