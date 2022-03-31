
package ar.edu.uner.fcad.ed.ejercicio3;

import java.util.Objects;


public class Alumno {
    private String nombre, apellido, notaConcep;
    private int examen1,examen2,examen3,notaFinal;

    public Alumno(String nombre, String apellido, int examen1, int examen2, int examen3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.examen1 = examen1;
        this.examen2 = examen2;
        this.examen3 = examen3;
        calcularNotaFinal();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNotaConcep() {
        return notaConcep;
    }

    public int getExamen1() {
        return examen1;
    }

    public void setExamen1(int examen1) {
        this.examen1 = examen1;
    }

    public int getExamen2() {
        return examen2;
    }

    public void setExamen2(int examen2) {
        this.examen2 = examen2;
    }

    public int getExamen3() {
        return examen3;
    }

    public void setExamen3(int examen3) {
        this.examen3 = examen3;
    }

    public int getNotaFinal() {
        return notaFinal;
    }
    private void calcularNotaFinal(){
        double ex1 = Math.ceil(examen1*0.25);
        double ex2 = Math.ceil(examen2*0.30);
        double ex3 = Math.ceil(examen3*0.45);
        notaFinal = (int) (ex1+ex2+ex3);
        if(examen1==10 && examen2==10 && examen3==10){
            notaFinal = 10;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.apellido);
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
        final Alumno other = (Alumno) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", notaConcep=" + notaConcep + ", examen1=" + examen1 + ", examen2=" + examen2 + ", examen3=" + examen3 + ", notaFinal=" + notaFinal + '}';
    }
    
    
    
    
}
