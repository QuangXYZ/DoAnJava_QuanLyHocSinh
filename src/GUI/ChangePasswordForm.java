/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.UserBUS;
import DTO.User;
import static GUI.FrLoginForm.Username;
import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Tit
 */
public class ChangePasswordForm extends javax.swing.JFrame {

    /**
     * Creates new form ChangePasswordForm
     */
    public ChangePasswordForm() {
        initComponents();
        lbImg.setIcon(new ImageIcon(new ImageIcon("src//images//cyber-security.png").getImage().getScaledInstance(lbImg.getWidth(), lbImg.getHeight(), Image.SCALE_SMOOTH)));
       
        jPanel1.setBackground(new Color(0,0,0,50));
        JLabel background = new JLabel();
        background.setBounds(0, 0, this.getWidth(), this.getHeight());
        background.setIcon(new ImageIcon(new ImageIcon("src//images//backgroundChangePassword.jpg").getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH)));
        this.add(background);
        jbUsername.setText(Username+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImg = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        tfPassword = new javax.swing.JPasswordField();
        jbUsername = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tfPasswordNew2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfPasswordNew = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ĐỔI MẬT KHẨU");
        setMinimumSize(new java.awt.Dimension(640, 420));
        setResizable(false);
        getContentPane().setLayout(null);
        getContentPane().add(lbImg);
        lbImg.setBounds(20, 100, 226, 217);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(329, 296));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Đổi mật khẩu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tfPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfPasswordMouseClicked(evt);
            }
        });

        jbUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbUsername.setForeground(new java.awt.Color(255, 102, 0));
        jbUsername.setMinimumSize(new java.awt.Dimension(98, 20));
        jbUsername.setPreferredSize(new java.awt.Dimension(98, 20));

        jButton1.setBackground(new java.awt.Color(0, 51, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Mật khẩu cũ");

        tfPasswordNew2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfPasswordNew2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfPasswordNew2MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Nhập lại mật khẩu :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Mật khẩu mới :");

        tfPasswordNew.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfPasswordNew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfPasswordNewMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Username :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfPasswordNew2)
                    .addComponent(tfPassword)
                    .addComponent(tfPasswordNew)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPasswordNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPasswordNew2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(240, 70, 340, 290);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("THAY ĐỔI MẬT KHẨU");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 214, 35);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    boolean checkValidForm(){
        UserBUS userBUS = new UserBUS();
            if (userBUS.checkLogin(Username, new String (tfPassword.getPassword()))){ 
                return true;
            } 
            return false;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        UserBUS usBUS = new UserBUS();
        if (tfPasswordNew.getText().equals("") ||  tfPasswordNew2.getText().equals("") || tfPassword.getText().equals("")) {
            tfPasswordNew.setBorder(BorderFactory.createLineBorder(Color.red));
            tfPasswordNew2.setBorder(BorderFactory.createLineBorder(Color.red));
            tfPassword.setBorder(BorderFactory.createLineBorder(Color.red));
            return;
        }
        if (checkValidForm()) {
            if (tfPasswordNew.getText().equals(tfPasswordNew2.getText())){
                if (usBUS.delUser(Username)!=0  && usBUS.addUser(new User(Username,tfPasswordNew.getText(),1))!=0)
                JOptionPane.showMessageDialog(this, "Đổi thành công");
                else JOptionPane.showMessageDialog(this, "Đổi ko thành công");
            }
            else{
                  JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra lại thông tin");
                  tfPasswordNew.setBorder(BorderFactory.createLineBorder(Color.red));
                  tfPasswordNew2.setBorder(BorderFactory.createLineBorder(Color.red));

            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra lại thông tin");
            tfPassword.setBorder(BorderFactory.createLineBorder(Color.red));
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FrMainForm mainForm;
                    mainForm = new FrMainForm();
                    mainForm.setVisible(true);
                    mainForm.setLocationRelativeTo(null);
                    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    void resetBorder(JTextField t){
        t.setBorder(null);
    }
    private void tfPasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPasswordMouseClicked
        // TODO add your handling code here:
        resetBorder(tfPassword);
    }//GEN-LAST:event_tfPasswordMouseClicked

    private void tfPasswordNewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPasswordNewMouseClicked
        // TODO add your handling code here:
        resetBorder(tfPasswordNew);
        resetBorder(tfPasswordNew2);
    }//GEN-LAST:event_tfPasswordNewMouseClicked

    private void tfPasswordNew2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfPasswordNew2MouseClicked
resetBorder(tfPasswordNew);
        resetBorder(tfPasswordNew2);        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordNew2MouseClicked

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
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePasswordForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbUsername;
    private javax.swing.JLabel lbImg;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JPasswordField tfPasswordNew;
    private javax.swing.JPasswordField tfPasswordNew2;
    // End of variables declaration//GEN-END:variables
}
