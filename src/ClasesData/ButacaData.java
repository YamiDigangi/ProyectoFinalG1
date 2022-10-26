/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;


import ClasesModelo.Butaca;
import ClasesModelo.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yamic
 */
public class ButacaData {
    
    private Connection con;
    //private SalaData salaData;
    
    

    
    public ButacaData() {
        this.con = Conexion.getConexion();
       // this.salaData= new SalaData();
    }
    
    
    public void agregarButaca (Butaca butaca) {
        String sql = "INSERT INTO butaca (idSala, fila, columna) VALUES (?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, butaca.getSala().getIdSala());
            ps.setString(2, butaca.getFila());
            ps.setInt(3, butaca.getColumna());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                butaca.setIdButaca(rs.getInt(1));
                       
                JOptionPane.showMessageDialog(null, "Buataca añadida exitosamente");
            }
                        
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ButacaData sentencia SQL erronea - agregarButaca"+ ex.getMessage());
        }
        
    }
    
    public void borrarButaca(int id) {
        
        
    }
    
    
    
    
}
