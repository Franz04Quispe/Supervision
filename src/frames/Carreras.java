
package frames;

import java.beans.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sql.conexionSQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Franz Joel Quispe Mamani, Rodrigo Escobar Condori
 */
public class Carreras {
    String sigla_Carrera;
    String nombre;
    int piso;

    public String getSigla_Carrera() {
        return sigla_Carrera;
    }

    public void setSigla_Carrera(String sigla_Carrera) {
        this.sigla_Carrera = sigla_Carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    public void MostrarCarreras(JTable paramTablaTotalCarreras){
        conexionSQL objetoConexion = new conexionSQL();
                
        DefaultTableModel modelo = new DefaultTableModel();
        String sql="";
        modelo.addColumn("Sigla");
        modelo.addColumn("Nombre");
        modelo.addColumn("Piso");
        
        paramTablaTotalCarreras.setModel(modelo);
        
        sql="select * from Carrera;";
        
        String[] datos = new String[3];
        Statement pt;
        
        try{
            pt=(Statement) objetoConexion.establecerConexion().createStatement();
            //PROBLEMAS
            //ResultSet rt=pt.executeQuery(sql);
            
            
        }catch (Exception e){
            
        }
    }

    private static class ResultSet {

        public ResultSet() {
        }
    }
}
