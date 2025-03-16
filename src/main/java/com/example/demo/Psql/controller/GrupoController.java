package com.example.demo.Psql.controller;

import com.example.demo.Psql.model.Grupo;
import com.example.demo.Psql.service.GrupoServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/psql/grupo")
public class GrupoController {

    private final GrupoServices grupoServices;

    public GrupoController(GrupoServices grupoServices) {
        this.grupoServices = grupoServices;
    }

    @PostMapping("/add")
    public ResponseEntity<Grupo> crearGrupo(@RequestBody Grupo grupo){
        return grupoServices.addGrupo(grupo);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity borrarGrupo(@PathVariable Integer id){
        return grupoServices.deleteGrupo(id);
    }

    @PostMapping("/crear")
    public ResponseEntity<Grupo> crearGrupoConjunto(@RequestBody Grupo grupo){
        return grupoServices.crearGrupo(grupo);
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity borrarGrupoConjunto(@PathVariable Integer id){
        return grupoServices.borrarGrupo(id);
    }

}
