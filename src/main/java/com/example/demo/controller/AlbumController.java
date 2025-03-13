package com.example.demo.controller;


import com.example.demo.model.Album;
import com.example.demo.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/album")
public class AlbumController {

    @Autowired
    private AlbumRepository albumRepository;

    @PostMapping("/crear")
    public Album crearAlbum(@RequestBody Album album) {
        return albumRepository.save(album);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminarAlbum(@PathVariable String id) {
        albumRepository.deleteById(id);
    }

    @PutMapping("/actualizar/{id}")
    public Album updateAlbum(@PathVariable String id, @RequestBody Album album) {

        return albumRepository.save(album);
    }

    @GetMapping("/listar")
    public List<Album> listAlbumns(){
        return albumRepository.findAll();
    }

    @GetMapping("/listar/{id}")
    public Optional<Album> listAlbumns(@PathVariable String id){
        return albumRepository.findById(id);
    }


}
