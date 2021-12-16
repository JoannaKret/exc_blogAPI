package fr.formation.monBlog.services;

import fr.formation.monBlog.entities.Article;
import fr.formation.monBlog.repositories.ArticleRepository;

import java.util.List;

//C'est bien d'éviter les tags de spring de type @service etc dans des élements tels que service
//d'ou la classe ArticleConfiguration qu instancie un service via un bean
public class ArticleService {

    ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }


   public List<Article> findAll() {
       //Plus tard cette méthode va communiquer avec le repository
       return this.articleRepository.findAll();
   }

   public Article findBySlug(String slug) {
        return this.articleRepository.findBySlug(slug);
   }

   public Article addArticle(Article article) {
       return this.articleRepository.save(article);
   }

   public void deleteArticle(Article article) {
        this.articleRepository.delete(article);
   }
}
