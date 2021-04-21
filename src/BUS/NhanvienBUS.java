/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;
import DAO.NhanvienDAO;
import DTO.NhanvienDTO;
import java.util.ArrayList;
/**
 *
 * @author Tan Thuan
 */
public class NhanvienBUS {
    public boolean themNV(NhanvienDTO nv){
        boolean result = new NhanvienDAO().themNV(nv);
        return result;
    }
    public boolean xoaNV(NhanvienDTO nv){
        boolean result = new NhanvienDAO().xoaNV(nv);
        return result;
    }
    public boolean suaNV(NhanvienDTO nv){
        boolean result = new NhanvienDAO().suaNV(nv);
        return result;
    }
    public ArrayList<NhanvienDTO> getList(){
        ArrayList<NhanvienDTO> listNV= new NhanvienDAO().getListNV();
        
        return listNV;
    }
}
