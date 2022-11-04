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
      Pelicula pel = new Pelicula(5,"50 Sombras", true);
      
    
      PeliculaData pelis = new PeliculaData();
     
//           
//        
//   pelis.altaPelicula(pel);
  // pelis.modificarPelicula(peliss);
  // pelis.modificarPelicula(peli);
//   pelis.borrarPelis(6);

//    pelis.obtenerPelis().forEach(Pelicula->{
//         JOptionPane.showMessageDialog(null, Pelicula);
//        
//    });
  
//    JOptionPane.showMessageDialog(null, pelis.obtenerPelisPorId(2));  

//------------------------------------------------------------------------------

      Sala sa = new Sala(2,"Sala Uno", "San Luis", true);
      Sala sla = new Sala(5,"Sala Cuatro", "San Luis", true);
      
      SalaData s = new SalaData();
      
      
      
//      s.altaSala(sla);
//      s.bajaSala(2);
//      s.modificarSala(sa);
//     System.out.println(s.obtenerSalaPorId(2));
 //-----------------------------------------------------------------------------
 
 
     Butaca bu= new Butaca(4,sa,"A",3);
     ButacaData b = new ButacaData();


     //b.agregarButaca(bu);
     // System.out.println(b.obtenerButacaPorid(5));
        
//----------------------------------PROYECCION--------------------------------------------

      LocalDateTime inic = LocalDateTime.of(2022, Month.NOVEMBER, 01, 20, 30, 00);
      LocalDateTime fin = LocalDateTime.of(2022, Month.NOVEMBER, 02, 22, 45, 00);
      
      Proyeccion pro = new Proyeccion(sa,peliss,Timestamp.valueOf(inic),Timestamp.valueOf(fin),true);
      Proyeccion proo = new Proyeccion(1,sa,peli,Timestamp.valueOf(inic),Timestamp.valueOf(fin),true);
      Proyeccion pr = new Proyeccion(sla,pel,Timestamp.valueOf(inic),Timestamp.valueOf(fin),true);
      
      ProyeccionData pd= new ProyeccionData();
      
      LocalDateTime lala = LocalDateTime.of(2022, Month.OCTOBER, 30, 6, 30, 00);
      
       // System.out.println(pd.obtenerProyeccionPorId(1));
      
      
//      ArrayList<Pelicula> list = new ArrayList();
//    
//    list = pd.obtenerPelisProyectadas(3, Timestamp.valueOf(lala));
//        System.out.println(Timestamp.valueOf(lala));
//    for(Pelicula ppro:list) {
//        
//        JOptionPane.showMessageDialog(null, ppro);
//    }
//      pd.agregarProyeccion(pr);
//      pd.agregarProyeccion(proo);
//      pd.borrarProyeccion(2);
//      pd.modificarProyeccion(proo);

//    ArrayList<Sala> lista = new ArrayList();
//    lista = pd.obtenerSalaProyeccion(3);
//    
//        for (Sala sal: lista) {
//            
//            JOptionPane.showMessageDialog(null, sal);
//            
//        }


//------------------------------------------------------------------------------

    LocalDateTime fcom = LocalDateTime.of(2022, Month.OCTOBER, 30, 07, 00, 0);
    Ticket ti = new Ticket(cli,proo,bu,Timestamp.valueOf(fcom),500,"Debito",true);
    
    TicketData td= new TicketData();

    LocalDateTime hora = LocalDateTime.of(2022, Month.OCTOBER, 30, 07, 00,00);
    
     //   System.out.println(td.ticketEmitidosPorFecha(Timestamp.valueOf(hora)));
//JOptionPane.showMessageDialog(null, td.ticketEmitidosPorFecha(Timestamp.valueOf(hora)));



//     ArrayList<Ticket> lista = new ArrayList();
//     
//    lista = td.ticketEmitidosPorFecha(Timestamp.valueOf(hora));
//    
//        for (Ticket t: lista) {
//            
//            JOptionPane.showMessageDialog(null, t);
//            
//        }
       //////////////-------------------//////////////
        
//    ArrayList<Ticket> lista = new ArrayList();
//     
//    lista = td.ticketEmitidosPorPelicula(peli);
//    
//        for (Ticket t: lista) {
//            
//            JOptionPane.showMessageDialog(null, t);
//            
//        }
        
  //------------------------ButacasOcupadas------------------------------------- 
  LocalDateTime ipro = LocalDateTime.of(2022, Month.OCTOBER, 30, 07, 00, 0);
  LocalDateTime fpro = LocalDateTime.of(2022, Month.OCTOBER, 30, 10, 00,00);
  
  ArrayList<Butaca> list = new ArrayList();
    
//    list = td.butacaOcupada(Timestamp.valueOf(ipro), Timestamp.valueOf(fpro));
//    
//    for(Butaca but:list) {
//        
//        JOptionPane.showMessageDialog(null, but);          
//    }
    
    //--------------------ButacasLibres------------------------------------------------------
   
    ArrayList<Butaca> lists = new ArrayList();
    
    lists = td.butacasLibres(Timestamp.valueOf(ipro));
    
    for(Butaca but:lists) {
        
        JOptionPane.showMessageDialog(null, but);          
    }
    
//    
//    
//    td.butacaOcupada(Timestamp.valueOf(fcom));
//    
//    td.agregarTicket(ti);
//    
//    td.modificarTicket(ti);
//


}
}
