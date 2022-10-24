/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesData;

import ClasesModelo.Conexion;
import java.sql.Connection;

/**
 *
 * @author yamic
 */
public class ButacaData {
    
    private Connection con;

    
    public ButacaData() {
        this.con = Conexion.getConexion();
    }
    
    
    
    
    
    
}
