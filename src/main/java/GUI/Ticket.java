/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Class.Kendaraan;


/**
 *
 * @author romaf
 */
public class Ticket extends javax.swing.JFrame {
    private String nama;
    private String noKtp;
    private String noHp;
    private String asal;
    private String tujuan;
    private String waktu;
    private String harga;
    private Kendaraan jenis;

    /**
     * Creates new form Tiket
     */
    public Ticket() {
    }
    
    public Ticket(Kendaraan jenis,String nama, String noKtp, String noHp, String asal, String tujuan, String waktu, String harga) {
        initComponents();
        this.nama= nama;
        this.noKtp= noKtp;
        this.noHp= noHp;
        this.asal= asal;
        this.tujuan= tujuan;
        this.waktu= waktu;
        this.harga= harga;
        this.jenis = jenis;
        
        Nama.setText(this.nama);
        NoKtp.setText(this.noKtp);
        NoHp.setText(this.noHp);
        Asal.setText(this.asal);
        Tujuan.setText(this.tujuan);
        Waktu.setText(this.waktu);
        Harga.setText(this.harga);
        Jenis.setText(jenis.getNamaKendaraan());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Harga = new javax.swing.JTextField();
        Nama = new javax.swing.JTextField();
        NoKtp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        NoHp = new javax.swing.JTextField();
        Asal = new javax.swing.JTextField();
        Tujuan = new javax.swing.JTextField();
        Waktu = new javax.swing.JTextField();
        Jenis = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Done = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jTextField1.setText("jTextField1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 226, 226));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel1.setText("Tiket ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(180, 10, 80, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Data Pelanggan");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 50, 100, 18);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(20, 200, 310, 10);

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3);
        jSeparator3.setBounds(120, 60, 210, 10);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("No HP    :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 60, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Harga        :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 380, 70, 16);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("No KTP   :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 120, 60, 16);

        Harga.setEditable(false);
        jPanel1.add(Harga);
        Harga.setBounds(120, 372, 180, 30);

        Nama.setEditable(false);
        jPanel1.add(Nama);
        Nama.setBounds(120, 70, 180, 30);

        NoKtp.setEditable(false);
        jPanel1.add(NoKtp);
        NoKtp.setBounds(120, 112, 180, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Nama     :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 80, 60, 16);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText(" Asal            :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 260, 80, 16);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Tujuan        :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 300, 80, 16);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Waktu        :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 340, 80, 16);

        NoHp.setEditable(false);
        jPanel1.add(NoHp);
        NoHp.setBounds(120, 152, 180, 30);

        Asal.setEditable(false);
        jPanel1.add(Asal);
        Asal.setBounds(120, 252, 180, 30);

        Tujuan.setEditable(false);
        jPanel1.add(Tujuan);
        Tujuan.setBounds(120, 292, 180, 30);

        Waktu.setEditable(false);
        jPanel1.add(Waktu);
        Waktu.setBounds(120, 332, 180, 30);

        Jenis.setEditable(false);
        jPanel1.add(Jenis);
        Jenis.setBounds(120, 212, 180, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Transportasi  :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 220, 90, 20);

        Done.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Done.setText("Done");
        Done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneMouseClicked(evt);
            }
        });
        jPanel1.add(Done);
        Done.setBounds(310, 420, 90, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/8.jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(0, 0, 450, 480);
        jPanel1.add(jLabel12);
        jLabel12.setBounds(0, 0, 450, 480);

        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 0, 440, 490);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setText("Harga        :");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(30, 380, 70, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneMouseClicked
        this.dispose();
    }//GEN-LAST:event_DoneMouseClicked

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
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ticket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Ticket().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Asal;
    private javax.swing.JButton Done;
    private javax.swing.JTextField Harga;
    private javax.swing.JTextField Jenis;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField NoHp;
    private javax.swing.JTextField NoKtp;
    private javax.swing.JTextField Tujuan;
    private javax.swing.JTextField Waktu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
