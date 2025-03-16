package com.example.demo.Psql.controller;

import com.example.demo.Psql.model.Album;
import com.example.demo.Psql.service.AlbumServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/psql/album")
public class AlbumController {

    private final AlbumServices albumServices;

    public AlbumController(AlbumServices albumServices) {
        this.albumServices = albumServices;
    }

    @PostMapping("/add")
    public ResponseEntity<Album> crearAlbum(@RequestBody Album album){
        return albumServices.addAlbum(album);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity borrarAlbum(@PathVariable Integer id){
        return albumServices.deleteAlbum(id);
    }

    @PostMapping("/crear")
    public ResponseEntity<Album> crearAlbumConjunto(@RequestBody Album album){
        return albumServices.crearAlbum(album);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity borrarAlbumConjunto(@PathVariable Integer id){
        return albumServices.borrarAlbum(id);
    }

}
