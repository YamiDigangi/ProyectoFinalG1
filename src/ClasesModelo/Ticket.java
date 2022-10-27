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
public class Ticket {
    private int idTicket;
    private Cliente cliente;
    private Proyeccion proyeccion;
    private Butaca butaca;
    private LocalDate fechaCompra;
    private double monto;
    private String formaPago;
    private boolean estadoTicket;

    public Ticket() {
    }

    public Ticket(int idTicket, Cliente cliente, Proyeccion proyeccion, Butaca butaca, LocalDate fechaCompra, double monto, String formaPago, boolean estadoTicket) {
        this.idTicket = idTicket;
        this.cliente = cliente;
        this.proyeccion = proyeccion;
        this.butaca = butaca;
        this.fechaCompra = fechaCompra;
        this.monto = monto;
        this.formaPago = formaPago;
        this.estadoTicket = estadoTicket;
    }

    public Ticket(Cliente cliente, Proyeccion proyeccion, Butaca butaca, LocalDate fechaCompra, double monto, String formaPago, boolean estadoTicket) {
        this.cliente = cliente;
        this.proyeccion = proyeccion;
        this.butaca = butaca;
        this.fechaCompra = fechaCompra;
        this.monto = monto;
        this.formaPago = formaPago;
        this.estadoTicket = estadoTicket;
    }

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Proyeccion getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(Proyeccion proyeccion) {
        this.proyeccion = proyeccion;
    }

    public Butaca getButaca() {
        return butaca;
    }

    public void setButaca(Butaca butaca) {
        this.butaca = butaca;
    }

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public boolean isEstadoTicket() {
        return estadoTicket;
    }

    public void setEstadoTicket(boolean estadoTicket) {
        this.estadoTicket = estadoTicket;
    }

    @Override
    public String toString() {
        return "Ticket{" + "idTicket=" + idTicket + ", cliente=" + cliente + ", proyeccion=" + proyeccion + ", butaca=" + butaca + ", fechaCompra=" + fechaCompra + ", monto=" + monto + ", formaPago=" + formaPago + ", estadoTicket=" + estadoTicket + '}';
    }

    public void setIdProyeccion(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
