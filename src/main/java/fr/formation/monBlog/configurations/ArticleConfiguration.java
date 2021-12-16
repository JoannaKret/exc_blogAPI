package fr.formation.monBlog.configurations;


import fr.formation.monBlog.repositories.ArticleRepository;
import fr.formation.monBlog.services.ArticleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArticleConfiguration {


    @Bean
    public ArticleService articleService(ArticleRepository articleRepository) {
        return new ArticleService(articleRepository);
}
}
