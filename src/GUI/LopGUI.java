/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.LopHocBUS;
import DTO.HocSinhDTO;
import DTO.LopHocDTO;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tit
 */
public class LopGUI extends javax.swing.JFrame {

    /**
     * Creates new form QLLOPView
     */
    ArrayList<LopHocDTO> dslh = new ArrayList<>();
    DefaultTableModel model ;
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    public void loadData(){
        try{   
            dslh.clear();
            LopHocBUS lhBUS = new LopHocBUS();
            dslh = lhBUS.getAllLopHoc();
        } catch(Exception e){
            System.out.println("Connect Error "+e);
        } 
    }
    public void loadDataTable(){   
        loadData();
        model = (DefaultTableModel)tbLop.getModel();
        model.setRowCount(0);
        for (int i=0;i<dslh.size();i++){
            model.addRow(new Object[]{dslh.get(i).getMaLop(),dslh.get(i).getTenLop()});       
        }
                  
    }
    public LopGUI() {
        initComponents();
        addBtn.setIcon(new ImageIcon(new ImageIcon("src//images//plus.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        delBtn.setIcon(new ImageIcon(new ImageIcon("src//images//delete.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        editBtn.setIcon(new ImageIcon(new ImageIcon("src//images//edit.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        backBtn.setIcon(new ImageIcon(new ImageIcon("src//images//previous.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        JLabel background = new JLabel();
        background.setBounds(0, 0, this.getWidth(), this.getHeight());
        background.setIcon(new ImageIcon(new ImageIcon("src//images//backgroundQLLOP.jpg").getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH)));
        this.add(background);
        loadDataTable();
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbLop = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHocSinh = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tfMSLop = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTenLop = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        siso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ LỚP HỌC");
        setMinimumSize(new java.awt.Dimension(755, 510));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("QUẢN LÝ LỚP HỌC");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(270, 40, 215, 46);

        tbLop.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "MaLop", "TenLop"
            }
        ));
        tbLop.setGridColor(new java.awt.Color(0, 0, 204));
        tbLop.setSelectionBackground(new java.awt.Color(255, 153, 0));
        tbLop.setSelectionForeground(new java.awt.Color(0, 0, 204));
        tbLop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLopMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbLop);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 310, 160, 117);

        tbHocSinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MSHS", "Họ và Tên", "Giới tính", "Ngày sinh"
            }
        ));
        tbHocSinh.setGridColor(new java.awt.Color(0, 0, 204));
        tbHocSinh.setSelectionBackground(new java.awt.Color(255, 153, 0));
        tbHocSinh.setSelectionForeground(new java.awt.Color(0, 0, 204));
        jScrollPane2.setViewportView(tbHocSinh);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(180, 310, 540, 117);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã Lớp :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 120, 82, 28);

        tfMSLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMSLopActionPerformed(evt);
            }
        });
        getContentPane().add(tfMSLop);
        tfMSLop.setBounds(240, 120, 320, 28);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Tên Lớp :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(98, 168, 82, 28);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tổng số học sinh :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 430, 126, 26);
        getContentPane().add(tfTenLop);
        tfTenLop.setBounds(241, 168, 320, 28);

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addBtn.setText("THÊM");
        addBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addBtn.setPreferredSize(new java.awt.Dimension(70, 35));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addBtn);
        addBtn.setBounds(90, 240, 110, 36);

        delBtn.setBackground(new java.awt.Color(255, 255, 255));
        delBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        delBtn.setText("XÓA");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        getContentPane().add(delBtn);
        delBtn.setBounds(250, 240, 107, 36);

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editBtn.setText("SỬA");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editBtn);
        editBtn.setBounds(400, 240, 110, 36);

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        backBtn.setText("QUAY LẠI");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(550, 240, 120, 36);

        siso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        siso.setText("0");
        getContentPane().add(siso);
        siso.setBounds(160, 430, 40, 26);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if (tfMSLop.getText().equals("")&&tfTenLop.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        }
        else {
            LopHocDTO lh = new LopHocDTO(tfMSLop.getText(), tfTenLop.getText());
            LopHocBUS lhBUS = new LopHocBUS();
            if (lhBUS.addLopHoc(lh)!=0) JOptionPane.showMessageDialog(this, "Thêm thành công");
                else JOptionPane.showMessageDialog(this, "Thêm không thành công");
        }
        loadDataTable();
    }//GEN-LAST:event_addBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        int i = tbLop.getSelectedRow();
        LopHocBUS lhBUS = new LopHocBUS();
        if (i>=0){
            LopHocDTO lh = new LopHocDTO(tfMSLop.getText(), tfTenLop.getText());
            int j =lhBUS.delLopHoc(lh);
            if (j!=0) JOptionPane.showMessageDialog(this, "Xóa thành công "+j);
                else JOptionPane.showMessageDialog(this, "Xóa không thành công "+j);
        
        }
        else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn lớp để xóa");
        }
        loadDataTable();
    }//GEN-LAST:event_delBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:

     
        LopHocBUS lhBUS = new LopHocBUS();
        int i = tbLop.getSelectedRow();
        if (i>=0){
            if (tfMSLop.getText().equals("")&&tfTenLop.getText().equals("")){JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");}
            else {
                int qes=JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn? Tất cả học sinh sẽ được thay đổi sang lớp mới", "Question",JOptionPane.YES_NO_OPTION);
                if(qes==JOptionPane.YES_OPTION){
                    LopHocDTO lh = new LopHocDTO(tfMSLop.getText(), tfTenLop.getText());
                    lhBUS.addLopHoc(lh);
                    System.out.println(lh.getMaLop());
                    int j =lhBUS.updateLopHoc(lh,model.getValueAt(i, 0).toString());                   
                    if (j!=0) {
                        JOptionPane.showMessageDialog(this, "Sửa thành công");
                        lhBUS.delLopHoc(new LopHocDTO(model.getValueAt(i, 0).toString(),""));
                    }
                    else JOptionPane.showMessageDialog(this, "Sửa không thành công");
                }
                else return;
            }
        }
        else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn lớp để sửa");
        }
       loadDataTable();
    }//GEN-LAST:event_editBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        HomeGUI mainForm;
        mainForm = new HomeGUI();
        mainForm.setVisible(true);
        mainForm.setLocationRelativeTo(null);
        this.dispose();

    }//GEN-LAST:event_backBtnActionPerformed

    private void tbLopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLopMouseClicked
        // TODO add your handling code here:
         model = (DefaultTableModel)tbLop.getModel();
        int i = tbLop.getSelectedRow();
        if (i>=0){
            tfMSLop.setText(model.getValueAt(i, 0).toString());
            tfTenLop.setText(model.getValueAt(i, 1).toString());
            DefaultTableModel model1 = (DefaultTableModel)tbHocSinh.getModel();
            ArrayList<HocSinhDTO> dshs = new ArrayList<>();
            LopHocBUS lhBUS = new LopHocBUS();
            dshs = lhBUS.getAllHocSinh(model.getValueAt(i, 0).toString());
            model1.setRowCount(0);
            for (int j=0;j<dshs.size();j++){
            model1.addRow(new Object[]{dshs.get(j).getMSHS(),dshs.get(j).getHoTen(),dshs.get(j).getGioiTinh(),formatDate.format(dshs.get(j).getNgaySinh())});       
        }   siso.setText(String.valueOf(dshs.size()));
            
        }
    }//GEN-LAST:event_tbLopMouseClicked

    private void tfMSLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMSLopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMSLopActionPerformed

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
            java.util.logging.Logger.getLogger(LopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display tbLopm */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LopGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel siso;
    private javax.swing.JTable tbHocSinh;
    private javax.swing.JTable tbLop;
    private javax.swing.JTextField tfMSLop;
    private javax.swing.JTextField tfTenLop;
    // End of variables declaration//GEN-END:variables
}