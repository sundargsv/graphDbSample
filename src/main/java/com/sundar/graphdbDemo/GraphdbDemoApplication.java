package com.sundar.graphdbDemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
@EnableNeo4jRepositories(basePackages = { "com.sundar.graphdbDemo.repository" })
@Slf4j
public class GraphdbDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GraphdbDemoApplication.class, args);
		log.info("Starting a demo graph database application....");
	}
}
