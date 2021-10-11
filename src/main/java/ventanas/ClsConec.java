/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class ClsConec {
     Connection conectar=null;
    
    public Connection conexion(){
    
        try{
        Class.forName("com.mysql.jdbc.Driver");
        conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/test","root","Holamundo1");
      
        
        }
        catch(Exception e){
          
            JOptionPane.showMessageDialog(null,"Error en el acceso");
        }
    
    
    return conectar;
    
    }
}
