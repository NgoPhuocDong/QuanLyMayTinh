/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;
/**
 *
 * @author tranconghung
 */
public class Main extends javax.swing.JFrame {
    int btnClicked = 1;
    
    int mousepX;
    int mousepY;
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        TrangChu_GUI pnTrangChu = new TrangChu_GUI();
        showPanel(pnTrangChu);
        
    }
    private void showPanel(JPanel panelName){       
        pnMain.removeAll();
        pnMain.add(panelName);
        pnMain.validate();
    }
    
    private void btnColorHover(JButton btnName){
        btnName.setBackground(new Color(0,255,153));//Xanh la
    }
    
    private void btnColorOrigin(JButton btnName){
        btnName.setBackground(new Color(128,216,255)); //Xanh duong
    }
    
    private void btnClicked(){
        if (btnClicked == 1){
            btnColorHover(btnTrangChu);
            
            //btnColorOrigin(btnQuanLyNV);
            btnColorOrigin(btnQuanLyKH);
            btnColorOrigin(btnQuanLyNguonHang);
            btnColorOrigin(btnQuanLySP);
            btnColorOrigin(btnQuanLyDM);
            btnColorOrigin(btnQuanLyHD);
            btnColorOrigin(btnBienBanKiemKe);
            btnColorOrigin(btnThongKe);
            btnColorOrigin(btnNhanVien);
            btnColorOrigin(btnQuanLyPhieuNhap);
        }
        
        if (btnClicked == 3){
            btnColorHover(btnQuanLyKH);
            
            //btnColorOrigin(btnQuanLyNV);
            btnColorOrigin(btnTrangChu);
            btnColorOrigin(btnQuanLyNguonHang);
            btnColorOrigin(btnQuanLySP);
            btnColorOrigin(btnQuanLyDM);
            btnColorOrigin(btnQuanLyHD);
            btnColorOrigin(btnBienBanKiemKe);
            btnColorOrigin(btnThongKe);
            btnColorOrigin(btnNhanVien);
            btnColorOrigin(btnQuanLyPhieuNhap);
        }
        
        if (btnClicked == 4){
            btnColorHover(btnQuanLyNguonHang);
            
            //btnColorOrigin(btnQuanLyNV);
            btnColorOrigin(btnQuanLyKH);
            btnColorOrigin(btnTrangChu);
            btnColorOrigin(btnQuanLySP);
            btnColorOrigin(btnQuanLyDM);
            btnColorOrigin(btnQuanLyHD);
            btnColorOrigin(btnBienBanKiemKe);
            btnColorOrigin(btnThongKe);
            btnColorOrigin(btnNhanVien);     
            btnColorOrigin(btnQuanLyPhieuNhap);
        }
        
        if (btnClicked == 5){
            btnColorHover(btnQuanLySP);
            
            //btnColorOrigin(btnQuanLyNV);
            btnColorOrigin(btnQuanLyKH);
            btnColorOrigin(btnQuanLyNguonHang);
            btnColorOrigin(btnTrangChu);
            btnColorOrigin(btnQuanLyDM);
            btnColorOrigin(btnQuanLyHD);
            btnColorOrigin(btnBienBanKiemKe);
            btnColorOrigin(btnThongKe);
            btnColorOrigin(btnNhanVien);
            btnColorOrigin(btnQuanLyPhieuNhap);
        }
        
        if (btnClicked == 6){
            btnColorHover(btnQuanLyDM);
            
            //btnColorOrigin(btnQuanLyNV);
            btnColorOrigin(btnQuanLyKH);
            btnColorOrigin(btnQuanLyNguonHang);
            btnColorOrigin(btnQuanLySP);
            btnColorOrigin(btnTrangChu);
            btnColorOrigin(btnQuanLyHD);
            btnColorOrigin(btnBienBanKiemKe);
            btnColorOrigin(btnThongKe);
            btnColorOrigin(btnNhanVien);
            btnColorOrigin(btnQuanLyPhieuNhap);
        }
        
        if (btnClicked == 7){
            btnColorHover(btnQuanLyHD);
            
            //btnColorOrigin(btnQuanLyNV);
            btnColorOrigin(btnQuanLyKH);
            btnColorOrigin(btnQuanLyNguonHang);
            btnColorOrigin(btnQuanLySP);
            btnColorOrigin(btnQuanLyDM);
            btnColorOrigin(btnTrangChu);
            btnColorOrigin(btnBienBanKiemKe);
            btnColorOrigin(btnThongKe);
            btnColorOrigin(btnNhanVien);
            btnColorOrigin(btnQuanLyPhieuNhap);
        }
        
        if (btnClicked == 8){
            btnColorHover(btnBienBanKiemKe);
            
            //btnColorOrigin(btnQuanLyNV);
            btnColorOrigin(btnQuanLyKH);
            btnColorOrigin(btnQuanLyNguonHang);
            btnColorOrigin(btnQuanLySP);
            btnColorOrigin(btnQuanLyDM);
            btnColorOrigin(btnQuanLyHD);
            btnColorOrigin(btnTrangChu);
            btnColorOrigin(btnThongKe);
            btnColorOrigin(btnNhanVien);
            btnColorOrigin(btnQuanLyPhieuNhap);
        }
        if (btnClicked == 9){
            btnColorHover(btnThongKe);
            
            //btnColorOrigin(btnQuanLyNV);
            btnColorOrigin(btnQuanLyPhieuNhap);
            btnColorOrigin(btnQuanLyKH);
            btnColorOrigin(btnQuanLyNguonHang);
            btnColorOrigin(btnQuanLySP);
            btnColorOrigin(btnQuanLyDM);
            btnColorOrigin(btnQuanLyHD);
            btnColorOrigin(btnBienBanKiemKe);
            btnColorOrigin(btnNhanVien);
            btnColorOrigin(btnTrangChu);
        }
        if (btnClicked == 10){
            btnColorHover(btnQuanLyPhieuNhap);
            
            //btnColorOrigin(btnQuanLyNV);
            btnColorOrigin(btnQuanLyKH);
            btnColorOrigin(btnQuanLyNguonHang);
            btnColorOrigin(btnQuanLySP);
            btnColorOrigin(btnQuanLyDM);
            btnColorOrigin(btnQuanLyHD);
            btnColorOrigin(btnBienBanKiemKe);
            btnColorOrigin(btnTrangChu);
            btnColorOrigin(btnNhanVien);
            btnColorOrigin(btnThongKe);
        }
         if (btnClicked == 2){
            btnColorHover(btnNhanVien);
            
            btnColorOrigin(btnTrangChu);
            btnColorOrigin(btnQuanLyKH);
            btnColorOrigin(btnQuanLyNguonHang);
            btnColorOrigin(btnQuanLySP);
            btnColorOrigin(btnQuanLyDM);
            btnColorOrigin(btnQuanLyHD);
            btnColorOrigin(btnBienBanKiemKe);
            btnColorOrigin(btnThongKe);
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

        pnMenu = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        btnQuanLyKH = new javax.swing.JButton();
        btnQuanLyNguonHang = new javax.swing.JButton();
        btnQuanLySP = new javax.swing.JButton();
        btnQuanLyDM = new javax.swing.JButton();
        btnQuanLyHD = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnTrangChu = new javax.swing.JButton();
        btnBienBanKiemKe = new javax.swing.JButton();
        btnQuanLyPhieuNhap = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnMain = new javax.swing.JPanel();
        pnTitileBar = new javax.swing.JPanel();
        lbExit = new javax.swing.JLabel();
        lbMinimize = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbHoTenOnline = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnMenu.setBackground(new java.awt.Color(0, 204, 204));
        pnMenu.setPreferredSize(new java.awt.Dimension(280, 500));
        pnMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDangXuat.setBackground(new java.awt.Color(255, 204, 0));
        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setBorder(null);
        btnDangXuat.setBorderPainted(false);
        btnDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDangXuatMouseExited(evt);
            }
        });
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        pnMenu.add(btnDangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 620, 122, 35));

        btnQuanLyKH.setBackground(new java.awt.Color(128, 216, 255));
        btnQuanLyKH.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuanLyKH.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\icons8-user-groups-26.png"));
        btnQuanLyKH.setText("Quản lý khách hàng");
        btnQuanLyKH.setBorder(null);
        btnQuanLyKH.setBorderPainted(false);
        btnQuanLyKH.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyKHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLyKHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLyKHMouseExited(evt);
            }
        });
        btnQuanLyKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyKHActionPerformed(evt);
            }
        });
        pnMenu.add(btnQuanLyKH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 255, 39));

        btnQuanLyNguonHang.setBackground(new java.awt.Color(128, 216, 255));
        btnQuanLyNguonHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuanLyNguonHang.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\icons8-truck-26.png"));
        btnQuanLyNguonHang.setText("Quản lý nguồn hàng");
        btnQuanLyNguonHang.setBorder(null);
        btnQuanLyNguonHang.setBorderPainted(false);
        btnQuanLyNguonHang.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyNguonHang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnQuanLyNguonHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyNguonHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLyNguonHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLyNguonHangMouseExited(evt);
            }
        });
        btnQuanLyNguonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNguonHangActionPerformed(evt);
            }
        });
        pnMenu.add(btnQuanLyNguonHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 255, 39));

        btnQuanLySP.setBackground(new java.awt.Color(128, 216, 255));
        btnQuanLySP.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuanLySP.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\icons8-product-26.png"));
        btnQuanLySP.setText("Quản lý sản phẩm");
        btnQuanLySP.setBorder(null);
        btnQuanLySP.setBorderPainted(false);
        btnQuanLySP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLySPMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLySPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLySPMouseExited(evt);
            }
        });
        btnQuanLySP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLySPActionPerformed(evt);
            }
        });
        pnMenu.add(btnQuanLySP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 255, 39));

        btnQuanLyDM.setBackground(new java.awt.Color(128, 216, 255));
        btnQuanLyDM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuanLyDM.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\icons8-product-management-26.png"));
        btnQuanLyDM.setText("Quản lý danh mục");
        btnQuanLyDM.setBorder(null);
        btnQuanLyDM.setBorderPainted(false);
        btnQuanLyDM.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyDM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyDMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLyDMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLyDMMouseExited(evt);
            }
        });
        btnQuanLyDM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyDMActionPerformed(evt);
            }
        });
        pnMenu.add(btnQuanLyDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 255, 39));

        btnQuanLyHD.setBackground(new java.awt.Color(128, 216, 255));
        btnQuanLyHD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuanLyHD.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\icons8-receipt-26.png"));
        btnQuanLyHD.setText("Quản lý hóa đơn");
        btnQuanLyHD.setBorder(null);
        btnQuanLyHD.setBorderPainted(false);
        btnQuanLyHD.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyHDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLyHDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLyHDMouseExited(evt);
            }
        });
        btnQuanLyHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyHDActionPerformed(evt);
            }
        });
        pnMenu.add(btnQuanLyHD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 255, 39));

        btnThongKe.setBackground(new java.awt.Color(128, 216, 255));
        btnThongKe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThongKe.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\icons8-account-26.png"));
        btnThongKe.setText("Thống kê");
        btnThongKe.setBorder(null);
        btnThongKe.setBorderPainted(false);
        btnThongKe.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongKeMouseExited(evt);
            }
        });
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });
        pnMenu.add(btnThongKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 255, 39));
        pnMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));
        pnMenu.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 280, 10));

        btnTrangChu.setBackground(new java.awt.Color(128, 216, 255));
        btnTrangChu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTrangChu.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\icons8-home-26.png"));
        btnTrangChu.setText("Trang chủ");
        btnTrangChu.setBorder(null);
        btnTrangChu.setBorderPainted(false);
        btnTrangChu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnTrangChu.setInheritsPopupMenu(true);
        btnTrangChu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTrangChu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrangChuMouseExited(evt);
            }
        });
        btnTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });
        pnMenu.add(btnTrangChu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 255, 39));

        btnBienBanKiemKe.setBackground(new java.awt.Color(128, 216, 255));
        btnBienBanKiemKe.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBienBanKiemKe.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\icons8-receipt-20.png"));
        btnBienBanKiemKe.setText("Biên bản kiểm kê");
        btnBienBanKiemKe.setBorder(null);
        btnBienBanKiemKe.setBorderPainted(false);
        btnBienBanKiemKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBienBanKiemKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBienBanKiemKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBienBanKiemKeMouseExited(evt);
            }
        });
        btnBienBanKiemKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBienBanKiemKeActionPerformed(evt);
            }
        });
        pnMenu.add(btnBienBanKiemKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 255, 39));

        btnQuanLyPhieuNhap.setBackground(new java.awt.Color(128, 216, 255));
        btnQuanLyPhieuNhap.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuanLyPhieuNhap.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\icons8-database-import-24.png"));
        btnQuanLyPhieuNhap.setText("Quản lý phiếu nhập");
        btnQuanLyPhieuNhap.setBorder(null);
        btnQuanLyPhieuNhap.setBorderPainted(false);
        btnQuanLyPhieuNhap.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnQuanLyPhieuNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQuanLyPhieuNhapMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuanLyPhieuNhapMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuanLyPhieuNhapMouseExited(evt);
            }
        });
        btnQuanLyPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyPhieuNhapActionPerformed(evt);
            }
        });
        pnMenu.add(btnQuanLyPhieuNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 255, 39));

        btnNhanVien.setBackground(new java.awt.Color(128, 216, 255));
        btnNhanVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\icons8-change-user-30.png"));
        btnNhanVien.setText("Quản lý nhân viên");
        btnNhanVien.setBorder(null);
        btnNhanVien.setBorderPainted(false);
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseExited(evt);
            }
        });
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });
        pnMenu.add(btnNhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 255, 39));

        jLabel4.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir")+"\\src\\main\\java\\Image\\logo.png"));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pnMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 200));

        pnMain.setBackground(new java.awt.Color(255, 255, 255));
        pnMain.setMinimumSize(new java.awt.Dimension(983, 570));
        pnMain.setPreferredSize(new java.awt.Dimension(983, 570));

        pnTitileBar.setBackground(new java.awt.Color(102, 102, 102));
        pnTitileBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        pnTitileBar.setAlignmentX(0.0F);
        pnTitileBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnTitileBarMouseDragged(evt);
            }
        });
        pnTitileBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnTitileBarMousePressed(evt);
            }
        });

        lbExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbExitMouseClicked(evt);
            }
        });

        lbMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbMinimizeMouseClicked(evt);
            }
        });

        lbTitle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("COMPUTER STORE");
        lbTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbTitle.setMaximumSize(new java.awt.Dimension(20, 20));
        lbTitle.setMinimumSize(new java.awt.Dimension(20, 20));
        lbTitle.setPreferredSize(new java.awt.Dimension(20, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));

        lbHoTenOnline.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbHoTenOnline.setForeground(new java.awt.Color(255, 255, 255));
        lbHoTenOnline.setText("name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Manager -");

        javax.swing.GroupLayout pnTitileBarLayout = new javax.swing.GroupLayout(pnTitileBar);
        pnTitileBar.setLayout(pnTitileBarLayout);
        pnTitileBarLayout.setHorizontalGroup(
            pnTitileBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTitileBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHoTenOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(486, 486, 486)
                .addComponent(lbMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbExit)
                .addGap(18, 18, 18))
        );
        pnTitileBarLayout.setVerticalGroup(
            pnTitileBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitileBarLayout.createSequentialGroup()
                .addGroup(pnTitileBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbExit, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(lbMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbHoTenOnline, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnTitileBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnTitileBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitileBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseEntered
        btnDangXuat.setBackground(new Color(255,204,102)); //Cam nhat
    }//GEN-LAST:event_btnDangXuatMouseEntered

    private void btnDangXuatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangXuatMouseExited
        btnDangXuat.setBackground(new Color(255,204,0)); //Cam
    }//GEN-LAST:event_btnDangXuatMouseExited

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        DangNhap_GUI1 frmDangNhap = new DangNhap_GUI1();

        frmDangNhap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnQuanLyKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyKHMouseClicked
        btnClicked = 3;
        btnClicked();
    }//GEN-LAST:event_btnQuanLyKHMouseClicked

    private void btnQuanLyKHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyKHMouseEntered
        btnColorHover(btnQuanLyKH);
    }//GEN-LAST:event_btnQuanLyKHMouseEntered

    private void btnQuanLyKHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyKHMouseExited
        if (btnClicked != 3){
            btnColorOrigin(btnQuanLyKH);
        }
    }//GEN-LAST:event_btnQuanLyKHMouseExited

    private void btnQuanLyKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyKHActionPerformed
        QuanLyKhachHang_GUI pnQLKH = new QuanLyKhachHang_GUI();

        showPanel(pnQLKH);
    }//GEN-LAST:event_btnQuanLyKHActionPerformed

    private void btnQuanLyNguonHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyNguonHangMouseClicked
        btnClicked = 4;
        btnClicked();
    }//GEN-LAST:event_btnQuanLyNguonHangMouseClicked

    private void btnQuanLyNguonHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyNguonHangMouseEntered
        btnColorHover(btnQuanLyNguonHang);
    }//GEN-LAST:event_btnQuanLyNguonHangMouseEntered

    private void btnQuanLyNguonHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyNguonHangMouseExited
        if (btnClicked != 4){
            btnColorOrigin(btnQuanLyNguonHang);
        }
    }//GEN-LAST:event_btnQuanLyNguonHangMouseExited

    private void btnQuanLyNguonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNguonHangActionPerformed
        QuanLyNguonHang_GUI quanLyNguonHang_GUI = new QuanLyNguonHang_GUI();
        showPanel(quanLyNguonHang_GUI);
    }//GEN-LAST:event_btnQuanLyNguonHangActionPerformed

    private void btnQuanLySPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLySPMouseClicked
        btnClicked = 5;
        btnClicked();
    }//GEN-LAST:event_btnQuanLySPMouseClicked

    private void btnQuanLySPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLySPMouseEntered
        btnColorHover(btnQuanLySP);
    }//GEN-LAST:event_btnQuanLySPMouseEntered

    private void btnQuanLySPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLySPMouseExited
        if (btnClicked != 5){
            btnColorOrigin(btnQuanLySP);
        }
    }//GEN-LAST:event_btnQuanLySPMouseExited

    private void btnQuanLySPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLySPActionPerformed
        SanPhamJPanel spjp = new SanPhamJPanel();

        showPanel(spjp);
    }//GEN-LAST:event_btnQuanLySPActionPerformed

    private void btnQuanLyDMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyDMMouseClicked
        btnClicked = 6;
        btnClicked();
    }//GEN-LAST:event_btnQuanLyDMMouseClicked

    private void btnQuanLyDMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyDMMouseEntered
        btnColorHover(btnQuanLyDM);
    }//GEN-LAST:event_btnQuanLyDMMouseEntered

    private void btnQuanLyDMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyDMMouseExited
        if (btnClicked != 6){
            btnColorOrigin(btnQuanLyDM);
        }
    }//GEN-LAST:event_btnQuanLyDMMouseExited

    private void btnQuanLyDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyDMActionPerformed
