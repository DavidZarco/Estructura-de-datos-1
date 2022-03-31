/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio4;

/**
 *
 * @author David Zarcó
 */
public class Categoria {
    private String nombrecate;   

    public Categoria(String nombrecate) {
        this.nombrecate = nombrecate;
    }

    public String getNombrecate() {
        return nombrecate;
    }

    public void setNombrecate(String nombrecate) {
        this.nombrecate = nombrecate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nombrecate);
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
        final Categoria other = (Categoria) obj;
        return Objects.equals(this.nombrecate, other.nombrecate);
    }

    @Override
    public String toString() {
        return "Categoria{" + "nombrecate=" + nombrecate + '}';
    }
}