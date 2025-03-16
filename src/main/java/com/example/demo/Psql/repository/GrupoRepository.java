package com.example.demo.Psql.repository;

import com.example.demo.Psql.model.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepository extends JpaRepository<Grupo,Integer> {
}
