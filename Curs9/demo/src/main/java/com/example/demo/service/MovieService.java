package com.example.demo.service;

import com.example.demo.model.Cast;
import com.example.demo.model.Movie;
import com.example.demo.repository.CastRepository;
import com.example.demo.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private CastRepository castRepository;

    public Movie add(Movie movie){
        Cast cast =  castRepository.save(movie.getCast());
        movie.setCast(cast);
       return movieRepository.save(movie);


    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }
}
