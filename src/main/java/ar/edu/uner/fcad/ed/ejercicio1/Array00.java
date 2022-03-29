
package ar.edu.uner.fcad.ed.ejercicio1;

public class Array00 {
    private double prom;
    private int [] array;
    /**
     * Inicializa un array sin posiciones.
     */
    public Array00() {
        this.array = new int[0];
    }
    /**
     * Incrementa en uno la longitud del array e inserta en la última posición 
     * el valor pasado por parámetro
     * @param valor 
     */
    public void add(int valor){
        //Crear nuevoArray con length = array.length + 1
        int [] nuevoArray = new int[array.length + 1];
        //Copiar los valores de array en otro array nuevoArray
        for (int i = 0; i < array.length; i++) {
            nuevoArray[i] = array[i];
        }
        //Poner el nuevo valor en nuevoArray 
        nuevoArray[nuevoArray.length - 1] = valor;        
        //Sobreescribir el valor de array
        this.array = nuevoArray;
    }
    /**
     * Quita el elemento ubicado en la posición especificada por el parámetro y
     * disminuye en uno la longitud del array.
     * @param indice 
     */
    public void remove(int indice){
        //Crear nuevoArray con length = array.length - 1
        int [] nuevoArray = new int[array.length - 1]; 
        
        //Copiar todos los valores menos indice
        int indiceAux = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != indice){
                nuevoArray[indiceAux] = array[i];
                indiceAux++;
            }
        }
        
        //Sobreescribir el array con nuevoArray
        this.array = nuevoArray;
    }
    /**
     * Obtiene el valor especificado por índice
     * @param indice
     * @return 
     */
    public int get(int indice){
        return array[indice];
    }
    /**
     * Establece el valor pasado por parámetro en la posición especificada por
     * indice
     * @param indice
     * @param valor 
     */
    public void set(int indice, int valor){
        this.array[indice] = valor;
    }
    /**
     * Devuelve la cantidad de posiciones actual de la estructura.
     * @return 
     */
    public int size(){
        return this.array.length;
    }
    /**
     * Concatena en un único String todos los valores de la estructura
     * @return 
     */
    @Override
    public String toString() {
        String resultado = "";
        for (int actual : array) {
             resultado += actual + ",";
        }
        if (resultado.length() > 0){
            resultado = resultado.substring(0, resultado.length() - 1) + "."; 
        }
        
        return resultado;
    }
    public double promedio(){
        for(int i = 0; i < array.length; i++){
            prom+=array[i];
        }
        prom = prom/(array.length);
        return prom;
    }
    public void multiplicar(int valorParam){
        for(int i = 0; i < array.length; i++){
            array[i]= array[i]*valorParam;
            System.out.print(array[i]+ " ") ;
        }
    }
    public void multiplicar2(int [] arrayParam){
            arrayParam = new int [array.length];
            for (int i = 0; i < array.length;i++) {
                arrayParam[i] = (int) (Math.random() *10);
                array[i] = array[i] * arrayParam[i];
                System.out.print(array[i] + " ");
            }   
        }
    public boolean todosDistinto(){
        for (int i = 0; i < array.length;i++) {    
        for (int j = 0; j < array.length;j++) {
        if(i!=j && array[i]==array[j]) {
            System.out.println("El array tiene elementos repetidos:");
            return false;
        }
        }      
        }
        System.out.println("El array no tiene elementos repetidos:");
        return true;
    }
    // 
    public void reverso(){
        int aux;
    for (int i = 0; i < array.length / 2; i++) {
        aux = array[i];
       array[i] = array[array.length - 1 - i];
        array[array.length - 1 - i] = aux;
    }
        System.out.println("El array invertido es:");
    for (int i = 0; i < array.length;i++) {
        System.out.print(array[i]+ " ");
    }
}
} 