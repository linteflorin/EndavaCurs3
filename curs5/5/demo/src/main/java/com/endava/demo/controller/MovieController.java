package com.endava.demo.controller;

import com.endava.demo.model.Movie;
import com.endava.demo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletResponse;

@RestController
public class MovieController {
    //CRUD

    //create
    //RequestBody
    //RequestParam -> parametrii
    //PathVariable
    @Autowired
    private MovieService movieService;

    @Autowired
    private RestTemplate restTemplate;

    //@RequestMapping(value = "/", method = RequestMethod.POST)
    @PostMapping(value = "/")
    public int add(@RequestParam String title, @RequestParam String genre){

        movieService.add(title,genre);
        return movieService.add(title,genre);

    }
    @PostMapping(value = "/add")
    public String addMovie(@RequestBody Movie movie, HttpServletResponse httpServletResponse){
        httpServletResponse.setStatus(HttpStatus.CREATED.value());
        return movie.getTitle();
    }

//tema: GET BY ID si GET ALL    //retrieve
    //TODO get by id
    //TODO get all

    //update
    //TODO model-> rating (modificare movie) cu put

    //delete
    @DeleteMapping(value = "/{id}")
    private int delete(@PathVariable int id){
       return movieService.delete(id);

    }
    @GetMapping(value = "/") // face delete
    public void callRest(){
        String url = "http://localhost:8080/1";
        restTemplate.delete(url);

    }
}
