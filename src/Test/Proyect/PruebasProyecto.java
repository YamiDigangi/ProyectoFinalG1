/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test.Proyect;

import ClasesData.*;
import ClasesModelo.*;


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
        Cliente cli = new Cliente(4,33029917,"Santigo","Farioli",true);
        ClienteData c = new ClienteData();
        
//        c.agregarCliente(cli);
//        c.borrarCliente(1);
//        c.modificarCliente(cli);
//-------------------------------------------------------------------------------

      //////////////////Pelicula//////////////////
      
      //
        
    Pelicula peli = new Pelicula("Volver al Futuro VI", true);
    
    PeliculaData peliD = new PeliculaData();
    
    peliD.agregarPelicula(peli);
    
    
    }
    
}
