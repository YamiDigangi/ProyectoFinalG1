
package ClasesData;

import ClasesModelo.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;


public class PeliculaData {
    
    private Connection con;

     
    public PeliculaData(){
        this.con = Conexion.getConexion();
        
    }
    
    public void altaPelicula(Pelicula pelicula) {
        
        String sql = "INSERT INTO pelicula (nombrePeli, estadoPeli) VALUES ( ?, ?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, pelicula.getNombrePeli());
            ps.setBoolean(2, pelicula.isEstadoPeli());
            
            ps.executeUpdate();//insert, update, delete
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                
                pelicula.setIdPelicula(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "La Película  se agregó correctamente");
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PeliculaData Sentencia SQL erronea-AltaPelicula");
        }
        
    }
    
    public void borrarPelis (int id){
        String sql="UPDATE pelicula SET estadopeli=0 WHERE idPelicula=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, id);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "La Película se elimino correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PeliculaData Sentencia SQL erronea-borrarPelicula");
        }
    }
    
    public ArrayList<Pelicula> obtenerPeliculas(){
        
        ArrayList<Pelicula> listaPelis=new ArrayList();
        
        String sql="SELECT * FROM pelicula WHERE estadoPeli = 1";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ResultSet rs=ps.executeQuery();
            
            while(rs.next()){
            
                Pelicula pelis=new Pelicula();
                
                pelis.setIdPelicula(rs.getInt("IdPelicula"));
                pelis.setNombrePeli(rs.getString("nombrePeli"));
                pelis.setEstadoPeli(rs.getBoolean("estadoPeli"));
                
                listaPelis.add(pelis);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PeliculaData Sentencia SQL erronea-obtenerPelis");
        }
    return listaPelis;
    }
        
    public Pelicula obtenerPelisPorId(int IdPelicula) {
        
        String sql= "SELECT * FROM pelicula WHERE IdPelicula = ?";
        
        Pelicula peli = new Pelicula();
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, IdPelicula);
            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){
                
                peli.setIdPelicula(rs.getInt("IdPelicula"));
                peli.setNombrePeli(rs.getString("nombrePeli"));
                                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PeliculaData Sentencia SQL erronea-listaPelisPorId");
        }
        return peli;
         
    }
    
    public void modificarPelicula(Pelicula pelicula){
        String sql="UPDATE pelicula SET nombrePeli = ?, estadoPeli = ? WHERE idPelicula = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
           
           ps.setString(1, pelicula.getNombrePeli());
           ps.setBoolean(2, true);
           ps.setInt(3, pelicula.getIdPelicula());
         
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "La Película seleccioanda fue actualizada");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PeliculaData Sentencia SQL erronea-actualizarPelicula");
        }
    }
    
}
