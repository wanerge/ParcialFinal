package com.example.demo.dao;

import com.example.demo.model.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEstudianteDAO extends CrudRepository<Estudiante, Long> {
}
