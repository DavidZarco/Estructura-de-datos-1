
package ar.edu.uner.fcad.ed.ejercicio1;

public class ClienteArray00 {
   
    public static void main(String[] args) {
        
        var objeto = new Array00();
        objeto.add(1);
        objeto.add(3);
        objeto.add(5);
        objeto.add(8);
        objeto.add(9);
        objeto.add(3);
        objeto.add(1);
        objeto.add(8);
        objeto.add(10);
        System.out.println("Numeros del array: " + objeto.toString());
        System.out.println("Maximo: "+objeto.maximo());
        System.out.println("Minimo: "+objeto.minimo());
        System.out.println("Promedio: "+objeto.promedio());
        System.out.println("Saco los repetidos...");
        objeto.quitarRepetidos();
        System.out.println("Array sin repetidos: "+objeto.toString());
     
    }

    
}
