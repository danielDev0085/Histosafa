package com.springboot.histosafa.article.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.CircuitBreakerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.histosafa.article.entity.Article;
import com.springboot.histosafa.article.service.implement.ArticleServiceImp;

@FeignClient(name="Article-service")
@RestController //RestController convierte la respuesta a JSON
@RequestMapping("/articles")
public class ArticleController {
	private final Logger logger = LoggerFactory.getLogger(ArticleController.class);
	
	@Autowired
	private CircuitBreakerFactory cbFactory;
	
	@Autowired
	private ArticleServiceImp articleService;
	
	@GetMapping("/list")
	private List<Article> getAllArticles() {
		return articleService.getAllArticles();
	}
	
	@GetMapping("/id/{id}")
	private Article getArticleById(@PathVariable Long idArticle) {
		//Creamos un circuito para tolerancia de fallos y en el run definimos la acción principal y la acción en caso de fallo
		return cbFactory.create("articles").run(() -> articleService.getArticleById(idArticle), e -> alternativeMethod(e));
	}
	
	/**
	 * Método para devolver un artículo por defecto em caso de fallo.
	 * @return Article
	 */
	private Article alternativeMethod(Throwable  e) {
		Article article = new Article();
		
		article.setTitle("Unknow title");
		article.setIntroduction("Error al mostrar el artículo");
		article.setContent("");
		article.setCentury("Undefined");
		
		logger.info(e.getMessage());
		return article;
	}

}
