/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;

import ClasesModelo.Butaca;
import ClasesModelo.*;
import java.sql.Connection;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.zone.ZoneOffsetTransitionRule;
import java.util.*;
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
       
    public Proyeccion obtenerProyeccionPorId(int IdProyeccion) {
        
        String sql= "SELECT * FROM proyeccion WHERE IdProyeccion = ?";
        
        Proyeccion p = new Proyeccion();
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, IdProyeccion);
            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                
                p.setIdProyeccion(rs.getInt("IdProyeccion"));
                                              
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ProyeccionData Sentencia SQL erronea-listaProyeccionPorId");
        }
        return p;
         
    }
    
    
    public ArrayList<Pelicula> obtenerPeliculasProyectadas(int sala, Timestamp hora){
        
        ArrayList<Pelicula> listaPelis = new ArrayList();
        
        String sql="SELECT pe.nombrePeli FROM pelicula pe, sala s, proyeccion p WHERE pe.idPelicula = p.idPelicula and s.idSala = p.idSala and p.idSala = ? AND p.inicioPro >= ?";
        
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
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ProyeccionData Sentencia SQL erronea-obtenerPelisProyectadas");
        }
     return listaPelis;
    }
          
    public ArrayList<Sala> obtenerSalaProyeccion(int idPeli){
        
        ArrayList<Sala> listSala = new ArrayList();
        
        String sql="SELECT s.idSala, s.ubicacion, s.localidad, s.estadoSala FROM proyeccion p, sala s, pelicula pe WHERE pe.idPelicula = p.idProyeccion AND s.idSala = p.idSala AND p.idSala = ?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1,idPeli);
            
            ResultSet rs=ps.executeQuery();
            
            Sala s;
            
            while(rs.next()){
            
                s = new Sala();
                
                s.setIdSala(rs.getInt("idSala"));
                s.setUbicacion(rs.getString("ubicacion"));
                s.setLocalidad(rs.getString("localidad"));
                s.setEstadoSala(rs.getBoolean("estadoSala"));
                                
                listSala.add(s);
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ProyeccionData Sentencia SQL erronea-obtenerSalaProyeccion" + ex.getMessage());
        }
     return listSala;
    }
     
    public List<Proyeccion> listarProyeccion(){
        ArrayList<Proyeccion> listarProyeccion = new ArrayList<>();
        
        String sql = "SELECT * FROM proyeccion WHERE estadoPro = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            SalaData sd = new SalaData();
            PeliculaData pd = new PeliculaData();
            while (rs.next()) {                
                Proyeccion p = new Proyeccion();
                p.setIdProyeccion(rs.getInt("idProyeccion"));
                Sala s = sd.obtenerSalaPorId(rs.getInt("idSala"));
                p.setSala(s);
                Pelicula pe = pd.obtenerPelisPorId(rs.getInt("idPelicula"));
                p.setPelicula(pe);
                p.setInicioPro(rs.getTimestamp("inicioPro"));
                p.setFinPro(rs.getTimestamp("finPro"));
                p.setEstadoPro(rs.getBoolean("estadoPro"));
                
                listarProyeccion.add(p);
            }
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener proyeccion" + ex);
        }
        
        return listarProyeccion;
    }

    public ArrayList<Proyeccion> obtenerProyeccionPorInicioProyeccion(Timestamp inicioPro) {
    
       //String sql="SELECT * FROM `proyeccion` WHERE inicioPro BETWEEN ? AND ?";

       ArrayList<Proyeccion> listarProyeccion = new ArrayList<>();
       String sql= "SELECT * FROM proyeccion WHERE inicioPro >= ? AND estadoPro = 1 order by inicioPro";
        
                
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setTimestamp(1,inicioPro);
            
            ResultSet rs = ps.executeQuery();
            
            SalaData sd = new SalaData();
            PeliculaData pd = new PeliculaData();
            
            while (rs.next()) {                
                Proyeccion p = new Proyeccion();
                p.setIdProyeccion(rs.getInt("idProyeccion"));
                Sala s = sd.obtenerSalaPorId(rs.getInt("idSala"));
                p.setSala(s);
                Pelicula pe = pd.obtenerPelisPorId(rs.getInt("idPelicula"));
                p.setPelicula(pe);
                p.setInicioPro(rs.getTimestamp("inicioPro"));
                p.setFinPro(rs.getTimestamp("finPro"));
                p.setEstadoPro(rs.getBoolean("estadoPro"));
                
                listarProyeccion.add(p);           
            }
      
            ps.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener proyeccion" + ex.getMessage());
        }
        
        return listarProyeccion;
    }

     
}
     