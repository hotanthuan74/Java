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
public class PhieunhaphangDTO {
    private int idPhieunhaphangDTO;
    private int idNhanvienDTO;
    private NhacungcapDTO idNhacungcapDTO;
    private Date ngayNhaphangDTO;
    private Date gionNhaphangDTO;
    private double tongTiennhaphangDTO;

    public PhieunhaphangDTO() {
    }

    public PhieunhaphangDTO(int idPhieunhaphangDTO, int idNhanvienDTO, NhacungcapDTO idNhacungcapDTO, Date ngayNhaphangDTO, Date gionNhaphangDTO, double tongTiennhaphangDTO) {
        this.idPhieunhaphangDTO = idPhieunhaphangDTO;
        this.idNhanvienDTO = idNhanvienDTO;
        this.idNhacungcapDTO = idNhacungcapDTO;
        this.ngayNhaphangDTO = ngayNhaphangDTO;
        this.gionNhaphangDTO = gionNhaphangDTO;
        this.tongTiennhaphangDTO = tongTiennhaphangDTO;
    }

    public int getIdPhieunhaphangDTO() {
        return idPhieunhaphangDTO;
    }

    public void setIdPhieunhaphangDTO(int idPhieunhaphangDTO) {
        this.idPhieunhaphangDTO = idPhieunhaphangDTO;
    }

    public int getIdNhanvienDTO() {
        return idNhanvienDTO;
    }

    public void setIdNhanvienDTO(int idNhanvienDTO) {
        this.idNhanvienDTO = idNhanvienDTO;
    }

    public NhacungcapDTO getIdNhacungcapDTO() {
        return idNhacungcapDTO;
    }

    public void setIdNhacungcapDTO(NhacungcapDTO idNhacungcapDTO) {
        this.idNhacungcapDTO = idNhacungcapDTO;
    }

    public Date getNgayNhaphangDTO() {
        return ngayNhaphangDTO;
    }

    public void setNgayNhaphangDTO(Date ngayNhaphangDTO) {
        this.ngayNhaphangDTO = ngayNhaphangDTO;
    }

    public Date getGionNhaphangDTO() {
        return gionNhaphangDTO;
    }

    public void setGionNhaphangDTO(Date gionNhaphangDTO) {
        this.gionNhaphangDTO = gionNhaphangDTO;
    }

    public double getTongTiennhaphangDTO() {
        return tongTiennhaphangDTO;
    }

    public void setTongTiennhaphangDTO(double tongTiennhaphangDTO) {
        this.tongTiennhaphangDTO = tongTiennhaphangDTO;
    }
    
    
}
