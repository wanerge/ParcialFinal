package com.example.demo.dto;

import lombok.Data;

@Data
public class NotaDTO {
    private long idMateria;
    private long idEstudiante;
    private int nota;
    private String observacion;
}
