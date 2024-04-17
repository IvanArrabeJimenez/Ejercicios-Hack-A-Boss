package com.ivanArrabe.Clase9Dia10Ejercicio1.repository;

import com.ivanArrabe.Clase9Dia10Ejercicio1.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemaRepository extends JpaRepository<Tema,Long> {
}
