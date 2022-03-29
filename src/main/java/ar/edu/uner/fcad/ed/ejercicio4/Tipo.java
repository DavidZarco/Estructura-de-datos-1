/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio4;

/**
 *
 * @author David Zarcó
 */
public class Tipo {
    private String descripción;

    public Tipo(String descripción) {
        this.descripción = descripción;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((descripción == null) ? 0 : descripción.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tipo other = (Tipo) obj;
        if (descripción == null) {
            if (other.descripción != null)
                return false;
        } else if (!descripción.equals(other.descripción))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "" +
            " descripción:" + getDescripción() + "" +
            "";
    }
    
}
