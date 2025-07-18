package com.example.demo.service;

import com.example.demo.dao.IEstudianteDAO;
import com.example.demo.dao.IMateriaDAO;
import com.example.demo.dao.INotaDAO;
import com.example.demo.dto.NotaDTO;
import com.example.demo.model.Estudiante;
import com.example.demo.model.Materia;
import com.example.demo.model.Nota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class NotaService {
    @Autowired
    private INotaDAO notaDAO;

    @Autowired
    private IMateriaDAO materiaDAO;

    @Autowired
    private IEstudianteDAO estudianteDAO;

    public List<Nota> buscarNotasId(long id){ return notaDAO.findByEstudiante_IdEstudiante(id);}

    public Nota crearNota(NotaDTO dto){
        Estudiante estudiante = estudianteDAO.findById(dto.getIdEstudiante())
                .orElseThrow(() -> new RuntimeException("estudiante no existe"));
        Materia materia = materiaDAO.findById(dto.getIdMateria())
                .orElseThrow(() -> new RuntimeException("materia no existe"));

        Nota nota = new Nota();
        nota.setEstudiante(estudiante);
        nota.setMateria(materia);
        nota.setNota(dto.getNota());
        nota.setObservacion(dto.getObservacion());
        nota.setFechaRegistro(LocalDateTime.now());
        return notaDAO.save(nota);
    }


}
