/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.mysql.cj.xdevapi.Result;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.crypto.Data;

/**
 *
 * @author tranconghung
 */
public class NhanVienDAO extends MyDatabaseManager{
    public NhanVienDAO(){
        NhanVienDAO.connectDB();
    }
    public void listNhanVien() throws SQLException{
        String sql = "select * from nhanvien";
        ResultSet rs = NhanVienDAO.doReadQuery(sql);
        if(rs != null){
            int i = 1;
            System.out.println("TT \t ID \t TenNhanVien \t\t GioiTinh\t NgaySinh \t SoDienThoai \t Email \t DiaChi");
            while (rs.next()) {
                 System.out.print(i + "\t" + rs.getInt("ID"));
                System.out.println("\t\t" + rs.getString("TenNhanVien")
                        + "\t\t\t" + rs.getString("GioiTinh")
                        + "\t\t\t" + rs.getString("NgaySinh")
                        + "\t\t\t" + rs.getString("SoDienThoai")
                        + "\t\t\t" + rs.getString("Email")
                        + "\t\t\t" + rs.getString("DiaChi"));
                i++;
            }
        }
    }
    public ArrayList readNhanVien() throws SQLException{
        String sql = "select * from nhanvien where ID > 0";
        ResultSet rs = NhanVienDAO.doReadQuery(sql);
        ArrayList arrayList = new ArrayList();
        if(rs != null){
            int i = 1;
            while (rs.next()) {
                NhanVien nhanVien = new NhanVien();
                nhanVien.setID(rs.getInt("ID"));
                nhanVien.setTenNhanVien(rs.getString("TenNhanVien"));
                nhanVien.setGioiTinh(rs.getString("GioiTinh"));
                nhanVien.setNgaySinh((Date) rs.getDate("NgaySinh"));
                nhanVien.setSoDienThoai(rs.getString("SoDienThoai"));
                nhanVien.setEmail(rs.getString("Email"));
                nhanVien.setDiaChi(rs.getString("DiaChi"));
                arrayList.add(nhanVien);
            }
        }
        return  arrayList;
    }
    public NhanVien getNhanVien(int ID) throws SQLException{
        String sql = "select * from nhanvien where ID = ?";
        PreparedStatement p = NhanVienDAO.connectDB().prepareStatement(sql);
        p.setInt(1, ID);
        ResultSet rs  = p.executeQuery();
        
        NhanVien nhanVien = new NhanVien();
        if(rs != null){
            int i = 1;
            while(rs.next()){
                nhanVien.setID(rs.getInt("ID"));
                nhanVien.setTenNhanVien(rs.getString("TenNhanVien"));
                nhanVien.setGioiTinh(rs.getString("GioiTinh"));
                nhanVien.setNgaySinh(rs.getDate("NgaySinh"));
                nhanVien.setSoDienThoai(rs.getString("SoDienThoai"));
                nhanVien.setEmail(rs.getString("Email"));
                nhanVien.setDiaChi(rs.getString("DiaChi"));
            }
        }
        return nhanVien;
    }
    
    public static void main(String[] args) {
        NhanVienDAO nvdao = new NhanVienDAO();
        try {
            nvdao.listNhanVien();
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
