/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.NhacungcapDTO;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Tan Thuan
 */
public class NhacungcapDAO {
    DB_ConnectionDAO conn=new DB_ConnectionDAO();
    // lấy data 
    public ArrayList<NhacungcapDTO> readNhacungcapDAO() {
        ArrayList<NhacungcapDTO> list = new ArrayList<>();
        try {
            String sSQL="SELECT tbl_nhacungcap.id_nhacungcap,tbl_nhacungcap.ten_ncc,tbl_nhacungcap.diachi_ncc,tbl_nhacungcap.std_ncc"
                     + "from tbl_nhacungcap";
                   
            ResultSet rs=conn.sqlQuery(sSQL);
            if(rs!=null){
                while(rs.next()){
                   NhacungcapDTO nccDTO = new NhacungcapDTO();
               
                   nccDTO.setIdNhacungcapDTO(rs.getInt("id_nhacungcap"));
               
                   nccDTO.setTenNhacungcapDTO(rs.getString("ten_ncc"));
                   nccDTO.setDiachiNhacungcapDTO(rs.getString("diachi_ncc"));
                   nccDTO.setSdtNhacungcapDTO(rs.getInt("std_ncc"));
                    
                  list.add(nccDTO);
                } 
                conn.closeConnection();
            }
                   
        } 
            catch (Exception e) {
                
                }
        
        
          return list;
        
    }
    // thêm sản phẩm
     public boolean AddNhacungcapDAO(NhacungcapDTO nccDTO){
        
            String sSQL="INSERT INTO `tbl_nhacungcap` (`id_nhacungcap`, `ten_ncc`, `diachi_ncc`,`std_ncc`) "
                    + "VALUES ('"+nccDTO.getIdNhacungcapDTO()+"','"+nccDTO.getTenNhacungcapDTO()
                    +"','"+nccDTO.getDiachiNhacungcapDTO()+"','"+nccDTO.getSdtNhacungcapDTO()+"'";
                
                    
            boolean result=conn.sqlUpdate(sSQL);
            conn.closeConnection();
            return result;
            
       
        
    }
     
     // sũa sản phẩm
      public boolean editNhacungcapDAO(NhacungcapDTO nccDTO){
        
            String sSQL="UPDATE `tbl_sanpham` SET"
                    +"`ten_ncc`='"+nccDTO.getTenNhacungcapDTO()+"',"
                    +"`diachi_ncc`='"+nccDTO.getDiachiNhacungcapDTO()+"',"
                    +"`sdt_ncc`='"+nccDTO.getSdtNhacungcapDTO()+"',"
                    
                    + "WHERE `id_nhacungcap`= "+nccDTO.getIdNhacungcapDTO();
                    
                    
                    
            boolean result=conn.sqlUpdate(sSQL);
            conn.closeConnection();
            return result;
            
     
   }
    //xóa sản phẩm
  public boolean deleteNhacungcapDAO(NhacungcapDTO nccDTO){
        
            String sSQL="DELETE FROM `tbl_nhacungcap` WHERE tbl_nhacungcap.id_nhacungcap = '"+nccDTO.getIdNhacungcapDTO()+"'";
                    
                    
            boolean result=conn.sqlUpdate(sSQL);
            conn.closeConnection();
            return result;
            }
    
}
