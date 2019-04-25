package com.example2schoolofjava.demo_jpa.controller;


import com.example2schoolofjava.demo_jpa.entitites.Person;
import com.example2schoolofjava.demo_jpa.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {


    final PersonService personService;

    @Autowired
    PersonController (PersonService personService){
        this.personService = personService;

    }
    @RequestMapping(path = "/getPeopleId/{PersonId}", method = RequestMethod.GET)
    public List<Person> getPeople(@PathVariable int PersonId){
        return personService.getPeople(PersonId);


    }


}
