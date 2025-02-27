/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasi;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import static aplikasi.Config.writeLog;
import javax.swing.JOptionPane;

/**
 *
 * @author Gusti Rizqi Karima
 */
public class Fpeminjaman extends javax.swing.JFrame {
    private void load_table(){
        //membuat tampilan model tabel
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID");
        model.addColumn("NIM");
        model.addColumn("Kode Buku");
        model.addColumn("Judul Buku");
        model.addColumn("Jumlah Buku");
        model.addColumn("Tanggal Pinjam");
        model.addColumn("Tanggal Balik");
    
    try {
        int no=1;
        String sql = "select * from peminjaman";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow(new Object[] {no++,res.getString(1),res.getString(2),
                                        res.getString(3),res.getString(4),res.getString(5),res.getString(6),
                                        res.getString(7)});
        }
        tblPeminjaman.setModel(model);
        writeLog("Tampilkan data ke Frame "+getClass().getSimpleName());
    } catch (Exception e) {
        writeLog("Data tidak dapat ditampilkan : " + e.getMessage());
    }
}
    
    private void bersihkan(){
        txtID.setText(null);
        txtNIM.setText(null);
        txtKodeBuku.setText(null);
        txtJudulBuku.setText(null);  
        txtJumlahBuku.setText(null);
        txtTanggalPinjam.setText(null);
        txtTanggalBalik.setText(null);
    }
    
    /**
     * Creates new form Fpeminjaman
     */
    public Fpeminjaman() {
        initComponents();
        load_table();    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPeminjaman = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNIM = new javax.swing.JTextField();
        txtKodeBuku = new javax.swing.JTextField();
        txtJudulBuku = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtJumlahBuku = new javax.swing.JTextField();
        txtTanggalPinjam = new javax.swing.JTextField();
        txtTanggalBalik = new javax.swing.JTextField();
        btTambah = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btBersihkan = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(610, 471));

        tblPeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPeminjaman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPeminjamanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPeminjaman);

        jPanel1.setBackground(new java.awt.Color(130, 161, 207));
        jPanel1.setPreferredSize(new java.awt.Dimension(658, 65));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Peminjaman");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("NIM :");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel4.setText("Kode Buku :");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("Judul Buku :");

        txtNIM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNIMActionPerformed(evt);
            }
        });

        txtKodeBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeBukuActionPerformed(evt);
            }
        });

        txtJudulBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJudulBukuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setText("Jumlah Buku :");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel7.setText("Tanggal Pinjam :");

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel8.setText("Tanggal Balik :");

        txtTanggalPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTanggalPinjamActionPerformed(evt);
            }
        });

        btTambah.setBackground(new java.awt.Color(153, 204, 255));
        btTambah.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btTambah.setForeground(new java.awt.Color(255, 255, 255));
        btTambah.setText("Tambah");
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });

        btEdit.setBackground(new java.awt.Color(153, 204, 255));
        btEdit.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btEdit.setForeground(new java.awt.Color(255, 255, 255));
        btEdit.setText("Edit");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btBersihkan.setBackground(new java.awt.Color(153, 204, 255));
        btBersihkan.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btBersihkan.setForeground(new java.awt.Color(255, 255, 255));
        btBersihkan.setText("Bersihkan");
        btBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBersihkanActionPerformed(evt);
            }
        });

        btHapus.setBackground(new java.awt.Color(153, 204, 255));
        btHapus.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btHapus.setForeground(new java.awt.Color(255, 255, 255));
        btHapus.setText("Hapus");
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(130, 161, 207));

        btBack.setBackground(new java.awt.Color(153, 204, 255));
        btBack.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btBack.setForeground(new java.awt.Color(255, 255, 255));
        btBack.setText("Kembali");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btBack)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btTambah)
                .addGap(18, 18, 18)
                .addComponent(btEdit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btHapus)
                .addGap(18, 18, 18)
                .addComponent(btBersihkan)
                .addGap(98, 98, 98))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtJumlahBuku)
                                    .addComponent(txtTanggalPinjam)
                                    .addComponent(txtTanggalBalik, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                            .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(txtJumlahBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtNIM)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTanggalPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTanggalBalik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTambah)
                    .addComponent(btEdit)
                    .addComponent(btHapus)
                    .addComponent(btBersihkan))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 510));

        setSize(new java.awt.Dimension(616, 513));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNIMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNIMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNIMActionPerformed

    private void txtKodeBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeBukuActionPerformed

    private void txtTanggalPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTanggalPinjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTanggalPinjamActionPerformed

    private void txtJudulBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJudulBukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJudulBukuActionPerformed

    private void btBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBersihkanActionPerformed
        // TODO add your handling code here:
        bersihkan();
    }//GEN-LAST:event_btBersihkanActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        Fbuku buku = new Fbuku();
        buku.setVisible(true);
        dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        // TODO add your handling code here:
        try {
                String sql = "INSERT INTO peminjaman VALUES ('"+txtID.getText()+
                    "','"+txtNIM.getText()+
                    "','"+txtKodeBuku.getText()+
                    "','"+txtJudulBuku.getText()+
                    "','"+txtJumlahBuku.getText()+
                    "','"+txtTanggalPinjam.getText()+
                    "','"+txtTanggalBalik.getText()+
                    "')";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Penyimpanan Data Berhasil");
            writeLog("Penyimpanan Data Berhasil dengan ID "+txtID.getText());
            load_table();
            bersihkan();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            writeLog("Data gagal disimpan: " + e.getMessage());
        }
    }//GEN-LAST:event_btTambahActionPerformed

    private void tblPeminjamanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPeminjamanMouseClicked
        // TODO add your handling code here:
        int baris = tblPeminjaman.rowAtPoint(evt.getPoint());
        String id =tblPeminjaman.getValueAt(baris, 1).toString();
        String nim= tblPeminjaman.getValueAt(baris,2).toString();
        String kode_buku = tblPeminjaman.getValueAt(baris, 3).toString();
        String judul_buku=tblPeminjaman.getValueAt(baris, 4).toString(); 
        String jumlah_buku=tblPeminjaman.getValueAt(baris, 5).toString();
        String tanggal_pinjam=tblPeminjaman.getValueAt(baris, 6).toString(); 
        String tanggal_balik=tblPeminjaman.getValueAt(baris, 7).toString();
        txtID.setText(id);
        txtNIM.setText(nim);       
        txtKodeBuku.setText(kode_buku);
        txtJudulBuku.setText(judul_buku);        
        txtJumlahBuku.setText(jumlah_buku);        
        txtTanggalPinjam.setText(tanggal_pinjam);
        txtTanggalBalik.setText(tanggal_balik);
    }//GEN-LAST:event_tblPeminjamanMouseClicked

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        // TODO add your handling code here:
        try {
                if ("".equals(txtID.getText())){
                    JOptionPane.showMessageDialog(this, "Isikan ID terlebih dahulu");
                }else{
                    String sql ="UPDATE peminjaman SET id_peminjaman = '"+ txtID.getText()+ 
                        "', nim = '"+txtNIM.getText()+
                        "', kode_buku = '"+txtKodeBuku.getText()+
                        "', judul_buku = '"+txtJudulBuku.getText()+
                        "', jumlah = '"+txtJumlahBuku.getText()+
                        "', tgl_pinjam = '"+txtTanggalPinjam.getText()+
                        "', tgl_balik = '"+txtTanggalBalik.getText()+
                        "' WHERE id_peminjaman = '"+txtID.getText()+"'";
                    java.sql.Connection conn=(Connection)Config.configDB();
                    java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Data Berhasil Diperbaharui dengan ID " +txtID.getText());
                    writeLog("Data Berhasil Diperbaharui dengan ID "+txtID.getText());
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Perubahan Data Gagal"+e.getMessage());
                writeLog("Perubahan Data Gagal : " + e.getMessage());
            }
            load_table();
            bersihkan();       
    }//GEN-LAST:event_btEditActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        // TODO add your handling code here:
        try {
            if ("".equals(txtID.getText())) {
                JOptionPane.showMessageDialog(this, "Isikan ID terlebih dahulu");
            }else{
                String sql = "DELETE FROM peminjaman WHERE id_peminjaman='" + txtID.getText() + "'";
                java.sql.Connection conn = (Connection)Config.configDB();
                java.sql.PreparedStatement pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus dengan ID " + txtID.getText());
                writeLog("Data Berhasil Dihapus dengan ID " + txtID.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            writeLog("Data gagal dihapus : " + e.getMessage());
        }
        load_table();  
        bersihkan();
    }//GEN-LAST:event_btHapusActionPerformed

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
            java.util.logging.Logger.getLogger(Fpeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fpeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fpeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fpeminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fpeminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btBersihkan;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btTambah;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPeminjaman;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtJumlahBuku;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtTanggalBalik;
    private javax.swing.JTextField txtTanggalPinjam;
    // End of variables declaration//GEN-END:variables
}
