package GUI;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class QuanLyNhanVien_GUI extends javax.swing.JPanel {
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbQuanLyNhanVien = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbMaNV = new javax.swing.JLabel();
        txfTenTaiKhoan = new javax.swing.JTextField();
        lbTenTaiKhoan = new javax.swing.JLabel();
        lbHoTen = new javax.swing.JLabel();
        txfHoTen = new javax.swing.JTextField();
        txfDiaChi = new javax.swing.JTextField();
        lbDiaChi = new javax.swing.JLabel();
        txfSDT = new javax.swing.JTextField();
        lbSDT = new javax.swing.JLabel();
        lbCMND = new javax.swing.JLabel();
        txfCMND = new javax.swing.JTextField();
        lbGioiTinh = new javax.swing.JLabel();
        txfMaNV = new javax.swing.JTextField();
        lbNhanVienImage = new javax.swing.JLabel();
        lbAnhNhanVienText = new javax.swing.JLabel();
        lbMatKhau = new javax.swing.JLabel();
        btnXoaInput = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnKhoa = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txfTimKiem = new javax.swing.JTextField();
        txfMatKhau = new javax.swing.JTextField();
        btnChonAnh = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        lbTimKiem = new javax.swing.JLabel();
        btnExcelExport = new javax.swing.JButton();
        cbbGioiTinh = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(153, 255, 153));

        lbQuanLyNhanVien.setBackground(new java.awt.Color(102, 102, 255));
        lbQuanLyNhanVien.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        lbQuanLyNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-change-user-30.png"))); // NOI18N
        lbQuanLyNhanVien.setText("QUẢN LÝ NHÂN VIÊN");
        lbQuanLyNhanVien.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        lbMaNV.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbMaNV.setText("Mã nhân viên:");

        txfTenTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfTenTaiKhoanKeyPressed(evt);
            }
        });

        lbTenTaiKhoan.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbTenTaiKhoan.setText("Tên tài khoản:");

        lbHoTen.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbHoTen.setText("Họ tên:");

        txfHoTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfHoTenKeyPressed(evt);
            }
        });

        txfDiaChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfDiaChiKeyPressed(evt);
            }
        });

        lbDiaChi.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbDiaChi.setText("Địa chỉ:");

        txfSDT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfSDTKeyPressed(evt);
            }
        });

        lbSDT.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbSDT.setText("SDT:");

        lbCMND.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbCMND.setText("CMND:");

        txfCMND.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfCMNDKeyPressed(evt);
            }
        });

        lbGioiTinh.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbGioiTinh.setText("Giới tính:");

        txfMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfMaNVKeyPressed(evt);
            }
        });

        lbNhanVienImage.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbNhanVienImage.setText("                     Hình ảnh ở đây");
        lbNhanVienImage.setOpaque(true);
        lbNhanVienImage.setVerifyInputWhenFocusTarget(false);

        lbAnhNhanVienText.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbAnhNhanVienText.setText("Ảnh nhân viên:");

        lbMatKhau.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        lbMatKhau.setText("Mật khẩu:");

        btnXoaInput.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnXoaInput.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clean-icon3.png"))); // NOI18N
        btnXoaInput.setText("Clear");
        btnXoaInput.setPreferredSize(new java.awt.Dimension(104, 27));
        btnXoaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaInputActionPerformed(evt);
            }
        });

        btnCapNhat.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-update-left-rotation-27.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnKhoa.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        btnKhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-delete-27.png"))); // NOI18N
        btnKhoa.setText("Xóa");
        btnKhoa.setPreferredSize(new java.awt.Dimension(104, 27));
        btnKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaActionPerformed(evt);
            }
        });

        txfTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txfTimKiemKeyReleased(evt);
            }
        });

        txfMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfMatKhauKeyPressed(evt);
            }
        });

        btnChonAnh.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnChonAnh.setText("Chọn ảnh");
        btnChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChonAnhActionPerformed(evt);
            }
        });

        tblNhanVien.setAutoCreateRowSorter(true);
        tblNhanVien.setBackground(new java.awt.Color(255, 204, 255));
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên tài khoản", "Mật khẩu", "Họ tên", "Địa chỉ", "SDT", "CMND", "Giới tính"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        tblNhanVien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblNhanVienKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);
        if (tblNhanVien.getColumnModel().getColumnCount() > 0) {
            tblNhanVien.getColumnModel().getColumn(0).setMaxWidth(110);
            tblNhanVien.getColumnModel().getColumn(1).setMaxWidth(90);
            tblNhanVien.getColumnModel().getColumn(2).setMaxWidth(120);
            tblNhanVien.getColumnModel().getColumn(3).setMaxWidth(120);
            tblNhanVien.getColumnModel().getColumn(4).setMaxWidth(300);
            tblNhanVien.getColumnModel().getColumn(5).setMaxWidth(200);
            tblNhanVien.getColumnModel().getColumn(6).setMaxWidth(150);
            tblNhanVien.getColumnModel().getColumn(7).setMaxWidth(150);
            tblNhanVien.getColumnModel().getColumn(8).setMaxWidth(90);
            tblNhanVien.getColumnModel().getColumn(9).setMaxWidth(90);
        }

        btnThem.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-27.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(104, 27));
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        lbTimKiem.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lbTimKiem.setText("Tìm kiếm:");

        btnExcelExport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExcelExport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-export-excel-27.png"))); // NOI18N
        btnExcelExport.setText("Xuất Excel");
        btnExcelExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelExportActionPerformed(evt);
            }
        });

        cbbGioiTinh.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        cbbGioiTinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbGioiTinhKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbTenTaiKhoan))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txfTenTaiKhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                    .addComponent(txfMaNV)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(6, 6, 6))
                                    .addComponent(lbHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbMatKhau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbCMND, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txfCMND)
                                            .addComponent(cbbGioiTinh, 0, 281, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txfHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                            .addComponent(txfMatKhau)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbDiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                                .addGap(10, 10, 10)
                                .addComponent(txfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbSDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnChonAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbAnhNhanVienText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lbNhanVienImage, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnXoaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCapNhat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(lbTimKiem)
                        .addGap(72, 72, 72)
                        .addComponent(txfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcelExport, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAnhNhanVienText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbNhanVienImage, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnChonAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCapNhat)
                            .addComponent(btnKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txfSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTimKiem))
                    .addComponent(btnExcelExport, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(331, 331, 331))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbQuanLyNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbbGioiTinhKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbGioiTinhKeyPressed
        
    }//GEN-LAST:event_cbbGioiTinhKeyPressed

    private void btnExcelExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelExportActionPerformed
       
    }//GEN-LAST:event_btnExcelExportActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
      
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblNhanVienKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblNhanVienKeyReleased
      
    }//GEN-LAST:event_tblNhanVienKeyReleased

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
     
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChonAnhActionPerformed
    
    }//GEN-LAST:event_btnChonAnhActionPerformed

    private void txfMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfMatKhauKeyPressed
      
    }//GEN-LAST:event_txfMatKhauKeyPressed

    private void txfTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTimKiemKeyReleased
        
    }//GEN-LAST:event_txfTimKiemKeyReleased

    private void btnKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaActionPerformed
      
    }//GEN-LAST:event_btnKhoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
      
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaInputActionPerformed
   
    }//GEN-LAST:event_btnXoaInputActionPerformed

    private void txfMaNVKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfMaNVKeyPressed
        
    }//GEN-LAST:event_txfMaNVKeyPressed

    private void txfCMNDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfCMNDKeyPressed
     
    }//GEN-LAST:event_txfCMNDKeyPressed

    private void txfSDTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfSDTKeyPressed
       
    }//GEN-LAST:event_txfSDTKeyPressed

    private void txfDiaChiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfDiaChiKeyPressed

    }//GEN-LAST:event_txfDiaChiKeyPressed

    private void txfHoTenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfHoTenKeyPressed
        
    }//GEN-LAST:event_txfHoTenKeyPressed

    private void txfTenTaiKhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfTenTaiKhoanKeyPressed
        
    }//GEN-LAST:event_txfTenTaiKhoanKeyPressed
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnChonAnh;
    private javax.swing.JButton btnExcelExport;
    private javax.swing.JButton btnKhoa;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoaInput;
    private javax.swing.JComboBox<String> cbbGioiTinh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbAnhNhanVienText;
    private javax.swing.JLabel lbCMND;
    private javax.swing.JLabel lbDiaChi;
    private javax.swing.JLabel lbGioiTinh;
    private javax.swing.JLabel lbHoTen;
    private javax.swing.JLabel lbMaNV;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JLabel lbNhanVienImage;
    private javax.swing.JLabel lbQuanLyNhanVien;
    private javax.swing.JLabel lbSDT;
    private javax.swing.JLabel lbTenTaiKhoan;
    private javax.swing.JLabel lbTimKiem;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txfCMND;
    private javax.swing.JTextField txfDiaChi;
    private javax.swing.JTextField txfHoTen;
    private javax.swing.JTextField txfMaNV;
    private javax.swing.JTextField txfMatKhau;
    private javax.swing.JTextField txfSDT;
    private javax.swing.JTextField txfTenTaiKhoan;
    private javax.swing.JTextField txfTimKiem;
    // End of variables declaration//GEN-END:variables
}
