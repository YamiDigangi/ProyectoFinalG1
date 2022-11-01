/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;

import ClasesModelo.Butaca;
import ClasesModelo.Conexion;
import ClasesModelo.Pelicula;
import ClasesModelo.Proyeccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.zone.ZoneOffsetTransitionRule;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author yamic
 */
public class ProyeccionData {
    private Connection con;
    

    public ProyeccionData() {
        this.con = Conexion.getConexion();
    }
    
    
    public void agregarProyeccion (Proyeccion proyeccion) {
        String sql = "INSERT INTO proyeccion (idSala, idPelicula, inicioPro, finPro, estadoPro) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, proyeccion.getSala().getIdSala());
            ps.setInt(2, proyeccion.getPelicula().getIdPelicula());
            ps.setTimestamp(3, proyeccion.getInicioPro());
            ps.setTimestamp(4, proyeccion.getFinPro());
            ps.setBoolean(5, proyeccion.isEstadoPro());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                proyeccion.setIdProyeccion(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "Proyeccion añadida exitosamente");
                
            }      
                    
            } catch (SQLException ex) {
                
            JOptionPane.showMessageDialog(null, "ProyeccionData sentencia SQL erronea - agregarProyecccion" + ex.getMessage());
        }
        
    }
    
    public void borrarProyeccion (int id) {
        String sql = "UPDATE proyeccion SET estadoPro=0 WHERE idProyeccion=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Proyeccion borrada exitosamente");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ProyeccionData sentencia SQL erronea - borrarProyeccion" + ex.getMessage());
        }
    }
    
    public void modificarProyeccion(Proyeccion proyeccion){
        String sql="UPDATE proyeccion SET idSala = ?, idPelicula = ?, inicioPro = ?, finPro = ?, estadoPro = ?, WHERE idProyeccu = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
           
           ps.setInt(1, proyeccion.getSala().getIdSala());
           ps.setInt(2, proyeccion.getPelicula().getIdPelicula());
           ps.setTimestamp(3, proyeccion.getInicioPro());
           ps.setTimestamp(4, proyeccion.getInicioPro());
           ps.setBoolean(5, true);
         
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "La Proyeccion seleccioanda fue actualizada");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ProyeccionData Sentencia SQL erronea-actualizarProyeccion");
        }
    }
    
    
     public ArrayList<Pelicula> obtenerPelisProyectadas(int sala, Timestamp hora){
        
        ArrayList<Pelicula> listaPelis = new ArrayList();
        
        String sql="SELECT pe.nombrePeli FROM pelicula pe, sala s, proyeccion p WHERE pe.idPelicula = p.idPelicula and s.idSala = p.idSala and p.idSala = ? AND p.inicioPro = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,sala);
            ps.setTimestamp(2, hora);
            
            ResultSet rs=ps.executeQuery();
            Pelicula pelis;
            
            while(rs.next()){
            
                pelis = new Pelicula();
                
                pelis.setNombrePeli(rs.getString("nombrePeli"));
                
                
                listaPelis.add(pelis);
            }
            JOptionPane.showMessageDialog(null, listaPelis);
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ProyeccionData Sentencia SQL erronea-obtenerPelisProyectadas");
        }
     return listaPelis;
    }
}



