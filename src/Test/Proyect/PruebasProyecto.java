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
        
/*                      ------------
                       |CLIENTE DATA|                                         
                        ------------                                         */
                        
 ///////////////////// AGREGAR CLIENTE///////////////////////////////////////////
 
        Cliente c1 = new Cliente(33029917,"Santiago","Farioli",true);
        Cliente c2 = new Cliente(33089673,"Javier","Torres",true);
        Cliente c3= new Cliente(123456,"Yamila Belen","Di Gangi",true);
        
        ClienteData cd = new ClienteData();
        
 //       cd.agregarCliente(c1);
 //-----------------------------------------------------------------------------
 
 /////////////////////BORRAR CLIENTE///////////////////////////////////////////       
        
//        cd.borrarCliente(1);

//------------------------------------------------------------------------------       
       
//////////////////////MODIFICAR CLIENTE/////////////////////////////////////////    
       
//        cd.modificarCliente(c1);

//------------------------------------------------------------------------------        

/////////////////////OBTENER CLIENTE POR DNI////////////////////////////////////      
          
//        cd.obtenerClientePorDni(33029917);  
         
//-------------------------------------------------------------------------------

/*                      -------------
                       |PELICULA DATA|
                        -------------                                          */

////////////////////////ALTA PELICULA////////////////////////////////////////////      
      
        Pelicula p1 = new Pelicula("Volver al Futuro", true);
        Pelicula p2 = new Pelicula("Volver al Futuro II", true);
        Pelicula p3 = new Pelicula("50 Sombras", true);
      
        PeliculaData pd = new PeliculaData();
      
//        pd.altaPelicula(p1);
//------------------------------------------------------------------------------

////////////////////////BAJA PELICULA///////////////////////////////////////////
      
//        pd.borrarPelis(1);
      
//------------------------------------------------------------------------------

//////////////////////MODIFICAR PELICULA////////////////////////////////////////

//        pd.modificarPelicula(p2);

//------------------------------------------------------------------------------

/////////////////////OBTENER PELICULAS//////////////////////////////////////////

//           pd.obtenerPeliculas().forEach(Pelicula->{
//         JOptionPane.showMessageDialog(null, Pelicula);
//        
//    });

//------------------------------------------------------------------------------

/*                      ---------
                       |SALA DATA|
                        ---------                                             */   
  
///////////////////////ALTA SALA////////////////////////////////////////////////

        Sala s1 = new Sala("Sala Uno", "San Luis", true);
        Sala s2 = new Sala("Sala Dos", "San Luis", true);
        Sala s3 = new Sala("Sala Tres", "San Luis", true);
        
        SalaData sd = new SalaData();
  
//      sd.altaSala(s1);

//------------------------------------------------------------------------------

///////////////////////BAJA SALA////////////////////////////////////////////////      
      
//      sd.bajaSala(2);
      
//------------------------------------------------------------------------------

//////////////////////MODIFICAR SALA////////////////////////////////////////////

//      sd.modificarSala(s2);

//------------------------------------------------------------------------------

/*                      -----------
                       |BUTACA DATA|
                        -----------                                            */

//////////////////////AGREGAR BUTACA////////////////////////////////////////////
 
        Butaca b1= new Butaca(s1,"A",3);
        Butaca b2= new Butaca(s2,"A",3);
        Butaca b3= new Butaca(s3,"A",3);
     
     
        ButacaData b = new ButacaData();

//      b.agregarButaca(b1)
        
//------------------------------------------------------------------------------        

//////////////////////OBTENER BUTACAS POR ID////////////////////////////////////
     
//      System.out.println(b.obtenerButacaPorId(5));
        
//------------------------------------------------------------------------------

/*                      ---------------
                       |PROYECCION DATA|
                        ---------------                                       */

//////////////////////AGREGAR PROYECCION////////////////////////////////////////

     LocalDateTime ini1 = LocalDateTime.of(2022, Month.OCTOBER, 30, 07, 00, 00);
     LocalDateTime fin1 = LocalDateTime.of(2022, Month.OCTOBER, 30, 10, 00, 00);
      
     LocalDateTime ini2 = LocalDateTime.of(2022, Month.OCTOBER, 31, 14, 00, 00);
     LocalDateTime fin2 = LocalDateTime.of(2022, Month.OCTOBER, 31, 16, 30, 00);

     LocalDateTime ini3 = LocalDateTime.of(2022, Month.NOVEMBER, 01, 10, 00, 00);
     LocalDateTime fin3 = LocalDateTime.of(2022, Month.NOVEMBER, 01, 12, 00, 00);
      
      
     Proyeccion pro1 = new Proyeccion(s2,p2,Timestamp.valueOf(ini1),Timestamp.valueOf(fin1),true);
     Proyeccion pro2 = new Proyeccion(s1,p1,Timestamp.valueOf(ini2),Timestamp.valueOf(fin2),true);
     Proyeccion pro3 = new Proyeccion(s3,p3,Timestamp.valueOf(ini3),Timestamp.valueOf(fin3),true);

     ProyeccionData proD= new ProyeccionData();


