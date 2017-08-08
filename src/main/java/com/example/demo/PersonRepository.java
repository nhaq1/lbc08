package com.example.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by oracle on 8/7/17.
 */

// This repository sits between Contoller (i.e HomeController) and Model (i.e. Person) classes
// This repository talks to the database
// Provides the following methods: findOne(), findAll(), save(), delete()
// <Person, Long> Person:class, Long: Type for the primary key
public interface PersonRepository extends CrudRepository<Person, Long> {
}
