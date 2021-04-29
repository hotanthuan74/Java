/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.SanphamDAO;
import DTO.SanphamDTO;
import java.util.ArrayList;

/**
 *
 * @author Tan Thuan
 */
public class SanphamBUS {
 
    
    public boolean themSP(SanphamDTO sp){
        boolean result = new SanphamDAO().addSanphamDAO(sp);
        return result;
    }
    public boolean xoaSP(SanphamDTO sp){
        boolean result = new SanphamDAO().deleteSanphamDAO(sp);
        return result;
    }
    public boolean suaSP(SanphamDTO sp){
        boolean result = new SanphamDAO().editSanphamDAO(sp);
        return result;
    }
    public ArrayList<SanphamDTO> getList(){
        ArrayList<SanphamDTO> listSP= new SanphamDAO().readSanphamDAO();
        
        return listSP;
    }
    
}
