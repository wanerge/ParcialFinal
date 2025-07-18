package com.example.demo.controller;

import com.example.demo.model.Estudiante;
import com.example.demo.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/estudiante")
@CrossOrigin("*")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @PostMapping("/v1/save")
    public long save(@RequestBody Estudiante estudiante) {
        estudianteService.save(estudiante);
        return estudiante.getIdEstudiante();
    }
}
