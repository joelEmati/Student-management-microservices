
package com.example.securityservice.repository;

import com.example.securityservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emati
 */
public interface UserRepository extends JpaRepository<User, Long> {
    
}
