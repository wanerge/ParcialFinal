package com.example.demo.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Materia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idmateria")
    private long idMateria;

    @Column(name = "nombre", nullable = false, length = 80)
    @NonNull
    private String nombre;

    @Column(name = "grupo", nullable = false, length = 80)
    @NonNull
    private int grupo;

}
