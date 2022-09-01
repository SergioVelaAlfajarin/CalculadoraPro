package pro.calc.gestor;

import java.sql.Connection;
import java.sql.DriverManager;


public class GestorXAMP {
    
    Connection conectar = null;
    
    public Connection conexion (){
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3306/calculadorapro","root","");
            System.out.println("Conexion aceptada.");
        } catch (Exception e) {
            System.out.println("No se ha podido conectar");
        }
       return conectar; 
    }
    
}
