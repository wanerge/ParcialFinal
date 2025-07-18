package com.example.demo.service;

import com.example.demo.dao.IEstudianteDAO;
import com.example.demo.model.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    @Autowired
    private IEstudianteDAO estudianteDAO;

    public Estudiante save(Estudiante estudiante){return estudianteDAO.save(estudiante);}

}
