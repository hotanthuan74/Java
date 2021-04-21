/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.DangnhapBUS;
import DAO.NhanvienDAO;
import DTO.DangnhapDTO;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author E6540
 */
public class dangnhap extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public char s;

    public dangnhap() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        initComponents();
        s = txtMatkhau.getEchoChar();
        setSize(777, 447);
        setLocationRelativeTo(null);
        jPanel2.setBackground(new Color(0, 0, 0, 65));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnExit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtTendangnhap = new javax.swing.JTextField();
        btnDangnhap = new javax.swing.JButton();
        btnXoahet = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMatkhau = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbLoginError = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnExit.setText("X");
        btnExit.setContentAreaFilled(false);
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(730, 0, 50, 31);

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        txtTendangnhap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTendangnhapFocusGained(evt);
            }
        });
        txtTendangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTendangnhapActionPerformed(evt);
            }
        });
        txtTendangnhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTendangnhapKeyPressed(evt);
            }
        });

        btnDangnhap.setBackground(new Color(37,187,219)
        );
        btnDangnhap.setText("Đăng nhập");
        btnDangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangnhapActionPerformed(evt);
            }
        });

        btnXoahet.setText("Xóa hết");
        btnXoahet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoahet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoahetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Đăng nhập");

        txtMatkhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatkhauActionPerformed(evt);
            }
        });
        txtMatkhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatkhauKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mật khẩu");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tài khoản");

        lbLoginError.setForeground(new java.awt.Color(255, 255, 255));
        lbLoginError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jCheckBox1.setBackground(new Color(0,0,0,65));
        jCheckBox1.setBorder(null);
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseClicked(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtTendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLoginError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoahet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel3)
                .addGap(58, 58, 58)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTendangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMatkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangnhap, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoahet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(lbLoginError, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtTendangnhap.getAccessibleContext().setAccessibleName("txUser");

        getContentPane().add(jPanel2);
        jPanel2.setBounds(380, 50, 330, 340);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/framedesign/dangnhapImg.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 780, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtTendangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTendangnhapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTendangnhapActionPerformed

    private void txtTendangnhapFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTendangnhapFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTendangnhapFocusGained

    private void btnXoahetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoahetActionPerformed
        // TODO add your handling code here:
        txtTendangnhap.setText("");
        txtMatkhau.setText("");


    }//GEN-LAST:event_btnXoahetActionPerformed
    public int StoI(String s) {

        Pattern pattern = Pattern.compile("numFound=\"([0-9]+)\"");
        Matcher matcher = pattern.matcher("");

        return Integer.parseInt(matcher.group());

    }

    public boolean getModel() {
        if (txtTendangnhap.getText().isEmpty() || txtMatkhau.getText().isEmpty()) {

            return false;

        }
        return true;

    }
    private void btnDangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangnhapActionPerformed
        // TODO add your handling code here:
        String tenDn = txtTendangnhap.getText();
        String mkDn = new String(txtMatkhau.getPassword());
        DangnhapBUS dnBUS = new DangnhapBUS();
        DangnhapDTO dnDTO = dnBUS.getTaiKhoan(tenDn);

        if (getModel() == true) {
            if (dnDTO != null) {
                if (dnDTO.getMatkhauDangnhapDTO().equals(mkDn)) {
                    if (dnDTO.getChucvunvDTO().getChucvuNhanvien().equals("Admin")) {
                        JFHethong_admin admin = new JFHethong_admin();
                        admin.setVisible(true);
                        this.dispose();
                    } else if (dnDTO.getChucvunvDTO().getChucvuNhanvien().equals("nv")) {
                        JFHethong_Nhanvien nv = new JFHethong_Nhanvien();
                        nv.setVisible(true);
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Tên Đăng nhập hoặc Mật khẩu không đúng!");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Tên Đăng nhập hoặc Mật khẩu không đúng!");
            }
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập đầy đủ thông tin đăng nhập");
    }


    }//GEN-LAST:event_btnDangnhapActionPerformed

    private void txtMatkhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatkhauKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            btnDangnhap.doClick();
        }
    }//GEN-LAST:event_txtMatkhauKeyPressed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseClicked
        // TODO add your handling code here:

        if (jCheckBox1.isSelected()) {
            txtMatkhau.setEchoChar((char) 0);

        } else {
            txtMatkhau.setEchoChar(s);

        }
    }//GEN-LAST:event_jCheckBox1MouseClicked

    private void txtMatkhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatkhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatkhauActionPerformed

    private void txtTendangnhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTendangnhapKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            txtMatkhau.requestFocus();
        }
    }//GEN-LAST:event_txtTendangnhapKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(dangnhap

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dangnhap

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dangnhap

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dangnhap

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dangnhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangnhap;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnXoahet;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbLoginError;
    private javax.swing.JPasswordField txtMatkhau;
    private javax.swing.JTextField txtTendangnhap;
    // End of variables declaration//GEN-END:variables
}
