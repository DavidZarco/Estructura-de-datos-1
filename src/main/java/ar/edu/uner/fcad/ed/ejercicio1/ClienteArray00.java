
package ar.edu.uner.fcad.ed.ejercicio1;

public class ClienteArray00 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 0;
        int [] arrayParam = new int [n];
        var objeto = new Array00();
        objeto.add(1);
        objeto.add(2);
        objeto.add(3);
        objeto.add(4);
        objeto.add(5);
        objeto.add(6);
        objeto.add(7);
        objeto.add(8);
        objeto.add(9);
        System.out.println("toString(): " + objeto.toString());
        objeto.remove(2);
        System.out.println("remove(2): " + objeto.toString());
        objeto.set(4, 33);
        System.out.println("objeto.set(8, 33): " + objeto.toString()); 
        System.out.println("objeto.get(i): ");
        for (var i = 0; i < objeto.size(); i++) {
            System.out.println("[" + i + "]: " + objeto.get(i));
        }
        System.out.println(objeto.promedio());
        objeto.multiplicar(3);
        System.out.println("");
        objeto.multiplicar2(arrayParam);
        System.out.println("");
        System.out.println(objeto.todosDistinto());
        objeto.reverso();
    }

    
}
