package com.springboot.histosafa.article.service.implement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.histosafa.article.entity.Article;
import com.springboot.histosafa.article.repository.ArticleRepository;
import com.springboot.histosafa.article.service.ArticleService;

/**
 * Implementación del servicio para la tabla ARTICULO de BD.
 * @author Daniel de Frutos.
 * @see AlticleService.
 */
@Service
public class ArticleServiceImp implements ArticleService{
	
	@Autowired
	ArticleRepository articleRepository;
	
	/**
	 * Obtener todos los artículos de BD.
	 * @return artículos.
	 */
	@Override
	public List<Article> getAllArticles() {
		return articleRepository.findAll();
	}
	
	/**
	 * Obtener artículo por id de BD.
	 * @param idArticle. lond id de artículo.
	 * @return artículo.
	 */
	@Override
	public Article getArticleById(long idArticle) {
		return articleRepository.findById(idArticle).orElse(null);
	}
	
	/**
	 * Crear artículo.
	 * @param article. Objeto artículo.
	 */
	@Override
	public void createArticle(Article article) {
		articleRepository.save(article);
	}
	
	/**
	 * Actualizar artículo.
	 * @param idArticle. lond id de artículo.
	 * @param article. Objeto artículo.
	 */
	@Override
	public void updateArticle(long idArticle, Article article) {
		Article articleUpdate = articleRepository.findById(idArticle).orElse(null);
		
		if(articleUpdate != null) {
			articleUpdate.setTitle(article.getTitle());
		}
	}
	
	/**
	 * Borrar artículo.
	 * @param idArticle. long id de artículo
	 */
	@Override
	public void deleteArticle(long idArticle) {
		
	}

}
