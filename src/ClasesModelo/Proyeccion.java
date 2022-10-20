/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesModelo;

import java.time.LocalDate;

/**
 *
 * @author yamic
 */
public class Proyeccion {
    private int idProyeccion;
    private Sala sala;
    private Pelicula pelicula;
    private LocalDate inicioPro,finPro;
    private boolean estadoPro;

    public Proyeccion() {
    }

    public Proyeccion(int idProyeccion, Sala sala, Pelicula pelicula, LocalDate inicioPro, LocalDate finPro, boolean estadoPro) {
        this.idProyeccion = idProyeccion;
        this.sala = sala;
        this.pelicula = pelicula;
        this.inicioPro = inicioPro;
        this.finPro = finPro;
        this.estadoPro = estadoPro;
    }

    public Proyeccion(Sala sala, Pelicula pelicula, LocalDate inicioPro, LocalDate finPro, boolean estadoPro) {
        this.sala = sala;
        this.pelicula = pelicula;
        this.inicioPro = inicioPro;
        this.finPro = finPro;
        this.estadoPro = estadoPro;
    }

    public int getIdProyeccion() {
        return idProyeccion;
    }

    public void setIdProyeccion(int idProyeccion) {
        this.idProyeccion = idProyeccion;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getInicioPro() {
        return inicioPro;
    }

    public void setInicioPro(LocalDate inicioPro) {
        this.inicioPro = inicioPro;
    }

    public LocalDate getFinPro() {
        return finPro;
    }

    public void setFinPro(LocalDate finPro) {
        this.finPro = finPro;
    }

    public boolean isEstadoPro() {
        return estadoPro;
    }

    public void setEstadoPro(boolean estadoPro) {
        this.estadoPro = estadoPro;
    }

    @Override
    public String toString() {
        return "Proyeccion{" + "idProyeccion=" + idProyeccion + ", sala=" + sala + ", pelicula=" + pelicula + ", inicioPro=" + inicioPro + ", finPro=" + finPro + ", estadoPro=" + estadoPro + '}';
    }

   
    
}

