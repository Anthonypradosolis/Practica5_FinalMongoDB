package com.example.demo.Psql.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GrupoMongo {

    private Integer _id;
    private String nome;
    private String xenero;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_nacemento;

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
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
