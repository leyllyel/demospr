package com.example.demo.controller;

import com.example.demo.repository.PersonRepository;

@Restcontroller
public class Controller {
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }
    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personRepository.findByCityOfLiving(city);
    }
}
