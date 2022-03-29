/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio3;

/**
 *
 * @author David Zarcó
 */
public class Mascota {
    private Integer nro;
    private String nombre;
    private Raza raza;
    private Integer nacimiento;
    private Persona duenio;
    public Mascota(Integer nro, String nombre, Raza raza, Integer nacimiento, Persona duenio) {
        this.nro = nro;
        this.nombre = nombre;
        this.raza = raza;
        this.nacimiento = nacimiento;
        this.duenio = duenio;
    }
    public Integer getNro() {
        return nro;
    }
    public void setNro(Integer nro) {
        this.nro = nro;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Raza getRaza() {
        return raza;
    }
    public void setRaza(Raza raza) {
        this.raza = raza;
    }
    public Integer getNacimiento() {
        return nacimiento;
    }
    public void setNacimiento(Integer nacimiento) {
        this.nacimiento = nacimiento;
    }
    public Persona getDuenio() {
        return duenio;
    }
    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nro == null) ? 0 : nro.hashCode());
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
        Mascota other = (Mascota) obj;
        if (nro == null) {
            if (other.nro != null)
                return false;
        } else if (!nro.equals(other.nro))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Duenio: " + duenio + " Nombre: " + nombre + " Nacimiento: " + nacimiento + " Numero: " + nro
                + "" + raza;
    }
}
