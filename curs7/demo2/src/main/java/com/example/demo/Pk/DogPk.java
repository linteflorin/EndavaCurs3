package com.example.demo.Pk;


import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class DogPk implements Serializable {
    private int id;
    private int age;

}
