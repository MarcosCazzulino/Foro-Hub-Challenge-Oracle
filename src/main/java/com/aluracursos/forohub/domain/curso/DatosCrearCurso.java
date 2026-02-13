package com.aluracursos.forohub.domain.curso;

import jakarta.validation.constraints.NotBlank;

public record DatosCrearCurso(
        @NotBlank
        String nombre,
        @NotBlank
        String categoria
) {
}
