
package ar.edu.uner.fcad.ed.ejercicio3;

/**
 *
 * @author stefa
 */
public class Alumno {
    private String nombre, apellido, notaConcep;
    private int examen1,examen2,examen3,notaFinal;

    public Alumno(String nombre, String apellido, int examen1, int examen2, int examen3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.examen1 = examen1;
        this.examen2 = examen2;
        this.examen3 = examen3;
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

    public void setNotaConcep(String notaConcep) {
        this.notaConcep = notaConcep;
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

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }
    
    
    
}
