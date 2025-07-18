package com.example.demo.service;

import com.example.demo.dao.IMateriaDAO;
import com.example.demo.model.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MateriaService {
    @Autowired
    private IMateriaDAO materiaDAO;

    public Materia save(Materia materia){return materiaDAO.save(materia);}
}
