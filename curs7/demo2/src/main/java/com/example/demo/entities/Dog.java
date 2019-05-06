package com.example.demo.entities;

import com.example.demo.Pk.DogPk;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Dog  {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private DogPk dogPk;



    private String name;
    private String color;

}
