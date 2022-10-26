/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Proyect;

import ClasesData.*;
import ClasesModelo.*;
import java.sql.Connection;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Month;
import javax.swing.JOptionPane;

/**
 *
 * @author yamic
 */
public class PruebasProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

    //////////////////AGREGAR CLIENTE//////////////////////////////    
        Cliente cli = new Cliente(5,33089673,"Javier","Torres",true);
        ClienteData c = new ClienteData();
        
//
      // c.agregarCliente(cli);
 //      c.borrarCliente(5);
  //      c.modificarCliente(cli);

//        c.agregarCliente(cli);
//        c.borrarCliente(4);
//        c.modificarCliente(cli);
//-------------------------------------------------------------------------------

      //////////////////-Pelicula-//////////////////
      ///-Alta/Baja/Modificaciones/ listados de Películas///
      
        
      Pelicula peli = new Pelicula(1,"Volver al Futuro", true);
      Pelicula peliss = new Pelicula(2,"Volver al Futuro II", true);
    
      PeliculaData pelis = new PeliculaData();
     
//           
//        
//   pelis.altaPelicula(peli);
  // pelis.modificarPelicula(peliss);
  // pelis.modificarPelicula(peli);
   //pelis.borrarPelis(2);

//    pelis.obtenerPelis().forEach(Pelicula->{
//         JOptionPane.showMessageDialog(null, Pelicula);
//        
//    });
  
//    JOptionPane.showMessageDialog(null, pelis.obtenerPelisPorId(2));  

//------------------------------------------------------------------------------

      Sala sa = new Sala(2,"Villa Mercedes", "San Luis", true);
      SalaData s = new SalaData();
      
     // s.altaSala(sa);
     // s.bajaSala(2);
     // s.modificarSala(sa);
     
 //-----------------------------------------------------------------------------
 
 
     Butaca bu= new Butaca(sa,"A",3);
     ButacaData b = new ButacaData();


     //b.agregarButaca(bu);
//------------------------------------------------------------------------------

      LocalDateTime inic = LocalDateTime.of(2022, Month.OCTOBER, 26, 16, 30, 00);
      LocalDateTime fin = LocalDateTime.of(2022, Month.OCTOBER, 26, 18, 00, 00);
      Proyeccion pro = new Proyeccion(sa,peliss,Timestamp.valueOf(inic),Timestamp.valueOf(fin),true);
      Proyeccion proo = new Proyeccion(sa,peli,Timestamp.valueOf(inic),Timestamp.valueOf(fin),true);
      ProyeccionData pd= new ProyeccionData();
      
      pd.agregarProyeccion(pro);
      pd.agregarProyeccion(proo);
      pd.borrarProyeccion(2);

     








}
}
