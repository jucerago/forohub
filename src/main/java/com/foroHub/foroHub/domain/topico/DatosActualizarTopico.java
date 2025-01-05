package com.foroHub.foroHub.domain.topico;

import com.foroHub.foroHub.domain.curso.DatosCurso;
import jakarta.validation.constraints.NotNull;

public record DatosActualizarTopico(@NotNull Long id, String titulo, String mensaje, DatosCurso curso) {
}
