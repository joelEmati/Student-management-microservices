
package com.emati.coursesservice.repository;
import com.emati.coursesservice.entities.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
/**
 *
 * @author emati
 */
@Repository
public interface ModuleRepository extends JpaRepository<Module, String> {
    
}
