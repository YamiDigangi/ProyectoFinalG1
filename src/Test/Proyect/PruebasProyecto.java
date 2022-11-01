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
import java.util.ArrayList;
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
        Cliente cl = new Cliente(33029917,"Santiago","Farioli",true);
        Cliente cli = new Cliente(5,33089673,"Javier","Torres",true);
        Cliente  c3= new Cliente(123456,"Yamila Belen","Di Gangi",true);
        ClienteData c = new ClienteData();
        Cliente c2 = new Cliente(36548952,"Roberto","Gimenez",true);
        
        
       //  c.agregarCliente(c2);
      // c.agregarCliente(cli);
 //      c.borrarCliente(5);
  //      c.modificarCliente(cli);

//        c.agregarCliente(cli);
//        c.borrarCliente(4);
//        c.modificarCliente(cli);
          
        // c.obtenerClientePorDni(33089673);
         
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
 
 
     Butaca bu= new Butaca(4,sa,"A",3);
     ButacaData b = new ButacaData();


     //b.agregarButaca(bu);
//------------------------------------------------------------------------------

      LocalDateTime inic = LocalDateTime.of(2022, Month.OCTOBER, 20, 16, 30, 00);
      LocalDateTime fin = LocalDateTime.of(2022, Month.OCTOBER, 21, 18, 00, 00);
      Proyeccion pro = new Proyeccion(2,sa,peliss,Timestamp.valueOf(inic),Timestamp.valueOf(fin),true);
      Proyeccion proo = new Proyeccion(1,sa,peli,Timestamp.valueOf(inic),Timestamp.valueOf(fin),true);
      ProyeccionData pd= new ProyeccionData();
      LocalDateTime lala = LocalDateTime.of(2022, Month.OCTOBER, 30, 10, 30, 00);
      
      
      ArrayList<Pelicula> list = new ArrayList();
    
    list = pd.obtenerPelisProyectadas(3, Timestamp.valueOf(lala));
    
    for(Pelicula ppro:list) {
        
        JOptionPane.showMessageDialog(null, list);
    }
 //     pd.agregarProyeccion(pro);
//      pd.agregarProyeccion(proo);
//      pd.borrarProyeccion(2);
//      pd.modificarProyeccion(proo);

//------------------------------------------------------------------------------

    LocalDateTime fcom = LocalDateTime.of(2022, Month.OCTOBER, 30, 10, 00, 0);
    Ticket ti = new Ticket(cli,proo,bu,Timestamp.valueOf(fcom),500,"Debito",true);
    
    TicketData td= new TicketData();
    
   /* ArrayList<Butaca> list = new ArrayList();
    
    list = td.butacaOcupada(Timestamp.valueOf(fcom));
    
    for(Butaca but:list) {
        
        JOptionPane.showMessageDialog(null, but);          
    
    
    td.butacaOcupada(Timestamp.valueOf(fcom)).forEach(butaca->{
        JOptionPane.showMessageDialog(null, butaca);
    }); */
    
    

    
    //td.butacaOcupada(Timestamp.valueOf(fcom));
    
    //td.agregarTicket(ti);
    
//    td.modificarTicket(ti);

     








}
}
