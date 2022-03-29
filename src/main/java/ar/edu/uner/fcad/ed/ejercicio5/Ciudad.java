/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio5;

/**
 *
 * @author David Zarcó
 */
public class Ciudad {
    private String  codigoiata;
    private String nombre;
    public Ciudad(String codigoiata, String nombre) {
        this.codigoiata = codigoiata;
        this.nombre = nombre;
    }
    public String getCodigoiata() {
        return codigoiata;
    }
    public void setCodigoiata(String codigoiata) {
        this.codigoiata = codigoiata;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigoiata == null) ? 0 : codigoiata.hashCode());
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
        Ciudad other = (Ciudad) obj;
        if (codigoiata == null) {
            if (other.codigoiata != null)
                return false;
        } else if (!codigoiata.equals(other.codigoiata))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return " " + "nombre:" + nombre +" "+  "codigoiata=" + codigoiata;
    }
    
}
