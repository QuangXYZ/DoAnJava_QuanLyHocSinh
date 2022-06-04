/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;



import BUS.UserBUS;
import java.sql.*;



import javax.swing.JOptionPane;
import DTO.UserDTO;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import sql.MyConnection;

/**
 *
 * @author Tit
 */
public class LoginGUI extends javax.swing.JFrame {

    /**
     * Creates new form FrMainForm
     */
    static String Username;
    public LoginGUI() {
        initComponents();
        lbLogin.setIcon(new ImageIcon(new ImageIcon("src//images//login.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        lbUserName.setIcon(new ImageIcon(new ImageIcon("src//images//user.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        lbPassword.setIcon(new ImageIcon(new ImageIcon("src//images//padlock.png").getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
        this.getContentPane().setBackground(new java.awt.Color(200, 255, 255));
        JLabel background = new JLabel();
        background.setBounds(0, 0, this.getWidth(), this.getHeight());
        background.setIcon(new ImageIcon(new ImageIcon("src//images//BackgroundLogin.jpg").getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH)));
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

        lbLogin = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        tfUserName = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(580, 350));
        setResizable(false);
        getContentPane().setLayout(null);

        lbLogin.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbLogin.setForeground(new java.awt.Color(0, 0, 153));
        lbLogin.setText("LOG IN");
        getContentPane().add(lbLogin);
        lbLogin.setBounds(226, 20, 137, 70);

        lbUserName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbUserName.setText("USERNAME : ");
        getContentPane().add(lbUserName);
        lbUserName.setBounds(50, 110, 134, 32);

        lbPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbPassword.setText("PASSWORD :");
        getContentPane().add(lbPassword);
        lbPassword.setBounds(50, 180, 134, 30);

        tfUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserNameActionPerformed(evt);
            }
        });
        getContentPane().add(tfUserName);
        tfUserName.setBounds(220, 110, 296, 32);

        tfPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(tfPassword);
        tfPassword.setBounds(220, 180, 296, 30);

        btnLogin.setBackground(new java.awt.Color(27, 185, 19));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("LOG IN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin);
        btnLogin.setBounds(228, 251, 111, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public boolean checkValidForm(){
        if (tfUserName.getText().isEmpty()||tfPassword.getPassword().length<=0) return false;
        else return true;
    }
    

    
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here: 
        if (checkValidForm()) {
            UserBUS userBUS = new UserBUS();
            if (userBUS.checkLogin(tfUserName.getText(), new String (tfPassword.getPassword()))){  
                Username = tfUserName.getText();
                HomeGUI mainForm;
                    mainForm = new HomeGUI();
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
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