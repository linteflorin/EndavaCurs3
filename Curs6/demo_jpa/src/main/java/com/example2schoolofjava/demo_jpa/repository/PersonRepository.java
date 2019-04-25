package com.example2schoolofjava.demo_jpa.repository;

import com.example2schoolofjava.demo_jpa.entitites.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {



}
