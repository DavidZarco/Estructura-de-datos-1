/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio5;

/**
 *
 * @author David Zarcó
 */
public class ClienteAeropuerto {
     private static void imprimir (Vuelo [] vuelosArray){
        for (int i=0; i < vuelosArray.length; i++) {
            System.out.println(vuelosArray[i]);
        }
    }
    private static Vuelo [] arribos(Vuelo [] vuelosArray){
    int cantidad = 0;
    Ciudad ciu = new Ciudad("COR","Concordia"); 

    for( var Vuelo : vuelosArray ) {
        if (Vuelo.getCiudaddestino().equals(ciu)){
            cantidad++;

        }
    }
    Vuelo [] res= new Vuelo[cantidad];
    int indice = 0;
    for (var Vuelo : vuelosArray) {
        if (Vuelo.getCiudaddestino().equals(ciu) ){
            res[indice++]=Vuelo ; 
        } 
    }
    return res;
    }
    private static Vuelo [] partidas(Vuelo [] vuelosArray){
        int cantidad = 0;
        Ciudad ciu = new Ciudad("COR","Concordia"); 
        for( var Vuelo : vuelosArray ) {
            if (Vuelo.getCiudadorigen().equals(ciu)){
                cantidad++;
            }
        }
        Vuelo [] res= new Vuelo[cantidad];
        int indice = 0;
        for (var Vuelo : vuelosArray) {
            if (Vuelo.getCiudadorigen().equals(ciu) ){
                res[indice++]=Vuelo ; 
            } 
        }
        return res;
        }
    
    
    public static void main(String[] args){
        System.out.println("*****************************");
        System.out.println("Todos los elementos del array");
        System.out.println("*****************************");
        Vuelo vuelo1= new Vuelo(2934,new LineaAerea(1,"Despegar"),new Ciudad("COR","Concordia"),new Ciudad("BRC","Río negro"),new FechayHora("10:30","30/02/2021"), new FechayHora("18:00","20/02/2021"));
        Vuelo vuelo2= new Vuelo(2334,new LineaAerea(2,"AerolineasArgentinas"),new Ciudad("EZE","Buenos aires"),new Ciudad("COR","Concordia"),new FechayHora("10:30","30/02/2021"), new FechayHora("18:00","21/02/2021"));
        Vuelo vuelo3= new Vuelo(2134,new LineaAerea(3,"AerolineasBrasileras"),new Ciudad("EZE","Buenos aires"),new Ciudad("COR","Concordia"),new FechayHora("10:30","30/02/2021"), new FechayHora("18:00","22/02/2021"));
        Vuelo vuelo4= new Vuelo(2034,new LineaAerea(4,"AerolineasChilenas"),new Ciudad("COR","Concordia"),new Ciudad("CHU","Rawson"),new FechayHora("10:30","30/02/2021"), new FechayHora("18:00","23/02/2021"));
        Vuelo vuelo5= new Vuelo(2534,new LineaAerea(40,"AerolineasUruguayas"),new Ciudad("EZE","Buenos aires"),new Ciudad("COR","Concordia"),new FechayHora("10:30","30/02/2021"), new FechayHora("18:00","24/02/2021"));
        Vuelo [] vueloArray= {vuelo1,vuelo2,vuelo3,vuelo4,vuelo5};
        imprimir(vueloArray);
        System.out.println("");
        System.out.println("**********************************");
        System.out.println("");
        
        System.out.println("Vuelos cuyo destino es Concordia:");
        System.out.println("");

        imprimir(arribos(vueloArray));
        System.out.println("");
        System.out.println("**********************************");
        System.out.println("");
        System.out.println("Vuelos cuyo origen de salida es Concordia:");
        System.out.println("");
        imprimir(partidas(vueloArray));
        System.out.println("");
        System.out.println("**********************************");
        System.out.println("");




    }
    
}
