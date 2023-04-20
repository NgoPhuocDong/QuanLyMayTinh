/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import BUS.*;
import DAO.*;
import DTO.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author tranconghung
 */
public class TaiKhoanNhanVienJFrame extends javax.swing.JFrame {
    private DefaultTableModel jtbtaikhoannhanvienModel;
    private  int idTaikhoanNV;
    private TaikhoanNhanvien taikhoanNhanvienUpdate = new TaikhoanNhanvien();
    private TaikhoanNhanvien taikhoanNhanvienDelete = new TaikhoanNhanvien();
    private File file;
    /**
     * Creates new form TaiKhoanNhanVienJFrame
     */
    public TaiKhoanNhanVienJFrame() {
        initComponents();
        initTable();
        LoadTable();
    }
     public void initTable(){
        jtbtaikhoannhanvienModel = new DefaultTableModel();
        jtbtaikhoannhanvienModel.setColumnIdentifiers(new String[]{"Ảnh đại diện","Tên đăng nhập","Mã nhân viên","Mật khẩu","Trạng thái"});
        jtbTaikhoanNhanvien.setModel(jtbtaikhoannhanvienModel);
        jtbTaikhoanNhanvien.getTableHeader().setReorderingAllowed(false);
        jtbTaikhoanNhanvien.getColumnModel().getColumn(0).setCellRenderer(new ImageRender());
        jtbTaikhoanNhanvien.setRowHeight(150);
    }
      private class ImageRender extends DefaultTableCellRenderer{
        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
            byte[] bytes = (byte[]) value;
            ImageIcon imageicon =  new ImageIcon(new ImageIcon(bytes).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT));
            setIcon(imageicon);
            return this;
        }
    }
    public void LoadTable(){
        try {
            TaiKhoanNhanVienBUS taiKhoanNhanVienBUS = new TaiKhoanNhanVienBUS();
            List<TaikhoanNhanvien> list = taiKhoanNhanVienBUS.LoadTaiKhoanNhanVien(WIDTH);
            jtbtaikhoannhanvienModel.setRowCount(0);
            for(TaikhoanNhanvien tk : list){
                jtbtaikhoannhanvienModel.addRow(new Object[]{
                    tk.getAnhDaiDien(),tk.getTenDangNhap(),tk.getID(),tk.getMatKhau(),tk.getTrangThai()
                });
            }
            jtbtaikhoannhanvienModel.fireTableDataChanged();
//            idTaikhoanNV = list.size() + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private boolean checkIdNhanvien() throws HeadlessException{
        StringBuilder bd = new StringBuilder();
        if(jtfManv.getText().equals("")){
            bd.append("Mã nhân viên không được để tróng");
        }
        if(bd.length() > 0){
            JOptionPane.showMessageDialog(this, bd, "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            jtfManv.setBackground(Color.red);
            return true;
        }
        return false;
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
        jtbTaikhoanNhanvien = new javax.swing.JTable();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfManv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfTrangthai = new javax.swing.JTextField();
        jtfPassword = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btnShowNhanVien = new javax.swing.JButton();
        btnbrowse = new javax.swing.JButton();
        jtfTimkiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        lbimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtbTaikhoanNhanvien.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbTaikhoanNhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTaikhoanNhanvienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbTaikhoanNhanvien);

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin tài khoản nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 18))); // NOI18N
        kGradientPanel1.setkGradientFocus(1000);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên tài khoản");

        jLabel2.setText("Mật khẩu");

        jLabel3.setText("ID nhân viên");

        jLabel4.setText("Trạng thái");

        jtfTrangthai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTrangthaiActionPerformed(evt);
            }
        });

        jLabel5.setText("Ảnh đại diện < (64kb)");

        btnShowNhanVien.setText("...");
        btnShowNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowNhanVienActionPerformed(evt);
            }
        });

        btnbrowse.setText("Browse");
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });

        btnTimkiem.setText("Tìm Kiếm");

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");

        jButton7.setText("jButton7");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfManv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtfTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbimage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnShowNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbrowse))
                .addGap(109, 109, 109)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addComponent(jtfTimkiem))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTimkiem)
                    .addComponent(jButton7))
                .addGap(31, 31, 31))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfManv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnShowNhanVien)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfTrangthai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lbimage, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbrowse))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfTrangthaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTrangthaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTrangthaiActionPerformed

    private void btnbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setMultiSelectionEnabled(false);
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            this.file = chooser.getSelectedFile();
            String path = file.getAbsolutePath();
            //txtAmount.setText(path);
            ImageIcon imageicon = new ImageIcon(path);
            Image image = imageicon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
            lbimage.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_btnbrowseActionPerformed

    private void btnShowNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowNhanVienActionPerformed
        TableNhanVien tbNhanVien = new TableNhanVien();
        try {
            tbNhanVien.list();
        } catch (Exception e) {
             Logger.getLogger(TableNhanVien.class.getName()).log(Level.SEVERE, null, e);
        }
        tbNhanVien.setVisible(true);
    }//GEN-LAST:event_btnShowNhanVienActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(checkIdNhanvien()) return;
        try {
            TaikhoanNhanvien taikhoanNhanvien = new TaikhoanNhanvien();
            taikhoanNhanvien.setTenDangNhap(jtfUsername.getText());
            taikhoanNhanvien.setID(Integer.parseInt(jtfManv.getText()));
            taikhoanNhanvien.setMatKhau(String.valueOf(jtfPassword.getPassword()).toString());
            taikhoanNhanvien.setTrangThai(Integer.parseInt(jtfTrangthai.getText()));
            taikhoanNhanvien.setAnhDaiDien(Files.readAllBytes(this.file.toPath()));
            TaiKhoanNhanVienBUS taiKhoanNhanVienBUS = new TaiKhoanNhanVienBUS();
            if(taiKhoanNhanVienBUS.insertTaiKhoanNV(taikhoanNhanvien) > 0 ){
                JOptionPane.showMessageDialog(this, "Thêm tài khoản thành công");
                jtfUsername.setText("");
                jtfManv.setText("");
                jtfPassword.setText("");
                jtfTrangthai.setText("");
                lbimage.setVisible(true);
                LoadTable();
            }
            else{
                JOptionPane.showMessageDialog(this,"Thêm tài khoản thất bại" , "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Tên đặng nhập đã tồn tại" , "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jtbTaikhoanNhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTaikhoanNhanvienMouseClicked
try {
            int row = jtbTaikhoanNhanvien.getSelectedRow();
            if(row >= 0){
                String Username =  jtbTaikhoanNhanvien.getValueAt(row, 1).toString();
                int ID = (Integer)jtbTaikhoanNhanvien.getValueAt(row, 2);
                TaiKhoanNhanVienBUS taiKhoanNhanVienBUS = new TaiKhoanNhanVienBUS();
                TaikhoanNhanvien taikhoanNhanvien  = taiKhoanNhanVienBUS.getTaikhoanNhanvien(Username);
                taikhoanNhanvienUpdate = taiKhoanNhanVienBUS.getIDTaikhoanNhanvien(ID);
                taikhoanNhanvienDelete = taiKhoanNhanVienBUS.getTaikhoanNhanvien(Username);
                if(taikhoanNhanvien != null){
                    jtfUsername.setText(taikhoanNhanvien.getTenDangNhap());
                    jtfManv.setText(String.valueOf(taikhoanNhanvien.getID()));
                    jtfPassword.setText(taikhoanNhanvien.getMatKhau());
                    jtfTrangthai.setText(String.valueOf(taikhoanNhanvien.getTrangThai()));
                    lbimage.setIcon(new ImageIcon(new ImageIcon(taikhoanNhanvien.getAnhDaiDien()).getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT)));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtbTaikhoanNhanvienMouseClicked

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
            java.util.logging.Logger.getLogger(TaiKhoanNhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaiKhoanNhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaiKhoanNhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaiKhoanNhanVienJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaiKhoanNhanVienJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnShowNhanVien;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbTaikhoanNhanvien;
    private javax.swing.JTextField jtfManv;
    private javax.swing.JPasswordField jtfPassword;
    private javax.swing.JTextField jtfTimkiem;
    private javax.swing.JTextField jtfTrangthai;
    private javax.swing.JTextField jtfUsername;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lbimage;
    // End of variables declaration//GEN-END:variables
}
