/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesModelo;

import java.util.logging.Logger;

/**
 *
 * @author yamic
 */
public class Butaca {
    
    private int idButaca;
    private int idSala;
    private int fila;
    private int columna;

    public Butaca() {
    }

    public Butaca(int idButaca, int idSala, int fila, int columna) {
        this.idButaca = idButaca;
        this.idSala = idSala;
        this.fila = fila;
        this.columna = columna;
    }

    public Butaca(int idSala, int fila, int columna) {
        this.idSala = idSala;
        this.fila = fila;
        this.columna = columna;
    }

    public int getIdButaca() {
        return idButaca;
    }

    public void setIdButaca(int idButaca) {
        this.idButaca = idButaca;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Butaca{" + "idButaca=" + idButaca + ", idSala=" + idSala + ", fila=" + fila + ", columna=" + columna + '}';
    }
  
    
     
}
