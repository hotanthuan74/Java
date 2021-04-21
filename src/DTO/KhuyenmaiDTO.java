/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Tan Thuan
 */
public class KhuyenmaiDTO {
    private int idKhuyenmaiDTO;
    private String tenKhuyenmaiDTO;
    private Date ngaybdKhuyenmaiDTO;
    private Date ngayktKhuyenmaiDTO;
    private double phantramKhuyenmaiDTO;
    private double dieukienKHuyemaiDTO;

    public KhuyenmaiDTO() {
    }

    public KhuyenmaiDTO(int idKhuyenmaiDTO, String tenKhuyenmaiDTO, Date ngaybdKhuyenmaiDTO, Date ngayktKhuyenmaiDTO, double phantramKhuyenmaiDTO, double dieukienKHuyemaiDTO) {
        this.idKhuyenmaiDTO = idKhuyenmaiDTO;
        this.tenKhuyenmaiDTO = tenKhuyenmaiDTO;
        this.ngaybdKhuyenmaiDTO = ngaybdKhuyenmaiDTO;
        this.ngayktKhuyenmaiDTO = ngayktKhuyenmaiDTO;
        this.phantramKhuyenmaiDTO = phantramKhuyenmaiDTO;
        this.dieukienKHuyemaiDTO = dieukienKHuyemaiDTO;
    }

    public int getIdKhuyenmaiDTO() {
        return idKhuyenmaiDTO;
    }

    public void setIdKhuyenmaiDTO(int idKhuyenmaiDTO) {
        this.idKhuyenmaiDTO = idKhuyenmaiDTO;
    }

    public String getTenKhuyenmaiDTO() {
        return tenKhuyenmaiDTO;
    }

    public void setTenKhuyenmaiDTO(String tenKhuyenmaiDTO) {
        this.tenKhuyenmaiDTO = tenKhuyenmaiDTO;
    }

    public Date getNgaybdKhuyenmaiDTO() {
        return ngaybdKhuyenmaiDTO;
    }

    public void setNgaybdKhuyenmaiDTO(Date ngaybdKhuyenmaiDTO) {
        this.ngaybdKhuyenmaiDTO = ngaybdKhuyenmaiDTO;
    }

    public Date getNgayktKhuyenmaiDTO() {
        return ngayktKhuyenmaiDTO;
    }

    public void setNgayktKhuyenmaiDTO(Date ngayktKhuyenmaiDTO) {
        this.ngayktKhuyenmaiDTO = ngayktKhuyenmaiDTO;
    }

    public double getPhantramKhuyenmaiDTO() {
        return phantramKhuyenmaiDTO;
    }

    public void setPhantramKhuyenmaiDTO(double phantramKhuyenmaiDTO) {
        this.phantramKhuyenmaiDTO = phantramKhuyenmaiDTO;
    }

    public double getDieukienKHuyemaiDTO() {
        return dieukienKHuyemaiDTO;
    }

    public void setDieukienKHuyemaiDTO(double dieukienKHuyemaiDTO) {
        this.dieukienKHuyemaiDTO = dieukienKHuyemaiDTO;
    }
    
    
    
}
