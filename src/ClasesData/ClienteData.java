
package ClasesData;

import ClasesModelo.Cliente;
import ClasesModelo.Conexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yamic
 */
public class ClienteData {
    private Connection con;

    
    public ClienteData() {
        this.con = Conexion.getConexion();
    }
    
    public void agregarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (dni, nombre, apellido, estado) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setBoolean(4, cliente.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Cliente agregado correctamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-AgregarCliente"+ ex.getMessage());
        }
        
    }
    
    public void borrarCliente (int id){
         String sql = "UPDATE cliente SET estado=0 WHERE idCliente=?";
         
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-borrarCliente");
        }
        
    }
    
    public void modificarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET dni = ?, nombre = ?, apellido = ?, estado = ? WHERE idCliente = ?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setInt(1,cliente.getDni());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getApellido());
            ps.setBoolean(4, cliente.isEstado());
            ps.setInt(5, cliente.getIdCliente());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Cliente modificado correctamente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea - modificarCliente");
        }
        
    }
    
    public Cliente obtenerClientePorDni(int dni){
     String sql= "SELECT * FROM cliente WHERE dni = ?";
        Cliente cli = new Cliente();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                cli.setIdCliente(rs.getInt("idCliente"));
                cli.setDni(dni);
                cli.setNombre(rs.getString("nombre"));
                cli.setApellido(rs.getString("apellido"));
                cli.setEstado(rs.getBoolean("estado"));
                
            }
            
//            JOptionPane.showMessageDialog(null, cli);
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ClienteData Sentencia SQL erronea-obtenerClientePorDni"+ex.getMessage());
        }
     return cli;
    }
}
