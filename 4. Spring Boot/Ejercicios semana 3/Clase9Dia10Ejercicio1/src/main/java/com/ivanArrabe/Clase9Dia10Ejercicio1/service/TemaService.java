package com.ivanArrabe.Clase9Dia10Ejercicio1.service;

import com.ivanArrabe.Clase9Dia10Ejercicio1.model.Tema;
import com.ivanArrabe.Clase9Dia10Ejercicio1.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService{

    @Autowired
    private TemaRepository temaRepo;

    @Override
    public void saveTema(Tema tema) {
        temaRepo.save(tema);
    }


    @Override
    public Tema findTema(Long id) {
        return temaRepo.findById(id).orElse(null);
    }

}
