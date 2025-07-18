package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Estudiante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idestudiante")
    private long idEstudiante;

    @Column(name = "nombre", nullable = false, length = 80)
    @NonNull
    private String nombre;

    @Column(name = "apellido", nullable = false, length = 80)
    @NonNull
    private String apellido;
}
