package com.example.demo.repository;

import com.example.demo.model.Cast;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CastRepository extends MongoRepository<Cast,String> {
}
