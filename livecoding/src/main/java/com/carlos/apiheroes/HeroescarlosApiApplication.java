package com.carlos.apiheroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;

@SpringBootApplication
@EnableDynamoDBRepositories
public class HeroescarlosApiApplication {

  public static void main(String[] args) {

    SpringApplication.run(HeroescarlosApiApplication.class, args);
    System.out.println("super poderes com webflux");
  }

}

