/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio3;

/**
 *
 * @author David Zarcó
 */
public class Raza {
    private String nombre;
   private Especie especie;
public Raza(String nombre, Especie especie) {
    this.nombre = nombre;
    this.especie = especie;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public Especie getEspecie() {
    return especie;
}
public void setEspecie(Especie especie) {
    this.especie = especie;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((especie == null) ? 0 : especie.hashCode());
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
    Raza other = (Raza) obj;
    if (especie == null) {
        if (other.especie != null)
            return false;
    } else if (!especie.equals(other.especie))
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
    return "" + especie + " Raza: " + nombre;
}
    
}
