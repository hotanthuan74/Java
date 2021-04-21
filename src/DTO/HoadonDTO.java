/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Tan Thuan
 */
public class HoadonDTO {
     private int idHoadonDTO ;
    private NhanvienDTO idNhanvienDTO;
    private KhachhangDTO idKhachhangDTO ;
    private KhuyenmaiDTO idKhuyenmaiDTO ;
    private LocalDate ngaylapHoadonDTO;
    private LocalTime giolapHoadonDTO;
    private double tongHoadonDTO;

    public HoadonDTO() {
    }

    public HoadonDTO(int idHoadonDTO, NhanvienDTO idNhanvienDTO, KhachhangDTO idKhachhangDTO, KhuyenmaiDTO idKhuyenmaiDTO, LocalDate ngaylapHoadonDTO, LocalTime giolapHoadonDTO, double tongHoadonDTO) {
        this.idHoadonDTO = idHoadonDTO;
        this.idNhanvienDTO = idNhanvienDTO;
        this.idKhachhangDTO = idKhachhangDTO;
        this.idKhuyenmaiDTO = idKhuyenmaiDTO;
        this.ngaylapHoadonDTO = ngaylapHoadonDTO;
        this.giolapHoadonDTO = giolapHoadonDTO;
        this.tongHoadonDTO = tongHoadonDTO;
    }

    public int getIdHoadonDTO() {
        return idHoadonDTO;
    }

    public void setIdHoadonDTO(int idHoadonDTO) {
        this.idHoadonDTO = idHoadonDTO;
    }

    public NhanvienDTO getIdNhanvienDTO() {
        return idNhanvienDTO;
    }

    public void setIdNhanvienDTO(NhanvienDTO idNhanvienDTO) {
        this.idNhanvienDTO = idNhanvienDTO;
    }

    public KhachhangDTO getIdKhachhangDTO() {
        return idKhachhangDTO;
    }

    public void setIdKhachhangDTO(KhachhangDTO idKhachhangDTO) {
        this.idKhachhangDTO = idKhachhangDTO;
    }

    public KhuyenmaiDTO getIdKhuyenmaiDTO() {
        return idKhuyenmaiDTO;
    }

    public void setIdKhuyenmaiDTO(KhuyenmaiDTO idKhuyenmaiDTO) {
        this.idKhuyenmaiDTO = idKhuyenmaiDTO;
    }

    public LocalDate getNgaylapHoadonDTO() {
        return ngaylapHoadonDTO;
    }

    public void setNgaylapHoadonDTO(LocalDate ngaylapHoadonDTO) {
        this.ngaylapHoadonDTO = ngaylapHoadonDTO;
    }

    public LocalTime getGiolapHoadonDTO() {
        return giolapHoadonDTO;
    }

    public void setGiolapHoadonDTO(LocalTime giolapHoadonDTO) {
        this.giolapHoadonDTO = giolapHoadonDTO;
    }

    public double getTongHoadonDTO() {
        return tongHoadonDTO;
    }

    public void setTongHoadonDTO(double tongHoadonDTO) {
        this.tongHoadonDTO = tongHoadonDTO;
    }
    
    
    
}
