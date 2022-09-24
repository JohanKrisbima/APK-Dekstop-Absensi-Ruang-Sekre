/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 * 
 * @author toshiba
 */
public class conek {
    private static Connection koneksi;
    
    public static Connection GetConnection()throws SQLException{
        if(koneksi==null){
          try{
          String url;          
          url="jdbc:mysql://localhost:3306/dbprojek";
          String nim = "root";
          String nama = "";
          DriverManager.registerDriver(new com.mysql.jdbc.Driver());
          koneksi =DriverManager.getConnection(url, nim, nama);
          }
          catch(SQLException e){
              JOptionPane.showMessageDialog(null, "eror koneksi");
          }
        }    
        return koneksi;
    }
        static Object getConnection(){
            throw new UnsupportedOperationException("not yet implementasi");
        } 

    public Object buatkoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} 
    