package com.example.demo.Psql.service;

import com.example.demo.Psql.ComunicacionMongo.ComunicacionMongo;
import com.example.demo.Psql.model.Album;
import com.example.demo.Psql.model.AlbumMongo;
import com.example.demo.Psql.repository.AlbumRepository;
import com.example.demo.Psql.repository.GrupoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlbumServices {

    private final AlbumRepository albumRepository;
    private final GrupoRepository grupoRepository;
    private final ComunicacionMongo comunicacionMongo;

    public AlbumServices(AlbumRepository albumRepository, GrupoRepository grupoRepository, ComunicacionMongo comunicacionMongo) {
        this.albumRepository = albumRepository;
        this.grupoRepository = grupoRepository;
        this.comunicacionMongo = comunicacionMongo;
    }

    public ResponseEntity<Album> addAlbum(Album album){
        if(grupoRepository.findById(album.getGrupo_id().getId()).isPresent()){
            albumRepository.save(album);
            return ResponseEntity.status(HttpStatus.CREATED).body(album);
        }
        return null;
    }

    public ResponseEntity deleteAlbum(Integer id){
        Optional<Album> albumOptional = albumRepository.findById(id);
        if(albumOptional.isPresent()){
            albumRepository.delete(albumOptional.get());
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

    public ResponseEntity<Album> crearAlbum(Album album){
        if(grupoRepository.findById(album.getGrupo_id().getId()).isPresent()){
            albumRepository.saveAndFlush(album);
            AlbumMongo albumMongo = new AlbumMongo(album.getId(),album.getGrupo_id().getId(), album.getTitulo(), album.getData_lanzamento(),album.getPuntuacion());
            comunicacionMongo.crearAlbum(albumMongo);
            return ResponseEntity.status(HttpStatus.CREATED).body(album);
        }
        return null;
    }

    public ResponseEntity borrarAlbum(Integer id){
        Optional<Album> albumOptional =albumRepository.findById(id);
        if(albumOptional.isPresent()){
            Integer idAlbum = albumOptional.get().getId();
            albumRepository.delete(albumOptional.get());
            comunicacionMongo.borrarAlbum(idAlbum);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }

}
