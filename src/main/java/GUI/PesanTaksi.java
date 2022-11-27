/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Class.Kendaraan;
import Class.Pelanggan;
import Class.Taksi;
import javax.swing.JOptionPane;

/**
 * Tampilan Pemesanan Taksi dimana user akan menginput data diri
 * beserta asal, tujuan dan waktu yang diinginkan 
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
public class PesanTaksi extends javax.swing.JFrame {
    
    private Kendaraan taksi = new Taksi();
    /**
     * Creates new form PesanTaksi
     */
    public PesanTaksi() {
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

        jLabel2 = new javax.swing.JLabel();
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
        Asal = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel2.setText("Keterangan : ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText(" Pemesanan Taxi ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 200, 32);

        Tujuan.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        Tujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tujuan", "Darussalam", "Batoh", "Peunayong", "Ulee Lheue" }));
        jPanel1.add(Tujuan);
        Tujuan.setBounds(30, 260, 110, 26);

        Waktu.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        Waktu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Waktu", "08:00", "12:00", "16:00", "20:00", " " }));
        jPanel1.add(Waktu);
        Waktu.setBounds(30, 300, 110, 26);

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
        NextButton.setBounds(260, 350, 80, 31);

        BackButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BackButton.setText("Back");
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        jPanel1.add(BackButton);
        BackButton.setBounds(50, 350, 72, 31);

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
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KTPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HPField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(40, 40, 270, 150);

        Asal.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        Asal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Asal", "Darussalam", "Batoh", "Peunayong", "Ulee Lheue" }));
        jPanel1.add(Asal);
        Asal.setBounds(30, 220, 110, 26);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/4.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 410, 410);

        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 0, 410, 410);

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel8.setText("Pemesanan Bus  ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 0, 190, 32);

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 24)); // NOI18N
        jLabel9.setText("Pemesanan Bus  ");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 0, 190, 32);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Method ini berfungsi sebagai tombol back,
     * jika user tidak jadi menginput data dan
     * ingin kembali ke form sebelumnya maka akan 
     * diarahkan ke form menu setelah tombol ini di klik
     */
    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
    Menu menu = new Menu();
    menu.setVisible(true);
    dispose();
    }//GEN-LAST:event_BackButtonMouseClicked
    
    /**
     * Method ini berfungsi sebagai tombol next,
     * jika user telah selesai menginput data maka akan 
     * diarahkan ke form Konfirmasi setelah tombol ini di klik
     */
    private void NextButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextButtonMouseClicked
    String convert = String.valueOf(taksi.getHarga());
    KonfirmasiTiket struk = new KonfirmasiTiket(taksi,NamaField.getText(), KTPField.getText(), HPField.getText(), taksi.getAsal(), taksi.getTujuan(), taksi.getWaktu(), convert);
    struk.setVisible(true);
    dispose();
    }//GEN-LAST:event_NextButtonMouseClicked
    
    /**
     * Method ini berfungsi sebagai algoritma dari form PesanTaksi
     * yang akan dijalankan saat user mengklik next button
     */
    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed
        // untuk user yang tidak menginput data saat mengisi form PesanBus
        if(NamaField.getText().length()<=0 || KTPField.getText().length()<=0 || HPField.getText().length()<=0){
            JOptionPane.showMessageDialog(null, "Harap mengisi data Anda dengan benar");
        }
        
        Pelanggan pl = new Pelanggan();
        String nama, noKtp, noHp;
        if(Asal.getSelectedItem().equals("Asal") && Tujuan.getSelectedItem().equals("Tujuan")){
            taksi.setHarga(0);
        } else if(Asal.getSelectedItem().equals("Darussalam") && Tujuan.getSelectedItem().equals("Darussalam")){
            taksi.setHarga(10000);
            taksi.setAsal("Darussalam");
            taksi.setTujuan("Darussalam");
        } else if(Asal.getSelectedItem().equals("Darussalam") && Tujuan.getSelectedItem().equals("Batoh")){
            taksi.setHarga(40000);
            taksi.setAsal("Darussalam");
            taksi.setTujuan("Batoh");
        } else if(Asal.getSelectedItem().equals("Darussalam") && Tujuan.getSelectedItem().equals("Peunayong")){
            taksi.setHarga(30000);
            taksi.setAsal("Darussalam");
            taksi.setTujuan("Peunayong");
        } else if(Asal.getSelectedItem().equals("Darussalam") && Tujuan.getSelectedItem().equals("Ulee Lheue")){
            taksi.setHarga(35000);
            taksi.setAsal("Darussalam");
            taksi.setTujuan("Ulee Lheue");
        } else if(Asal.getSelectedItem().equals("Batoh") && Tujuan.getSelectedItem().equals("Darussalam")){
            taksi.setHarga(40000);
            taksi.setAsal("Batoh");
            taksi.setTujuan("Darussalam");
        } else if(Asal.getSelectedItem().equals("Batoh") && Tujuan.getSelectedItem().equals("Batoh")){
            taksi.setHarga(10000);
            taksi.setAsal("Batoh");
            taksi.setTujuan("Batoh");
        } else if(Asal.getSelectedItem().equals("Batoh") && Tujuan.getSelectedItem().equals("Peunayong")){
            taksi.setHarga(20000);
            taksi.setAsal("Batoh");
            taksi.setTujuan("Peunayong");
        } else if(Asal.getSelectedItem().equals("Batoh") && Tujuan.getSelectedItem().equals("Ulee Lheue")){
            taksi.setHarga(20000);
            taksi.setAsal("Batoh");
            taksi.setTujuan("Ulee Lheue");
        } else if(Asal.getSelectedItem().equals("Peunayong") && Tujuan.getSelectedItem().equals("Darussalam")){
            taksi.setHarga(30000);
            taksi.setAsal("Peunayong");
            taksi.setTujuan("Darussalam");
        } else if(Asal.getSelectedItem().equals("Peunayong") && Tujuan.getSelectedItem().equals("Batoh")){
            taksi.setHarga(20000);
            taksi.setAsal("Peunayong");
            taksi.setTujuan("Batoh");
        } else if(Asal.getSelectedItem().equals("Peunayong") && Tujuan.getSelectedItem().equals("Peunayong")){
            taksi.setHarga(10000);
            taksi.setAsal("Peunayong");
            taksi.setTujuan("Peunayong");
        } else if(Asal.getSelectedItem().equals("Peunayong") && Tujuan.getSelectedItem().equals("Ulee Lheue")){
            taksi.setHarga(15000);
            taksi.setAsal("Peunayong");
            taksi.setTujuan("Ulee Lheue");
        } else if(Asal.getSelectedItem().equals("Ulee Lheue") && Tujuan.getSelectedItem().equals("Darussalam")){
            taksi.setHarga(35000);
            taksi.setAsal("Ulee Lheue");
            taksi.setTujuan("Darussalam");
        } else if(Asal.getSelectedItem().equals("Ulee Lheue") && Tujuan.getSelectedItem().equals("Batoh")){
            taksi.setHarga(20000);
            taksi.setAsal("Ulee Lheue");
            taksi.setTujuan("Batoh");
        } else if(Asal.getSelectedItem().equals("Ulee Lheue") && Tujuan.getSelectedItem().equals("Peunayong")){
            taksi.setHarga(15000);
            taksi.setAsal("Ulee Lheue");
            taksi.setTujuan("Peunayong");
        } else if(Asal.getSelectedItem().equals("Ulee Lheue") && Tujuan.getSelectedItem().equals("Ulee Lheue")){
            taksi.setHarga(10000);
            taksi.setAsal("Ulee Lheue");
            taksi.setTujuan("Ulee Lheue");
        }
        
        if(Waktu.getSelectedItem().equals("Waktu")){
            taksi.setWaktu("");
        } else if(Waktu.getSelectedItem().equals("08:00")){
            taksi.setWaktu("08:00");
        } else if(Waktu.getSelectedItem().equals("12:00")){
            taksi.setWaktu("12:00");
        } else if(Waktu.getSelectedItem().equals("16:00")){
            taksi.setWaktu("16:00");
        } else if(Waktu.getSelectedItem().equals("20:00")){
            taksi.setWaktu("20:00");
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
            java.util.logging.Logger.getLogger(PesanTaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PesanTaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PesanTaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PesanTaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PesanTaksi().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Asal;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
