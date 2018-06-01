package com.unilever.developer.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name = "AREA")
public class Area implements Serializable

{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private long id;
    private String nombre;
    private String descripcion;
    private String lineaproduccion;

    public Area() {
    }

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", lineaproduccion='" + lineaproduccion + '\'' +
                '}';
    }

    public Area(String nombre, String descripcion, String lineaproduccion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lineaproduccion = lineaproduccion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getLineaproduccion() {
        return lineaproduccion;
    }

    public void setLineaproduccion(String lineaproduccion) {
        this.lineaproduccion = lineaproduccion;
    }
}