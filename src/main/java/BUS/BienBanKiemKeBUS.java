/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DAO.*;
import DTO.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author tranconghung
 */
public class BienBanKiemKeBUS {
    BienBanKiemKeDAO bienBanKiemKeDAO;
    public BienBanKiemKeBUS(){
        bienBanKiemKeDAO = new BienBanKiemKeDAO();
    }
    public List LoadBienBanKiemKe(int page) throws SQLException{
        int numofrecords = 30;
        ArrayList list = bienBanKiemKeDAO.readBienBamKiemKe();
        int size = list.size();
        int from, to;
        from = (page - 1) * numofrecords;
        to = page * numofrecords;

        return list.subList(from, Math.min(to, size));
    }
    public BienBanKiemKe getBienBanKiemKe(int ID) throws SQLException{
        BienBanKiemKe bbkk = bienBanKiemKeDAO.getBienBanKiemKe(ID);
        return bbkk;
    }
    public int addBienBanKiemKe(BienBanKiemKe bbkk) throws SQLException{
        int result = bienBanKiemKeDAO.addBienBanKiemKe(bbkk);
        return result;
    }
}
