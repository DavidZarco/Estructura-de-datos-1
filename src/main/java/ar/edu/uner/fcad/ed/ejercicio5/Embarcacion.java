
package ar.edu.uner.fcad.ed.ejercicio5;


public class Embarcacion {
    private int numero;
    private String nombre;
    private TipoEmbarcacion tipoembarcion;
    private Localidad localidad;
    private Dimension dimension;
    private int anioconstruccion;

    public Embarcacion(int numero, String nombre, TipoEmbarcacion tipoembarcion, Localidad localidad, Dimension dimension, int anioconstruccion) {
        this.numero = numero;
        this.nombre = nombre;
        this.tipoembarcion = tipoembarcion;
        this.localidad = localidad;
        this.dimension = dimension;
        this.anioconstruccion = anioconstruccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoEmbarcacion getTipoembarcion() {
        return tipoembarcion;
    }

    public void setTipoembarcion(TipoEmbarcacion tipoembarcion) {
        this.tipoembarcion = tipoembarcion;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getAnioconstruccion() {
        return anioconstruccion;
    }

    public void setAnioconstruccion(int anioconstruccion) {
        this.anioconstruccion = anioconstruccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.numero;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Embarcacion other = (Embarcacion) obj;
        return this.numero == other.numero;
    }

    @Override
    public String toString() {
        return "\nEmbarcacion\n" + "Numero:" + numero + ".\nNombre:" + nombre + ".\nTipo de embarcion\n" + tipoembarcion + ".\nLocalidad\n" + localidad + ".\nDimension:" + dimension + ".\nAño de construccion=" + anioconstruccion ;
    }
}