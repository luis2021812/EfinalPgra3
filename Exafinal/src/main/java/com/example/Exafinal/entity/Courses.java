package com.example.Exafinal.entity;

import javax.persistence.*;

@Entity
@Table(name = "Cursos")
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String clase;
    public Long  notas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Long getNotas() {
        return notas;
    }

    public void setNotas(Long notas) {
        this.notas = notas;
    }
}
