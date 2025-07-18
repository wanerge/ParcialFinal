package com.example.demo.controller;

import com.example.demo.dto.NotaDTO;
import com.example.demo.model.Nota;
import com.example.demo.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nota")
@CrossOrigin("*")
public class NotaController {
    @Autowired
    private NotaService service;

    @GetMapping("/v1/{id}")
    public List<Nota> list(@PathVariable("id") long id) {
        return service.buscarNotasId(id);
    }

    @PostMapping("/v1/save")
    public Nota save(@RequestBody NotaDTO dto) {
        return service.crearNota(dto);
    }
}
