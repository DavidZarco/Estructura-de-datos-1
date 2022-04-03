/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio4;

/**
 *
 * @author David Zarcó
 */
public class ClienteBiblioteca {
    
    private static void imprimir(Libro [] librosArray){
        for (int i=0; i < librosArray.length; i++) {
            System.out.println(librosArray[i]);
            }
    }
       
    private static Libro [] librosPorCategoria(Libro [] librosArray,Categoria cat){
        System.out.println(cat);
        System.out.println("");
          int cantidad =0;
            for (var Libro : librosArray) {
                if (Libro.getCategoria().equals(cat) ){
                    cantidad++;   
                }
            }
            Libro [] res = new Libro[cantidad];
            int indice = 0;
    
            for (var Libro : librosArray) {
                if (Libro.getCategoria().equals(cat)){
                res[indice++]=Libro;
                } 
            }
            if (cantidad == 0) {
                System.out.println("No se hayan libros de la categoria " + cat);
            }
            return res;
    }
    
    private static Libro [] librosPorAutor(Libro [] librosArray, Autor autor){
        System.out.println(autor);
        System.out.println("");
          int cantidad =0;
            for (var Libro : librosArray) {
                if (Libro.getAutor().equals(autor)){ 
                    cantidad++;   
                }
            }
         Libro [] res = new Libro[cantidad];
            int indice = 0;
    
            for (var Libro : librosArray) {
                if (Libro.getAutor().equals(autor)){  
                    res[indice++]= Libro ; 
                } 
            }
            if (cantidad == 0) {
                System.out.println("No se hayan libros de " + autor );
            }
        return res;
    }

    private static Libro [] librosPorAnio(Libro [] librosArray, int año){
        System.out.println("Año:"+año);
        System.out.println("");
        int cantidad =0;
            for (var Libro : librosArray) {
                if (Libro.getAniopublicacion() == año){  
                    cantidad++;   
                }
            }
            Libro [] res = new Libro[cantidad];
            int indice = 0;
            for (var Libro : librosArray) {
                if (Libro.getAniopublicacion() == año){
                    res[indice++]= Libro ; 
                } 
            }
            if (cantidad == 0) {
                System.out.println("En el año " + año + " no se hayan libros.");
            }
        return res; 
    }
    
    
   public static void main(String[] args) {
        
        Libro libro1 = new Libro(120,"Introducción a la Aritmética",new Autor("Blaise","Pascal"),new Categoria("Mátematica"),1659);
        Libro libro2 = new Libro(543,"Los miserables",new Autor("Víctor","Hugo"),new Categoria("Novela"),1862);
        Libro libro3 = new Libro(732,"Psicología de las masas y análisis del yo",new Autor("Sigmund","Freud"),new Categoria("Psicología"),1921);
        Libro libro4 = new Libro(222,"Crímenes imperceptibles",new Autor("Guillermo","Martínez"),new Categoria("Novela"),2003);
        Libro libro5 = new Libro(923,"La interpretación de los sueños",new Autor("Sigmund","Freud"),new Categoria("Psicología"),1899);
        
        Libro [] librosArray= {libro1,libro2,libro3,libro4,libro5};
        
        System.out.println("***********");
        System.out.println("Todos los elementos del array");
        System.out.println("***********");
        imprimir(librosArray);
        System.out.println("");
        System.out.println("***********");
        System.out.println("");
        System.out.println("Todos los libros filtrados por categoria:");
        imprimir(librosPorCategoria(librosArray,new Categoria("Novela")));
        System.out.println("");    
        System.out.println("***********");
        System.out.println("");
        System.out.println("Todos los libros filtrados por autor:");
        imprimir(librosPorAutor(librosArray,new Autor("Sigmund","Freud")));
        System.out.println("");    
        System.out.println("***********");
        System.out.println("");
        System.out.println("Todos los libros filtrados por año:");
        imprimir(librosPorAnio(librosArray,1659));
    }
}