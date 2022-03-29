/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio4;

/**
 *
 * @author David Zarcó
 */
import java.math.BigDecimal;

public class ClienteAutomoviles {
    private static void imprimir (Automovil [] autoArray){
        for (int i=0; i < autoArray.length; i++) {
            System.out.println(autoArray[i]);
        }
    }
    private static Automovil [] filtrarporAnio(Automovil [] param, int anio){
        int cantidad =0;
        for (var Automovil : param) {
            if (Automovil.getAnio()==anio){
                
                cantidad++;   
            } ;
        }
        Automovil [] res = new Automovil [cantidad];
        int indice = 0;

        for (var Automovil : param) {
            if (Automovil.getAnio()==anio ){
                res[indice++]=Automovil; 
            } 
        }
        return res;
        }
        static Automovil [] filtrarPorTipo(Automovil[] param, Tipo tipo){
            int cantidad =0;
            for (var Automovil : param) {
                if (Automovil.getTipo().equals(tipo)){
                    cantidad++;   
                } ;
            }
            Automovil [] res = new Automovil [cantidad];
            int indice = 0;
    
            for (var Automovil : param) {
                if (Automovil.getTipo().equals(tipo)){
                    res[indice++]=Automovil; 
                } 
            }
            return res;
        }
        static Automovil [] cantidadPorAnio(Automovil[] param){
            int cantidad=0;
            int contador=0;
            Tipo x = new Tipo ("Sedan");
            Tipo y = new Tipo ("Camioneta");
            for (var Automovil : param) {
                if(Automovil.getTipo().equals(x)){
                    contador++;
                }               
                } 
            for (var Automovil : param){
                if(Automovil.getTipo().equals(y)){
                cantidad++;
                }
            }
            System.out.println("La cantidad de tipo Sedan son:"+contador);
            System.out.println("La cantidad de tipo Camion son:"+cantidad);
            return param;
        }
        static Automovil [] valuacionesPorTipo(Automovil[] param){

            BigDecimal contador2 = new BigDecimal("0.0");
            BigDecimal contador = new BigDecimal("0.0");
            BigDecimal acumulador;
            BigDecimal acumulador2;
            Tipo x = new Tipo ("Sedan");
            Tipo y = new Tipo ("Camioneta");
            for (var Automovil : param) {
                if(Automovil.getTipo().equals(x)){
                    acumulador = (Automovil.getValuacion());      
                    contador = contador.add(acumulador);
                }
            }
            
            for (var Automovil : param) {
                if(Automovil.getTipo().equals(y)){
                    acumulador2 = (Automovil.getValuacion());      
                    contador2 = contador2.add(acumulador2);
                }
            }
            System.out.println("La cantidad de valuaciones Sedan son:" +contador);
            System.out.println("La cantidad de valuaciones Camion son:" +contador2);
            
            return param;
        }
       
    public static void main(String []args) {
        System.out.println("*****************************");
        System.out.println("Todos los elementos del array");
        System.out.println("*****************************");
        Automovil auto1= new Automovil("AJ328QQ",new Tipo("Sedan"),new Marca("Chevrolet"),2021,new BigDecimal("1234567"));
        Automovil auto2= new Automovil("AF125PP",new Tipo("Sedan"),new Marca("Toyota"),2021,new BigDecimal("1896123"));
        Automovil auto3= new Automovil("AB856TT",new Tipo("Camioneta"),new Marca("Ford"),2020,new BigDecimal("2986413"));
        Automovil [] autoArray= {auto1,auto2,auto3};
        imprimir(autoArray);
        System.out.println("Los autos filtrado por año son:");
        imprimir(filtrarporAnio(autoArray, 2020));
        System.out.println("Los autos filtrado por tipo son:");
        imprimir(filtrarPorTipo(autoArray, new Tipo("Sedan")));
        System.out.println("Los autos por año son:");
        cantidadPorAnio(autoArray);
        System.out.println("La suma de las valuaciones son:");
        valuacionesPorTipo(autoArray);
     




    }
    
}
