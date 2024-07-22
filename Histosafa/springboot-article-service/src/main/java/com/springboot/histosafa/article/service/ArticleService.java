package com.springboot.histosafa.article.service;

import java.util.List;

import com.springboot.histosafa.article.entity.Article;

/**
 * Interfaz del servicio para la tabla ARTICULO de BD.
 * @author Daniel de Frutos.
 */
public interface ArticleService {
	
	List<Article> getAllArticles();
	
	Article getArticleById(long idArticle);
	
	void createArticle(Article article);
	
	void updateArticle(long idArticle, Article article);
	
	void deleteArticle(long idArticle);
}
