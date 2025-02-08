package org.example;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Pelicula implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long idPelicula; // secuencia
    @Embedded
    @AttributeOverride(name = "pais", column = @Column(name = "paisPelicula"))
    InfoContenido informacion;


}
