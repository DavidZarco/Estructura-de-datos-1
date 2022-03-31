/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ar.edu.uner.fcad.ed.ejercicio5;

/**
 *
 * @author David Zarcó
 */
public class Dimension {
    private double eslora;
    private double manga;
    private double puntal;

    public Dimension(double eslora, double manga, double puntal) {
        this.eslora = eslora;
        this.manga = manga;
        this.puntal = puntal;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public double getManga() {
        return manga;
    }

    public void setManga(double manga) {
        this.manga = manga;
    }

    public double getPuntal() {
        return puntal;
    }

    public void setPuntal(double puntal) {
        this.puntal = puntal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.eslora) ^ (Double.doubleToLongBits(this.eslora) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.manga) ^ (Double.doubleToLongBits(this.manga) >>> 32));
        hash = 79 * hash + (int) (Double.doubleToLongBits(this.puntal) ^ (Double.doubleToLongBits(this.puntal) >>> 32));
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
        final Dimension other = (Dimension) obj;
        if (Double.doubleToLongBits(this.eslora) != Double.doubleToLongBits(other.eslora)) {
            return false;
        }
        if (Double.doubleToLongBits(this.manga) != Double.doubleToLongBits(other.manga)) {
            return false;
        }
        return Double.doubleToLongBits(this.puntal) == Double.doubleToLongBits(other.puntal);
    }

    @Override
    public String toString() {
        return  "Eslora:" + eslora + ", manga:" + manga + ", puntal:" + puntal ;
    }   
}