package fr.formation.monBlog.configurations;

import fr.formation.monBlog.repositories.UserRepository;
import fr.formation.monBlog.services.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    public UserService userService(UserRepository userRepository) {

        return new UserService(userRepository);
    }
}
