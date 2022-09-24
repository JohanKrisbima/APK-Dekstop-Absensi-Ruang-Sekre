/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toshiba
 */
public class cls_kehadiran {
    Connection conn = null;
    ResultSet rs = null ;
    PreparedStatement pst = null;
   
    private String sql;
    public String nim;
    public String nama;
    public String tanggal;
    public String presensi;
    
    
     public void submit()throws SQLException{
        conn = conek.GetConnection();
        sql = "INSERT INTO `presensi` (`nim`, `nama`, `tanggal`, `presensi`) VALUES(?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nim);
        pst.setString(2, nama);
        pst.setString(3, tanggal);
        pst.setString(4, presensi);
        pst.execute();
        pst.close();
 
    }
     
     
   public ResultSet UpdateJTable()throws SQLException{
       conn = conek.GetConnection();
       sql = "select * from presensi";
       pst = conn.prepareStatement(sql);
       rs = pst.executeQuery();
       return rs;
   }
}


