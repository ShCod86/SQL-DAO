package ru.netology.sqldao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import ru.netology.sqldao.entity.Person;

import java.util.List;

@Repository
public class DAORepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("select p from Person p where lower(p.city) = lower(:city) order by p.city", Person.class)
                .setParameter("city", city).getResultList();
    }
}
