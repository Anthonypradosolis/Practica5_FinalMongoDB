package com.example.demo.service;

import com.example.demo.model.Album;
import com.example.demo.repository.AlbumRepository;
import com.example.demo.repository.GrupoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AlbumServices {

    private final AlbumRepository albumRepository;
    private final GrupoRepository grupoRepository;

    public AlbumServices(AlbumRepository albumRepository, GrupoRepository grupoRepository) {
        this.albumRepository = albumRepository;
        this.grupoRepository = grupoRepository;
    }

    public ResponseEntity<Album> crearAlbum(Album album){
        if(grupoRepository.findById(String.valueOf(Integer.valueOf(album.getGrupoId()))).isPresent()){
            albumRepository.save(album);
            return ResponseEntity.status(HttpStatus.CREATED).body(album);
        }
        return null;
    }
}
