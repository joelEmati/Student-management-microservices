
package com.emati.securityservice.repository;

import com.emati.securityservice.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emati
 */
public interface UsersRepository extends JpaRepository<Users, Long> {
    
}
