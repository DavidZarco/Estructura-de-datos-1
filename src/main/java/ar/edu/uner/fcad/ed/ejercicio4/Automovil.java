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

public class Automovil {
 private String matricula;
 private Tipo tipo;
 private Marca marca;
 private Integer anio;
 private BigDecimal valuacion;

    public Automovil(String matricula, Tipo tipo, Marca marca, Integer anio, BigDecimal valuacion) {
    this.matricula = matricula;
    this.tipo = tipo;
    this.marca = marca;
    this.anio = anio;
    this.valuacion = valuacion;
}
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public BigDecimal getValuacion() {
        return valuacion;
    }

    public void setValuacion(BigDecimal valuacion) {
        this.valuacion = valuacion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((anio == null) ? 0 : anio.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        result = prime * result + ((valuacion == null) ? 0 : valuacion.hashCode());
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
        Automovil other = (Automovil) obj;
        if (anio == null) {
            if (other.anio != null)
                return false;
        } else if (!anio.equals(other.anio))
            return false;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!marca.equals(other.marca))
            return false;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        if (tipo == null) {
            if (other.tipo != null)
                return false;
        } else if (!tipo.equals(other.tipo))
            return false;
        if (valuacion == null) {
            if (other.valuacion != null)
                return false;
        } else if (!valuacion.equals(other.valuacion))
            return false;
        return true;
    }
   

    @Override
    public String toString() {
        return "" +
            " matricula=" + getMatricula() + "" +
            ", tipo:" + getTipo() + "" +
            ", marca:" + getMarca() + "" +
            ", anio=" + getAnio() + "" +
            ", valuacion=" + getValuacion() + "" +
            "";
    }
    
}
