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

    public ResponseEntity<Album> actualizarAlbum(Integer _id,Integer _idGrupo,Album nuevoAlbum){
        if(grupoRepository.findById(String.valueOf(_idGrupo)).isPresent()){
            Album albumUpdate = albumRepository.findById(_id).get();
            albumUpdate.setTitulo(nuevoAlbum.getTitulo());
            albumUpdate.setPuntuacion(nuevoAlbum.getPuntuacion());
            albumUpdate.setData_lanzamento(nuevoAlbum.getData_lanzamento());
            albumRepository.save(albumUpdate);
            return ResponseEntity.status(HttpStatus.OK).body(albumUpdate);
        }
        return null;
    }

    public ResponseEntity borrarAlbum(Integer _id){
        albumRepository.deleteById(_id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
