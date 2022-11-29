/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;

import ClasesModelo.Conexion;
import ClasesModelo.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yamic
 */
public class SalaData {
    
    private Connection con;
    

    public SalaData() {
        this.con = Conexion.getConexion();
    }
    
    
    public void altaSala (Sala sala) {
       String sql= "INSERT INTO sala (ubicacion, localidad, estadoSala) VALUES (?,?,?)";
       
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, sala.getUbicacion());
            ps.setString(2, sala.getLocalidad());
            ps.setBoolean(3, sala.isEstadoSala());
            ps.executeUpdate();
            
            ResultSet rs= ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                sala.setIdSala(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Sala creada exitosamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SalaData Sentencia SQL erronea - altaSala");
       }
        
        
        
        
    }
    
    
    public void bajaSala (int id) {
        String sql= "UPDATE sala SET estadoSala=0 WHERE idSala=?";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Baja de sala exitosa");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SalaData sentencia SQL erronea - bajaSala");
       }
    }
    
    
    
    public void modificarSala (Sala sala) {
        String sql= "UPDATE sala SET ubicacion = ?, localidad = ?, estadoSala = ? WHERE idSala = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, sala.getUbicacion());
            ps.setString(2, sala.getLocalidad());
            ps.setBoolean(3, sala.isEstadoSala());
            ps.setInt(4, sala.getIdSala());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Sala actualizada");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SalaData sentencia SQL erronea - modificarSala");
        }    
        
    }
    
    
    public Sala obtenerSalaPorId(int idSala) {
        String sql= "SELECT * FROM sala WHERE idSala = ? AND estadoSala = 1";
        Sala s = new Sala();
        
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, idSala);
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
                s.setIdSala(idSala);
                s.setUbicacion(rs.getString("ubicacion"));
                s.setLocalidad(rs.getString("localidad"));
                s.setEstadoSala(rs.getBoolean("estadoSala"));     
                
            }
        ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SalaData Sentencia SQL erronea-obtenerSalaPorId"+ex.getMessage());
        }
        return s;
         
    }
    
    
    public ArrayList<Sala> obtenerSalas(){
        
        ArrayList<Sala> listaSalas=new ArrayList();
        
        String sql="SELECT * FROM sala WHERE estadoSala = 1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                Sala s=new Sala();
                
                s.setIdSala(rs.getInt("idSala"));
                s.setUbicacion(rs.getString("ubicacion"));
                s.setLocalidad(rs.getString("localidad"));
                s.setEstadoSala(rs.getBoolean("estadoSala"));
                listaSalas.add(s);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SalaData Sentencia SQL erronea-obtenerSalas");
        }
    return listaSalas;
    }
        
  }
    

