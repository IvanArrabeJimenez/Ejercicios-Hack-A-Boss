package com.ivanArrabe.Clase9Dia10Ejercicio1.service;

import com.ivanArrabe.Clase9Dia10Ejercicio1.dto.CursoDto;
import com.ivanArrabe.Clase9Dia10Ejercicio1.dto.TemaDto;
import com.ivanArrabe.Clase9Dia10Ejercicio1.model.Curso;

import java.util.List;

public interface ICursoService {
    public void saveCurso(Curso curso);
    public List<Curso> getCursos();
    public List<CursoDto> getCursosJava(String nombre);
    public Curso findCurso(Long id);
    public List<TemaDto> getCursoTemas(Long id);
}
