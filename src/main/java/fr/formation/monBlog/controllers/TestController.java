package fr.formation.monBlog.controllers;

import fr.formation.monBlog.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tests")
public class TestController {

   /* @GetMapping("hello/{prenom}")
    public String getAticles(@PathVariable String prenom) {
        return "Hello " + prenom;
    }*/
    @GetMapping("hello")
    public String getNames(@RequestParam String name,
                               @RequestParam String lastname) {
        return "Hello " + name + " " + lastname;
    }

    @PostMapping
    public String jeposte(@RequestBody User utilisateur) {
        return "hello" + " " + utilisateur.getName() + " " + utilisateur.getLastname();
    }




}
