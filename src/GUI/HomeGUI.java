/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.UserBUS;
import static GUI.LoginGUI.Username;
import java.awt.Color;
import static java.awt.Color.*;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Tit
 */
public class HomeGUI extends javax.swing.JFrame {

    /**
     * Creates new form FrMainForm
     */
    
    
    public HomeGUI() {
       
        initComponents();
        lbChao.setText("Xin chào "+Username+" !");
        jButton1.setIcon(new ImageIcon(new ImageIcon("src//images//students.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        jButton2.setIcon(new ImageIcon(new ImageIcon("src//images//teacher.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        jButton3.setIcon(new ImageIcon(new ImageIcon("src//images//student-grades.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        jButton4.setIcon(new ImageIcon(new ImageIcon("src//images//class.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        jButton5.setIcon(new ImageIcon(new ImageIcon("src//images//userMain.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        jButton6.setIcon(new ImageIcon(new ImageIcon("src//images//turn-off.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        jLabel1.setIcon(new ImageIcon(new ImageIcon("src//images//home.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        jButton7.setIcon(new ImageIcon(new ImageIcon("src//images//analytics.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        lbLogouot.setIcon(new ImageIcon(new ImageIcon("src//images//log-out.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        
        jPanel2.setBackground(new java.awt.Color(0, 0, 0, 0));
    
        
        
        JLabel background = new JLabel();
        background.setBounds(0, jPanel1.getHeight(), this.getWidth(), this.getHeight()-jPanel1.getHeight());
        background.setIcon(new ImageIcon(new ImageIcon("src//images//backgroundMain.jpg").getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH)));
        this.add(background);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbChao = new javax.swing.JLabel();
        lbLogouot = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trang chủ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(790, 703));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("TRANG CHỦ");

        lbChao.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbChao.setForeground(new java.awt.Color(255, 255, 255));
        lbChao.setText("XIN CHÀO ");

        lbLogouot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbLogouot.setForeground(new java.awt.Color(255, 255, 255));
        lbLogouot.setText("LOG OUT");
        lbLogouot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLogouotMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbLogouotMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbLogouotMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lbChao, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbLogouot, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbChao, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLogouot, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 107);

        jPanel2.setForeground(new java.awt.Color(0, 153, 204));
        jPanel2.setLayout(new java.awt.GridLayout(3, 3, 20, 20));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 145, 220, 255));
        jButton1.setText("HỌC SINH");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 145, 220, 255));
        jButton2.setText("GIÁO VIÊN");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 145, 220, 255));
        jButton3.setText("ĐIỂM");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);

        jButton4.setBackground(new java.awt.Color(255, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 145, 220, 255));
        jButton4.setText("LỚP");
        jButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);

        jButton5.setBackground(new java.awt.Color(255, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 145, 220, 255));
        jButton5.setText("TÀI KHOẢN");
        jButton5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5);

        jButton6.setBackground(new java.awt.Color(255, 204, 204));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 145, 220, 255));
        jButton6.setText("THOÁT");
        jButton6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton6MouseExited(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 204, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 145, 220, 255));
        jButton7.setText("THỐNG KÊ");
        jButton7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton7MouseExited(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(71, 151, 640, 490);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Color colorBtn = new java.awt.Color(0, 145, 220, 255);
    Color colorBtn1 = new java.awt.Color(255, 204, 204, 255);
    void changeColorEnter(JButton btn){
        btn.setBackground(colorBtn);
        btn.setForeground(colorBtn1);
    }
    void changeColorExit(JButton btn){
        btn.setBackground(colorBtn1);
        btn.setForeground(colorBtn);
    }
    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        changeColorEnter(jButton1);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:Button1.setBackground(BLUE);
        changeColorExit(jButton1);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        HocSinhGUI qlsv;
                    qlsv = new HocSinhGUI();
                    qlsv.setVisible(true);
                    qlsv.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         GiaoVienGUI qlgv;
                    qlgv = new GiaoVienGUI();
                    qlgv.setVisible(true);
                    qlgv.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        QuanLiDiemHocSinhGUI qlDiemHocSinh;
                    qlDiemHocSinh = new QuanLiDiemHocSinhGUI();
                    qlDiemHocSinh.hienThiDuLieu();
                    qlDiemHocSinh.setVisible(true);
                    qlDiemHocSinh.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        changeColorEnter(jButton2);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        changeColorExit(jButton2);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        changeColorEnter(jButton3);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        changeColorExit(jButton3);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        changeColorEnter(jButton4);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        changeColorExit(jButton4);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        changeColorEnter(jButton5);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        changeColorExit(jButton5);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseEntered
        // TODO add your handling code here:
        changeColorEnter(jButton6);
    }//GEN-LAST:event_jButton6MouseEntered

    private void jButton6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseExited
        // TODO add your handling code here:
        changeColorExit(jButton6);
    }//GEN-LAST:event_jButton6MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        LopGUI lop ;
                    lop = new LopGUI();
                    lop.setVisible(true);
                    lop.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Icon img =  new ImageIcon(new ImageIcon("src//images//warning.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH));
        int click;
        click = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn thoát","Xác nhận",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,img);
                 if (click==JOptionPane.YES_OPTION) {
                     System.exit(0);
                 }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        KetQuaGUI kqqgui ;
                    kqqgui = new KetQuaGUI();
                    kqqgui.doDuLieuComboBox();
                    kqqgui.setVisible(true);
                    kqqgui.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        changeColorEnter(jButton7);
    }//GEN-LAST:event_jButton7MouseEntered

    private void jButton7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseExited
        // TODO add your handling code here:
        changeColorExit(jButton7);
    }//GEN-LAST:event_jButton7MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        UserBUS usBUS = new UserBUS();
        if (usBUS.checkAdmin(Username)) {
            UserGUI qluv ;
                    qluv = new UserGUI(); 
                    qluv.setVisible(true);
                    qluv.setLocationRelativeTo(null);
                    this.dispose();
        }
        else {
            ChangePasswordGUI changePasswordForm;
                    changePasswordForm = new ChangePasswordGUI(); 
                    changePasswordForm.setVisible(true);
                    changePasswordForm.setLocationRelativeTo(null);
                    this.dispose();
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void lbLogouotMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogouotMouseEntered
        // TODO add your handling code here:
        lbLogouot.setForeground(red);
    }//GEN-LAST:event_lbLogouotMouseEntered

    private void lbLogouotMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogouotMouseExited
        // TODO add your handling code here:
         lbLogouot.setForeground(white);
    }//GEN-LAST:event_lbLogouotMouseExited

    private void lbLogouotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLogouotMouseClicked
        // TODO add your handling code here:
        LoginGUI loginForm ;
                    loginForm = new LoginGUI(); 
                    loginForm.setVisible(true);
                    loginForm.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_lbLogouotMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbChao;
    private javax.swing.JLabel lbLogouot;
    // End of variables declaration//GEN-END:variables
}