package fr.formation.monBlog.controllers;


import fr.formation.monBlog.entities.User;
import fr.formation.monBlog.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return this.userService.getAllUsers();
    }

    @GetMapping("{username}")
    public User getUserByUsername(String username) {
        return this.userService.getUserByUsername(username);
    }

    @PostMapping
    public User addNewUser(User userToAdd) {
        return this.userService.addUser(userToAdd);
    }

    @PutMapping
    public User modifyUser(User userToModify) {
        return this.userService.addUser(userToModify);
    }

    @DeleteMapping
    public void removeUser(User userToRemove) {
        this.userService.removeUser(userToRemove);
    }
}
