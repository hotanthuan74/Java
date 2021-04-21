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

     public DangnhapDTO getTaiKhoan(String tendn) {
        for (DangnhapDTO dnDTO : dnDAO.readAccountDAO()) {
            if (dnDTO.getTenDangnhapDTO().equals(tendn)) {
                return dnDTO;
            }
           
        }
        return null;
    }


    public boolean addAccountBUS(DangnhapDTO dnDTO) {
        boolean rsesult = dnDAO.AddAccountDAO(dnDTO);
        return rsesult;
    }

}
