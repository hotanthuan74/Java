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
public class SanphamDTO {
    private int idSanphamDTO;
    private LoaisanphamDTO idLoaiSanphamDTO;
    private double giaSanphamDTO;
    private int soluongSanphamDTO;
    private String donvitinhSanphamDTO;

    public SanphamDTO() {
    }

    public SanphamDTO(int idSanphamDTO, LoaisanphamDTO idLoaiSanphamDTO, double giaSanphamDTO, int soluongSanphamDTO, String donvitinhSanphamDTO) {
        this.idSanphamDTO = idSanphamDTO;
        this.idLoaiSanphamDTO = idLoaiSanphamDTO;
        this.giaSanphamDTO = giaSanphamDTO;
        this.soluongSanphamDTO = soluongSanphamDTO;
        this.donvitinhSanphamDTO = donvitinhSanphamDTO;
    }

    public int getIdSanphamDTO() {
        return idSanphamDTO;
    }

    public void setIdSanphamDTO(int idSanphamDTO) {
        this.idSanphamDTO = idSanphamDTO;
    }

    public LoaisanphamDTO getIdLoaiSanphamDTO() {
        return idLoaiSanphamDTO;
    }

    public void setIdLoaiSanphamDTO(LoaisanphamDTO idLoaiSanphamDTO) {
        this.idLoaiSanphamDTO = idLoaiSanphamDTO;
    }

    public double getGiaSanphamDTO() {
        return giaSanphamDTO;
    }

    public void setGiaSanphamDTO(double giaSanphamDTO) {
        this.giaSanphamDTO = giaSanphamDTO;
    }

    public int getSoluongSanphamDTO() {
        return soluongSanphamDTO;
    }

    public void setSoluongSanphamDTO(int soluongSanphamDTO) {
        this.soluongSanphamDTO = soluongSanphamDTO;
    }

    public String getDonvitinhSanphamDTO() {
        return donvitinhSanphamDTO;
    }

    public void setDonvitinhSanphamDTO(String donvitinhSanphamDTO) {
        this.donvitinhSanphamDTO = donvitinhSanphamDTO;
    }
    
    
}
