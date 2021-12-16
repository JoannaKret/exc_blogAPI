package fr.formation.monBlog.services;

import fr.formation.monBlog.entities.User;
import fr.formation.monBlog.repositories.UserRepository;

import java.util.List;

public class UserService {

    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {

        return this.userRepository.findAll();
    }

    public User getUserByUsername(String username) {
        return this.userRepository.findByUsername(username);
    }

    public User addUser(User user) {
        return this.userRepository.save(user);
    }

    public void removeUser(User user) {
        this.userRepository.delete(user);
    }
}
