package fr.formation.monBlog.repositories;

import fr.formation.monBlog.entities.Article;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleRepository extends MongoRepository<Article, String> {

    Article findBySlug(String slug);


}
