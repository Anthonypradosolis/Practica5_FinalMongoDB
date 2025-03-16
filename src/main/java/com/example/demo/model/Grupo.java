package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "grupo")
public class Grupo {

    @Id
    private int id;
    private String nome;
    private String xenero;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate data_formacion;


}
