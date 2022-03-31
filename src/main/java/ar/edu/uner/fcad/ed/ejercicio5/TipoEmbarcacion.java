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
public class TipoEmbarcacion {
    private String descripcion;

    public TipoEmbarcacion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.descripcion);
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
        final TipoEmbarcacion other = (TipoEmbarcacion) obj;
        return Objects.equals(this.descripcion, other.descripcion);
    }

    @Override
    public String toString() {
        return "TipoEmbarcacion{" + "descripcion=" + descripcion + '}';
    }
}