/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import BUS.LoginBUS;
import java.sql.*;



import javax.swing.JOptionPane;
import DTO.User;
import java.awt.Image;
import javax.swing.ImageIcon;
import sql.MyConnection;

/**
 *
 * @author Tit
 */
public class FrLoginForm extends javax.swing.JFrame {

    /**
     * Creates new form FrMainForm
     */
    static String Username;
    public FrLoginForm() {
        initComponents();
        lbLogin.setIcon(new ImageIcon(new ImageIcon("src//images//login.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        lbUserName.setIcon(new ImageIcon(new ImageIcon("src//images//user.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        lbPassword.setIcon(new ImageIcon(new ImageIcon("src//images//padlock.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        this.getContentPane().setBackground(new java.awt.Color(200, 255, 255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbLogin = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUAN LY SINH VIEN");
        setAutoRequestFocus(false);

        lbLogin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(0, 0, 204));
        lbLogin.setText("LOG IN");

        lbUserName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbUserName.setText("USER NAME : ");

        lbPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbPassword.setText("PASSWORD :");

        tfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserNameActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(27, 185, 19));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOG IN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(lbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                            .addComponent(tfUserName))))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean checkValidForm(){
        if (tfUserName.getText().isEmpty()||tfPassword.getPassword().length<=0) return false;
        else return true;
    }
    

    
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here: 
        if (checkValidForm()) {
            LoginBUS lgBUS = new LoginBUS();
            if (lgBUS.checkLogin(tfUserName.getText(), new String (tfPassword.getPassword()))){  
                Username = tfUserName.getText();
                FrMainForm mainForm;
                    mainForm = new FrMainForm();
                    mainForm.setVisible(true);
                    mainForm.setLocationRelativeTo(null);
                    this.dispose();
               
                
            }
            else{
                JOptionPane.showMessageDialog(this, "Nhap sai UserName hoac Password");
            }
        } 
        else {
            JOptionPane.showMessageDialog(this, "Vui long nhap day du thong tin");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void tfUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserNameActionPerformed

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
            java.util.logging.Logger.getLogger(FrLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrLoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUserName;
    // End of variables declaration//GEN-END:variables
}
