package com.ivanArrabe.Clase9Dia10Ejercicio1.repository;

import com.ivanArrabe.Clase9Dia10Ejercicio1.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso,Long> {

    @Query("SELECT c FROM Curso c WHERE c.nombre LIKE %:palabra%")
    List<Curso> findCursosByNombre(@Param("palabra")String palabra);
}
