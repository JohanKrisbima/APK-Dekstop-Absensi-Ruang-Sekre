/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javafx.scene.control.RadioButton;
import koneksi.cls_kehadiran;
import javax.swing.JOptionPane;
import koneksi.conek;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author toshiba
 */
public class kehadiran extends javax.swing.JInternalFrame {

    /**
     * Creates new form presensi
     */
    public kehadiran() {
        initComponents();
        ViewData();
       
    }
    

 
 
public void ViewData(){
    cls_kehadiran presensi = new cls_kehadiran();
    try{
        jTable1.setModel(DbUtils.resultSetToTableModel(presensi.UpdateJTable()));
        
    }catch (Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnpresent = new javax.swing.JRadioButton();
        btnlate = new javax.swing.JRadioButton();
        btnexcused = new javax.swing.JRadioButton();
        btnabsent = new javax.swing.JRadioButton();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txttanggal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnpresent.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(btnpresent);
        btnpresent.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btnpresent.setForeground(new java.awt.Color(0, 51, 255));
        btnpresent.setText("Present");
        btnpresent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpresentActionPerformed(evt);
            }
        });
        getContentPane().add(btnpresent, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, -1));

        buttonGroup1.add(btnlate);
        btnlate.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btnlate.setForeground(new java.awt.Color(0, 51, 255));
        btnlate.setText("Late");
        btnlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlateActionPerformed(evt);
            }
        });
        getContentPane().add(btnlate, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        buttonGroup1.add(btnexcused);
        btnexcused.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btnexcused.setForeground(new java.awt.Color(0, 51, 255));
        btnexcused.setText("Excused");
        btnexcused.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexcusedActionPerformed(evt);
            }
        });
        getContentPane().add(btnexcused, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 70, -1));

        buttonGroup1.add(btnabsent);
        btnabsent.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        btnabsent.setForeground(new java.awt.Color(0, 51, 255));
        btnabsent.setText("Absent");
        btnabsent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabsentActionPerformed(evt);
            }
        });
        getContentPane().add(btnabsent, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 60, -1));

        submit.setBackground(new java.awt.Color(0, 0, 255));
        submit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 102, 255));
        jLabel4.setText("NIM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 30, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Nama");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 40, 20));

        txtnim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnimActionPerformed(evt);
            }
        });
        getContentPane().add(txtnim, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 140, -1));

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 140, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Tanggal", "Presensi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 374, 94));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Tanggal");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 50, 20));

        txttanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttanggalActionPerformed(evt);
            }
        });
        getContentPane().add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 140, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IMG_20211126_124434_755.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -26, 550, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnexcusedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexcusedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnexcusedActionPerformed

    private void btnlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlateActionPerformed

    private void txtnimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnimActionPerformed

    private void btnabsentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabsentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnabsentActionPerformed

    private void btnpresentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpresentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnpresentActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        cls_kehadiran idm = new cls_kehadiran();
        idm.nim= txtnim.getText();
        idm.nama= txtnama.getText();
        idm.tanggal= txttanggal.getText();
        if(btnpresent.isSelected()==true){
            idm.presensi= "present";
        }
        else if(btnabsent.isSelected()==true){
            idm.presensi= "absent";
        }
        else if(btnexcused.isSelected()==true){
            idm.presensi= "excused";
        }
        else if(btnlate.isSelected()==true){
            idm.presensi= "late";
        }
        
        try{
        idm.submit();
        JOptionPane.showMessageDialog(null, "Berhasil Tersubmit");}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
         ViewData();
    
    }//GEN-LAST:event_submitActionPerformed

    private void txttanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttanggalActionPerformed

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnabsent;
    private javax.swing.JRadioButton btnexcused;
    private javax.swing.JRadioButton btnlate;
    private javax.swing.JRadioButton btnpresent;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton submit;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txttanggal;
    // End of variables declaration//GEN-END:variables
}
