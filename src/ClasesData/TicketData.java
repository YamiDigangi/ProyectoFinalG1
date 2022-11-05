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
      
    
    public ArrayList<Ticket> ticketEmitidosPorFecha (Timestamp fechaCompra){
        ArrayList<Ticket> listaTicket = new ArrayList();
        String sql = "SELECT * FROM ticket WHERE fechaCompra = ?";
                
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTimestamp(1, fechaCompra);
            
            ResultSet rs = ps.executeQuery();
            
            Ticket t;
            Cliente c;         
            Proyeccion p;
            Butaca b;
            
            while(rs.next()){
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
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "TicketData Sentencia SQL erronea - ticketEmitidosPorFecha"+ ex.getMessage());
        }
        return listaTicket;   
    }
    
    public ArrayList<Ticket> ticketEmitidosPorPelicula (Pelicula pelicula){
        ArrayList<Ticket> listaTicket = new ArrayList();
        String sql = "SELECT * FROM Ticket t, Proyeccion p, pelicula peli WHERE t.idProyeccion = p.idProyeccion AND p.idPelicula = peli.idPelicula and peli.nombrePeli = ?";
                
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, pelicula.getNombrePeli());
            
            ResultSet rs = ps.executeQuery();
            
            Ticket t = new Ticket();
            Cliente c = new Cliente();           // PROBAR INSTANCIANDO LAS CLASES EN LA SENTENCIA WHILE!!
            Proyeccion p = new Proyeccion();
            Butaca b = new Butaca();
            
            while(rs.next()){
                
                        
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
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "TicketData Sentencia SQL erronea - ticketEmitidosPorPelicula"+ ex.getMessage());
        }
        return listaTicket;   
    }
    
    
    
    public ArrayList<Butaca> butacaOcupada(Timestamp inicio, Timestamp fin) {
          
    ArrayList<Butaca> but = new ArrayList(); 
    String sql = "SELECT t.idButaca from butaca b, proyeccion p, sala s, ticket t WHERE t.idProyeccion=p.idProyeccion and t.idButaca= b.idButaca and p.idSala = s.idSala and s.idSala=b.idSala and p.inicioPro BETWEEN ? AND ?";
    
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setTimestamp(1, inicio);
            ps.setTimestamp(2, fin);
            
            ResultSet rs = ps.executeQuery();
            
            Butaca b;
            while(rs.next()){
                b= new Butaca();
                b.setIdButaca(rs.getInt("idButaca"));
                but.add(b);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"No hay butacas ocupadas" + ex.getMessage());
        }
        
    return but;
    
    }
    
    
    public ArrayList<Butaca> butacasLibres(Timestamp inicio) {
        
        ArrayList<Butaca> but = new ArrayList();
        String sql = "SELECT b.idButaca, b.fila,b.columna FROM butaca b WHERE b.idButaca NOT IN (SELECT t.idButaca from butaca b, proyeccion p, sala s, ticket t WHERE t.idProyeccion=p.idProyeccion and t.idButaca= b.idButaca and p.idSala = s.idSala and p.inicioPro = ?)";
        
        
          try {
      
               PreparedStatement ps = con.prepareStatement(sql);
               ps.setTimestamp(1, inicio);
               
               ResultSet rs = ps.executeQuery();
               
                Butaca b;
                while(rs.next()){
                b= new Butaca();
                b.setIdButaca(rs.getInt("idButaca"));
                but.add(b);
            }
               
               ps.close();
    
          } catch (SQLException ex) {             
            Logger.getLogger(TicketData.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return but;
    
    }
    
} 
    
    
    
    
    
    
    
    

