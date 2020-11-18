package mx.uv.basededatos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;





public class DAO {
    private static Conexion conexion=new Conexion();
    public static List <Usuarios> dameUsuarios(){
        Statement stm=null;
        Connection con = null;
        ResultSet rs=null;
        List<Usuarios> resultado =new ArrayList<>();
        con = conexion.getConexion();
        try{
            String sql ="Select * from usuarios ";
            stm=con.createStatement();
            rs=stm.executeQuery(sql);
            while(rs.next()){
                Usuarios u=new Usuarios(rs.getString("id"), rs.getString("email"), rs.getString("password"))
                resultado.add(u);
            }
        }catch(Exception e){
            e.printStackTrace();;

        }finally{
            if(rs !=null){
                try {
                    rs.close();

                }catch(Exception e){
                    e.printStackTrace();
                }
                rs=null;
            }
            if(stm !=null){
                try{
                    stm.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
            try{
                con.close();
                System.out.println("Conexion cerrada ");
            }catch(Exception e){
                e.printStackTrace();
            }
            

            }
            return resultado;
        }

        

    }
    
}
