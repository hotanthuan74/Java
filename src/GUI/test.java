/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.DangnhapBUS;
import DAO.DB_ConnectionDAO;
import DAO.DangnhapDAO;
import DTO.DangnhapDTO;

/**
 *
 * @author Tan Thuan
 */
public class test {
    public static void main(String[] args) {
        DB_ConnectionDAO conn=new DB_ConnectionDAO();
        DangnhapBUS dnBUS=new DangnhapBUS();
        DangnhapDAO dangnhapDAO=new DangnhapDAO();
//        DangnhapDTO dnDTO=new DangnhapDTO();
//        System.out.println(dangnhapDAO.checkAccount("admin","admin"));
//        if(dangnhapDAO.checkAccount("admin","admin")==true){
//            System.out.println(dnDTO.getMatkhauDangnhapDTO());
//        }
//       DangnhapDTO dnDTO=dnBUS.getTaiKhoan("admin","admin");
//       if(dnDTO!=null){
//           if(dnDTO.getChucvunvDTO().getChucvuNhanvien().equals("nv")){
//               System.out.println("Tui la nv");
//           }
//           else{
//               System.out.println("Tui la sep");
//           }
//       }
//    }
    
    } 
}
