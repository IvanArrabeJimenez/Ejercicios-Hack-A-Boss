package com.ivanArrabe.Clase9Dia10Ejercicio1.service;

import com.ivanArrabe.Clase9Dia10Ejercicio1.dto.CursoDto;
import com.ivanArrabe.Clase9Dia10Ejercicio1.dto.TemaDto;
import com.ivanArrabe.Clase9Dia10Ejercicio1.model.Curso;
import com.ivanArrabe.Clase9Dia10Ejercicio1.model.Tema;
import com.ivanArrabe.Clase9Dia10Ejercicio1.repository.CursoRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CursoService implements ICursoService{

    @Autowired
    private CursoRepository cursoRepo;

    private EntityManager entityManager;

    @Override
    public void saveCurso(Curso curso) {
        cursoRepo.save(curso);
    }

    @Override
    public List<Curso> getCursos() {
        return cursoRepo.findAll();
    }

    @Override
    public List<TemaDto> getCursoTemas(Long id) {
        Curso cursoEspecifico =cursoRepo.findAll().stream()
                .filter(curso -> curso.getIdCurso().equals(id))
                .findFirst()
                .orElse(null);

        List<TemaDto>temaDtoList = new ArrayList<>();

        for (Tema tema : cursoEspecifico.getTemas()){
            TemaDto temaDto = new TemaDto();
            temaDto.setId(tema.getIdTema());
            temaDto.setNombre(tema.getNombre());

            temaDtoList.add(temaDto);
        }
        return temaDtoList;
    }

    @Override
    public List<CursoDto> getCursosJava(String nombre) {
        List<Curso> cursos = cursoRepo.findCursosByNombre(nombre);

        return cursos.stream()
                .map(curso -> new CursoDto(curso.getIdCurso(), curso.getNombre()))
                .collect(Collectors.toList());
    }

    @Override
    public Curso findCurso(Long id) {
        return cursoRepo.findById(id).orElse(null);
    }

}
