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
public class ChitietHoadonDTO {
    private int idHoadonDTO;
    private int idSanphamDTO;
    private int soluongDTO;
    private double dongiaDTO;

    public ChitietHoadonDTO() {
    }

    public ChitietHoadonDTO(int idHoadonDTO, int idSanphamDTO, int soluongDTO, double dongiaDTO) {
        this.idHoadonDTO = idHoadonDTO;
        this.idSanphamDTO = idSanphamDTO;
        this.soluongDTO = soluongDTO;
        this.dongiaDTO = dongiaDTO;
    }

    public int getIdHoadonDTO() {
        return idHoadonDTO;
    }

    public void setIdHoadonDTO(int idHoadonDTO) {
        this.idHoadonDTO = idHoadonDTO;
    }

    public int getIdSanphamDTO() {
        return idSanphamDTO;
    }

    public void setIdSanphamDTO(int idSanphamDTO) {
        this.idSanphamDTO = idSanphamDTO;
    }

    public int getSoluongDTO() {
        return soluongDTO;
    }

    public void setSoluongDTO(int soluongDTO) {
        this.soluongDTO = soluongDTO;
    }

    public double getDongiaDTO() {
        return dongiaDTO;
    }

    public void setDongiaDTO(double dongiaDTO) {
        this.dongiaDTO = dongiaDTO;
    }
    
    
}
