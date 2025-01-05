package com.foroHub.foroHub.domain.topico;

import com.foroHub.foroHub.domain.curso.DatosCurso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistroTopico(
        @NotBlank
        String idUsuario,
        @NotBlank
        String mensaje,
        @NotNull
        @Valid
        DatosCurso curso,
        @NotBlank
        String titulo) {
}
