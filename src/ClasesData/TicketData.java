/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;

import ClasesModelo.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yamic
 */
public class TicketData {
    private Connection con;
    
    

    public TicketData() {
        this.con = Conexion.getConexion();
        
    }
    
    public void agregarTicket (Ticket ticket) {
        String sql = "INSERT INTO ticket (idCliente, idProyeccion, idButaca, fechaCompra, monto, formaPago, estadoTicket) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ticket.getCliente().getIdCliente());
            ps.setInt(2, ticket.getProyeccion().getIdProyeccion());
            ps.setInt(3, ticket.getButaca().getIdButaca());
            ps.setTimestamp(4, ticket.getFechaCompra());
            ps.setDouble(5, ticket.getMonto());
            ps.setString(6, ticket.getFormaPago());
            ps.setBoolean(7, ticket.isEstadoTicket());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                ticket.setIdTicket(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "ticket añadidó exitosamente");
                
            }      
                    
            } catch (SQLException ex) {
                
            JOptionPane.showMessageDialog(null, "ticketData sentencia SQL erronea - ticket");
        }
        
    }
    
    public void borrarTicket(int id) {
        String sql = "UPDATE ticket SET estadoTicket= 0 WHERE idTicket=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Ticket borrada exitosamente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ticketData sentencia SQL erronea - borrarTicket" + ex.getMessage());
        }
    }
    
    public void modificarTicket(Ticket ticket){
        String sql="UPDATE ticket SET idCliente = ?, idProyeccion = ?, idButaca = ?, fechaCompra = ?, monto = ?, formaPago = ?, estadoTicket = ? WHERE idTicket = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
           
          
            ps.setInt(1, ticket.getCliente().getIdCliente());
            ps.setInt(2, ticket.getProyeccion().getIdProyeccion());
            ps.setInt(3, ticket.getButaca().getIdButaca());
            ps.setTimestamp(4, ticket.getFechaCompra());
            ps.setDouble(5, ticket.getMonto());
            ps.setString(6, ticket.getFormaPago());
            ps.setBoolean(7, ticket.isEstadoTicket());
            ps.setInt(8, ticket.getIdTicket());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "El Ticket seleccioando fue actualizado");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "TicketData Sentencia SQL erronea-actualizarTicket"+ex.getMessage());
        }
    }
    
    
    /* public ArrayList<Ticket> ticketEmitidos(Timestamp fcompra) {
        
    ArrayList<Ticket> listaTicket = new ArrayList(); 
    
    String sql = " ";
    
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setTimestamp(1, inicio);
            
            ResultSet rs = ps.executeQuery();
            
            Butaca b;
            while(rs.next()){
                b= new Butaca();
                b.setIdButaca(rs.getInt("idButaca"));
                but.add(b);
            }
            
            JOptionPane.showMessageDialog(null, but);
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No hay butacas ocupadas" + ex.getMessage());
        }
        
    return but;
    
    }*/
    
    
    public ArrayList<Ticket> ticketEmitidosPorFecha (Timestamp fechaCompra){
        ArrayList<Ticket> listaTicket = new ArrayList();
        String sql = "SELECT t.idTicket, t.idCliente, t.idProyeccion, t.idButaca, t.fechaCompra, t.monto, t.formaPago, t.estadoTicket FROM ticket t, cliente c, proyeccion p, butaca b WHERE c.idCliente = t.idCliente and p.idProyeccion = t.idProyeccion AND b.idButaca = t.idButaca and fechaCompra = ?";
        
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTimestamp(1, fechaCompra);
            
            ResultSet rs = ps.executeQuery();
            
            Ticket t;
            Cliente c;         
            Proyeccion p;
            Butaca b;
            
            if(rs.next()){
                t = new Ticket();
                c = new Cliente();         
                p = new Proyeccion();
                b = new Butaca();
       
                c.setIdCliente(rs.getInt("idCliente"));
                p.setIdProyeccion(rs.getInt("idProyeccion"));
                b.setIdButaca(rs.getInt("idButaca"));
                
                t.setCliente(c);
                t.setProyeccion(p);
                t.setButaca(b);
                
                t.setIdTicket(rs.getInt("idTicket"));
                t.setFechaCompra(rs.getTimestamp("fechaCompra"));
                t.setMonto(rs.getDouble("monto"));
                t.setFormaPago(rs.getString("formaPago"));
                t.setEstadoTicket(rs.getBoolean("estadoTicket"));
                listaTicket.add(t);
                
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "TicketData Sentencia SQL erronea - ticketEmitidosPorFecha"+ ex.getMessage());
        }
        return listaTicket;   
    }
    
}
