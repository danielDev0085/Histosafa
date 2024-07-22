package com.springboot.histosafa.article;

import java.time.Duration;

import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JCircuitBreakerFactory;
import org.springframework.cloud.circuitbreaker.resilience4j.Resilience4JConfigBuilder;
import org.springframework.cloud.client.circuitbreaker.Customizer;
import org.springframework.context.annotation.Bean;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;

public class AppConfig {
	
	/**
	 * Personalizar configuración de Resilience4J para tolerancia de fallos.
	 * @return Resilience4JCircuitBreakerFactory. Configuración de Resilience4J
	 */
	@Bean
	public Customizer<Resilience4JCircuitBreakerFactory> defaultCustomizerResilience4J(){
		return factory -> factory.configureDefault(id -> {
			return new Resilience4JConfigBuilder(id)
					.circuitBreakerConfig(CircuitBreakerConfig.custom()
							.slidingWindowSize(10) //Número de pruebas de comprobación
							.failureRateThreshold(50) //Porcentaje de fallo de la petición
							.waitDurationInOpenState(Duration.ofSeconds(10L)) //Tiempo de espera en estado abierto
							.build()) //Construimos circuitBreaker
					.timeLimiterConfig(TimeLimiterConfig.ofDefaults()) //Timeout por defecto
					.build(); //Construimos todo
		});
	}
}
