package com.example.Exafinal.entity;

import javax.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nombre;
    public Long carne;
    public String notas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCarne() {
        return carne;
    }

    public void setCarne(Long carne) {
        this.carne = carne;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }
}
