package fr.formation.monBlog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class User {

    @Id
    private String id;
    private String username;
    private String name;
    private String lastname;
    private String email;


}
