/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exepciones.CalificacionErroneaExeption;
import java.io.Serializable;

/**
 *
 * @author Megabit
 */
public class Alumno implements Serializable{
    
    
    
    private String noCOntrol;
    private String nombre;
    private String paterno;
    private String materno;
    private Double calificacion;
    private String carrera;

    public Alumno(String noCOntrol, String nombre, String paterno, String materno, Double calificacion, String carrera) throws CalificacionErroneaExeption {
        this.noCOntrol = noCOntrol;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.setCalificacion(calificacion);
        this.carrera = carrera;
    }

    public String getNoCOntrol() {
        return noCOntrol;
    }

    public void setNoCOntrol(String noCOntrol) {
        this.noCOntrol = noCOntrol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Double calificacion) throws CalificacionErroneaExeption {
        if ((calificacion <= 10) && (calificacion > 0)) {
            this.calificacion = calificacion;
        } else {
            throw new CalificacionErroneaExeption("La calificaciond debe de estar en un rango de 0 - 10");
        }
    }

    public String getCarrera() {

        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alumno) {
            Alumno alumno = (Alumno) obj;
            if (this.noCOntrol.compareTo(alumno.getNoCOntrol()) == 0) {
                return true;
            }
        }
        return false;
    }
}
