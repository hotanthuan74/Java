/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.DangnhapDAO;
import DTO.DangnhapDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tan Thuan
 */
public class DangnhapBUS {

    DangnhapDAO dnDAO = new DangnhapDAO();
    List<DangnhapDTO> list =new ArrayList<>();

    public List<DangnhapDTO> readBUSs() {
        
        if (dnDAO.readAccountDAO() != null) {
            list = dnDAO.readAccountDAO();
        }

        return list;

    }
//    public boolean getPhanquyen(){
//        for(DangnhapDTO dn:list){
//            if(dn.getChucvunvDTO().equals("Admin")){
//                return true;
//            }
//            
//        }
//        
//    }

//    public boolean chectAcountBUS(String tenDangnhap, String matkhau) {
//
//        try {
//            DangnhapDTO dnDTO=new DangnhapDTO();
//            if () {
//
//                System.out.println("Tìm thấy tài khoản thành công!");
//                return true;
//
//            }
//        } catch (Exception e) {
//            System.out.println("Tìm thấy tài khoản thất bại!");
//            return false;
//        }
//
//        return false;
//    }
     public DangnhapDTO getTaiKhoan(String tendn) {
        for (DangnhapDTO dnDTO : dnDAO.readAccountDAO()) {
            if (dnDTO.getTenDangnhapDTO().equals(tendn)) {
                return dnDTO;
            }
           
        }
        return null;
    }
//     public DangnhapDTO getMatkhau(String matkhau)
    
//    public int dangnhap(String tenDangnhap,String matkhau) {
//               
//          if(dnDAO.readAccountDAO()!=null){
//              if(dnDAO.checkAccount(tenDangnhap, matkhau)==true){
//                  System.out.println("co");
//                  if()
//              }
//              else if(dnDAO.checkAccount(tenDangnhap, matkhau)==false){
//                  System.out.println("ko");
//              }
//          }
//          return -1;
//               
//        
//                
//}

    public boolean addAccountBUS(DangnhapDTO dnDTO) {
        boolean rsesult = dnDAO.AddAccountDAO(dnDTO);
        return rsesult;
    }

}
