/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author David Zarcó
 */
public class ClienteBichitos {
    private static void imprimir (Mascota [] mascotaArray){
        for (int i=0; i < mascotaArray.length; i++) {
            System.out.println(mascotaArray[i]);
        }
    }
    private static Mascota [] filtrarGerontes(Mascota [] mascotaArray){
        int cantidad =0;
        for (var mascota : mascotaArray) {
            if (2021 -mascota.getNacimiento()>13) {
                cantidad++;   
            }
        }
        Mascota [] res = new Mascota[cantidad];
        int indice = 0;

        for (var mascota : mascotaArray) {
            if (2021 -mascota.getNacimiento()>13){
                res[indice++]=mascota ; 
             } 
        }
        return res;
        }
        private static Mascota [] filtrarporEspecie(Mascota [] mascotaArray, Especie especieMascotaArray){
            int cantidad =0;
            for (var mascota : mascotaArray) {
                if (mascota.getRaza().getEspecie().equals(especieMascotaArray) ){
                    
                    cantidad++;   
                } ;
            }
            Mascota [] res = new Mascota[cantidad];
            int indice = 0;
    
            for (var mascota : mascotaArray) {
                if (mascota.getRaza().getEspecie().equals(especieMascotaArray) ){
                    
                    res[indice++]=mascota ; 
                } 
            }
            return res;
            }
            private static Persona maxMascotero(Mascota [] MascotaArray){
                int posicion = 0;
                int max = 0;
                int aux = 0;
                int contador = 0;
                
                for (int i=0; i<MascotaArray.length;i++){
                    contador = 0;

                    for (int j=0; j<MascotaArray.length;j++){
                        if(MascotaArray[i].getDuenio().equals(MascotaArray[j].getDuenio())){
                            contador++;
                            aux=contador; 
                            if(aux > max ){ 
                                max=aux;    
                                posicion=j;  
                            }
                        }
                    }
                }
                Persona [] res = new Persona[1];
                return res[0]=MascotaArray[posicion].getDuenio();
            }
        
        public static void main(String[] args){
   
            Mascota mascota1= new Mascota(1,"Piojo",new Raza("cocker", new Especie("canino")),2005,new Persona("Altamirano","Daniel","58498321"));
            Mascota mascota2= new Mascota(2,"Raul",new Raza("persa", new Especie("felino")),2015,new Persona ("Ronaldo","Cristiano","28498321"));
            Mascota mascota3= new Mascota(3,"Pedro",new Raza("cocker", new Especie("canino")),2010,new Persona ("Riquelme","Juan Roman","48498321"));
            Mascota mascota4= new Mascota(4,"Tomas",new Raza("cocker", new Especie("canino")),2019,new Persona ("Altamirano","Daniel","58498321"));
            Mascota mascota5= new Mascota(5,"Felipe",new Raza("cocker", new Especie("canino")),2020,new Persona ("Scola","Luis","18498321"));
            Mascota [] mascotaArray= {mascota1,mascota2,mascota3,mascota4,mascota5};
            System.out.println("*****************************");
            System.out.println("Todos los elementos del array");
            System.out.println("*****************************");
            imprimir(mascotaArray);
            System.out.println("*****************************");
            System.out.println("Todos los perros mayores a 13 años son:");
            System.out.println("*****************************");
            imprimir (filtrarGerontes(mascotaArray));
            System.out.println("*****************************");
            System.out.println("Los animales filtrados:");
            System.out.println("*****************************");
            imprimir (filtrarporEspecie(mascotaArray, new Especie("canino")));
            System.out.println("*****************************");
            System.out.println("La persona con mas mascotas es:");
            System.out.println("*****************************");
            System.out.println(maxMascotero(mascotaArray));
        } 
    
}
