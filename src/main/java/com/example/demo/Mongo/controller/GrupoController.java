package com.example.demo.Mongo.controller;

import com.example.demo.Mongo.model.Grupo;
import com.example.demo.Mongo.service.GrupoServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mongo/grupo")
public class GrupoController {

    private final GrupoServices grupoServices;

    public GrupoController(GrupoServices grupoServices) {
        this.grupoServices = grupoServices;
    }

    @Operation(summary = "Crea un grupo")
    @PostMapping("/crear")
    public ResponseEntity<Grupo> crearGrupo(@RequestBody Grupo grupo){
        return grupoServices.crearGrupo(grupo);
    }

    @Operation(summary = "Actualiza un grupo")
    @PutMapping("/actualizar/{_id}")
    public ResponseEntity<Grupo> actulizarGrupo(@PathVariable Integer _id,@RequestBody Grupo novoGrupo){
        return grupoServices.actulizarGrupo(_id, novoGrupo);
    }

    @Operation(summary = "Borra un grupo")
    @DeleteMapping("/borrar/{_id}")
    public ResponseEntity borrarGrupo(@PathVariable Integer _id){
        return grupoServices.borrarGrupo(_id);
    }

    @Operation(summary = "Lista los grupos")
    @GetMapping("/listar")
    public ResponseEntity<List<Grupo>> listarGrupos(){
        return grupoServices.listarGrupos();
    }

    @Operation(summary = "Lista un grupo")
    @GetMapping("/listar/{_id}")
    public ResponseEntity<Grupo> listarGrupo(@PathVariable Integer _id){
        return grupoServices.listarGrupo(_id);
    }
}
