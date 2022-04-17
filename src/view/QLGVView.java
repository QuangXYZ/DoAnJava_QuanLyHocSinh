/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import quanlyhocsinh.HocSinh;
import quanlyhocsinh.HocSinh;
import quanlyhocsinh.HocSinh;
import static view.QLHSView.model;
public class QLGVView extends javax.swing.JFrame {

    /**
     * Creates new form QLGVView
     */
        String dbUrl ="jdbc:mysql://localhost:3306/qlhs";
    String username = "root"; String password= "12345678";
    String imgURL="none";
    File directory = new File("");
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    ArrayList<HocSinh> dshs = new ArrayList<>();
    static DefaultTableModel model ;
    public void loadDataSQL(){
        Connection con;
        try{          
            con = DriverManager.getConnection(dbUrl,username,password);
            System.out.println("Connection successful");
            Statement s=con.createStatement();
            ResultSet rs =s.executeQuery("SELECT * FROM GIANGVIEN");
            while(rs.next()){
                 dshs.add(new HocSinh(rs.getString(1),rs.getString(2),formatDate.parse(rs.getString(3)),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7)));
            }
           con.close();
        } catch(Exception e){
            System.out.println("Connect Error "+e);
        } 
    }
           

    public void loadDataTable(){   
        
        model = (DefaultTableModel)tbDSGV.getModel();
        model.setRowCount(0);
        for (int i=0;i<dshs.size();i++){
           
            model.addRow(new Object[]{i+1,dshs.get(i).getMSHS(),dshs.get(i).getHoTen(),formatDate.format(dshs.get(i).getNgaySinh()),
                dshs.get(i).getGioiTinh(),dshs.get(i).getLop(),dshs.get(i).getQueQuan()});
          
        }
                  
    }
    public QLGVView() {
        initComponents();
        
        loadDataSQL();
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

        jMenuItem4 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbDSHS = new javax.swing.JTable();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        tfMSGV = new javax.swing.JTextField();
        tfHoTen = new javax.swing.JTextField();
        tfNgaySinh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        tfLop = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();
        cbQueQuan = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDSGV = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        TheoTen = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        TheoMSGV = new javax.swing.JMenuItem();
        TheoNgaySinh = new javax.swing.JMenuItem();
        TheoGioiTinh = new javax.swing.JMenuItem();
        TheoQueQuan = new javax.swing.JMenuItem();
        TheoLop = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        tbDSHS.setBackground(new java.awt.Color(204, 255, 255));
        tbDSHS.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbDSHS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MSHS", "HỌ VÀ TÊN", "NGÀY SINH", "GIỚI TÍNH", "LỚP", "QUÊ QUÁN"
            }
        ));
        tbDSHS.setSelectionBackground(new java.awt.Color(0, 0, 153));
        tbDSHS.setSelectionForeground(new java.awt.Color(255, 255, 51));
        tbDSHS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSHSMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbDSHS);

        jMenuItem7.setText("jMenuItem7");

        jMenuItem9.setText("jMenuItem9");

        jMenuItem11.setText("jMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ GIÁO VIÊN");

        tfMSGV.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        tfHoTen.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoTenActionPerformed(evt);
            }
        });

        tfNgaySinh.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        tfNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgaySinhActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("MSGV : ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Họ và tên : ");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Ngày sinh : ");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Giới tính :");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Lớp :");

        buttonGroup1.add(rbNam);
        rbNam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbNam.setText("NAM");
        rbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNamActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNu);
        rbNu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbNu.setText("NỮ");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Quê quán :");

        tfLop.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        addBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addBtn.setText("THÊM");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        delBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        delBtn.setText("XÓA");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        editBtn.setText("SỬA");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        saveBtn.setText("LƯU");

        imgLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Image"));
        imgLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLabelMouseClicked(evt);
            }
        });

        cbQueQuan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbQueQuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa – Vũng Tàu", "Bạc Liêu", "Bắc Giang", "Bắc Kạn", "Bắc Ninh", "Bến Tre", "Bình Dương", "Bình Định", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Cần Thơ", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Thành phố Hồ Chí Minh", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lạng Sơn", "Lào Cai", "Lâm Đồng", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái" }));
        cbQueQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQueQuanActionPerformed(evt);
            }
        });

        tbDSGV.setBackground(new java.awt.Color(204, 255, 255));
        tbDSGV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tbDSGV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "MSGV", "HỌ VÀ TÊN", "NGÀY SINH", "GIỚI TÍNH", "LỚP", "QUÊ QUÁN"
            }
        ));
        tbDSGV.setSelectionBackground(new java.awt.Color(0, 0, 153));
        tbDSGV.setSelectionForeground(new java.awt.Color(255, 255, 51));
        tbDSGV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSGVMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tbDSGV);

        jMenu1.setText("TOOL");

        jMenuItem3.setText("Sắp xếp");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem5.setText("Lọc");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        TheoTen.setText("Tìm kiếm");

        jMenuItem1.setText("Theo tên");
        TheoTen.add(jMenuItem1);

        TheoMSGV.setText("Theo MSGV");
        TheoMSGV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoMSGVActionPerformed(evt);
            }
        });
        TheoTen.add(TheoMSGV);

        TheoNgaySinh.setText("Theo Ngày sinh");
        TheoTen.add(TheoNgaySinh);

        TheoGioiTinh.setText("Theo giới tính");
        TheoTen.add(TheoGioiTinh);

        TheoQueQuan.setText("Theo quê quán");
        TheoTen.add(TheoQueQuan);

        TheoLop.setText("Theo lớp");
        TheoLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoLopActionPerformed(evt);
            }
        });
        TheoTen.add(TheoLop);

        jMenu1.add(TheoTen);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("THỐNG KÊ");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfMSGV)
                            .addComponent(tfHoTen)
                            .addComponent(tfNgaySinh)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rbNam)
                                .addGap(48, 48, 48)
                                .addComponent(rbNu))
                            .addComponent(tfLop, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbQueQuan, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfMSGV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbNam)
                            .addComponent(rbNu)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void tfNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgaySinhActionPerformed

    private void tfHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoTenActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        if (tfNgaySinh.getText().equals("")||tfMSGV.getText().equals("")||tfHoTen.getText().equals("")||tfLop.getText().equals("")||(rbNam.isSelected()==false&&rbNu.isSelected()==false)){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        }
        else {
            int i = tbDSGV.getSelectedRow();
            dshs.get(i).setMSHS(tfMSGV.getText());
            dshs.get(i).setHoTen(tfHoTen.getText());
            dshs.get(i).setGioiTinh(rbNam.isSelected()?"Nam":"Nu");
            try {
                dshs.get(i).setNgaySinh(formatDate.parse(tfNgaySinh.getText()));
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ");
            }
            dshs.get(i).setQueQuan(cbQueQuan.getSelectedItem().toString());
            dshs.get(i).setLop(tfLop.getText());
            dshs.get(i).setImg(imgURL);
            model.setValueAt(dshs.get(i).getMSHS(), i, 1);
            model.setValueAt(dshs.get(i).getHoTen(), i, 2);
            model.setValueAt(formatDate.format(dshs.get(i).getNgaySinh()), i, 3);
            model.setValueAt(dshs.get(i).getGioiTinh(), i, 4);
            model.setValueAt(dshs.get(i).getLop(), i, 5);
            model.setValueAt(dshs.get(i).getQueQuan(), i, 6);   
        }    
        resetForm();
    }//GEN-LAST:event_editBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
                if (tfNgaySinh.getText().equals("")||tfMSGV.getText().equals("")||tfHoTen.getText().equals("")||tfLop.getText().equals("")||(rbNam.isSelected()==false&&rbNu.isSelected()==false)){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        }
        else {
            try {      
                
                dshs.add(new HocSinh(tfMSGV.getText(),tfHoTen.getText(),formatDate.parse(tfNgaySinh.getText()),rbNam.isSelected()?"Nam":"Nu",cbQueQuan.getSelectedItem().toString(),tfLop.getText(),imgURL));
                loadDataTable();
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng ngày sinh");
            }
           
        }    
        resetForm();
    }//GEN-LAST:event_addBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
        int i = tbDSGV.getSelectedRow();
        model.removeRow(i);
        dshs.remove(i);
        resetForm();
    }//GEN-LAST:event_delBtnActionPerformed

        private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Connection con;
        try{          
            con = DriverManager.getConnection(dbUrl,username,password);
            System.out.println("Connection successful");
            Statement s=con.createStatement();
            s.executeUpdate("DELETE FROM HOCSINH");
            for (HocSinh h : dshs){
                String img = h.getImg().replace("\\", "\\\\");
                s.executeUpdate("INSERT INTO HOCSINH VALUES('"+h.getMSHS()+"','"+h.getHoTen()+"','"+formatDate.format(h.getNgaySinh())+"','"+h.getGioiTinh()+"','"+h.getQueQuan()+"','"+h.getLop()+"','"+img+"')");
            }       
           con.close();
           JOptionPane.showMessageDialog(this, "Lưu thành công ! ");
        } catch(Exception e){
            System.out.println("Connect Error "+e);
        } 
    }
        
    private void imgLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLabelMouseClicked
        try {
            // TODO add your handling code here:
            JFileChooser jfc = new JFileChooser(directory.getAbsolutePath()+"//src//images");
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            imgURL=file.toString().replace(directory.getAbsolutePath(),"");
            Image img = ImageIO.read(file);
            int width = imgLabel.getWidth();
            int height = imgLabel.getHeight();
            imgLabel.setIcon(new ImageIcon(img.getScaledInstance(width, height-20,  Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
            Logger.getLogger(QLHSView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_imgLabelMouseClicked

    private void cbQueQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQueQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbQueQuanActionPerformed

    private void rbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNamActionPerformed

    private void tbDSHSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSHSMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel)tbDSGV.getModel();
        int i = tbDSGV.getSelectedRow();
        if (i>=0){
            tfMSGV.setText(model.getValueAt(i,1).toString());
            tfHoTen.setText(model.getValueAt(i,2).toString());
            tfNgaySinh.setText(model.getValueAt(i,3).toString());
            if(model.getValueAt(i,4).toString().equals("Nam"))
            rbNam.setSelected(true);
            else rbNu.setSelected(true);
            tfLop.setText(model.getValueAt(i,5).toString());
            cbQueQuan.setSelectedItem(model.getValueAt(i,6).toString());
            ImageIcon img = new ImageIcon(directory.getAbsolutePath()+dshs.get(i).getImg());
            imgLabel.setIcon(new ImageIcon(img.getImage().getScaledInstance(imgLabel.getWidth()-10, imgLabel.getHeight()-20, Image.SCALE_SMOOTH)));

        }

    }//GEN-LAST:event_tbDSHSMouseClicked

    private void tbDSGVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSGVMouseClicked
        // TODO add your handling code here:
               model = (DefaultTableModel)tbDSGV.getModel();
        int i = tbDSGV.getSelectedRow();
        if (i>=0){
            tfMSGV.setText(model.getValueAt(i,1).toString());
            tfHoTen.setText(model.getValueAt(i,2).toString());
            tfNgaySinh.setText(model.getValueAt(i,3).toString());
            if(model.getValueAt(i,4).toString().equals("Nam"))
                rbNam.setSelected(true); 
            else rbNu.setSelected(true);
            tfLop.setText(model.getValueAt(i,5).toString());
            cbQueQuan.setSelectedItem(model.getValueAt(i,6).toString());           
            ImageIcon img = new ImageIcon(directory.getAbsolutePath()+dshs.get(i).getImg());
            imgLabel.setIcon(new ImageIcon(img.getImage().getScaledInstance(imgLabel.getWidth()-10, imgLabel.getHeight()-20, Image.SCALE_SMOOTH)));

        }
    }//GEN-LAST:event_tbDSGVMouseClicked

    private void TheoLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheoLopActionPerformed
        // TODO add your handling code here:
        JFrame frame= new JFrame("Tìm kiếm theo lớp");
        JOptionPane.showInputDialog(frame,
                "Nhập lớp cần tìm",
                "Tìm kiếm theo lớp",
                JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_TheoLopActionPerformed

    private void TheoMSGVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheoMSGVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TheoMSGVActionPerformed
    public void resetForm(){
        tfHoTen.setText("");
        tfMSGV.setText("");
        tfLop.setText("");
        rbNam.setSelected(true);
        imgLabel.setIcon(null);
        tfNgaySinh.setText("");
        cbQueQuan.setSelectedIndex(0);
        
    }
                             


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
            java.util.logging.Logger.getLogger(QLGVView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLGVView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLGVView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLGVView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLGVView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem TheoGioiTinh;
    private javax.swing.JMenuItem TheoLop;
    private javax.swing.JMenuItem TheoMSGV;
    private javax.swing.JMenuItem TheoNgaySinh;
    private javax.swing.JMenuItem TheoQueQuan;
    private javax.swing.JMenu TheoTen;
    private javax.swing.JButton addBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbQueQuan;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTable tbDSGV;
    private javax.swing.JTable tbDSHS;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfLop;
    private javax.swing.JTextField tfMSGV;
    private javax.swing.JTextField tfNgaySinh;
    // End of variables declaration//GEN-END:variables
}
