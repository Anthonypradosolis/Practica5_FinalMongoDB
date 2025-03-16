package com.example.demo.Mongo.repository;

import com.example.demo.Mongo.model.Grupo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GrupoRepository extends MongoRepository<Grupo,Integer> {
}
