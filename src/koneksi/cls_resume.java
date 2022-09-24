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
/**
 *
 * @author toshiba
 */
public class cls_resume {
    Connection conn = null;
    ResultSet rs = null ;
    PreparedStatement pst = null;
    
    private String sql;
    public String nama;
    public String hari;
    public String tanggal;
    public String aktivitas;
    
    
    public void simpan()throws SQLException{
        conn = conek.GetConnection();
        sql = "INSERT INTO `resume` (`nama`, `hari`, `tanggal`, `aktivitas`) VALUES(?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nama);
        pst.setString(2, hari);
        pst.setString(3, tanggal);
        pst.setString(4, aktivitas);
        pst.execute();
        pst.close();
    }
   public ResultSet UpdateJTable()throws SQLException{
       conn = conek.GetConnection();
       sql = "select * from resume";
       pst = conn.prepareStatement(sql);
       rs = pst.executeQuery();
       return rs;
   }
}
