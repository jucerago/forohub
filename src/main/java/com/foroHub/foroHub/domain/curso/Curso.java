package com.foroHub.foroHub.domain.curso;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Embeddable
@Getter
@AllArgsConstructor
public class Curso {
    private String nombre;
    private String categoria;

    public Curso(DatosCurso curso) {
        this.nombre = curso.nombre();
        this.categoria = curso.categoria();
    }

    public Curso(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Curso actualizarDatos(DatosCurso curso) {
        this.nombre = curso.nombre();
        this.categoria = curso.categoria();
        return this;
    }
}
