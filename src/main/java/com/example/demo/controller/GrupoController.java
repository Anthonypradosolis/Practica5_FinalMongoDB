package com.example.demo.controller;

import com.example.demo.model.Grupo;
import com.example.demo.service.GrupoServices;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
