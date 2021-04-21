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
public class KhachhangDTO {
    private int maKhachhang;
    private String tenKhachhang;
    private String hoKhachhang;
    private String diaChi;
    private int sdtKhachhang;
    private String emailKhachhang;

    public KhachhangDTO() {
    }

    public KhachhangDTO(int maKhachhang, String tenKhachhang, String hoKhachhang, String diaChi, int sdtKhachhang,String emailKhachhang) {
        this.maKhachhang = maKhachhang;
        this.tenKhachhang = tenKhachhang;
        this.hoKhachhang = hoKhachhang;
        this.diaChi = diaChi;
        this.sdtKhachhang = sdtKhachhang;
        this.emailKhachhang = emailKhachhang;
    }

    public int getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(int maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public String getEmailKhachhang() {
        return emailKhachhang;
    }

    public void setEmailKhachhang(String emailKhachhang) {
        this.emailKhachhang = emailKhachhang;
    }

    

   

    public String getTenKhachhang() {
        return tenKhachhang;
    }

    public void setTenKhachhang(String tenKhachhang) {
        this.tenKhachhang = tenKhachhang;
    }

    public String getHoKhachhang() {
        return hoKhachhang;
    }

    public void setHoKhachhang(String hoKhachhang) {
        this.hoKhachhang = hoKhachhang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSdtKhachhang() {
        return sdtKhachhang;
    }

    public void setSdtKhachhang(int sdtKhachhang) {
        this.sdtKhachhang = sdtKhachhang;
    }
    
    
}