//      proD.agregarProyeccion(pro1);

//------------------------------------------------------------------------------
      
//////////////////////BORRAR PROYECCION/////////////////////////////////////////    
      
//      proD.borrarProyeccion(2);

//------------------------------------------------------------------------------

//////////////////////MODIFICA PROYECCION///////////////////////////////////////

//      proD.modificarProyeccion(pro3);
      
//------------------------------------------------------------------------------

//////////////////////OBTENER PELICULAS PROYECTADAS/////////////////////////////
      
// LocalDateTime horario = LocalDateTime.of(2022, Month.OCTOBER, 30, 6, 30, 00);
//      
//      
//      ArrayList<Pelicula> list = new ArrayList();
//    
//      list = proD.obtenerPeliculasProyectadas(3, Timestamp.valueOf(horario));
//    
//    for(Pelicula ppro:list) {
//        
//        JOptionPane.showMessageDialog(null, ppro);
//    }
//------------------------------------------------------------------------------

//////////////////////OBTENER SALA PROYECCION/////////////////////////////
     
//     ArrayList<Sala> lista = new ArrayList();
//     lista = proD.obtenerSalaProyeccion(3);
//    
//     for (Sala sal: lista) {
//            
//       JOptionPane.showMessageDialog(null, sal);
//            
//     }
//------------------------------------------------------------------------------

/*                      -----------
                       |TICKET DATA|
                        -----------                                           */

////////////////////////AGREGAR TICKET//////////////////////////////////////////

LocalDateTime fcom1 = LocalDateTime.of(2022, Month.OCTOBER, 29, 14, 00, 0);
LocalDateTime fcom2 = LocalDateTime.of(2022, Month.OCTOBER, 30, 10, 00, 0);
LocalDateTime fcom3 = LocalDateTime.of(2022, Month.OCTOBER, 30, 16, 00, 0);

Ticket t1 = new Ticket(c1,pro1,b1,Timestamp.valueOf(fcom1),500,"Debito",true);
Ticket t2 = new Ticket(c2,pro2,b2,Timestamp.valueOf(fcom2),500,"Contado",true);
Ticket t3 = new Ticket(c1,pro3,b3,Timestamp.valueOf(fcom3),500,"Credito",true);

 TicketData td= new TicketData();

      //td.agregarTicket(t1);
     
            
     
//------------------------------------------------------------------------------     

////////////////////////BORRAR TICKET////////////////////////////////////////
    
//           td.borrarTicket(3);

//------------------------------------------------------------------------------
   
////////////////////////Ticket Emitidos Por Fecha///////////////////////////////

    LocalDateTime hora = LocalDateTime.of(2022, Month.OCTOBER, 30, 07, 00,00);
    
     ArrayList<Ticket> lista = new ArrayList();
     
//    lista = td.ticketEmitidosPorFecha(Timestamp.valueOf(hora));
//    
//        for (Ticket t: lista) {
//            
//            JOptionPane.showMessageDialog(null, t);
//            
//        }
//        
//------------------------------------------------------------------------------
   
////////////////////////Ticket Emitidos Por Peliculas///////////////////////////


//    ArrayList<Ticket> listaPeli = new ArrayList();
//     
//    listaPeli = td.ticketEmitidosPorPelicula(p2);
//    
//        for (Ticket t: listaPeli) {
//            
//            JOptionPane.showMessageDialog(null, t);
//            
//        }
//
//------------------------------------------------------------------------------
////////////////////////Ticket Emitidos Por Fecha///////////////////////////


        
// LocalDateTime fecha = LocalDateTime.of(2022, Month.OCTOBER, 30, 07, 00, 00);
//      
//      
//      ArrayList<Cliente> listC = new ArrayList();
//    
//      listC = td.obtenerClientesPorFecha(Timestamp.valueOf(fecha));
//    
//    for(Cliente c:listC) {
//        
//        JOptionPane.showMessageDialog(null, c);
//    }

//------------------------------------------------------------------------------

////////////////////////////////Butacas Ocupadas////////////////////////////////

  LocalDateTime ipro = LocalDateTime.of(2022, Month.OCTOBER, 30, 07, 00, 0);
  LocalDateTime fpro = LocalDateTime.of(2022, Month.OCTOBER, 30, 10, 00,00);
  
  ArrayList<Butaca> list = new ArrayList();
    
//    list = td.butacaOcupada(Timestamp.valueOf(ipro), Timestamp.valueOf(fpro));
    
//    for(Butaca but:list) {
//        
//        JOptionPane.showMessageDialog(null, but);          
//    }
//    
////////////////////////////////Butacas Libres////////////////////////////////
   
//    ArrayList<Butaca> lists = new ArrayList();
//    
//    lists = td.butacasLibres(Timestamp.valueOf(ipro));
//    
//    for(Butaca but:lists) {
//        
//        JOptionPane.showMessageDialog(null, but);          
//    }
//    
//------------------------------------------------------------------------------
}
}
