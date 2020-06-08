package com.controllers;

import com.models.Person;
import com.repositories.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@RestController
@Slf4j
@RequestMapping("/person")
public class PersonController {
    
    @Autowired
    private PersonRepository personRepository;

    @GetMapping
    public Flux<Person> index() {
        log.info("The current person's are: " + personRepository.findAll());
        return personRepository.findAll();
    }

}