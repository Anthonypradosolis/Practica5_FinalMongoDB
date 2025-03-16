package com.example.demo.service;

import com.example.demo.model.Grupo;
import com.example.demo.repository.GrupoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GrupoServices {

    private final GrupoRepository grupoRepository;

    public GrupoServices(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    public ResponseEntity<Grupo> crearGrupo(Grupo grupo){
        grupoRepository.insert(grupo);
        return ResponseEntity.status(HttpStatus.CREATED).body(grupo);
    }
}
