/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio5;

/**
 *
 * @author David Zarcó
 */
public class Vuelo {
    private Integer num;
private LineaAerea lineaaerea;
private Ciudad  ciudadorigen;
private Ciudad ciudaddestino;
private FechayHora salida;
private FechayHora arribo;
public Vuelo(Integer num, LineaAerea lineaaerea, Ciudad ciudadorigen, Ciudad ciudaddestino, FechayHora salida,
        FechayHora arribo) {
    this.num = num;
    this.lineaaerea = lineaaerea;
    this.ciudadorigen = ciudadorigen;
    this.ciudaddestino = ciudaddestino;
    this.salida = salida;
    this.arribo = arribo;
}
public Integer getNum() {
    return num;
}
public void setNum(Integer num) {
    this.num = num;
}
public LineaAerea getLineaaerea() {
    return lineaaerea;
}
public void setLineaaerea(LineaAerea lineaaerea) {
    this.lineaaerea = lineaaerea;
}
public Ciudad getCiudadorigen() {
    return ciudadorigen;
}
public void setCiudadorigen(Ciudad ciudadorigen) {
    this.ciudadorigen = ciudadorigen;
}
public Ciudad getCiudaddestino() {
    return ciudaddestino;
}
public void setCiudaddestino(Ciudad ciudaddestino) {
    this.ciudaddestino = ciudaddestino;
}
public FechayHora getSalida() {
    return salida;
}
public void setSalida(FechayHora salida) {
    this.salida = salida;
}
public FechayHora getArribo() {
    return arribo;
}
public void setArribo(FechayHora arribo) {
    this.arribo = arribo;
}
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((arribo == null) ? 0 : arribo.hashCode());
    result = prime * result + ((ciudaddestino == null) ? 0 : ciudaddestino.hashCode());
    result = prime * result + ((ciudadorigen == null) ? 0 : ciudadorigen.hashCode());
    result = prime * result + ((lineaaerea == null) ? 0 : lineaaerea.hashCode());
    result = prime * result + ((num == null) ? 0 : num.hashCode());
    result = prime * result + ((salida == null) ? 0 : salida.hashCode());
    return result;
}
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Vuelo other = (Vuelo) obj;
    if (arribo == null) {
        if (other.arribo != null)
            return false;
    } else if (!arribo.equals(other.arribo))
        return false;
    if (ciudaddestino == null) {
        if (other.ciudaddestino != null)
            return false;
    } else if (!ciudaddestino.equals(other.ciudaddestino))
        return false;
    if (ciudadorigen == null) {
        if (other.ciudadorigen != null)
            return false;
    } else if (!ciudadorigen.equals(other.ciudadorigen))
        return false;
    if (lineaaerea == null) {
        if (other.lineaaerea != null)
            return false;
    } else if (!lineaaerea.equals(other.lineaaerea))
        return false;
    if (num == null) {
        if (other.num != null)
            return false;
    } else if (!num.equals(other.num))
        return false;
    if (salida == null) {
        if (other.salida != null)
            return false;
    } else if (!salida.equals(other.salida))
        return false;
    return true;
}
@Override
public String toString() {
    return "Vuelo arribo:" + arribo + ", ciudad de destino:" + ciudaddestino + ", ciudad de origen:" + ciudadorigen
            + ", linea Aerea:" + lineaaerea + ", numero de linea:" + num + ", salida:" + salida ;
}
    
}