//        QuanLyDanhMuc_GUI pnQLDM = new QuanLyDanhMuc_GUI();
//
//        showPanel(pnQLDM);
    }//GEN-LAST:event_btnQuanLyDMActionPerformed

    private void btnQuanLyHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyHDMouseClicked
        btnClicked = 7;
        btnClicked();
    }//GEN-LAST:event_btnQuanLyHDMouseClicked

    private void btnQuanLyHDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyHDMouseEntered
        btnColorHover(btnQuanLyHD);
    }//GEN-LAST:event_btnQuanLyHDMouseEntered

    private void btnQuanLyHDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyHDMouseExited
        if (btnClicked != 7){
            btnColorOrigin(btnQuanLyHD);
        }
    }//GEN-LAST:event_btnQuanLyHDMouseExited

    private void btnQuanLyHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyHDActionPerformed
        QuanLyHoaDon_GUI pnQLHD = new QuanLyHoaDon_GUI();

        showPanel(pnQLHD);
    }//GEN-LAST:event_btnQuanLyHDActionPerformed

    private void btnThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseClicked
        btnClicked = 9;
        btnClicked();
    }//GEN-LAST:event_btnThongKeMouseClicked

    private void btnThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseEntered
        btnColorHover(btnThongKe);
    }//GEN-LAST:event_btnThongKeMouseEntered

    private void btnThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseExited
        if (btnClicked != 9){
            btnColorOrigin(btnThongKe);
        }
    }//GEN-LAST:event_btnThongKeMouseExited

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        try {
            ThongKeJPanel thongKeJPanel = new ThongKeJPanel();
            showPanel(thongKeJPanel);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnTrangChuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseClicked
        btnClicked = 1;
        btnClicked();
    }//GEN-LAST:event_btnTrangChuMouseClicked

    private void btnTrangChuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseEntered
        btnColorHover(btnTrangChu);
        //btnTrangChu.setBackground(new Color(0,255,153)); //hover Xanh lá
    }//GEN-LAST:event_btnTrangChuMouseEntered

    private void btnTrangChuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrangChuMouseExited
        if (btnClicked != 1){
            btnColorOrigin(btnTrangChu);
        }
    }//GEN-LAST:event_btnTrangChuMouseExited

    private void btnTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrangChuActionPerformed
        TrangChu_GUI pnTrangChu = new TrangChu_GUI();

        showPanel(pnTrangChu);
            
    }//GEN-LAST:event_btnTrangChuActionPerformed

    private void btnBienBanKiemKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBienBanKiemKeMouseClicked
        btnClicked = 8;
        btnClicked();
    }//GEN-LAST:event_btnBienBanKiemKeMouseClicked

    private void btnBienBanKiemKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBienBanKiemKeMouseEntered
        btnColorHover(btnBienBanKiemKe);
    }//GEN-LAST:event_btnBienBanKiemKeMouseEntered

    private void btnBienBanKiemKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBienBanKiemKeMouseExited
        if (btnClicked != 8){
            btnColorOrigin(btnBienBanKiemKe);
        }
    }//GEN-LAST:event_btnBienBanKiemKeMouseExited

    private void btnBienBanKiemKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBienBanKiemKeActionPerformed
        BienBanKiemKeJPanel bienBanKiemKeJPanel = new BienBanKiemKeJPanel();

        showPanel(bienBanKiemKeJPanel);
    }//GEN-LAST:event_btnBienBanKiemKeActionPerformed

    private void btnQuanLyPhieuNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyPhieuNhapMouseClicked
        btnClicked = 10;
        btnClicked();
    }//GEN-LAST:event_btnQuanLyPhieuNhapMouseClicked

    private void btnQuanLyPhieuNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyPhieuNhapMouseEntered
        btnColorHover(btnQuanLyPhieuNhap);
    }//GEN-LAST:event_btnQuanLyPhieuNhapMouseEntered

    private void btnQuanLyPhieuNhapMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuanLyPhieuNhapMouseExited
        if (btnClicked != 10){
            btnColorOrigin(btnQuanLyPhieuNhap);
        }
    }//GEN-LAST:event_btnQuanLyPhieuNhapMouseExited

    private void btnQuanLyPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyPhieuNhapActionPerformed
