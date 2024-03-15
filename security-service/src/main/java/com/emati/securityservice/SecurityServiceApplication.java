package com.emati.securityservice;

import com.emati.securityservice.entities.Role;
import com.emati.securityservice.entities.Users;
import com.emati.securityservice.repository.UsersRepository;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SecurityServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityServiceApplication.class, args);
	}
        
BCryptPasswordEncoder encoder = new  BCryptPasswordEncoder(); 
			

@Bean
CommandLineRunner commamdLineRunner(UsersRepository usersRepository)  {
     
        return arg -> {
                
            List<Users> userList=List.of(
                    
                Users.builder()
                    .username("user1")
                    .password(encoder.encode("user1"))
                    .role(Role.ROLE_TEACHER)
                    .build(),    
                Users.builder()
                    .username("user2")
                    .password(encoder.encode("user2"))
                    .role(Role.ROLE_TEACHER)
                    .build(),                     
                Users.builder()
                    .username("user3")
                    .password(encoder.encode("user3"))
                    .role(Role.ROLE_STUDENT)
                    .build(),    
                Users.builder()
                    .username("user4")
                    .password(encoder.encode("user4"))
                    .role(Role.ROLE_STUDENT)
                    .build(),                  
                Users.builder()
                    .username("user5")
                    .password(encoder.encode("user5"))
                    .role(Role.ROLE_STUDENT)
                    .build(),    
                Users.builder()
                    .username("user6")
                    .password(encoder.encode("user6"))
                    .role(Role.ROLE_ADMIN)
                    .build()                  
            );
            
            usersRepository.saveAll(userList);
            
            };
        }         
        
        
}
