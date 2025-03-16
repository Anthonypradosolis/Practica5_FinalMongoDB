package com.example.demo.Psql.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "grupo")
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Grupo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "xenero")
    private String xenero;
    @Column(name = "data_formacion")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_nacemento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getXenero() {
        return xenero;
    }

    public void setXenero(String xenero) {
        this.xenero = xenero;
    }

    public LocalDate getData_nacemento() {
        return data_nacemento;
    }

    public void setData_nacemento(LocalDate data_nacemento) {
        this.data_nacemento = data_nacemento;
    }

}
