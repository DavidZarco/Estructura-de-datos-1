/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio5;

/**
 *
 * @author David Zarcó
 */
public class ClientePNA {
    
    private static void imprimir(Embarcacion [] param){
        for ( int i=0; i<param.length; i++){
            System.out.println(param[i]);
        }
        
    }
    
    private static Embarcacion [] filtrarAntiguas(Embarcacion[] param) {
    int cantidad =0;
            for (var Embarcacion : param) {
                if (Embarcacion.getAnioconstruccion() < 1980) {
                    cantidad++;   
                }
            }
            Embarcacion [] res = new Embarcacion[cantidad];
            int indice = 0;
    
            for (var Embarcacion : param) {
                if (Embarcacion.getAnioconstruccion() < 1980){
                res[indice++]=Embarcacion;
                } 
            }
            return res;
    }
   
    private static Embarcacion [] filtrarMenores(Embarcacion [] param, int esloraMax){
       int cantidad =0;
            for (var Embarcacion : param) {
                if (Embarcacion.getDimension().getEslora() < esloraMax) {
                    cantidad++;   
                }
            }
            Embarcacion [] res = new Embarcacion[cantidad];
            int indice = 0;
    
            for (var Embarcacion : param) {
                if (Embarcacion.getDimension().getEslora() < esloraMax){
                res[indice++]=Embarcacion;
                } 
            }
            return res;
    }
   
    private static Embarcacion [] filtrarPorTipo(Embarcacion [] param, TipoEmbarcacion tipo) {
    int cantidad =0;
            for (var Embarcacion : param) {
                if (Embarcacion.getTipoembarcion().equals(tipo)) {
                    cantidad++;   
                }
            }
            Embarcacion [] res = new Embarcacion[cantidad];
            int indice = 0;
    
            for (var Embarcacion : param) {
               if (Embarcacion.getTipoembarcion().equals(tipo)){
                res[indice++]=Embarcacion;
                } 
            }
            return res;
}
    
    
    
    public static void main(String [] args){
        
        Embarcacion embarcacion1 = new Embarcacion(1,"Pipo",new TipoEmbarcacion("Lancha"),new Localidad("Concordia"),new Dimension(14.40,11.50,20.00),1969);
        Embarcacion embarcacion2 = new Embarcacion(2,"Titanic",new TipoEmbarcacion("Crucero"),new Localidad("New York"),new Dimension(200.23,12.32,21.00),1948);
        Embarcacion embarcacion3 = new Embarcacion(3,"Tzuyu",new TipoEmbarcacion("Velero"),new Localidad("Seul"),new Dimension(13.23,12.15,10.30),1999);
        Embarcacion embarcacion4 = new Embarcacion(4,"Manoban",new TipoEmbarcacion("Crucero"),new Localidad("Tailandia"),new Dimension(18.25,12.15,10.30),2003);
        Embarcacion embarcacion5 = new Embarcacion(5,"Perla Negra",new TipoEmbarcacion("Velero"),new Localidad("Isla Tortuga"),new Dimension(60.23,76.15,23.30),2003);
        
        Embarcacion [] embarcacionArray = {embarcacion1,embarcacion2,embarcacion3,embarcacion4,embarcacion5};
        
        System.out.println("***********");
        System.out.println("Todos los elementos del array:");
        imprimir(embarcacionArray);
            
        System.out.println("***********");
        System.out.println("Todos las embarcaciones anteriores al año: 1980");
        imprimir(filtrarAntiguas(embarcacionArray));    
        
        System.out.println("***********");
        System.out.println("Todas las embarcaciones filtradas por Eslora máxima:");
        imprimir(filtrarMenores(embarcacionArray,15));
        
        System.out.println("***********");
        System.out.println("Todos las embarcaciones filtradas por tipo:");
        imprimir(filtrarPorTipo(embarcacionArray,new TipoEmbarcacion("Velero")));
            
    }
 }