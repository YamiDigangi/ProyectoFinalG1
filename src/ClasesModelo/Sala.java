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
public class Sala {
    private int idSala;
    private String ubicacion;
    private String localidad;
    private boolean estadoSala;

    public Sala() {
    }
    
    public Sala(String ubicacion, String localidad, boolean estadoSala) {
        this.ubicacion = ubicacion;
        this.localidad = localidad;
        this.estadoSala = estadoSala;
    }

    public Sala(int idSala, String ubicacion, String localidad, boolean estadoSala) {
        this.idSala = idSala;
        this.ubicacion = ubicacion;
        this.localidad = localidad;
        this.estadoSala = estadoSala;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public boolean isEstadoSala() {
        return estadoSala;
    }

    public void setEstadoSala(boolean estadoSala) {
        this.estadoSala = estadoSala;
    }

    @Override
    public String toString() {
        return  idSala + "Ubicacion: " + ubicacion + "\nlocalidad: " + localidad;
    }

    
           
}
