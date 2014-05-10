/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIFIX;

import GUIFIX.Model.Busways;
import GUIFIX.Model.Penumpang;
import GUIFIX.Model.Transaksi;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Ranita
 */
public class Goto extends javax.swing.JFrame {
    ArrayList<String> listBusway = new ArrayList<>();
    
    Penumpang session = null;
    public Connection conn ;
    public Statement stt ;
    /**
     * Creates new form Goto
     */
   
    
    public Goto(Penumpang p) {
        initComponents();
        this.session = p;
        init();
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/busway","root","");
            stt = conn.createStatement();
  //          JOptionPane.showMessageDialog(null, "Berhasil koneksi");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak berhasil koneksi");
        }
         list();
    }
    public void init(){
        lblsaldo.setText(session.getSaldo());
        lblidpen.setText(session.getIdPenumpang());
    }
    public void list(){
     int i=0;
            try{
               String sql = "select * from busway " ;
               ResultSet rs = stt.executeQuery(sql);
                while(rs.next()){
                    jTable1.setValueAt(rs.getString("platNomer"),i,0);
                    jTable1.setValueAt(rs.getString("rute"),i,1);
                    i++;
                    listBusway.add(rs.getString("platNomer"));
                }
                rs.close();
            }catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null,"Error : "+e.getMessage());
            }
    }
    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblrute = new javax.swing.JLabel();
        lblrate = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfidbus = new javax.swing.JTextField();
        tftgl = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tfidtran = new javax.swing.JTextField();
        jToggleButton3 = new javax.swing.JToggleButton();
        lblidpen = new javax.swing.JLabel();
        lblrate1 = new javax.swing.JLabel();
        lblsaldo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Busway Scan Card");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID Busway", "Route"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable1KeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel5.setText("Go To ...");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ID Busway    :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Route          :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Rate            :");
        jLabel10.setToolTipText("");

        jToggleButton1.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jToggleButton1.setText("Go To !");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Copyright @2014");

        jLabel9.setText("Praktikum Rekayasa Perangkat Lunak");

        lblrute.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblrute.setText("Route");
        lblrute.setToolTipText("");

        lblrate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblrate.setText("Rate");
        lblrate.setToolTipText("");

        jToggleButton2.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jToggleButton2.setText("Cetak Struk");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Tanggal            :");
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("ID Penumpang            :");
        jLabel12.setToolTipText("");

        tfidbus.setText("Masukkan id busway");
        tfidbus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidbusActionPerformed(evt);
            }
        });

        tftgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tftglActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("ID Transaksi :");

        tfidtran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfidtranActionPerformed(evt);
            }
        });

        jToggleButton3.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        jToggleButton3.setText("Transaksi");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });

        lblidpen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblidpen.setText("Saldo");
        lblidpen.setToolTipText("");

        lblrate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblrate1.setText("Saldo :");
        lblrate1.setToolTipText("");

        lblsaldo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblsaldo.setText("Saldo");
        lblsaldo.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblrate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(181, 181, 181))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblrute, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tftgl, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lblidpen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(lblrate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblsaldo, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfidtran, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(tfidbus, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addGap(104, 104, 104))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jToggleButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(tfidtran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(lblrute))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(lblrate))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblsaldo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jToggleButton1)
                                        .addComponent(lblrate1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(lblidpen))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(tftgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton3)
                                .addGap(11, 11, 11)
                                .addComponent(jToggleButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(tfidbus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {                                   
        
    }                                  

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        int i=0;
            try{
                Busways b = new Busways();
               String sql = "select * from busway where platNomer ='"+tfidbus.getText()+"'" ;
               ResultSet rs = stt.executeQuery(sql);
                while(rs.next()){
                    lblrute.setText(rs.getString("rute"));
                    lblrate.setText(rs.getString("tarif"));
                    i++;
                }  
                rs.close();
            }catch(Exception e){
                javax.swing.JOptionPane.showMessageDialog(null,"Error : "+e.getMessage());
            } 
    }                                              

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
         this.dispose();
         new Cetak(session, lblrate.getText(), lblrute.getText(), tfidbus.getText()).setVisible(true);
    }                                              

    private void tfidbusActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void tftglActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void tfidtranActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        try {
            Busways b = new Busways();
            int saldo = Integer.parseInt(lblsaldo.getText());
            int rate = Integer.parseInt(lblrate.getText());
            int hasil = saldo - rate;
            session.setSaldo(""+hasil);
            session.updatePenumpang();
            Transaksi t = new Transaksi();
            t.setIdBusway(tfidbus.getText());
            t.setIdTransaksi(tfidtran.getText());
            t.setIdPenumpang(session.getIdPenumpang());
            t.setTanggal(tftgl.getText());
            t.SimpanTransaksi();
            JOptionPane.showMessageDialog(this, "Transaksi Busway Berhasil, Cihuyy!!");
//             String sqlbusway = "select * from busway " ;
//             ResultSet rs = stt.executeQuery(sqlbusway);
//             
//             String sqlpenumpang = "select * from penumpang " ;
//             ResultSet rspen = stt.executeQuery(sqlpenumpang);
//             
//             Transaksi t = new Transaksi();
//             Penumpang p = new Penumpang();
//             Busways b = new Busways();
//               t.setIdTransaksi(tfidtran.getText());
//               t.setIdBusway(tfidbus.getText());
//              // t.setIdPenumpang(tfidpen.getText());
//               t.setTanggal(tftgl.getText());
//               t.SimpanTransaksi();
//               javax.swing.JOptionPane.showMessageDialog(null, "Transaksi Berhasil !! Cihuy");
//               tfidbus.setText("Masukkan id busway");
//           //    tfidpen.setText("");
//               tfidtran.setText("");
//               tftgl.setText("");
        } catch (Exception e) {
        }
      
        
    }                                              

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        if(jTable1.getSelectedRow()> -1)
        {
            tfidbus.setText(listBusway.get(jTable1.getSelectedRow()));
        }
    }                                    

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
            java.util.logging.Logger.getLogger(Goto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Goto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Goto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Goto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Goto(null).setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JLabel lblidpen;
    private javax.swing.JLabel lblrate;
    private javax.swing.JLabel lblrate1;
    private javax.swing.JLabel lblrute;
    private javax.swing.JLabel lblsaldo;
    private javax.swing.JTextField tfidbus;
    private javax.swing.JTextField tfidtran;
    private javax.swing.JTextField tftgl;
    // End of variables declaration                   
}
