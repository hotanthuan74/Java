/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Tan Thuan
 */
public class NhanvienDTO {
    private int idNhanvien;
    private String tenNhanvien;
    private  String hoNhanvien;
    private int sdtNhanvien;
    private int tuoiNhanvien;
    private String chucvuNhanvien;
    private double luongNhanvien;
    private String diaChiNhanvien;
    private String trangThaiNhanVien;

    public NhanvienDTO() {
    }

    public NhanvienDTO(int idNhanvien, String tenNhanvien, String hoNhanvien, int sdtNhanvien, int tuoiNhanvien, String chucvuNhanvien, double luongNhanvien, String diaChiNhanvien, String trangThaiNhanvien) {
        this.idNhanvien = idNhanvien;
        this.tenNhanvien = tenNhanvien;
        this.hoNhanvien = hoNhanvien;
        this.sdtNhanvien = sdtNhanvien;
        this.tuoiNhanvien = tuoiNhanvien;
        this.chucvuNhanvien = chucvuNhanvien;
        this.luongNhanvien = luongNhanvien;
        this.diaChiNhanvien = diaChiNhanvien;
        this.trangThaiNhanVien = trangThaiNhanvien;
    }

    public String getTrangThaiNhanVien() {
        return trangThaiNhanVien;
    }

    public void setTrangThaiNhanVien(String trangThaiNhanVien) {
        this.trangThaiNhanVien = trangThaiNhanVien;
    }

    public int getIdNhanvien() {
        return idNhanvien;
    }

    public void setIdNhanvien(int idNhanvien) {
        this.idNhanvien = idNhanvien;
    }

    public String getTenNhanvien() {
        return tenNhanvien;
    }

    public void setTenNhanvien(String tenNhanvien) {
        this.tenNhanvien = tenNhanvien;
    }

    public String getHoNhanvien() {
        return hoNhanvien;
    }

    public void setHoNhanvien(String hoNhanvien) {
        this.hoNhanvien = hoNhanvien;
    }

    public int getSdtNhanvien() {
        return sdtNhanvien;
    }

    public void setSdtNhanvien(int sdtNhanvien) {
        this.sdtNhanvien = sdtNhanvien;
    }

    public int getTuoiNhanvien() {
        return tuoiNhanvien;
    }

    public void setTuoiNhanvien(int tuoiNhanvien) {
        this.tuoiNhanvien = tuoiNhanvien;
    }

    public String getChucvuNhanvien() {
        return chucvuNhanvien;
    }

    public void setChucvuNhanvien(String chucvuNhanvien) {
        this.chucvuNhanvien = chucvuNhanvien;
    }

    public double getLuongNhanvien() {
        return luongNhanvien;
    }

    public void setLuongNhanvien(double luongNhanvien) {
        this.luongNhanvien = luongNhanvien;
    }

    public String getDiaChiNhanvien() {
        return diaChiNhanvien;
    }

    public void setDiaChiNhanvien(String diaChiNhanvien) {
        this.diaChiNhanvien = diaChiNhanvien;
    }
    
    
}
