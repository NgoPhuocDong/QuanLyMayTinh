/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import DTO.DonHangBan;
import DTO.ChiTietDonHangBan;
import DAO.*;
import BUS.*;
import DTO.NhanVien;
import java.beans.Customizer;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.util.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**
 *
 * @author VO THANH HOA
 */
public class DonHangBanJFrame extends javax.swing.JFrame {
    private DefaultTableModel jtbDonHangBanmodel;
    private  DonHangBanBUS donHangBUS = new DonHangBanBUS();
    private DonHangBan donHangUpdate = new DonHangBan();
    private DonHangBan donHangDelete = new DonHangBan();
    private int donhangbanid;
    
    private DefaultTableModel jtbChiTietDonHangBanmodel;
    private  ChiTietDonHangBanBUS chiTietBUS = new ChiTietDonHangBanBUS();
    private ChiTietDonHangBan chiTietUpdate = new ChiTietDonHangBan();
    private ChiTietDonHangBan chiTietDelete = new ChiTietDonHangBan();
    private int chitietdonhangbanid;
    
    /**
     * Creates new form DonHangBanJF
     */
    public DonHangBanJFrame() {
        initComponents();
        initTable();
        loadData();   
    }
    
    private void initTable(){
        jtbDonHangBanmodel = new DefaultTableModel();
        jtbDonHangBanmodel.setColumnIdentifiers(new String[] {"ID","idNhanVienLap","idKhachHang","idTrangThai","NgayLap","TongTien"});
        jtbDonHangBan.setModel(jtbDonHangBanmodel);
        
        jtbChiTietDonHangBanmodel = new DefaultTableModel();
        jtbChiTietDonHangBanmodel.setColumnIdentifiers(new String[] {"ID","idDonHangBan","idSanPham","SoLuong","DonGiaApDung","ThanhTien"});
        jtbChiTietDonHangBan.setModel(jtbChiTietDonHangBanmodel);
    }
    private void loadData(){
        try {
            DonHangBanBUS donHangBUS = new DonHangBanBUS();
            List<DonHangBan> list  = donHangBUS.LoadDonHangBan(WIDTH);
            
            NhanVienBUS nhanVienBUS = new NhanVienBUS();
            List<NhanVien> listnv  = nhanVienBUS.LoadNhanVien(WIDTH);
            jtbDonHangBanmodel.setRowCount(0);
            for(DonHangBan dh : list){
                jtbDonHangBanmodel.addRow(new Object[]{
                    dh.getID(),dh.getIdNhanVienLap(),dh.getIdKhachHang(),dh.getIdTrangThai(),dh.getNgayLap(),dh.getTongTien()
                });
            }
            jtbDonHangBanmodel.fireTableDataChanged();
            donhangbanid = list.size() + 1;
            
            
            ChiTietDonHangBanBUS chiTietBUS = new ChiTietDonHangBanBUS();
            List<ChiTietDonHangBan> listct  = chiTietBUS.LoadChiTietDonHangBan(WIDTH);
            
            jtbChiTietDonHangBanmodel.setRowCount(0);
            for(ChiTietDonHangBan dh : listct){
                jtbChiTietDonHangBanmodel.addRow(new Object[]{
                    dh.getId(),dh.getIdDonHangBan(),dh.getIdSanPham(),dh.getSoLuong(),dh.getDonGiaApDung(),dh.getThanhTien()
                });
            }
            jtbChiTietDonHangBanmodel.fireTableDataChanged();
            chitietdonhangbanid = list.size() + 1;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void XuatExcel() {
       JFileChooser file = new JFileChooser(); //Khởi tạo JFileChooser
        file.setCurrentDirectory(new File(System.getProperty("user.home"))); 
        
        int result = file.showSaveDialog(null);
        if ( result == JFileChooser.APPROVE_OPTION){
            XSSFWorkbook excelWorkbook = new XSSFWorkbook();
            XSSFSheet excelSheet = excelWorkbook.createSheet("CHI TIET HOA DON");
            
            XSSFRow row = null;
            Cell cell = null;
            
            row = excelSheet.createRow((short) 2);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("CHI TIET HOA DON");

            row = excelSheet.createRow((short) 3);
            row.setHeight((short) 500);
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue("ID DON HANG");
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue("ID SAN PHAM");
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue("SO LUONG");
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue("DON GIA");
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue("THANH TIEN"); 
            for (int i = 0; i < jtbChiTietDonHangBan.getRowCount(); i++){
                row = excelSheet.createRow((short) 4 + i);
                row.setHeight((short) 400);
                for (int j = 0; j < jtbChiTietDonHangBan.getColumnCount(); j++){
                    row.createCell(j).setCellValue(jtbChiTietDonHangBan.getValueAt(i, j).toString());
                }
            }          
            FileOutputStream excelFOS;
            BufferedOutputStream excelBOS;
            try{
                excelFOS = new FileOutputStream(new File(file.getSelectedFile() + ".xls"));
                excelBOS = new BufferedOutputStream(excelFOS);
                excelWorkbook.write(excelBOS);
                JOptionPane.showMessageDialog(null, "Xuất file excel thành công!");
                excelBOS.close();
                excelWorkbook.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfidNhanVienLap = new javax.swing.JTextField();
        jtfidKhachHang = new javax.swing.JTextField();
        jtfidTrangThai = new javax.swing.JTextField();
        jtfTongTien = new javax.swing.JTextField();
        jtfTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jdtNgayLap = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        btnExcel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDonHangBan = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtfidDonHangBan = new javax.swing.JTextField();
        jtfidSanPham = new javax.swing.JTextField();
        jtfSoLuong = new javax.swing.JTextField();
        jtfDonGia = new javax.swing.JTextField();
        jtfThanhTien = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbChiTietDonHangBan = new javax.swing.JTable();
        btnThemChiTiet = new javax.swing.JButton();
        btnXoaChiTiet = new javax.swing.JButton();
        btnCapNhatChiTiet = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("id nhân viên lập");

        jLabel3.setText("id khách hàng");

        jLabel4.setText("id trạng thái");

        jLabel5.setText("Ngày lập");

        jLabel6.setText("Tổng tiền");

        jtfidNhanVienLap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfidNhanVienLapActionPerformed(evt);
            }
        });

        jtfidKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfidKhachHangActionPerformed(evt);
            }
        });

        jtfidTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfidTrangThaiActionPerformed(evt);
            }
        });

        jtfTongTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTongTienActionPerformed(evt);
            }
        });

        jtfTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTimKiemActionPerformed(evt);
            }
        });
        jtfTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfTimKiemKeyReleased(evt);
            }
        });

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnCapNhat.setText("Cập nhật");
        btnCapNhat.setActionCommand("jButton2");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jLabel12.setText("Đơn hàng bán");

        btnExcel.setText("jButton1");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfidTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfidNhanVienLap, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(jdtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfidKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLuu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnCapNhat)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnXoa))
                                    .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTimKiem)))))
                .addGap(187, 187, 187))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfTongTien)
                .addGap(18, 18, 18)
                .addComponent(btnExcel)
                .addGap(227, 227, 227))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtfidNhanVienLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jtfidKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnTimKiem))
                            .addGap(32, 32, 32))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLuu)
                            .addComponent(btnXoa)
                            .addComponent(btnCapNhat))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfidTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdtNgayLap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcel))
                .addContainerGap())
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtbDonHangBan.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbDonHangBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbDonHangBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbDonHangBan);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Chi Tiết Đơn Hàng");

        jLabel7.setText("id đơn hàng");

        jLabel8.setText("id sản phẩm");

        jLabel9.setText("Số lượng");

        jLabel10.setText("Đơn giá ");

        jLabel11.setText("Thành tiền");

        jtfidDonHangBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfidDonHangBanActionPerformed(evt);
            }
        });

        jtfidSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfidSanPhamActionPerformed(evt);
            }
        });

        jtfSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSoLuongActionPerformed(evt);
            }
        });

        jtfDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDonGiaActionPerformed(evt);
            }
        });

        jtfThanhTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfThanhTienActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtbChiTietDonHangBan.setModel(new javax.swing.table.DefaultTableModel(
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
        jtbChiTietDonHangBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbChiTietDonHangBanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtbChiTietDonHangBan);

        btnThemChiTiet.setText("Thêm");
        btnThemChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemChiTietActionPerformed(evt);
            }
        });

        btnXoaChiTiet.setText("Xóa");
        btnXoaChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaChiTietActionPerformed(evt);
            }
        });

        btnCapNhatChiTiet.setText("Cập nhật");
        btnCapNhatChiTiet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatChiTietActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel13.setText("table sản phẩm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 349, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 166, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 167, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfidDonHangBan, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jtfDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfidSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtfThanhTien)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfSoLuong))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnThemChiTiet)
                                .addGap(15, 15, 15)
                                .addComponent(btnXoaChiTiet)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCapNhatChiTiet))))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfidDonHangBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfidSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jtfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThemChiTiet)
                        .addComponent(btnXoaChiTiet)
                        .addComponent(btnCapNhatChiTiet)
                        .addComponent(jtfDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(jtfThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//    private boolean Email(){
//          String Email;
//          Email = jtfEmailNhanvien.getText();
//          String check = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
//          if(!Email.matches(check)){
//             return false;
//          }else{
//            return true;
//          }
//          
//      }
    
    private void jtfidNhanVienLapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfidNhanVienLapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfidNhanVienLapActionPerformed

    private void jtfidKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfidKhachHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfidKhachHangActionPerformed

    private void jtfidTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfidTrangThaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfidTrangThaiActionPerformed

    private void jtfTongTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTongTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTongTienActionPerformed

    private void jtfTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        // TODO add your handling code here:
        try {
            DonHangBanBUS donHangBUS = new DonHangBanBUS();
            List<DonHangBan> list = donHangBUS.findDonHangBan(jtfTimKiem.getText());

            if(list.isEmpty()){
                JOptionPane.showMessageDialog(this,"Đơn hàng bán không tồn tại" , "Cảnh báo", JOptionPane.ERROR_MESSAGE);
            }
            else{
                for(DonHangBan dh : list){
                    jtfidNhanVienLap.setText(String.valueOf(dh.getIdNhanVienLap()));
                    jtfidKhachHang.setText(String.valueOf(dh.getIdKhachHang()));
                    jtfidTrangThai.setText(String.valueOf(dh.getIdTrangThai()));
                    jdtNgayLap.setDate(dh.getNgayLap());
                    jtfTongTien.setText(String.valueOf(dh.getTongTien()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Đơn hàng bán không tồn tại" , "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        DonHangBan donHang = new DonHangBan();
        try {
            if(jtfidKhachHang.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Nhập lại");
                return;
            }
            
            donHang = this.donHangUpdate;
            donHang.setIdNhanVienLap(Integer.parseInt(jtfidNhanVienLap.getText()));
            donHang.setIdKhachHang(Integer.parseInt(jtfidKhachHang.getText()));
            donHang.setIdTrangThai(Integer.parseInt(jtfidTrangThai.getText()));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String finddate =  sdf.format(jdtNgayLap.getDate());
            donHang.setNgayLap( Date.valueOf(finddate));
            donHang.setTongTien(Float.parseFloat(jtfTongTien.getText()));

            if(JOptionPane.showConfirmDialog(this, "Bạn có muốn Update không?", "Hỏi"
                , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION){
            return;
        }
        DonHangBanBUS donHangBUS = new DonHangBanBUS();
        if(donHangBUS.updateDonHangBan(donHang)>0){
            JOptionPane.showMessageDialog(null, "Update thành công");
            jtfidNhanVienLap.setText("");
            jtfidKhachHang.setText("");
            jtfidTrangThai.setText("");
            jdtNgayLap.cleanup();
            jtfTongTien.setText("");
            loadData();
        }
        else{
            JOptionPane.showMessageDialog(null, "Update thất bại");
        }
        } catch (Exception e) {
            Logger.getLogger(DonHangBanJFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try {
            if(JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Hỏi"
                , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION){
            return;
        }
        DonHangBanBUS donHangBUS = new DonHangBanBUS();
        if(donHangBUS.deleteDonHangBan(donHangDelete)){
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            loadData();
        }
        else{
            JOptionPane.showMessageDialog(null, "Xóa thất bại");
        }
        } catch (Exception e) {
            Logger.getLogger(DonHangBanJFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        DonHangBan donHang = new DonHangBan();
        if(jtfidNhanVienLap.getText().isBlank()|| jtfidKhachHang.getText().isBlank() || jdtNgayLap.getDate()== null
            || jtfidTrangThai.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Không được điền thiếu thông tin nhân viên");
            return;
        }
        try {
            if(jtfidTrangThai.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "nhập lại");
                return;
            }
            donHang.setID(donhangbanid);
            donHang.setIdNhanVienLap(Integer.parseInt(jtfidNhanVienLap.getText()));
            donHang.setIdKhachHang(Integer.parseInt(jtfidKhachHang.getText()));
            donHang.setIdTrangThai(Integer.parseInt(jtfidTrangThai.getText()));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String finddate =  sdf.format(jdtNgayLap.getDate()).toString();
            donHang.setNgayLap( Date.valueOf(finddate));
            donHang.setTongTien(Float.parseFloat(jtfTongTien.getText()));
            DonHangBanBUS donHangBUS = new DonHangBanBUS();
            if(donHangBUS.saveDonHangBan(donHang) > 0){
                JOptionPane.showMessageDialog(this, "Thêm đơn hàng bán thành công");
                jtfidNhanVienLap.setText("");
                jtfidKhachHang.setText("");
                jtfidTrangThai.setText("");
                jdtNgayLap.cleanup();
                jtfTongTien.setText("");
                loadData();
            }
            else{
                JOptionPane.showMessageDialog(this, "Thêm đơn hàng bán thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Thêm đơn hàng bán thất bại");
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void jtbDonHangBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbDonHangBanMouseClicked
        // TODO add your handling code here:
        try {
            int row = jtbDonHangBan.getSelectedRow();
            if(row >= 0){
                int id = (Integer) jtbDonHangBan.getValueAt(row, 0);
                DonHangBanBUS donHangBUS = new DonHangBanBUS();
                DonHangBan dh = donHangBUS.getDonHangBan(id);
                donHangUpdate = this.donHangBUS.getDonHangBan(id);
                donHangDelete = this.donHangBUS.getDonHangBan(id);
                if(dh != null){
                    jtfidNhanVienLap.setText(String.valueOf(dh.getIdNhanVienLap()));
                    jtfidKhachHang.setText(String.valueOf(dh.getIdKhachHang()));
                    jtfidTrangThai.setText(String.valueOf(dh.getIdTrangThai()));
                    jdtNgayLap.setDate(dh.getNgayLap());
                    jtfTongTien.setText(String.valueOf(dh.getTongTien()));
                    //jtbChiTietDonHangBanmodel.getColumnClass(ICONIFIED);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtbDonHangBanMouseClicked

    private void jtfTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTimKiemKeyReleased
        // TODO add your handling code here:
        try {
            DonHangBanBUS donHangBUS = new DonHangBanBUS();
            List<DonHangBan> list = donHangBUS.findDonHangBan(jtfTimKiem.getText());
            initTable();
            for(DonHangBan donHang : list){
                jtbDonHangBanmodel.addRow(new Object[]{
                    donHang.getID(),donHang.getIdNhanVienLap(),donHang.getIdKhachHang(),donHang.getIdTrangThai(),donHang.getNgayLap(),
                    donHang.getTongTien()
                });
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,"Đơn hàng bán không tồn tại" , "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtfTimKiemKeyReleased

    private void jtfidDonHangBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfidDonHangBanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfidDonHangBanActionPerformed

    private void jtfDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDonGiaActionPerformed

    private void jtfThanhTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfThanhTienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfThanhTienActionPerformed

    private void jtbChiTietDonHangBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbChiTietDonHangBanMouseClicked
        // TODO add your handling code here:
        try {
            int row = jtbChiTietDonHangBan.getSelectedRow();
            if(row >= 0){
                int id = (Integer) jtbChiTietDonHangBan.getValueAt(row, 0);
                ChiTietDonHangBanBUS chiTietBUS = new ChiTietDonHangBanBUS();
                ChiTietDonHangBan dh = chiTietBUS.getChiTietDonHangBan(id);
                chiTietUpdate = this.chiTietBUS.getChiTietDonHangBan(id);
                chiTietDelete = this.chiTietBUS.getChiTietDonHangBan(id);
                if(dh != null){
                    jtfidDonHangBan.setText(String.valueOf(dh.getIdDonHangBan()));
                    jtfidSanPham.setText(String.valueOf(dh.getIdSanPham()));
                    jtfSoLuong.setText(String.valueOf(dh.getSoLuong()));
                    jtfDonGia.setText(String.valueOf(dh.getDonGiaApDung()));
                    jtfThanhTien.setText(String.valueOf(dh.getThanhTien()));
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jtbChiTietDonHangBanMouseClicked

    private void btnThemChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemChiTietActionPerformed
        // TODO add your handling code here:
        ChiTietDonHangBan chiTiet = new ChiTietDonHangBan();
        if(jtfidDonHangBan.getText().isBlank()|| jtfidSanPham.getText().isBlank()|| jtfSoLuong.getText().isBlank()
            || jtfDonGia.getText().isBlank() || jtfThanhTien.getText().isBlank()){
            JOptionPane.showMessageDialog(this, "Không được điền thiếu thông tin chi tiết hóa đơn");
            return;
        }
        try {
            if(jtfidDonHangBan.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "nhập lại");
                return;
            }
            chiTiet.setId(chitietdonhangbanid);
            chiTiet.setIdDonHangBan(Integer.parseInt(jtfidDonHangBan.getText()));
            chiTiet.setIdSanPham(Integer.parseInt(jtfidSanPham.getText()));
            chiTiet.setSoLuong(Integer.parseInt(jtfSoLuong.getText()));
            chiTiet.setDonGiaApDung(Float.parseFloat(jtfDonGia.getText()));
            chiTiet.setThanhTien(Float.parseFloat(jtfThanhTien.getText()));
            ChiTietDonHangBanBUS chiTietBUS = new ChiTietDonHangBanBUS();
            if(chiTietBUS.saveChiTietDonHangBan(chiTiet) > 0){
                JOptionPane.showMessageDialog(this, "Thêm chi tiết thành công");
                jtfidDonHangBan.setText("");
                jtfidSanPham.setText("");
                jtfSoLuong.setText("");
                jtfDonGia.setText("");
                jtfThanhTien.setText("");
                loadData();
            }
            else{
                JOptionPane.showMessageDialog(this, "Thêm chi tiết thất bại");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Thêm chi tiết thất bại");
        }
    }//GEN-LAST:event_btnThemChiTietActionPerformed

    private void jtfidSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfidSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfidSanPhamActionPerformed

    private void jtfSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSoLuongActionPerformed

    private void btnCapNhatChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatChiTietActionPerformed
        // TODO add your handling code here:
        ChiTietDonHangBan chiTiet = new ChiTietDonHangBan();
        try {
            if(jtfidDonHangBan.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Nhập lại");
                return;
            }
            
            chiTiet = this.chiTietUpdate;
            chiTiet.setIdDonHangBan(Integer.parseInt(jtfidDonHangBan.getText()));
            chiTiet.setIdSanPham(Integer.parseInt(jtfidSanPham.getText()));
            chiTiet.setSoLuong(Integer.parseInt(jtfSoLuong.getText()));
            chiTiet.setDonGiaApDung(Double.parseDouble(jtfDonGia.getText()));
            chiTiet.setThanhTien(Double.parseDouble(jtfThanhTien.getText()));

            if(JOptionPane.showConfirmDialog(this, "Bạn có muốn Update không?", "Hỏi"
                , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION){
            return;
        }
        ChiTietDonHangBanBUS chiTietBUS = new ChiTietDonHangBanBUS();
        if(chiTietBUS.updateChiTietDonHangBan(chiTiet)>0){
            JOptionPane.showMessageDialog(null, "Update thành công");
            jtfidDonHangBan.setText("");
            jtfidSanPham.setText("");
            jtfSoLuong.setText("");
            jtfDonGia.setText("");
            jtfThanhTien.setText("");
            loadData();
        }
        else{
            JOptionPane.showMessageDialog(null, "Update thất bại");
        }
        } catch (Exception e) {
            Logger.getLogger(DonHangBanJFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnCapNhatChiTietActionPerformed

    private void btnXoaChiTietActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaChiTietActionPerformed
        // TODO add your handling code here:
        try {
            if(JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa không?", "Hỏi"
                , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.NO_OPTION){
            return;
        }
        ChiTietDonHangBanBUS chiTietBUS = new ChiTietDonHangBanBUS();
        if(chiTietBUS.deleteChiTietDonHangBan(chiTietDelete)){
            JOptionPane.showMessageDialog(null, "Xóa thành công");
            loadData();
        }
        else{
            JOptionPane.showMessageDialog(null, "Xóa thất bại");
        }
        } catch (Exception e) {
            Logger.getLogger(DonHangBanJFrame.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btnXoaChiTietActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        XuatExcel();
    }//GEN-LAST:event_btnExcelActionPerformed

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
            java.util.logging.Logger.getLogger(DonHangBanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonHangBanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonHangBanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonHangBanJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DonHangBanJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnCapNhatChiTiet;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThemChiTiet;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoaChiTiet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser jdtNgayLap;
    private javax.swing.JTable jtbChiTietDonHangBan;
    private javax.swing.JTable jtbDonHangBan;
    private javax.swing.JTextField jtfDonGia;
    private javax.swing.JTextField jtfSoLuong;
    private javax.swing.JTextField jtfThanhTien;
    private javax.swing.JTextField jtfTimKiem;
    private javax.swing.JTextField jtfTongTien;
    private javax.swing.JTextField jtfidDonHangBan;
    private javax.swing.JTextField jtfidKhachHang;
    private javax.swing.JTextField jtfidNhanVienLap;
    private javax.swing.JTextField jtfidSanPham;
    private javax.swing.JTextField jtfidTrangThai;
    // End of variables declaration//GEN-END:variables
}
