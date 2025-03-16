package com.example.demo.Psql.service;

import com.example.demo.Psql.ComunicacionMongo.ComunicacionMongo;
import com.example.demo.Psql.repository.AlbumRepository;
import com.example.demo.Psql.repository.GrupoRepository;

public class AlbumServices {

    private final AlbumRepository albumRepository;
    private final GrupoRepository grupoRepository;
    private final ComunicacionMongo comunicacionMongo;

    public AlbumServices(AlbumRepository albumRepository, GrupoRepository grupoRepository, ComunicacionMongo comunicacionMongo) {
        this.albumRepository = albumRepository;
        this.grupoRepository = grupoRepository;
        this.comunicacionMongo = comunicacionMongo;
    }



}
