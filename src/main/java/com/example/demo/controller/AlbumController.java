package com.example.demo.controller;


import com.example.demo.model.Album;
import com.example.demo.service.AlbumServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo/album")
public class AlbumController {

    private final AlbumServices albumServices;

    public AlbumController(AlbumServices albumServices) {
        this.albumServices = albumServices;
    }

    @Operation(summary = "Crea un album")
    @PostMapping("/crear")
    public ResponseEntity<Album> crearAlbum(@RequestBody Album album) {
        return albumServices.crearAlbum(album);
    }

    @Operation(summary = "Borra un album")
    @DeleteMapping("/delete/{_id}")
    public ResponseEntity eliminarAlbum(@PathVariable Integer _id) {
        return albumServices.borrarAlbum(_id);
    }

    @Operation(summary = "Actualiza un album")
    @PutMapping("/actualizar/{_id}/{_idGrupo}")
    public ResponseEntity<Album> altualizarAlbum(@PathVariable Integer _id, @PathVariable Integer _idGrupo, @RequestBody Album novoAlbum) {
        return albumServices.actualizarAlbum(_id, _idGrupo, novoAlbum);
    }

    @Operation(summary = "Lista los albumes")
    @GetMapping("/listar")
    public ResponseEntity<List<Album>> listarAlbumnes(){
        return albumServices.listarAlbumes();
    }

    @Operation(summary = "Lista un album")
    @GetMapping("/listar/{_id}")
    public ResponseEntity<Album> listarAlbum(@PathVariable Integer _id){
        return albumServices.listarAlbum(_id);
    }


}
