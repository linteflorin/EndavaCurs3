package com.example.demo.service;

import com.example.demo.model.Cast;
import com.example.demo.repository.CastRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CastService {

    @Autowired
    private CastRepository castRepository;

    public Cast save(Cast cast){

        return castRepository.save(cast);

    }
}
