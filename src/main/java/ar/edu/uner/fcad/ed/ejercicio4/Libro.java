/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio4;

/**
 *
 * @author David Zarcó
 */

public class Libro {
    private int numinventario;
    private String titulo;
    private Autor Autor;
    private Categoria Categoria;
    private int aniopublicacion;

    public Libro(int numinventario, String titulo, Autor Autor, Categoria Categoria, int aniopublicacion) {
        this.numinventario = numinventario;
        this.titulo = titulo;
        this.Autor = Autor;
        this.Categoria = Categoria;
        this.aniopublicacion = aniopublicacion;
    }


    public int getNuminventario() {
        return numinventario;
    }

    public void setNuminventario(int numinventario) {
        this.numinventario = numinventario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }

    public Categoria getCategoria() {
        return Categoria;
    }

    public void setCategoria(Categoria Categoria) {
        this.Categoria = Categoria;
    }

    public int getAniopublicacion() {
        return aniopublicacion;
    }

    public void setAniopublicacion(int aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.numinventario;
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
        final Libro other = (Libro) obj;
        return this.numinventario == other.numinventario;
    }

    @Override
    public String toString() {
        return "Libro:\n" + "Titulo: " + titulo + ", Autor " + Autor + ", \nCategoria: " + Categoria + ", año de publicacion: " + aniopublicacion + ", Numero de inventario: " + numinventario ;
    } 
}
