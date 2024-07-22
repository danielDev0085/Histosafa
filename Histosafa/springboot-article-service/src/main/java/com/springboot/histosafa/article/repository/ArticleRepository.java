package com.springboot.histosafa.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.histosafa.article.entity.Article;

/**
 * Repositorio de BD para la tabla ARTICULO.
 * @author Daniel de Frutos
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long>{

}
