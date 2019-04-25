package com.example2schoolofjava.demo_jpa.service;


import com.example2schoolofjava.demo_jpa.entitites.Person;
import com.example2schoolofjava.demo_jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository=personRepository;

    }
    public List<Person> getPeople(int id){
        if(personRepository.findById(id).isPresent())
            return personRepository.findAllById(id).get();

        return null;
    }

}
