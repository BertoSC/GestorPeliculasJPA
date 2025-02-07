package org.example;

import jakarta.persistence.Id;

import java.io.Serializable;

public class InfoContenido implements Serializable {
    String titulo;
    String genero;
    String pais;
    int duracion;
    int año;
    String sinopsis;


}