package com.example.demo;

public interface PersonRepository extends JpaRepository<Person, PersonId> {

    List<Person> findByCityOfLiving(String city);

    List<Person> findByAgeGreaterThanOrderByAgeDesc(int age);
}
