package com.emati.resultsservice.repository;

import com.emati.resultsservice.entities.Results;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author emati
 */
public interface ResultsRepository extends JpaRepository<Results, Long> {
    
}
