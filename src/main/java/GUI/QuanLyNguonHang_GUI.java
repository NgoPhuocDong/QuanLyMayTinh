/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import DTO.*;
import DAO.*;
import BUS.*;
import java.beans.Customizer;
import java.sql.Date;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
/**
 *
 * @author MSI VN
 */
public class QuanLyNguonHang_GUI extends javax.swing.JPanel {

    private DefaultTableModel jtbNguonHangmodel;
    private NguonHangBus nguonhangBUS = new NguonHangBus();
    private NguonHang nguonhangUpdate = new NguonHang();
    private NguonHang nguonhangDelete = new NguonHang();
    private int nguonhangid;
    
    public QuanLyNguonHang_GUI() {
        this.setLayout(null);
        initComponents();
        this.setVisible(true);
        initTable();
        loadData();
    }

    private void initTable() {
        jtbNguonHangmodel = new DefaultTableModel();
        jtbNguonHangmodel.setColumnIdentifiers(new String[]{"ID", "Tên nguồn hàng", "Số điện thoại", "Email", "Địa chỉ", "Ngày tạo", "Người đại diện"});
        jtbNguonHang.setModel(jtbNguonHangmodel);
    }

    private void loadData() {
        try {
            NguonHangBus nguonhangBUS = new NguonHangBus();
            List<NguonHang> list = nguonhangBUS.LoadNguonHang(WIDTH);
            jtbNguonHangmodel.setRowCount(0);
            for (NguonHang nh : list) {
                jtbNguonHangmodel.addRow(new Object[]{
                    nh.getID(), nh.getTenNguonHang(), nh.getSoDienThoai(), nh.getEmail(), nh.getDiaChi(), nh.getNgayTao(), nh.getNguoiDaiDien()
                });
            }
            jtbNguonHangmodel.fireTableDataChanged();
            nguonhangid = list.size() + 1;
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
    
    private boolean Email() {
        String Email;
        Email = jtfEmail.getText();
        String check = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        if (!Email.matches(check)) {
            return false;
        } else {
            return true;
        }

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfTenNguonHang = new javax.swing.JTextField();
        jtfSoDienThoai = new javax.swing.JTextField();
        jtfEmail = new javax.swing.JTextField();
        jtfDiaChi = new javax.swing.JTextField();
        jtfNguoiDaiDien = new javax.swing.JTextField();
        jdcNgayTao = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbNguonHang = new javax.swing.JTable();
        jbtThem = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jbtXoa = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jbtSua = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jbtReset = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jtfTimKiem = new javax.swing.JTextField();
        jbtTim = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Quản Lý Nguồn Hàng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(299, 299, 299))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel2.setText("Tên nguồn hàng");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel4.setText("Số điện thoại");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel5.setText("Địa chỉ");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel6.setText("Ngày tạo");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel7.setText("Người đại diện");

        jtbNguonHang.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbNguonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbNguonHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbNguonHang);

        jbtThem.setBackground(new java.awt.Color(0, 0, 0));
        jbtThem.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtThemMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Thêm");

        javax.swing.GroupLayout jbtThemLayout = new javax.swing.GroupLayout(jbtThem);
        jbtThem.setLayout(jbtThemLayout);
        jbtThemLayout.setHorizontalGroup(
            jbtThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbtThemLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(31, 31, 31))
        );
        jbtThemLayout.setVerticalGroup(
            jbtThemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtThemLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jbtXoa.setBackground(new java.awt.Color(0, 0, 0));
        jbtXoa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtXoaMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Xóa");

        javax.swing.GroupLayout jbtXoaLayout = new javax.swing.GroupLayout(jbtXoa);
        jbtXoa.setLayout(jbtXoaLayout);
        jbtXoaLayout.setHorizontalGroup(
            jbtXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtXoaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jbtXoaLayout.setVerticalGroup(
            jbtXoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtXoaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel9)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jbtSua.setBackground(new java.awt.Color(0, 0, 0));
        jbtSua.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtSua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtSuaMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Sửa");

        javax.swing.GroupLayout jbtSuaLayout = new javax.swing.GroupLayout(jbtSua);
        jbtSua.setLayout(jbtSuaLayout);
        jbtSuaLayout.setHorizontalGroup(
            jbtSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbtSuaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(37, 37, 37))
        );
        jbtSuaLayout.setVerticalGroup(
            jbtSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtSuaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jbtReset.setBackground(new java.awt.Color(0, 0, 0));
        jbtReset.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtResetMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Reset");

        javax.swing.GroupLayout jbtResetLayout = new javax.swing.GroupLayout(jbtReset);
        jbtReset.setLayout(jbtResetLayout);
        jbtResetLayout.setHorizontalGroup(
            jbtResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtResetLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel13)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jbtResetLayout.setVerticalGroup(
            jbtResetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtResetLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel13)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jtfTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfTimKiemKeyPressed(evt);
            }
        });

        jbtTim.setBackground(new java.awt.Color(0, 0, 0));
        jbtTim.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtTimMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tìm");

        javax.swing.GroupLayout jbtTimLayout = new javax.swing.GroupLayout(jbtTim);
        jbtTim.setLayout(jbtTimLayout);
        jbtTimLayout.setHorizontalGroup(
            jbtTimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jbtTimLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(18, 18, 18))
        );
        jbtTimLayout.setVerticalGroup(
            jbtTimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jbtTimLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfSoDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jtfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jtfDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jtfNguoiDaiDien, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                            .addComponent(jtfTenNguonHang)
                            .addComponent(jdcNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jbtThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbtSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbtXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtReset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jtfTimKiem)
                            .addComponent(jbtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jtfTenNguonHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbtThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jtfSoDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jtfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbtReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbtSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jbtXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jdcNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtfNguoiDaiDien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbtTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtThemMouseClicked
        if (jtfTenNguonHang.getText().isBlank() || jtfNguoiDaiDien.getText().isBlank() || jdcNgayTao.getDate() == null
                || jtfSoDienThoai.getText().isBlank() || jtfEmail.getText().isBlank() || jtfDiaChi.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Không được điền thiếu thông tin nguồn hàng");
            return;
        }
        try {
            if (!Email()) {
                JOptionPane.showMessageDialog(this, "Sai dinh dang Email");
                return;
            }
            NguonHang nh = new NguonHang();
            nh.setID(nguonhangid);
            nh.setTenNguonHang(jtfTenNguonHang.getText());
            nh.setSoDienThoai(jtfSoDienThoai.getText());
            nh.setEmail(jtfEmail.getText());
            nh.setDiaChi(jtfDiaChi.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String finddate = sdf.format(jdcNgayTao.getDate()).toString();
            nh.setNgayTao(Date.valueOf(finddate));
            nh.setNguoiDaiDien(jtfNguoiDaiDien.getText());
            KhachHangBUS khachhangBUS = new KhachHangBUS();
            if (nguonhangBUS.saveNguonHang(nh) > 0) {
                JOptionPane.showMessageDialog(this, "Thêm nguồn hàng thành công");
                jtfTenNguonHang.setText("");
                jtfSoDienThoai.setText("");
                jtfEmail.setText("");
                jtfDiaChi.setText("");
                jdcNgayTao.setCalendar(null);
                jtfNguoiDaiDien.setText("");
                loadData();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm nguồn hàng thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Thêm nguồn hàng thất bại");
        }
    }//GEN-LAST:event_jbtThemMouseClicked

    private void jbtSuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtSuaMouseClicked
        try {
            if (!Email()) {
                JOptionPane.showMessageDialog(this, "Sai dinh dang Email");
                return;
            }
            NguonHang nh = new NguonHang();
            nh = this.nguonhangUpdate;
            nh.setTenNguonHang(jtfTenNguonHang.getText());
            nh.setSoDienThoai(jtfSoDienThoai.getText());
            nh.setEmail(jtfEmail.getText());
            nh.setDiaChi(jtfDiaChi.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String finddate = sdf.format(jdcNgayTao.getDate()).toString();
            nh.setNgayTao(Date.valueOf(finddate));
            nh.setNguoiDaiDien(jtfNguoiDaiDien.getText());

            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn Update không?", "Hỏi",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
                return;
            }
            NguonHangBus nguonhangBUS = new NguonHangBus();
            if (nguonhangBUS.updateNguonHang(nh) > 0) {
                JOptionPane.showMessageDialog(null, "Update thành công");
                jtfTenNguonHang.setText("");
                jtfSoDienThoai.setText("");
                jtfEmail.setText("");
                jtfDiaChi.setText("");
                jdcNgayTao.setCalendar(null);
                jtfNguoiDaiDien.setText("");
                loadData();
            } else {
                JOptionPane.showMessageDialog(null, "Update thất bại");
            }
        } catch (Exception e) {
            Logger.getLogger(NhanVienJFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jbtSuaMouseClicked

    private void jbtXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtXoaMouseClicked
        try {
            if (JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Hỏi",
                     JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION) {
                return;
            }
            NguonHangBus nguonhangBUS = new NguonHangBus();
            if (nguonhangBUS.deleteNguonHang(nguonhangDelete)) {
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                loadData();
            } else {
                JOptionPane.showMessageDialog(null, "Xóa thất bại");
            }
        } catch (Exception e) {
            Logger.getLogger(NhanVienJFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jbtXoaMouseClicked

    private void jtbNguonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbNguonHangMouseClicked
        try {
            int row = jtbNguonHang.getSelectedRow();
            if (row >= 0) {
                int id = (Integer) jtbNguonHang.getValueAt(row, 0);
                NguonHangBus nguonhangBUS = new NguonHangBus();
                NguonHang nh = nguonhangBUS.getNguonHang(id);
                nguonhangUpdate = this.nguonhangBUS.getNguonHang(id);
                nguonhangDelete = this.nguonhangBUS.getNguonHang(id);
                if (nh != null) {
                    jtfTenNguonHang.setText(nh.getTenNguonHang());
                    jtfSoDienThoai.setText(nh.getSoDienThoai());
                    jtfEmail.setText(nh.getEmail());
                    jtfDiaChi.setText(nh.getDiaChi());
                    jdcNgayTao.setDate(nh.getNgayTao());
                    jtfNguoiDaiDien.setText(nh.getNguoiDaiDien());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtbNguonHangMouseClicked

    private void jtfTimKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimKiemKeyPressed
        try {
            NguonHangBus nguonhangBUS = new NguonHangBus();
            List<NguonHang> list = nguonhangBUS.findNguonHang(jtfTimKiem.getText());
            initTable();
            for (NguonHang nh : list) {
                jtbNguonHangmodel.addRow(new Object[]{
                    nh.getID(), nh.getTenNguonHang(), nh.getSoDienThoai(),
                    nh.getEmail(), nh.getDiaChi(), nh.getNgayTao(), nh.getNguoiDaiDien()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Khách hàng không tồn tại", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtfTimKiemKeyPressed

    private void jbtTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtTimMouseClicked
        try {
            NguonHangBus nguonhangBUS = new NguonHangBus();
            List<NguonHang> list = nguonhangBUS.findNguonHang(jtfTimKiem.getText());

            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Khách hàng không tồn tại", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            } else {
                for (NguonHang nh : list) {
                    jtfTenNguonHang.setText(nh.getTenNguonHang());
                    jtfSoDienThoai.setText(nh.getSoDienThoai());
                    jtfEmail.setText(nh.getEmail());
                    jtfDiaChi.setText(nh.getDiaChi());
                    jdcNgayTao.setDate(nh.getNgayTao());
                    jtfNguoiDaiDien.setText(nh.getNguoiDaiDien());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Khách hàng không tồn tại", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbtTimMouseClicked

    private void jbtResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtResetMouseClicked
        jtfTenNguonHang.setText("");
        jtfSoDienThoai.setText("");
        jtfEmail.setText("");
        jtfDiaChi.setText("");
        jdcNgayTao.setCalendar(null);
        jtfNguoiDaiDien.setText("");
    }//GEN-LAST:event_jbtResetMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jbtReset;
    private javax.swing.JPanel jbtSua;
    private javax.swing.JPanel jbtThem;
    private javax.swing.JPanel jbtTim;
    private javax.swing.JPanel jbtXoa;
    private com.toedter.calendar.JDateChooser jdcNgayTao;
    private javax.swing.JTable jtbNguonHang;
    private javax.swing.JTextField jtfDiaChi;
    private javax.swing.JTextField jtfEmail;
    private javax.swing.JTextField jtfNguoiDaiDien;
    private javax.swing.JTextField jtfSoDienThoai;
    private javax.swing.JTextField jtfTenNguonHang;
    private javax.swing.JTextField jtfTimKiem;
    // End of variables declaration//GEN-END:variables
}
