package com.example.demo;

@Repository
public class PersonRepositoryImpl {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM Person p WHERE p.city_of_living = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }
}

