/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tranconghung
 */
public class NhanVienBUS {
    NhanVienDAO nhanVienDAO;
    public  NhanVienBUS(){
        nhanVienDAO = new NhanVienDAO();
    }
    public List LoadNhanVien(int page) throws SQLException{
        int numfrecords = 100;
        ArrayList list = nhanVienDAO.readNhanVien();
        int size = list.size();
        int from, to;
        from = (page - 1) * numfrecords;
        to = page * numfrecords;
        
        return list.subList(from, Math.min(to,size));
    }
    public NhanVien getNhanVien(int ID) throws SQLException{
        NhanVien nhanVien = nhanVienDAO.getNhanVien(ID);
        return nhanVien;
    }
}
