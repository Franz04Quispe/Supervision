package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Franz Joel Quispe Mamani, Rodrigo Escobar Condori
 */
public class conexionSQL {
    
    public static Connection establecerConexion(){
        String url="jdbc:postgresql://localhost:5432/Supervision";
        
        Connection con;
        try {
            //                                      usuario, la constraseña de pgadmin4           
            con = DriverManager.getConnection(url,"postgres","TonySt4rk4");
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }   
    }
}
