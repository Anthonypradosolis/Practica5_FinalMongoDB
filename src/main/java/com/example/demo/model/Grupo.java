package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
@Document(collection = "grupo")
public class Grupo {

    @Id
    private int id;
    private String nome;
    private String xenero;
    private Date data_formacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getData_formacion() {
        return data_formacion;
    }

    public void setData_formacion(Date data_formacion) {
        this.data_formacion = data_formacion;
    }
}
