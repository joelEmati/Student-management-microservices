package com.emati.resultsservice;

import com.emati.resultsservice.entities.Results;
import com.emati.resultsservice.repository.ResultsRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ResultsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResultsServiceApplication.class, args);
	}

 @Bean
 CommandLineRunner commamdLineRunner(ResultsRepository resultsRepository)  {
     
        return arg -> {
                
            List<Results> resultsList=List.of(
                    
                Results.builder()
                     .courseid(Long.valueOf(1))
                     .studentid(Long.valueOf(1))
                     .build(),    
                Results.builder()
                     .courseid(Long.valueOf(2))
                     .studentid(Long.valueOf(2))
                     .build(),    
                Results.builder()
                     .courseid(Long.valueOf(3))
                     .studentid(Long.valueOf(3))
                     .build(),     
                Results.builder()
                     .courseid(Long.valueOf(4))
                     .studentid(Long.valueOf(4))
                     .build()                    
            );
            
            resultsRepository.saveAll(resultsList);
            
            };
        }        
        
        
        
        
}
