package com.springboot.histosafa.userfavouritearticle.articleClient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="springboot-article-service", url="localhost:0")
public interface ArticleRestClient {
	
	@GetMapping("/articles/id/{id}")
	public Article getArticleById(Long id);
}
