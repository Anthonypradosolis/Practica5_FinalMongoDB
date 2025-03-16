package com.example.demo.Mongo.repository;

import com.example.demo.Mongo.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepository extends MongoRepository<Album,Integer> {
}
