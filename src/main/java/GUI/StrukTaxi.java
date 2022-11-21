/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author romaf
 */
public class StrukTaxi extends javax.swing.JFrame {

    /**
     * Creates new form DataHargaTaxi
     */
    public StrukTaxi() {
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

        jPanel1 = new javax.swing.JPanel();
        ConfirmButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        HargaField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TujuanField = new javax.swing.JTextField();
        AsalField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

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
        jPanel1.add(TujuanField);
        TujuanField.setBounds(140, 110, 150, 22);

        AsalField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsalFieldActionPerformed(evt);
            }
        });
        jPanel1.add(AsalField);
        AsalField.setBounds(140, 70, 150, 22);

        jLabel4.setText("Asal            :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 70, 70, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Struk Taxi");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(150, 30, 80, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AsalFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsalFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AsalFieldActionPerformed

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
    PesanTaxi taxi = new PesanTaxi();
    taxi.setVisible(true);
    dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void ConfirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmButtonMouseClicked
    Tiket tiket = new Tiket();
    tiket.setVisible(true);
    dispose();
    }//GEN-LAST:event_ConfirmButtonMouseClicked

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
            java.util.logging.Logger.getLogger(StrukTaxi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StrukTaxi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StrukTaxi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StrukTaxi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StrukTaxi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AsalField;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField HargaField;
    private javax.swing.JTextField TujuanField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}