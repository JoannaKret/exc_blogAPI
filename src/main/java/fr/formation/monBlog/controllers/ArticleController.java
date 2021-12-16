package fr.formation.monBlog.controllers;

import fr.formation.monBlog.entities.Article;
import fr.formation.monBlog.services.ArticleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("articles")
public class ArticleController {

    ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping
    public List<Article> getAllArticles() {

        return this.articleService.findAll();
    }

    @GetMapping("/{slug}")
    public Article getArticleBySlug(@PathVariable String slug) {
        return this.articleService.findBySlug(slug);
        /*return "This returns a single article with a slug: " + article.getSlug() +
                ". Please enjoy its content: " + article.getContent();*/
    }

    @PostMapping
    public Article postArticle(@RequestBody Article article) {
        return this.articleService.addArticle(article);
                //"The article: " + article.getTitle() + " has been succesfully published. " +
                //"Please enjoy its content: " + article.getContent();
    }

    @PutMapping
    public Article update(@RequestBody Article article) {
        return this.articleService.addArticle(article);
    }

    @DeleteMapping
    public void deleteArticle(@RequestBody Article article) {

        //return "The following article: " + article.getTitle() + " has been successfully removed.";
    }
}
