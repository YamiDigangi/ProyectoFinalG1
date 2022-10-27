/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;

import ClasesModelo.*;
import java.sql.*;
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
        String sql = "INSERT INTO ticket (idCliente, idProyeccion, idButaca	, fechaCompra, monto, formaPago, estadoTiket) VALUES ( ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, ticket.getCliente().getIdCliente());
            ps.setInt(2, ticket.getProyeccion().getIdProyeccion());
            ps.setInt(3, ticket.getButaca().getIdButaca());
//            ps.setDate(4, ticket.getFechaCompra());
            ps.setDouble(5, ticket.getMonto());
            ps.setString(6, ticket.getFormaPago());
            ps.setBoolean(7, true);
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                ticket.setIdProyeccion(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "ticket añadidó exitosamente");
                
            }      
                    
            } catch (SQLException ex) {
                
            JOptionPane.showMessageDialog(null, "ticketData sentencia SQL erronea - ticket");
        }
        
    }
    
    public void borrarticket(int id) {
        String sql = "UPDATE ticket SET estadoPro=0 WHERE idticket=?";
        
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
        String sql="UPDATE proyeccion SET idCliente = ?, idProyeccion = ?, idButaca	 = ?, fechaCompra = ?, monto = ?, formaPago = ?, estadoTiket = ? WHERE idticket = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
           
          
            ps.setInt(1, ticket.getCliente().getIdCliente());
            ps.setInt(2, ticket.getProyeccion().getIdProyeccion());
            ps.setInt(3, ticket.getButaca().getIdButaca());
//            ps.setDate(4, ticket.getFechaCompra());
            ps.setDouble(5, ticket.getMonto());
            ps.setString(6, ticket.getFormaPago());
            ps.setBoolean(7, true);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "El Ticket seleccioando fue actualizado");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "TicketData Sentencia SQL erronea-actualizarTicket");
        }
    }
    
}