//        QuanLyNhapHang_GUI pnQLNH = new QuanLyNhapHang_GUI();
//
//        showPanel(pnQLNH);
    }//GEN-LAST:event_btnQuanLyPhieuNhapActionPerformed

    private void lbExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lbExitMouseClicked

    private void lbMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lbMinimizeMouseClicked

    private void pnTitileBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTitileBarMouseDragged
        int toaDoX = evt.getXOnScreen();
        int toaDoY = evt.getYOnScreen();

        this.setLocation(toaDoX-mousepX, toaDoY-mousepY);
    }//GEN-LAST:event_pnTitileBarMouseDragged

    private void pnTitileBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnTitileBarMousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();
    }//GEN-LAST:event_pnTitileBarMousePressed

    private void btnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseClicked
        btnClicked = 2;
        btnClicked();
    }//GEN-LAST:event_btnNhanVienMouseClicked

    private void btnNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseEntered
        btnColorHover(btnNhanVien);
    }//GEN-LAST:event_btnNhanVienMouseEntered

    private void btnNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseExited
        if (btnClicked != 2){
            btnColorOrigin(btnNhanVien);
        }
    }//GEN-LAST:event_btnNhanVienMouseExited

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        NhanVienJPanel nhanVienJPanel = new NhanVienJPanel();
        showPanel(nhanVienJPanel);
    }//GEN-LAST:event_btnNhanVienActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBienBanKiemKe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnQuanLyDM;
    private javax.swing.JButton btnQuanLyHD;
    private javax.swing.JButton btnQuanLyKH;
    private javax.swing.JButton btnQuanLyNguonHang;
    private javax.swing.JButton btnQuanLyPhieuNhap;
    private javax.swing.JButton btnQuanLySP;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbExit;
    private javax.swing.JLabel lbHoTenOnline;
    private javax.swing.JLabel lbMinimize;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnTitileBar;
    // End of variables declaration//GEN-END:variables
}
