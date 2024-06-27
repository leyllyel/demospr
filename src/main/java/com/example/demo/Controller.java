package com.example.demo;

@Restcontroller
public class Controller {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return personRepository.findByCityOfLiving(city);
    }
}
