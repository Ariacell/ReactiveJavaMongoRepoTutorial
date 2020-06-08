package com.controllers;

import com.models.Person;
import com.repositories.PersonRepository;

import org.springframework.web.reactive.function.server.RequestPredicates;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RouterFunctions.*;
import static org.springframework.web.reactive.function.server.ServerResponse.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.method;

@Configuration
public class RoutesConfiguration {
    
    @Bean
    RouterFunction<?> routes(PersonRepository personRepository) {
        return nest(path("/person"),
        
            route(RequestPredicates.GET("/{id}"),
             req -> ok().body(personRepository.findById(req.pathVariable("id")), Person.class))
            
            .andRoute(method(HttpMethod.POST), 
            req -> {
                personRepository.insert(req.bodyToMono(Person.class)).subscribe();
                return ok().build();
            }
            )
        
        );


    }
}