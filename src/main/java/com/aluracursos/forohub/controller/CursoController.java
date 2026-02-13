package com.aluracursos.forohub.controller;

import com.aluracursos.forohub.domain.curso.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/cursos")
//@SecurityRequirement(name = "bearer-key")
public class CursoController {
    @Autowired
    private CursoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<DatosDetalleCurso> registrarCurso(@RequestBody @Valid DatosCrearCurso datos, UriComponentsBuilder uriBuilder) {
        var curso = new Curso(datos);
        repository.save(curso);

        var datosDetalle = new DatosDetalleCurso(curso);

        URI url = uriBuilder.path("/cursos/{id}").buildAndExpand(curso.getId()).toUri();

        return ResponseEntity.created(url).body(datosDetalle);
    }

    @GetMapping
    public ResponseEntity<Page<DatosListadoCurso>> listarCursos(@PageableDefault(size = 10) Pageable paginacion) {
        var page = repository.findAll(paginacion).map(DatosListadoCurso::new);
        return ResponseEntity.ok(page);
    }
}
