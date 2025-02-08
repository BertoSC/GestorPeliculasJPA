package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CalificacionId implements Serializable {
    @Column (name = "idUsuario")
    Long idUsuario;
    @Column(name = "idPelicula")
    Long idPelicula;

    public CalificacionId() {
    }

    public CalificacionId(Long idUsuario, Long idPelicula) {
        this.idUsuario = idUsuario;
        this.idPelicula = idPelicula;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalificacionId that = (CalificacionId) o;
        return Objects.equals(idUsuario, that.idUsuario) && Objects.equals(idPelicula, that.idPelicula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idPelicula);
    }

    @Override
    public String toString() {
        return "CalificacionId{" +
                "idUsuario=" + idUsuario +
                ", idPelicula=" + idPelicula +
                '}';
    }
}
