package com.example.demo.controller;


import com.example.demo.model.Album;
import com.example.demo.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @PostMapping("/crear")
    public Album crearAlbum(@RequestBody Album album) {
        return albumRepository.save(album);
    }

}
