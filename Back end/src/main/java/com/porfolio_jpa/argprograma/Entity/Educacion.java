
package com.porfolio_jpa.argprograma.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreEstudio;
    private String descripcion;
    
    //Construtctores

    public Educacion() {
    }

    public Educacion(String nombreEstudio, String descripcion) {
        this.nombreEstudio = nombreEstudio;
        this.descripcion = descripcion;
    }

 //Getters & setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
