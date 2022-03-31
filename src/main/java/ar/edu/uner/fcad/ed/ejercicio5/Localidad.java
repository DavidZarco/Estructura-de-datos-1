/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio5;

import java.util.Objects;

/**
 *
 * @author David Zarcó
 */
public class Localidad {
    private String nombreLocal;

    public Localidad(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    public String getNombreLocal() {
        return nombreLocal;
    }

    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.nombreLocal);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Localidad other = (Localidad) obj;
        return Objects.equals(this.nombreLocal, other.nombreLocal);
    }

    @Override
    public String toString() {
        return "Localidad{" + "nombreLocal=" + nombreLocal + '}';
    }
}