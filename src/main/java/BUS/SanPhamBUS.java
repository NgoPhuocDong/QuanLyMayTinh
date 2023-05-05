/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DTO.SanPham;
import DTO.LoaiSanPham;
import DAO.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tranconghung
 */
public class SanPhamBUS {
    SanPhamDAO sanphamDAO;
    public  SanPhamBUS(){
        sanphamDAO = new SanPhamDAO();
    }
    public List LoadSanPham(int page) throws SQLException{
        int numfrecords = 100;
        ArrayList list = sanphamDAO.readSanPham();
        int size = list.size();
        int from, to;
        from = (page - 1) * numfrecords;
        to = page * numfrecords;
        
        return list.subList(from, Math.min(to,size));
    }
    public SanPham getSanPham(int ID) throws SQLException{
        SanPham sanPham = sanphamDAO.getSanPham(ID);
        return sanPham;
    }
    public int saveSanPham(SanPham sanPham) throws SQLException{
        int result = sanphamDAO.saveSanPham(sanPham);
        return result;
    }
    public int updateSanPham(SanPham sanPham) throws SQLException{
        int result = sanphamDAO.updateSanPham(sanPham);
        return result;
    }
    public boolean deleteSanPham(SanPham sanPham) throws SQLException {
        boolean result = sanphamDAO.deleteSanPham(sanPham);
        return result;
    }
    public List findSanPham(String TenSanPham) throws SQLException{
        List list = new ArrayList();
        list = sanphamDAO.findSanPham(TenSanPham);
        return list;
    }
}
