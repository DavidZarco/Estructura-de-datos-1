
package ar.edu.uner.fcad.ed.ejercicio3;


/**
 *
 * @author stefa
 */
public class ClienteAlumnos {
    public static void main(String[] args) {
        Alumno [] alumnos = new Alumno[5];
        
        alumnos[0] = new Alumno("Stefano", "Carbajal", 10, 5, 6);
        alumnos[1] = new Alumno("David","Zarco",8,5,10);
        alumnos[2] = new Alumno("Daniel","Altamirano",2,8,10);
        alumnos[3] = new Alumno("Billie","Eilish",10,10,10);
        alumnos[4] = new Alumno("Michael","Jackson",2,2,2);
        
        for(int i=0;i<alumnos.length;i++){
                System.out.println("Alumno "+i+"\n"+alumnos[i].toString());
                System.out.println("********");
                }
        
    }
}
