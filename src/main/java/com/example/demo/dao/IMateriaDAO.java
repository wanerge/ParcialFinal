package com.example.demo.dao;

import com.example.demo.model.Materia;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMateriaDAO extends CrudRepository<Materia, Long> {
}
