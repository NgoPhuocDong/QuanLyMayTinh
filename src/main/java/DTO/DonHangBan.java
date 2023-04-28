/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.sql.Date;
import javax.xml.crypto.Data;
/**
 *
 * @author VO THANH HOA
 */
public class DonHangBan {
    int id;
    int idNhanVienLap;
    int idKhachHang;
    int idTrangThai;
    Date ngayLap;
    float tongTien;

    public DonHangBan() {
    }

    public DonHangBan(int id, int idNhanVienLap, int idKhachHang, int idTrangThai, Date ngayLap, float tongTien) {
        this.id = id;
        this.idNhanVienLap = idNhanVienLap;
        this.idKhachHang = idKhachHang;
        this.idTrangThai = idTrangThai;
        this.ngayLap = ngayLap;
        this.tongTien = tongTien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdNhanVienLap() {
        return idNhanVienLap;
    }

    public void setIdNhanVienLap(int idNhanVien) {
        this.idNhanVienLap = idNhanVienLap;
    }

    public int getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(int idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public int getIdTrangThai() {
        return idTrangThai;
    }

    public void setIdTrangThai(int idTrangThai) {
        this.idTrangThai = idTrangThai;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

}
