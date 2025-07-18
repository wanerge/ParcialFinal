package com.example.demo.dao;

import com.example.demo.model.Nota;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface INotaDAO extends CrudRepository<Nota, Long> {
    List<Nota> findByEstudiante_IdEstudiante(long estudianteIdEstudiante);
}
