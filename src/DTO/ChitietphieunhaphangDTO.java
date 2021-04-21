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
public class ChitietphieunhaphangDTO {
    private PhieunhaphangDTO idPhieunhaphang;
    private SanphamDTO idSanphamDTO;
    private int soLuongnhapDTO;
    private double dongiaNhapDTO;
    private double tongTienNhapDTO;

    public ChitietphieunhaphangDTO() {
    }

    public ChitietphieunhaphangDTO(PhieunhaphangDTO idPhieunhaphang, SanphamDTO idSanphamDTO, int soLuongnhapDTO, double dongiaNhapDTO, double tongTienNhapDTO) {
        this.idPhieunhaphang = idPhieunhaphang;
        this.idSanphamDTO = idSanphamDTO;
        this.soLuongnhapDTO = soLuongnhapDTO;
        this.dongiaNhapDTO = dongiaNhapDTO;
        this.tongTienNhapDTO = tongTienNhapDTO;
    }

    public PhieunhaphangDTO getIdPhieunhaphang() {
        return idPhieunhaphang;
    }

    public void setIdPhieunhaphang(PhieunhaphangDTO idPhieunhaphang) {
        this.idPhieunhaphang = idPhieunhaphang;
    }

    public SanphamDTO getIdSanphamDTO() {
        return idSanphamDTO;
    }

    public void setIdSanphamDTO(SanphamDTO idSanphamDTO) {
        this.idSanphamDTO = idSanphamDTO;
    }

    public int getSoLuongnhapDTO() {
        return soLuongnhapDTO;
    }

    public void setSoLuongnhapDTO(int soLuongnhapDTO) {
        this.soLuongnhapDTO = soLuongnhapDTO;
    }

    public double getDongiaNhapDTO() {
        return dongiaNhapDTO;
    }

    public void setDongiaNhapDTO(double dongiaNhapDTO) {
        this.dongiaNhapDTO = dongiaNhapDTO;
    }

    public double getTongTienNhapDTO() {
        return tongTienNhapDTO;
    }

    public void setTongTienNhapDTO(double tongTienNhapDTO) {
        this.tongTienNhapDTO = tongTienNhapDTO;
    }
    
    
}
