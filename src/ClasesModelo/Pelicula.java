/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesModelo;

/**
 *
 * @author yamic
 */
public class Pelicula {
    private int idPelicula;
    private String nombrePeli;
    private boolean estadoPeli;

    public Pelicula() {
    }

    public Pelicula(String nombrePeli, boolean estadoPeli) {
        this.nombrePeli = nombrePeli;
        this.estadoPeli = estadoPeli;
    }

    public Pelicula(int idPelicula, String nombrePeli, boolean estadoPeli) {
        this.idPelicula = idPelicula;
        this.nombrePeli = nombrePeli;
        this.estadoPeli = estadoPeli;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombrePeli() {
        return nombrePeli;
    }

    public void setNombrePeli(String nombrePeli) {
        this.nombrePeli = nombrePeli;
    }

    public boolean isEstadoPeli() {
        return estadoPeli;
    }

    public void setEstadoPeli(boolean estadoPeli) {
        this.estadoPeli = estadoPeli;
    }

    @Override
    public String toString() {
        return   nombrePeli;
    }
    
    
}
