/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Class.Kendaraan;
import Class.MiniBus;
import Class.Pelanggan;
import javax.swing.JOptionPane;

/**
 * Tampilan Pemesanan Minibus dimana user akan menginput data diri beserta
 * tujuan dan waktu yang diinginkan
 *
 * @author Sofia (2108107010006)
 * @author Ayu Aulia (2108107010038)
 * @author Dhaifina Alifa Putri (2108107010018)
 * @author Putri Ulfayani (2108107010004)
 * @author Siti Nurrahmasita (2108107010015)
 * 
 * @version (27-11-2022)
 * @since (10-11-2022)
 */
public class PesanMiniBus extends javax.swing.JFrame {

    private Kendaraan mb = new MiniBus();

    /**
     * Creates new form PesanMiniBus
     */
    public PesanMiniBus() {
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
        jLabel1 = new javax.swing.JLabel();
        Tujuan = new javax.swing.JComboBox<>();
        Waktu = new javax.swing.JComboBox<>();
        NextButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        NamaField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        HPField = new javax.swing.JTextField();
        KTPField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Pemesanan Mini Bus");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 250, 32);

        Tujuan.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        Tujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tujuan", "Singkil", "Meulaboh", "Takengon", "Lhokseumawe", "Tapaktuan" }));
        jPanel1.add(Tujuan);
        Tujuan.setBounds(30, 210, 110, 26);

        Waktu.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        Waktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Waktu", "08:00", "12:00", "16:00", "20:00", " " }));
        jPanel1.add(Waktu);
        Waktu.setBounds(30, 250, 110, 26);

        NextButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NextButton.setText("Next ");
        NextButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextButtonMouseClicked(evt);
            }
        });
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });
        jPanel1.add(NextButton);
        NextButton.setBounds(270, 310, 80, 31);

        BackButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(50, 310, 72, 30);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Data Pelanggan"));

        jLabel6.setText("Nama :");

        jLabel3.setText("No KTP :");

        jLabel5.setText("No HP :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(NamaField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(KTPField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(HPField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KTPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 40, 270, 150);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-3, 0, 410, 380);

        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 410, 380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method ini berfungsi sebagai tombol back, jika user tidak jadi menginput
     * data dan ingin kembali ke form sebelumnya maka akan diarahkan ke form
     * menu setelah tombol ini di klik
     */
    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        Menu menu = new Menu();
        menu.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    /**
     * Method ini berfungsi sebagai tombol next, jika user telah selesai
     * menginput data maka akan diarahkan ke form Konfirmasi setelah tombol ini
     * di klik
     */
    private void NextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseClicked
        String convert = String.valueOf(mb.getHarga());
        KonfirmasiTiket struk = new KonfirmasiTiket(mb, NamaField.getText(), KTPField.getText(), HPField.getText(), mb.getAsal(), mb.getTujuan(), mb.getWaktu(), convert);
        struk.setVisible(true);
        dispose();
    }//GEN-LAST:event_NextButtonMouseClicked

    /**
     * Method ini berfungsi sebagai algoritma dari form PesanMiniBus yang akan
     * dijalankan saat user mengklik next button
     */
    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // untuk user yang tidak menginput data saat mengisi form PesanMiniBus
        if (NamaField.getText().length() <= 0 || KTPField.getText().length() <= 0 || HPField.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Harap mengisi data Anda dengan benar");
        }

        Pelanggan pl = new Pelanggan();
        String nama, noKtp, noHp;
        if (Tujuan.getSelectedItem().equals("Tujuan")) {
            mb.setHarga(0);
        } else if (Tujuan.getSelectedItem().equals("Singkil")) {
            mb.setHarga(250000);
            mb.setTujuan("Singkil");
        } else if (Tujuan.getSelectedItem().equals("Meulaboh")) {
            mb.setHarga(120000);
            mb.setTujuan("Meulaboh");
        } else if (Tujuan.getSelectedItem().equals("Takengon")) {
            mb.setHarga(170000);
            mb.setTujuan("Takengon");
        } else if (Tujuan.getSelectedItem().equals("Lhokseumawe")) {
            mb.setHarga(180000);
            mb.setTujuan("Lhokseumawe");
        } else if (Tujuan.getSelectedItem().equals("Tapaktuan")) {
            mb.setHarga(150000);
            mb.setTujuan("Tapaktuan");
        }

        if (Waktu.getSelectedItem().equals("Waktu")) {
            mb.setWaktu("");
        } else if (Waktu.getSelectedItem().equals("08:00")) {
            mb.setWaktu("08:00");
        } else if (Waktu.getSelectedItem().equals("12:00")) {
            mb.setWaktu("12:00");
        } else if (Waktu.getSelectedItem().equals("16:00")) {
            mb.setWaktu("16:00");
        } else if (Waktu.getSelectedItem().equals("20:00")) {
            mb.setWaktu("20:00");
        }

        nama = String.valueOf(NamaField.getText());
        pl.setNama(nama);

        noKtp = String.valueOf(KTPField.getText());
        pl.setKtp(noKtp);

        noHp = String.valueOf(HPField.getText());
        pl.setNoHP(noHp);
    }//GEN-LAST:event_NextButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PesanMiniBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesanMiniBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesanMiniBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesanMiniBus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PesanMiniBus().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JTextField HPField;
    private javax.swing.JTextField KTPField;
    private javax.swing.JTextField NamaField;
    private javax.swing.JButton NextButton;
    private javax.swing.JComboBox<String> Tujuan;
    private javax.swing.JComboBox<String> Waktu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
