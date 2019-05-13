package com.example.demo.model;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Cast {


    private String id;

    private List<String> actors;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getActors() {
        return actors;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }
}
