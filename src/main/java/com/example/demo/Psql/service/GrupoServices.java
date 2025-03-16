package com.example.demo.Psql.service;

import com.example.demo.Psql.ComunicacionMongo.ComunicacionMongo;
import com.example.demo.Psql.model.Grupo;
import com.example.demo.Psql.model.GrupoMongo;
import com.example.demo.Psql.repository.GrupoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class GrupoServices {

    private final GrupoRepository grupoRepository;
    private final ComunicacionMongo comunicacionMongo;

    public GrupoServices(GrupoRepository grupoRepository, ComunicacionMongo comunicacionMongo) {
        this.grupoRepository = grupoRepository;
        this.comunicacionMongo = comunicacionMongo;
    }

    public ResponseEntity<Grupo> addGrupo(Grupo grupo){
        grupoRepository.save(grupo);
        return ResponseEntity.status(HttpStatus.CREATED).body(grupo);
    }

    public ResponseEntity deleteGrupo(Integer id){
        grupoRepository.delete(grupoRepository.findById(id).get());
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    public ResponseEntity<Grupo> crearGrupo(Grupo grupo){
        grupoRepository.save(grupo);
        GrupoMongo grupoMongo = new GrupoMongo(grupo.getId(),grupo.getNome(),grupo.getXenero(),grupo.getData_nacemento());
        comunicacionMongo.crearGrupo(grupoMongo);
        return ResponseEntity.status(HttpStatus.CREATED).body(grupo);
    }

    public ResponseEntity borrarGrupo(Integer id){
        grupoRepository.delete(grupoRepository.findById(id).get());
        comunicacionMongo.borrarGrupo(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
