package mx.uv.basededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static String url="jdb:mysql://17.0.0.1:3306/ejemplo_siemple";
    private static String driverName = "com:mysql.jdbc.Driver";
   
    private static String username="root";
    private static String password ="";
    private static Connection conexion=null;
    public static Connection getConexion(){
        try{
            Class.forName(driverName)
            conexion =DriverManager.getConnection(url,username,password);
            System.out.println("Succes Connection");
        }catch(SQLException e){
            System.out.println("Fallo en la conexion ");
        }catch(ClassNotFoundException e1){
            System.out.println("Driver no funciona");
        }
        return conexion;
    }

}
