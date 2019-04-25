package repository;

import entitites.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository

public class PersonReporitory {

    @Autowired
    EntityManager entityManager ;

    public List<Person> getPeople(){

        String query = "SELECT p FROM Person p ";
        List<Person> personList= entityManager.createQuery(query).getResultList();
        return personList;


    }


}
