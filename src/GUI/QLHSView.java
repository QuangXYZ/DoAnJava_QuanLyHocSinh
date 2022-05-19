/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BUS.HocSinhBUS;
import BUS.KetQuaBUS;
import BUS.LopHocBUS;
import BUS.QuanLiDiemHocSinhBUS;
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

import DTO.HocSinh;
import DTO.KetQuaDTO;
import DTO.LopHoc;
import DTO.QuanLiDiemHS;
import sql.MyConnection;
import java.awt.Dimension;

/**
 *
 * @author Tit
 */
public class QLHSView extends javax.swing.JFrame {

    /**
     * Creates new form QLHSView
     */
    String imgURL = "none";
    File directory = new File("");
    SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
    ArrayList<HocSinh> dshs = new ArrayList<>();
    DefaultTableModel model;

    public void loadData() {
        try {
            dshs.clear();
            HocSinhBUS hsBUS = new HocSinhBUS();
            dshs = hsBUS.getAllHocSinh();
        } catch (Exception e) {
            System.out.println("Connect Error " + e);
        }
    }

    public void loadDataTable() {
        loadData();
        model = (DefaultTableModel) tbDSHS.getModel();
        model.setRowCount(0);
        for (int i = 0; i < dshs.size(); i++) {
            model.addRow(new Object[]{i + 1, dshs.get(i).getMSHS(), dshs.get(i).getHoTen(), formatDate.format(dshs.get(i).getNgaySinh()),
                dshs.get(i).getGioiTinh(), dshs.get(i).getLop(), dshs.get(i).getQueQuan()});

        }

    }

    public void loadDataCBLop() {
        LopHocBUS lh = new LopHocBUS();
        ArrayList<LopHoc> arr = new ArrayList<>();
        arr = lh.getAllLopHoc();
        for (LopHoc l : arr) {
            cbLop.addItem(l.getMaLop());
        }

    }

    public QLHSView() {
    	setResizable(false);
        initComponents();
        addBtn.setIcon(new ImageIcon(new ImageIcon("src//images//plus.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        delBtn.setIcon(new ImageIcon(new ImageIcon("src//images//delete.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        editBtn.setIcon(new ImageIcon(new ImageIcon("src//images//edit.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        backBtn.setIcon(new ImageIcon(new ImageIcon("src//images//previous.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        RefreshMenu.setIcon(new ImageIcon(new ImageIcon("src//images//refresh.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        searchMenu.setIcon(new ImageIcon(new ImageIcon("src//images//search.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        JLabel background = new JLabel();
        background.setBounds(0, 0, this.getWidth(), this.getHeight());
        background.setIcon(new ImageIcon(new ImageIcon("src//images//backgroundQLHS.png").getImage().getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH)));
        this.add(background);
        loadDataCBLop();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenu3 = new javax.swing.JMenu();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbNam = new javax.swing.JRadioButton();
        rbNu = new javax.swing.JRadioButton();
        tfMSHS = new javax.swing.JTextField();
        tfHoTen = new javax.swing.JTextField();
        cbQueQuan = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDSHS = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfNgaySinh = new javax.swing.JTextField();
        background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbLop = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        RefreshMenu = new javax.swing.JMenuItem();
        searchMenu = new javax.swing.JMenu();
        TheoMSSV = new javax.swing.JMenuItem();
        TheoHoten = new javax.swing.JMenuItem();
        TheoNgaysinh = new javax.swing.JMenuItem();
        TheoGioitinh = new javax.swing.JMenuItem();
        TheoQuequan = new javax.swing.JMenuItem();
        TheoLop = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUAN LY SINH VIEN");
        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(660, 660));
        setSize(new java.awt.Dimension(626, 550));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("MSHS : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(47, 91, 50, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Họ và tên : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(46, 137, 72, 17);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Giới tính : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(46, 224, 65, 17);

        rbNam.setBackground(new java.awt.Color(0, 0, 0, 0));
        buttonGroup1.add(rbNam);
        rbNam.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbNam.setText("NAM");
        rbNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNamActionPerformed(evt);
            }
        });
        getContentPane().add(rbNam);
        rbNam.setBounds(163, 220, 55, 25);

        rbNu.setBackground(new java.awt.Color(0, 0, 0, 0));
        buttonGroup1.add(rbNu);
        rbNu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        rbNu.setText("NỮ");
        getContentPane().add(rbNu);
        rbNu.setBounds(264, 220, 47, 25);

        tfMSHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMSHSActionPerformed(evt);
            }
        });
        getContentPane().add(tfMSHS);
        tfMSHS.setBounds(161, 87, 261, 27);

        tfHoTen.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfHoTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHoTenActionPerformed(evt);
            }
        });
        getContentPane().add(tfHoTen);
        tfHoTen.setBounds(161, 132, 261, 27);

        cbQueQuan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbQueQuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "An Giang", "Bà Rịa – Vũng Tàu", "Bạc Liêu", "Bắc Giang", "Bắc Kạn", "Bắc Ninh", "Bến Tre", "Bình Dương", "Bình Định", "Bình Phước", "Bình Thuận", "Cà Mau", "Cao Bằng", "Cần Thơ", "Đà Nẵng", "Đắk Lắk", "Đắk Nông", "Điện Biên", "Đồng Nai", "Đồng Tháp", "Gia Lai", "Hà Giang", "Hà Nam", "Hà Nội", "Hà Tĩnh", "Hải Dương", "Hải Phòng", "Hậu Giang", "Hòa Bình", "Thành phố Hồ Chí Minh", "Hưng Yên", "Khánh Hòa", "Kiên Giang", "Kon Tum", "Lai Châu", "Lạng Sơn", "Lào Cai", "Lâm Đồng", "Long An", "Nam Định", "Nghệ An", "Ninh Bình", "Ninh Thuận", "Phú Thọ", "Phú Yên", "Quảng Bình", "Quảng Nam", "Quảng Ngãi", "Quảng Ninh", "Quảng Trị", "Sóc Trăng", "Sơn La", "Tây Ninh", "Thái Bình", "Thái Nguyên", "Thanh Hóa", "Thừa Thiên Huế", "Tiền Giang", "Trà Vinh", "Tuyên Quang", "Vĩnh Long", "Vĩnh Phúc", "Yên Bái" }));
        cbQueQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbQueQuanActionPerformed(evt);
            }
        });
        getContentPane().add(cbQueQuan);
        cbQueQuan.setBounds(162, 262, 257, 27);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Quê quán");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(47, 267, 63, 17);

        tbDSHS.setBackground(new java.awt.Color(255, 255, 102));
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
        jScrollPane1.setViewportView(tbDSHS);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(23, 408, 599, 176);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Lớp");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(47, 311, 25, 17);

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
        addBtn.setBounds(47, 354, 110, 36);

        delBtn.setBackground(new java.awt.Color(255, 255, 255));
        delBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        delBtn.setText("XÓA");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        getContentPane().add(delBtn);
        delBtn.setBounds(197, 354, 107, 36);

        editBtn.setBackground(new java.awt.Color(255, 255, 255));
        editBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        editBtn.setText("SỬA");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editBtn);
        editBtn.setBounds(344, 354, 110, 36);

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        backBtn.setText("QUAY LẠI");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(482, 354, 122, 36);

        imgLabel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Image"));
        imgLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgLabelMouseClicked(evt);
            }
        });
        getContentPane().add(imgLabel);
        imgLabel.setBounds(449, 87, 164, 169);

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("Ngày sinh");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(46, 180, 62, 17);

        tfNgaySinh.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tfNgaySinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNgaySinhActionPerformed(evt);
            }
        });
        getContentPane().add(tfNgaySinh);
        tfNgaySinh.setBounds(161, 175, 261, 27);

        background.setBackground(new java.awt.Color(51, 51, 51));
        background.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("QUẢN LÝ HỌC SINH");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(205, 205, 205))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(background);
        background.setBounds(0, 0, 644, 66);

        getContentPane().add(cbLop);
        cbLop.setBounds(162, 306, 257, 27);

        jMenuBar1.setBackground(new java.awt.Color(102, 102, 102));

        jMenu1.setText("Công cụ");

        RefreshMenu.setText("Refresh");
        RefreshMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshMenuActionPerformed(evt);
            }
        });
        jMenu1.add(RefreshMenu);

        searchMenu.setText("Tìm kiếm");

        TheoMSSV.setText("Theo MSSV");
        TheoMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoMSSVActionPerformed(evt);
            }
        });
        searchMenu.add(TheoMSSV);

        TheoHoten.setText("Theo Họ tên");
        TheoHoten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoHotenActionPerformed(evt);
            }
        });
        searchMenu.add(TheoHoten);

        TheoNgaysinh.setText("Theo Ngày sinh");
        TheoNgaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoNgaysinhActionPerformed(evt);
            }
        });
        searchMenu.add(TheoNgaysinh);

        TheoGioitinh.setText("Theo Giới tính");
        TheoGioitinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoGioitinhActionPerformed(evt);
            }
        });
        searchMenu.add(TheoGioitinh);

        TheoQuequan.setText("Theo Quê quán");
        TheoQuequan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoQuequanActionPerformed(evt);
            }
        });
        searchMenu.add(TheoQuequan);

        TheoLop.setText("Theo Lớp");
        TheoLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TheoLopActionPerformed(evt);
            }
        });
        searchMenu.add(TheoLop);

        jMenu1.add(searchMenu);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbNamActionPerformed

    private void cbQueQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbQueQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbQueQuanActionPerformed

    private void tfHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHoTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHoTenActionPerformed

    private void tfMSHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMSHSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMSHSActionPerformed

    public void resetForm() {
        tfHoTen.setText("");
        tfMSHS.setText("");
        cbLop.setSelectedIndex(0);
        rbNam.setSelected(true);
        imgLabel.setIcon(null);
        tfNgaySinh.setText("");
        cbQueQuan.setSelectedIndex(0);

    }
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if (tfNgaySinh.getText().equals("") || tfMSHS.getText().equals("") || tfHoTen.getText().equals("") || (rbNam.isSelected() == false && rbNu.isSelected() == false)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        } else {
            try {
                for (HocSinh hs : dshs) if (hs.getMSHS().equals(tfMSHS.getText())) {
                JOptionPane.showMessageDialog(this, "Học sinh "+tfMSHS.getText()+" đã tồn tại !");
                return;
            }
                HocSinh hs = new HocSinh(tfMSHS.getText(), tfHoTen.getText(), formatDate.parse(tfNgaySinh.getText()), rbNam.isSelected() ? "Nam" : "Nu", cbQueQuan.getSelectedItem().toString(), cbLop.getSelectedItem().toString(), imgURL);
                HocSinhBUS hsBUS = new HocSinhBUS();
                if (hsBUS.addHocSinh(hs) != 0) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm không thành công");
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng ngày sinh");
            }
        }
        resetForm();
        loadDataTable();

    }//GEN-LAST:event_addBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        // TODO add your handling code here:
       int i = tbDSHS.getSelectedRow();
        HocSinhBUS hsBUS = new HocSinhBUS();

        if (i >= 0) {
            QuanLiDiemHocSinhBUS  qldhsbus = new QuanLiDiemHocSinhBUS();
            KetQuaBUS kqbus= new KetQuaBUS();
            //kqbus.xoaKetQua(model.getValueAt(i, 1).toString());
            kqbus.xoaKetQua(new KetQuaDTO(model.getValueAt(i, 1).toString()));
            qldhsbus.xoaDiemHocSinh(new QuanLiDiemHS(model.getValueAt(i, 1).toString()));
            if (hsBUS.deleteHocSinh(model.getValueAt(i, 1).toString()) != 0) {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
            } else {
                JOptionPane.showMessageDialog(this, "Xóa không thành công");
            }

            resetForm();
            loadDataTable();
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn học sinh để xóa");
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void imgLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgLabelMouseClicked
        try {
            // TODO add your handling code here:
            JFileChooser jfc = new JFileChooser(directory.getAbsolutePath() + "//src//images");
            jfc.showOpenDialog(null);
            File file = jfc.getSelectedFile();
            imgURL = file.toString().replace(directory.getAbsolutePath(), "");
            Image img = ImageIO.read(file);
            int width = imgLabel.getWidth();
            int height = imgLabel.getHeight();
            imgLabel.setIcon(new ImageIcon(img.getScaledInstance(width -13, height-25, Image.SCALE_SMOOTH)));
        } catch (IOException ex) {
            Logger.getLogger(QLHSView.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_imgLabelMouseClicked

    private void tfNgaySinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNgaySinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNgaySinhActionPerformed

    private void tbDSHSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSHSMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) tbDSHS.getModel();
        int i = tbDSHS.getSelectedRow();
        if (i >= 0) {
            tfMSHS.setText(model.getValueAt(i, 1).toString());
            tfHoTen.setText(model.getValueAt(i, 2).toString());
            tfNgaySinh.setText(model.getValueAt(i, 3).toString());
            if (model.getValueAt(i, 4).toString().equals("Nam")) {
                rbNam.setSelected(true);
            } else {
                rbNu.setSelected(true);
            }
            cbLop.setSelectedItem(model.getValueAt(i, 5).toString());
            cbQueQuan.setSelectedItem(model.getValueAt(i, 6).toString());
            ImageIcon img = new ImageIcon(directory.getAbsolutePath() + dshs.get(i).getImg());
            imgLabel.setIcon(new ImageIcon(img.getImage().getScaledInstance(imgLabel.getWidth()-13, imgLabel.getHeight() - 25, Image.SCALE_SMOOTH)));
            imgURL = dshs.get(i).getImg();
        }

    }//GEN-LAST:event_tbDSHSMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        if (tfNgaySinh.getText().equals("") || tfMSHS.getText().equals("") || tfHoTen.getText().equals("") || (rbNam.isSelected() == false && rbNu.isSelected() == false)) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        } else {
            try {
                HocSinh hs = new HocSinh(tfMSHS.getText(), tfHoTen.getText(), formatDate.parse(tfNgaySinh.getText()), rbNam.isSelected() ? "Nam" : "Nu", cbQueQuan.getSelectedItem().toString(), cbLop.getSelectedItem().toString(), imgURL);
                HocSinhBUS hsBUS = new HocSinhBUS();
                if (hsBUS.updateHocSinh(hs) != 0) {
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                } else {
                    JOptionPane.showMessageDialog(this, "Sửa không thành công");
                }
            } catch (ParseException ex) {
                JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ");
            }
        }
        loadDataTable();
        resetForm();
    }//GEN-LAST:event_editBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        FrMainForm mainForm;
        mainForm = new FrMainForm();
        mainForm.setVisible(true);
        mainForm.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed


    private void TheoQuequanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheoQuequanActionPerformed
        // TODO add your handling code here:

        String s = (String) JOptionPane.showInputDialog(this,
                "Nhập quê quán cần tìm",
                "Tìm kiếm theo quê quán",
                JOptionPane.INFORMATION_MESSAGE);
        if (s.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        } else {
            HocSinhBUS hsBUS = new HocSinhBUS();
            dshs = hsBUS.searchHocSinhQueQuan(s);
            model = (DefaultTableModel) tbDSHS.getModel();
            model.setRowCount(0);
            for (int i = 0; i < dshs.size(); i++) {
                model.addRow(new Object[]{i + 1, dshs.get(i).getMSHS(), dshs.get(i).getHoTen(), formatDate.format(dshs.get(i).getNgaySinh()),
                    dshs.get(i).getGioiTinh(), dshs.get(i).getLop(), dshs.get(i).getQueQuan()});

            }
            JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");

        }
    }//GEN-LAST:event_TheoQuequanActionPerformed

    private void TheoMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheoMSSVActionPerformed
        // TODO add your handling code here:
        String s = (String) JOptionPane.showInputDialog(this,
                "Nhập MSSV cần tìm",
                "Tìm kiếm theo MSSV",
                JOptionPane.INFORMATION_MESSAGE);
        if (s.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        } else {
            HocSinhBUS hsBUS = new HocSinhBUS();
            dshs = hsBUS.searchHocSinhMSHS(s);
            model = (DefaultTableModel) tbDSHS.getModel();
            model.setRowCount(0);
            for (int i = 0; i < dshs.size(); i++) {
                model.addRow(new Object[]{i + 1, dshs.get(i).getMSHS(), dshs.get(i).getHoTen(), formatDate.format(dshs.get(i).getNgaySinh()),
                    dshs.get(i).getGioiTinh(), dshs.get(i).getLop(), dshs.get(i).getQueQuan()});

            }
            JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");

        }
    }//GEN-LAST:event_TheoMSSVActionPerformed

    private void TheoHotenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheoHotenActionPerformed
        // TODO add your handling code here:

        String s = (String) JOptionPane.showInputDialog(this,
                "Nhập họ tên cần tìm",
                "Tìm kiếm theo họ tên",
                JOptionPane.INFORMATION_MESSAGE);
        if (s.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        } else {
            HocSinhBUS hsBUS = new HocSinhBUS();
            dshs = hsBUS.searchHocSinhHoTen(s);
            model = (DefaultTableModel) tbDSHS.getModel();
            model.setRowCount(0);
            for (int i = 0; i < dshs.size(); i++) {
                model.addRow(new Object[]{i + 1, dshs.get(i).getMSHS(), dshs.get(i).getHoTen(), formatDate.format(dshs.get(i).getNgaySinh()),
                    dshs.get(i).getGioiTinh(), dshs.get(i).getLop(), dshs.get(i).getQueQuan()});
            }
            JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");

        }
    }//GEN-LAST:event_TheoHotenActionPerformed

    private void TheoNgaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheoNgaysinhActionPerformed
        // TODO add your handling code here:

        String s = (String) JOptionPane.showInputDialog(this,
                "Nhập ngày sinh cần tìm",
                "Tìm kiếm theo ngày sinh",
                JOptionPane.INFORMATION_MESSAGE);
        if (s.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        } else {
            HocSinhBUS hsBUS = new HocSinhBUS();
            dshs = hsBUS.searchHocSinhNgaySinh(s);
            model = (DefaultTableModel) tbDSHS.getModel();
            model.setRowCount(0);
            for (int i = 0; i < dshs.size(); i++) {
                model.addRow(new Object[]{i + 1, dshs.get(i).getMSHS(), dshs.get(i).getHoTen(), formatDate.format(dshs.get(i).getNgaySinh()),
                    dshs.get(i).getGioiTinh(), dshs.get(i).getLop(), dshs.get(i).getQueQuan()});
            }
                JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");

        }
    }//GEN-LAST:event_TheoNgaysinhActionPerformed

    private void TheoGioitinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheoGioitinhActionPerformed
        // TODO add your handling code here:

        String s = (String) JOptionPane.showInputDialog(this,
                "Nhập giới tính cần tìm",
                "Tìm kiếm theo giới tính",
                JOptionPane.INFORMATION_MESSAGE);
        if (s.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        } else {
            HocSinhBUS hsBUS = new HocSinhBUS();
            dshs = hsBUS.searchHocSinhGioiTinh(s);
            model = (DefaultTableModel) tbDSHS.getModel();
            model.setRowCount(0);
            for (int i = 0; i < dshs.size(); i++) {
                model.addRow(new Object[]{i + 1, dshs.get(i).getMSHS(), dshs.get(i).getHoTen(), formatDate.format(dshs.get(i).getNgaySinh()),
                    dshs.get(i).getGioiTinh(), dshs.get(i).getLop(), dshs.get(i).getQueQuan()});
            }
            JOptionPane.showMessageDialog(this, "Tìm kiếm thành công! ");
           
        }
    }//GEN-LAST:event_TheoGioitinhActionPerformed

    private void TheoLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TheoLopActionPerformed
        // TODO add your handling code here:

        String s = (String) JOptionPane.showInputDialog(this,
                "Nhập lớp cần tìm",
                "Tìm kiếm theo lớp",
                JOptionPane.INFORMATION_MESSAGE);
        if (s.equals("")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        } else {
            HocSinhBUS hsBUS = new HocSinhBUS();
            dshs = hsBUS.searchHocSinhLop(s);
            model = (DefaultTableModel) tbDSHS.getModel();
            model.setRowCount(0);
            for (int i = 0; i < dshs.size(); i++) {
                model.addRow(new Object[]{i + 1, dshs.get(i).getMSHS(), dshs.get(i).getHoTen(), formatDate.format(dshs.get(i).getNgaySinh()),
                    dshs.get(i).getGioiTinh(), dshs.get(i).getLop(), dshs.get(i).getQueQuan()});
            }
                JOptionPane.showMessageDialog(this, "Tìm kiếm thành công!");
            
        }
    }//GEN-LAST:event_TheoLopActionPerformed

    private void RefreshMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshMenuActionPerformed
        // TODO add your handling code here:
        loadData();
        loadDataTable();
        resetForm();
    }//GEN-LAST:event_RefreshMenuActionPerformed

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
            java.util.logging.Logger.getLogger(QLHSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLHSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLHSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLHSView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLHSView().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem RefreshMenu;
    private javax.swing.JMenuItem TheoGioitinh;
    private javax.swing.JMenuItem TheoHoten;
    private javax.swing.JMenuItem TheoLop;
    private javax.swing.JMenuItem TheoMSSV;
    private javax.swing.JMenuItem TheoNgaysinh;
    private javax.swing.JMenuItem TheoQuequan;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel background;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbLop;
    private javax.swing.JComboBox<String> cbQueQuan;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNam;
    private javax.swing.JRadioButton rbNu;
    private javax.swing.JMenu searchMenu;
    private javax.swing.JTable tbDSHS;
    private javax.swing.JTextField tfHoTen;
    private javax.swing.JTextField tfMSHS;
    private javax.swing.JTextField tfNgaySinh;
    // End of variables declaration//GEN-END:variables
}
