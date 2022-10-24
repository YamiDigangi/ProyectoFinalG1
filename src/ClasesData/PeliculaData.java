
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
    
    public void agregarPelicula(Pelicula pelicula) {
        
        String sql = "INSERT INTO pelicula ( nombrePeli, estado) VALUES (?,?)";
        
        try {
            PreparedStatement ps= con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, pelicula.getNombrePeli());
            ps.setBoolean(2, pelicula.isEstadoPeli());
            
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()) {
                pelicula.setIdPelicula(rs.getInt(1));
                
                JOptionPane.showMessageDialog(null, "La Pelicula se agregó correctamente");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PeliculaData Sentencia SQL erronea-AgregarPelicula");
        }
        
    }
    
    public ArrayList<Pelicula> listaDePelis(){
        
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
            JOptionPane.showMessageDialog(null, "PeliculaData Sentencia SQL erronea-ListaDePelis");
        }
    return listaPelis;
    }
        
    public Pelicula listaPelisPorId(int IdPelicula) {
        
        String sql= "SELECT * FROM pelicula WHERE IdPelicula = ?";
        
        Pelicula peli = new Pelicula();
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, IdPelicula);
            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next()){              
                
                peli.setNombrePeli("nombrePeli");
                peli.setEstadoPeli(true);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PeliculaData Sentencia SQL erronea-listaPelisPorId");
        }
        return peli;
         
    }
    
    public void actualizaPelicula(Pelicula pelicula){
        String sql="UPDATE pelicula SET nombrepeli = ?, estado = ? WHERE idPelicula = ?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
//           pelicula.setIdPelicula("idPelicula");
           pelicula.setNombrePeli("nombrePeli");
           pelicula.setEstadoPeli(true);
         
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "La pelicula seleccioanda fue actualizada");
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PeliculaData Sentencia SQL erronea-actualizarPelicula");
        }
    }
    
    public void borrarPelis (int id){
        String sql="UPDATE pelicula SET estado=0 WHERE idPelicula=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, id);
            ps.executeUpdate();//
            
            JOptionPane.showMessageDialog(null, "La Plicula se elimino correctamente");
            
            ps.close();
            
    }   catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "PeliculaData Sentencia SQL erronea-borrarPelicula");
        }
    }
    
}
