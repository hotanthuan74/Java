/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.KhachhangDAO;
import DTO.KhachhangDTO;
import java.util.ArrayList;

/**
 *
 * @author Tan Thuan
 */
public class KhachhangBUS {
    public boolean themKH(KhachhangDTO kh){
        boolean result = new KhachhangDAO().themKh(kh);
        return result;
    }
    public boolean xoaKH(KhachhangDTO kh){
        boolean result = new KhachhangDAO().xoaKh(kh);
        return result;
    }
    public boolean suaKH(KhachhangDTO kh){
        boolean result = new KhachhangDAO().suaKh(kh);
        return result;
    }
    public ArrayList<KhachhangDTO> getList(){
        ArrayList<KhachhangDTO> list= new KhachhangDAO().getList();
        
        return list;
    }
}
