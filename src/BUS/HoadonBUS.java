/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.HoadonDAO;
import DTO.HoadonDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tan Thuan
 */
public class HoadonBUS {
    
    HoadonDAO hdDAO=new HoadonDAO();
    List<HoadonDTO> list;
    
    public boolean addHoadonBUS(HoadonDTO hdDTO){
           boolean rsesult=hdDAO.AddHoadonDAO(hdDTO);
           return rsesult;
    }
    
    public boolean XoaHoadonBUS(HoadonDTO hdDTO){
           boolean rsesult=hdDAO.DeleteHoadonDAO(hdDTO);
           return rsesult;
    }
    
    public boolean SuaHoadonBUS(HoadonDTO hdDTO){
           boolean rsesult=hdDAO.UpdateHoadonDAO(hdDTO);
           return rsesult;
    }
    
  
    public List<HoadonDTO> readBUSs(){
            list=new ArrayList<>();
            if(hdDAO.readHoadonDAO()!=null){
                list = hdDAO.readHoadonDAO();
            }
            
            return list;
            
       
    }
}
