package fr.formation.monBlog.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document //Version noSQL mongo pour dire @Entite de sql
public class Article {

    @Id
    /*
    * @Id
    * @GeneratedValue(*/
    private String id;
    private String title;
    private String slug;
    private String content;
}
