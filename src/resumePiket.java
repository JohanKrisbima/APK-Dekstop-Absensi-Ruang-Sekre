
import koneksi.cls_resume;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toshiba
 */
public class resumePiket extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form resume
     */
    public resumePiket() {
        initComponents();
        
    }
    
public void ViewData(){
    cls_resume resume = new cls_resume();
    try{
        jTable1.setModel(DbUtils.resultSetToTableModel(resume.UpdateJTable()));
        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnama = new javax.swing.JTextField();
        txthari = new javax.swing.JTextField();
        txttanggal = new javax.swing.JTextField();
        simpan = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtaktivitas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nama", "Hari", "Tanggal", "Aktivitas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 534, 91));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Hari");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 30, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Nama");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 40, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Aktivitas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 70, 20));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 180, -1));
        getContentPane().add(txthari, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 180, -1));
        getContentPane().add(txttanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 180, -1));

        simpan.setBackground(new java.awt.Color(0, 51, 255));
        simpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        simpan.setForeground(new java.awt.Color(255, 255, 255));
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));
        getContentPane().add(txtaktivitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 180, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Tanggal");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 50, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/IMG_20211126_195807_208.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, -26, 550, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        cls_resume idm = new cls_resume();
        idm.nama= txtnama.getText();
        idm.hari= txthari.getText();
        idm.tanggal= txttanggal.getText();
        idm.aktivitas= txtaktivitas.getText();
        try{
        idm.simpan();
        JOptionPane.showMessageDialog(null, "Berhasil Tersimpan");}
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        ViewData();
        
    }//GEN-LAST:event_simpanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField txtaktivitas;
    private javax.swing.JTextField txthari;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txttanggal;
    // End of variables declaration//GEN-END:variables
}
