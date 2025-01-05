package com.foroHub.foroHub.domain.topico;

import com.foroHub.foroHub.domain.curso.Curso;

public record DatosListadoTopicos(
        Long id,
        String idUsuario,
        String mensaje,
        String titulo,
        Curso curso
) {
    public DatosListadoTopicos(Topico topico) {
        this(topico.getId(), topico.getIdUsuario(), topico.getMensaje(), topico.getTitulo(), topico.getCurso());
    }
}
