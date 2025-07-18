package com.example.demo.controller;

import com.example.demo.model.Materia;
import com.example.demo.service.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/materia")
@CrossOrigin("*")
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @PostMapping("/v1/save")
    public long save(@RequestBody Materia materia) {
        materiaService.save(materia);
        return materia.getIdMateria();
    }
}
