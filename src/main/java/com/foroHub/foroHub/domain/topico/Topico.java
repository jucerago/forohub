package com.foroHub.foroHub.domain.topico;

import com.foroHub.foroHub.domain.curso.Curso;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "idUsuario")
    private String idUsuario;
    private String mensaje;
    private Boolean activo;
    @Embedded
    private Curso curso;
    private String titulo;


    public Topico(DatosRegistroTopico datosRegistroTopico) {
        this.activo = true;
        this.idUsuario = datosRegistroTopico.idUsuario();
        this.mensaje = datosRegistroTopico.mensaje();
        this.curso = new Curso(datosRegistroTopico.curso());
        this.titulo = datosRegistroTopico.titulo();
    }

    // Constructor sin argumentos requerido por Hibernate
    public Topico() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void actualizarDatos(DatosActualizarTopico datosActualizarTopico) {
        if (datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
        if (datosActualizarTopico.curso()!= null){
            this.curso = curso.actualizarDatos(datosActualizarTopico.curso());
        }
        if (datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }

    }

    public void desactivarTopico() {
        this.activo = false;
    }
}
