package com.example.demo.Psql.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AlbumMongo {

    private Integer _id;
    private Integer id_grupo;
    private String titulo;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_lanzamento;
    private BigDecimal puntuacion;

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public Integer getId_grupo() {
        return id_grupo;
    }

    public void setId_grupo(Integer id_grupo) {
        this.id_grupo = id_grupo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getData_lanzamento() {
        return data_lanzamento;
    }

    public void setData_lanzamento(LocalDate data_lanzamento) {
        this.data_lanzamento = data_lanzamento;
    }

    public BigDecimal getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(BigDecimal puntuacion) {
        this.puntuacion = puntuacion;
    }

}
