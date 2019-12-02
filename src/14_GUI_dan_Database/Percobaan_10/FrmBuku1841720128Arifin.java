/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import backend.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MuFin
 */
public class FrmBuku1841720128Arifin extends javax.swing.JFrame {

    /**
     * Creates new form FrmBuku1841720128Arifin
     */
    public FrmBuku1841720128Arifin() {
        initComponents();
        tampilkanDataArifin();
        tampilkanCmbKategori();
        kosongkanFormArifin();
    }
    
    public void kosongkanFormArifin(){
        txtIdBuku.setText("0");
        cmbKategori.setSelectedIndex(0);
        txtJudul.setText("");
        txtPenulis.setText("");
        txtPenerbit.setText("");
    }
    
    public void tampilkanDataArifin(){
        String[] kolom = {"ID", "Kategori", "Judul", "Penulis", "Penerbit"};
        ArrayList<Buku1841720128Arifin> list = new Buku1841720128Arifin().getAllArifin();
        Object rowData[] = new Object[5];
        
        tblBuku.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(int i = 0; i < list.size(); i++){
            rowData[0] = list.get(i).getIdbukuArifin();
            rowData[1] = list.get(i).getKategoriArifin().getNamaArifin();
            rowData[2] = list.get(i).getJudulArifin();
            rowData[3] = list.get(i).getPenulisArifin();
            rowData[4] = list.get(i).getPenerbitArifin();
            
            ((DefaultTableModel)tblBuku.getModel()).addRow(rowData);
        }
    }
    
    public void cariArifin(String text){
        String[] kolom = {"ID", "Kategori", "Judul", "Penulis", "Penerbit"};
        ArrayList<Buku1841720128Arifin> list = new Buku1841720128Arifin().getAllArifin();
        Object rowData[] = new Object[5];
        
        tblBuku.setModel(new DefaultTableModel(new Object[][] {}, kolom));
        
        for(int i = 0; i < list.size(); i++){
            rowData[0] = list.get(i).getIdbukuArifin();
            rowData[1] = list.get(i).getKategoriArifin().getNamaArifin();
            rowData[2] = list.get(i).getJudulArifin();
            rowData[3] = list.get(i).getPenulisArifin();
            rowData[4] = list.get(i).getPenerbitArifin();
            
            ((DefaultTableModel)tblBuku.getModel()).addRow(rowData);
        }
    }
    
    public void tampilkanCmbKategori() {
        cmbKategori.setModel(new DefaultComboBoxModel(new Kategori1841720128Arifin().getAllArifin().toArray()));
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
        btnSimpan = new javax.swing.JButton();
        txtIdBuku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtJudul = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPenerbit = new javax.swing.JTextField();
        txtPenulis = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnTambahBaru = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBuku = new javax.swing.JTable();
        cmbKategori = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID Buku");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        txtIdBuku.setEditable(false);

        jLabel2.setText("Kategori");

        jLabel3.setText("Judul");

        jLabel4.setText("Penerbit");

        jLabel5.setText("Penulis");

        btnTambahBaru.setText("Tambah Baru");
        btnTambahBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahBaruActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        tblBuku.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBuku);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambahBaru)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCari))
                    .addComponent(btnSimpan)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btnSimpan)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambahBaru)
                    .addComponent(btnHapus)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        Buku1841720128Arifin buku = new Buku1841720128Arifin();
        buku.setIdbukuArifin(Integer.parseInt(txtIdBuku.getText()));
        buku.setKategoriArifin((Kategori1841720128Arifin)cmbKategori.getSelectedItem());
        buku.setJudulArifin(txtJudul.getText());
        buku.setPenulisArifin(txtPenulis.getText());
        buku.setPenerbitArifin(txtPenerbit.getText());
        buku.saveArifin();
        
        txtIdBuku.setText(Integer.toString(buku.getIdbukuArifin()));
        
        tampilkanDataArifin();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblBuku.getModel();
        int row = tblBuku.getSelectedRow();
        
        Buku1841720128Arifin buku = new Buku1841720128Arifin().getByIdArifin(Integer.parseInt(model.getValueAt(row, 0).toString()));
        buku.deleteArifin();
        kosongkanFormArifin();
        tampilkanDataArifin();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahBaruActionPerformed
        kosongkanFormArifin();
    }//GEN-LAST:event_btnTambahBaruActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        cariArifin(txtCari.getText());
    }//GEN-LAST:event_btnCariActionPerformed

    private void tblBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBukuMouseClicked
        DefaultTableModel model = (DefaultTableModel)tblBuku.getModel();
        int row = tblBuku.getSelectedRow();
        Buku1841720128Arifin buku = new Buku1841720128Arifin();
        
        buku = buku.getByIdArifin(Integer.parseInt(model.getValueAt(row, 0).toString()));
        
        txtIdBuku.setText(String.valueOf(buku.getIdbukuArifin()));
        cmbKategori.getModel().setSelectedItem(buku.getKategoriArifin());
        txtJudul.setText(buku.getJudulArifin());
        txtPenerbit.setText(buku.getPenerbitArifin());
        txtPenulis.setText(buku.getPenulisArifin());
    }//GEN-LAST:event_tblBukuMouseClicked

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
            java.util.logging.Logger.getLogger(FrmBuku1841720128Arifin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBuku1841720128Arifin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBuku1841720128Arifin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBuku1841720128Arifin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBuku1841720128Arifin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambahBaru;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBuku;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtIdBuku;
    private javax.swing.JTextField txtJudul;
    private javax.swing.JTextField txtPenerbit;
    private javax.swing.JTextField txtPenulis;
    // End of variables declaration//GEN-END:variables
}