package com.example.demo.repository;

import com.example.demo.model.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepository extends MongoRepository<Album,Integer> {
}
