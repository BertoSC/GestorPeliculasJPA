package org.example;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Calificacion implements Serializable {
    @EmbeddedId
    CalificacionId id;

    @ManyToOne
    @MapsId("idUsuario")
    @JoinColumn(name = "idUsuario")
    Usuario usuario;

    @ManyToOne
    @MapsId("idPelicula")
    @JoinColumn(name = "idPelicula")
    Pelicula pelicula;

    int calificacion;
    LocalDate fechaCalificacion;
    String comentario;



}
