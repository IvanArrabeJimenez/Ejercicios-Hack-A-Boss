package com.ivanArrabe.Clase9Dia10Ejercicio1.service;

import com.ivanArrabe.Clase9Dia10Ejercicio1.dto.TemaDto;
import com.ivanArrabe.Clase9Dia10Ejercicio1.model.Tema;

import java.util.List;

public interface ITemaService {
    public void saveTema(Tema tema);
    public Tema findTema(Long id);
}
