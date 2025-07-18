package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Nota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idnota")
    private long idNota;

    @ManyToOne
    @JoinColumn(name = "idmateria", nullable = false)
    private Materia materia;

    @ManyToOne
    @JoinColumn(name = "idestudiante", nullable = false)
    private Estudiante estudiante;

    @Column(name = "nota", nullable = false, length = 80)
    @NonNull
    private int nota;

    @Column(name = "fecharegistro", nullable = false)
    @NonNull
    private LocalDateTime fechaRegistro;

    @Column(name = "observacion", nullable = false, length = 150)
    @NonNull
    private String observacion;

}
