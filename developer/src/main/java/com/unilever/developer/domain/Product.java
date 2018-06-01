package com.unilever.developer.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name ="PRODUCTO")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @NotNull
    private Long id;
    private String name;
    private Long code;
    private String formule;
    private String category;
    private Double ph;
    private Double sulfunacion;
    private Double corrocion;
    private Double peso;

    public Product() {
    }

    public Product(String name, Long code, String formule, String category, Double ph, Double sulfunacion, Double corrocion, Double peso) {
        this.name = name;
        this.code = code;
        this.formule = formule;
        this.category = category;
        this.ph = ph;
        this.sulfunacion = sulfunacion;
        this.corrocion = corrocion;
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getFormule() {
        return formule;
    }

    public void setFormule(String formule) {
        this.formule = formule;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getPh() {
        return ph;
    }

    public void setPh(Double ph) {
        this.ph = ph;
    }

    public Double getSulfunacion() {
        return sulfunacion;
    }

    public void setSulfunacion(Double sulfunacion) {
        this.sulfunacion = sulfunacion;
    }

    public Double getCorrocion() {
        return corrocion;
    }

    public void setCorrocion(Double corrocion) {
        this.corrocion = corrocion;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}

