
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
    public int maximo() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }

    public int minimo() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        return min;
    }

    public double promedio() {
        for (int i = 0; i < array.length; i++) {
            prom += array[i];
        }
        prom = prom / (array.length);
        return prom;
    }
    public void quitarRepetidos(){
        
        for(int i=0; i < array.length;i++){
            for(int u=(i+1);u < array.length;u++){
                if(array[i]==array[u]){
                    this.remove(u);
                    
                }
            }
        }
    }
}
