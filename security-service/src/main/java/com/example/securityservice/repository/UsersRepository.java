
package com.example.securityservice.repository;

import com.example.securityservice.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emati
 */
public interface UsersRepository extends JpaRepository<Users, Long> {
    
}
