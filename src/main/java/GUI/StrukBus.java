/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Class.Struk;
import Class.Tiket;
import Class.Kendaraan;
import Class.Bus;
import Class.Pelanggan;

/**
 *
 * @author romaf
 */
public class StrukBus extends javax.swing.JFrame {

    /**
     * Creates new form DataHargaBus
     */
    public StrukBus() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        ConfirmButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        HargaField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TujuanField = new javax.swing.JTextField();
        AsalField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        WaktuField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.setText("Mini Bus");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("Taxi");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("Bus");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 221, 255));
        jPanel1.setLayout(null);

        ConfirmButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ConfirmButton.setText("Confirm");
        ConfirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmButtonMouseClicked(evt);
            }
        });
        jPanel1.add(ConfirmButton);
        ConfirmButton.setBounds(260, 240, 70, 20);

        BackButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(60, 240, 80, 20);
        jPanel1.add(HargaField);
        HargaField.setBounds(140, 150, 150, 22);

        jLabel3.setText("Harga         :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 150, 70, 20);

        jLabel2.setText("Tujuan        :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 110, 70, 20);

        TujuanField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TujuanFieldKeyReleased(evt);
            }
        });
        jPanel1.add(TujuanField);
        TujuanField.setBounds(140, 110, 150, 22);

        AsalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsalFieldActionPerformed(evt);
            }
        });
        AsalField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AsalFieldKeyReleased(evt);
            }
        });
        jPanel1.add(AsalField);
        AsalField.setBounds(140, 70, 150, 22);

        jLabel4.setText("Asal            :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 70, 70, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Struk Bus");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(130, 30, 70, 17);

        WaktuField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WaktuFieldActionPerformed(evt);
            }
        });
        jPanel1.add(WaktuField);
        WaktuField.setBounds(140, 190, 150, 22);

        jLabel5.setText("Waktu        :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 190, 70, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AsalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsalFieldActionPerformed

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
    PesanBus bus = new PesanBus();
    bus.setVisible(true);
    dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void ConfirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmButtonMouseClicked
    Ticket tiket = new Ticket();
    tiket.setVisible(true);
    dispose();
    }//GEN-LAST:event_ConfirmButtonMouseClicked

    private void WaktuFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WaktuFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WaktuFieldActionPerformed

    private void AsalFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AsalFieldKeyReleased
        // Tiket tkt = new Tiket();
        // AsalField.setText("" + tkt.getAsal());
        
        Kendaraan bus = new Bus();
        AsalField.setText("" +bus.getAsal());
    }//GEN-LAST:event_AsalFieldKeyReleased

    private void TujuanFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TujuanFieldKeyReleased
        // Tiket tkt = new Tiket();
        // TujuanField.setText("" + tkt.getTujuan());
        
        Kendaraan bus = new Bus();
        TujuanField.setText("" +bus.getTujuan());
    }//GEN-LAST:event_TujuanFieldKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StrukBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StrukBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StrukBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StrukBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StrukBus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AsalField;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField HargaField;
    private javax.swing.JTextField TujuanField;
    private javax.swing.JTextField WaktuField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
