package org.example;

import jakarta.persistence.*;
import org.hibernate.annotations.AnyKeyJavaClass;
import org.hibernate.annotations.IdGeneratorType;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
@Entity
@Access(AccessType.FIELD)
public class Serie implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long idSerie; // secuencia
    @Embedded
    InfoContenido informacion;
    @Convert (converter = LocalDateConverter.class)
    LocalDate fechaEstreno;
    int temporadas;
    int capitulos;
    @ElementCollection
    @CollectionTable(name = "serie_directores", joinColumns = @JoinColumn(name = "serie_id"))
    @Column(name = "director")
    List<String> directores;

    public Serie() {
    }

    public Serie(InfoContenido informacion, LocalDate fechaEstreno, int temporadas, int capitulos, List<String> directores) {
        this.informacion = informacion;
        this.fechaEstreno = fechaEstreno;
        this.temporadas = temporadas;
        this.capitulos = capitulos;
        this.directores = directores;
    }

    public Serie(Long idSerie, InfoContenido informacion, LocalDate fechaEstreno, int temporadas, int capitulos, List<String> directores) {
        this.idSerie = idSerie;
        this.informacion = informacion;
        this.fechaEstreno = fechaEstreno;
        this.temporadas = temporadas;
        this.capitulos = capitulos;
        this.directores = directores;
    }

    public Long getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Long idSerie) {
        this.idSerie = idSerie;
    }

    public InfoContenido getInformacion() {
        return informacion;
    }

    public void setInformacion(InfoContenido informacion) {
        this.informacion = informacion;
    }


    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public List<String> getDirectores() {
        return directores;
    }

    public void setDirectores(List<String> directores) {
        this.directores = directores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return temporadas == serie.temporadas && capitulos == serie.capitulos && Objects.equals(idSerie, serie.idSerie) && Objects.equals(informacion, serie.informacion) && Objects.equals(fechaEstreno, serie.fechaEstreno) && Objects.equals(directores, serie.directores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSerie, informacion, fechaEstreno, temporadas, capitulos, directores);
    }

    @Override
    public String toString() {
        return "Serie{" +
                "idSerie=" + idSerie +
                ", informacion=" + informacion +
                ", fechaEstreno=" + fechaEstreno +
                ", temporadas=" + temporadas +
                ", capitulos=" + capitulos +
                ", directores=" + directores +
                '}';
    }
}
