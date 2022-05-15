package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BUS.KetQuaBUS;
import BUS.QuanLiDiemHocSinhBUS;
import DTO.HocSinh;
import DTO.KetQuaDTO;
import DTO.QuanLiDiemHS;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import java.awt.Font;

public class QuanLiDiemHocSinh extends JFrame {
	private JPanel contentPane;
	private JTextField tfToan;
	private JTextField tfSinh;
	private JTextField tfLi;
	private JTextField tfHoa;
	private JTextField tfAnh;
	private JTextField tfVan;
	private JTextField tfMSHS;
	private JTable table = new JTable();
	static DefaultTableModel model ;
	
	public void hienThiDuLieu() {
		QuanLiDiemHocSinhBUS quanLiDiemHocSinhBUS = new QuanLiDiemHocSinhBUS();
		ArrayList<QuanLiDiemHS> dsDiemHS = quanLiDiemHocSinhBUS.docDiemHocSinh();
		model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for(QuanLiDiemHS dsDiem: dsDiemHS) {
			Object[] row = new Object[] {dsDiem.getMSHS(), dsDiem.getHocSinh().getHoTen(), dsDiem.getToan(), dsDiem.getAnh(), dsDiem.getVan(),dsDiem.getSinh(), dsDiem.getLy(), dsDiem.getHoa()};
			model.addRow(row);
		}
	}
	
	
	public QuanLiDiemHocSinh() {
		
		setTitle("QUAN LÍ ĐIỂM HỌC SINH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 644);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Điểm Toán");
		lblNewLabel.setBounds(441, 234, 90, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Điểm Anh");
		lblNewLabel_1.setBounds(126, 128, 90, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Điểm Văn");
		lblNewLabel_2.setBounds(126, 181, 90, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Điểm Sinh");
		lblNewLabel_3.setBounds(126, 234, 90, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Điểm Lí");
		lblNewLabel_4.setBounds(441, 128, 90, 30);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Điểm Hóa");
		lblNewLabel_5.setBounds(441, 181, 90, 30);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("MAHS");
		lblNewLabel_6.setBounds(126, 78, 90, 30);
		contentPane.add(lblNewLabel_6);
		
		tfToan = new JTextField();
		tfToan.setBounds(569, 234, 96, 31);
		contentPane.add(tfToan);
		tfToan.setColumns(10);
		
		tfSinh = new JTextField();
		tfSinh.setBounds(242, 235, 96, 30);
		contentPane.add(tfSinh);
		tfSinh.setColumns(10);
		
		tfLi = new JTextField();
		tfLi.setBounds(569, 129, 96, 30);
		contentPane.add(tfLi);
		tfLi.setColumns(10);
		
		tfMSHS = new JTextField();
		tfMSHS.setBounds(242, 78, 96, 31);
		contentPane.add(tfMSHS);
		tfMSHS.setColumns(10);
		
		tfHoa = new JTextField();
		tfHoa.setBounds(569, 180, 96, 33);
		contentPane.add(tfHoa);
		tfHoa.setColumns(10);
		
		tfAnh = new JTextField();
		tfAnh.setBounds(241, 129, 96, 30);
		contentPane.add(tfAnh);
		tfAnh.setColumns(10);
		
		tfVan = new JTextField();
		tfVan.setBounds(241, 182, 96, 30);
		contentPane.add(tfVan);
		tfVan.setColumns(10);
		

		JButton btnNhapLai = new JButton("NHẬP LẠI");
		btnNhapLai.setBounds(10, 295, 119, 30);
		btnNhapLai.setIcon(new ImageIcon("src\\images\\btNhapLai.png"));
		btnNhapLai.setBackground(new Color(176, 224, 230));
		contentPane.add(btnNhapLai);
		
		JButton btnThem = new JButton("THÊM");
		btnThem.setBounds(142, 295, 119, 30);
		btnThem.setIcon(new ImageIcon("src\\images\\btThem.png"));
		btnThem.setBackground(new Color(176, 224, 230));
		contentPane.add(btnThem);
		
		JButton btXoa = new JButton("XÓA");
		btXoa.setBounds(275, 295, 119, 30);
		btXoa.setIcon(new ImageIcon("src\\images\\btXoa.png"));
		btXoa.setBackground(new Color(176, 224, 230));
		contentPane.add(btXoa);
		
		JButton btSua = new JButton("SỬA");
		btSua.setBounds(412, 295, 119, 30);
		btSua.setIcon(new ImageIcon("src\\images\\btSua.png"));
		btSua.setBackground(new Color(176, 224, 230));
		contentPane.add(btSua);
		
		JButton btnTimKiem = new JButton("TÌM KIẾM");
		btnTimKiem.setBounds(544, 295, 119, 30);
		btnTimKiem.setIcon(new ImageIcon("src\\images\\btTim.png"));
		btnTimKiem.setBackground(new Color(176, 224, 230));
		contentPane.add(btnTimKiem);
		
		JButton btnQuayLai = new JButton("QUAY LẠI");
		btnQuayLai.setIcon(new ImageIcon("src\\images\\btQuayLai.png"));
		btnQuayLai.setBackground(new Color(176, 224, 230));
		btnQuayLai.setBounds(673, 295, 119, 30);
		contentPane.add(btnQuayLai);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 335, 782, 262);
		contentPane.add(scrollPane);
		
		
		
		
		//table_1 = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"MAHS", "HỌ VÀ TÊN", "TOAN", "VĂN", "ANH", "SINH", "LÍ", "HÓA"
				}
			));
			table.getColumnModel().getColumn(0).setPreferredWidth(69);
			table.getColumnModel().getColumn(1).setPreferredWidth(159);
			table.getColumnModel().getColumn(2).setPreferredWidth(69);
			table.getColumnModel().getColumn(3).setPreferredWidth(68);
			table.getColumnModel().getColumn(4).setPreferredWidth(71);
			table.getColumnModel().getColumn(5).setPreferredWidth(67);
			table.getColumnModel().getColumn(6).setPreferredWidth(67);
			table.getColumnModel().getColumn(7).setPreferredWidth(68);
			scrollPane.setViewportView(table);
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 802, 47);
			panel.setBackground(new Color(100, 149, 237));
			contentPane.add(panel);
			/*label.setVerticalAlignment(JLabel.TOP);
				label.setVerticalTextPosition(JLabel.TOP);
				panel.setAlignmentY(TOP_ALIGNMENT);*/
			JLabel lblNewLabel_7 = new JLabel("QUẢN LÍ ĐIỂM HỌC SINH");
			lblNewLabel_7.setForeground(new Color(173, 255, 47));
			lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 30));
			panel.add(lblNewLabel_7);
			
			//Xử lí sự kiện button Nhập Lại

			btnNhapLai.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnNhapLaiActionPerformed(evt);
				}
			});
			
			//xử lí sự kiện Click table
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent evt) {
					tableMouseClicked(evt);
				}
			});
			
			
			//xử lí sự kiện cho button thêm			
			btnThem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnThemActionPerformed(evt);
				}
			});
			
			//xử lí sự kiện cho button xóa
			btXoa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btXoaActionPerformed(evt);
				}
			});
			
			//xử lí sự kiện button sửa
			btSua.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btSuaActionPerformed(evt);
				}
			});
			
			//xử lí sự kiện cho button tìm kiếm
			btnTimKiem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnTimKiemActionPerformed(evt);
				}
			});
			
			btnQuayLai.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnQuayLaiActionPerformed(evt);
				}
			});
		
		}
	
	private void btnNhapLaiActionPerformed(ActionEvent evt) {
		tfToan.setText("");
		tfAnh.setText("");
		tfVan.setText("");
		tfSinh.setText("");
		tfLi.setText("");
		tfHoa.setText("");
		tfMSHS.setText("");
	}
	
	private void btnThemActionPerformed(ActionEvent evt) {
		
		if (tfToan.getText().equals("")||tfMSHS.getText().equals("")||tfAnh.getText().equals("")||tfVan.getText().equals("")||tfSinh.getText().equals("")||tfLi.getText().equals("")||tfHoa.getText().equals("")){
			JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
        } else {
			try {
			QuanLiDiemHS diemHS = new  QuanLiDiemHS();
			diemHS.setMSHS(tfMSHS.getText());
			diemHS.setToan(Float.parseFloat(tfToan.getText()));
			diemHS.setAnh(Float.parseFloat(tfAnh.getText()));
			diemHS.setVan(Float.parseFloat(tfVan.getText()));
			diemHS.setSinh(Float.parseFloat(tfSinh.getText()));
			diemHS.setLy(Float.parseFloat(tfLi.getText()));
			diemHS.setHoa(Float.parseFloat(tfHoa.getText()));
			
			//Tính điểm trung bình 
			float toan = 0, anh = 0, van = 0, sinh = 0, ly = 0, hoa = 0;
			
			toan = Float.parseFloat(tfToan.getText());
			anh = Float.parseFloat(tfAnh.getText());
			van = Float.parseFloat(tfVan.getText());
			sinh = Float.parseFloat(tfSinh.getText());
			hoa = Float.parseFloat(tfHoa.getText());
			ly = Float.parseFloat(tfLi.getText());
			
			if(toan < 0 || toan > 10 || anh < 0 || anh > 10 || van < 0 || van > 10 || sinh < 0 || sinh > 10 || hoa < 0 || hoa > 10 || ly < 0 || ly > 10) {
				JOptionPane.showMessageDialog(this, "Nhập sai dữ liệu! ");
				return;
			}
			
			QuanLiDiemHocSinhBUS diemHocSinhBUS = new QuanLiDiemHocSinhBUS();
			if(diemHocSinhBUS.themDiemHocSinh(diemHS) != 0) {
				JOptionPane.showMessageDialog(this, "Thêm thành công ! ");
				hienThiDuLieu();
			}else {
				JOptionPane.showMessageDialog(this, "Thêm không thành công ! ");
			}
			
	
			
			
			
			float trungBinh = diemHocSinhBUS.tinhTrungBinh(toan, anh, van, sinh, ly, hoa);
			//float trungBinh = (float)Math.round(((toan + anh + van + hoa + ly + sinh)/6)*100) / 100;
			KetQuaDTO ketQuaDTO = new KetQuaDTO();
			ketQuaDTO.setMSHS(tfMSHS.getText());
			ketQuaDTO.setDiemTrungBinh(trungBinh);
			if(trungBinh >= 8) {
				ketQuaDTO.setHocLuc("Giỏi");
			}else if(trungBinh >= 7 && trungBinh <= 8) {
				ketQuaDTO.setHocLuc("Khá");
			}else if(trungBinh >= 5 && trungBinh <= 7) {
				ketQuaDTO.setHocLuc("Trung bình");
			} else {
				ketQuaDTO.setHocLuc("Yếu");
			}
			
			KetQuaBUS ketQuaBUS = new KetQuaBUS();
			ketQuaBUS.themKetQuaHocLuc(ketQuaDTO);
		}catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this,  "Nhập sai dữ liệu");
		}
      }
	}
	
	
	
	private void btXoaActionPerformed(ActionEvent evt) {
		QuanLiDiemHS diemHS = new  QuanLiDiemHS();
		diemHS.setMSHS(tfMSHS.getText());
		QuanLiDiemHocSinhBUS diemHocSinhBUS = new QuanLiDiemHocSinhBUS();
		if(diemHocSinhBUS.xoaDiemHocSinh(diemHS) != 0) {
			JOptionPane.showMessageDialog(this, "Xóa thành công ! ");
			hienThiDuLieu();
		}else {
			JOptionPane.showMessageDialog(this, "Xóa không thành công ! ");
		}
	}
		
		private void btSuaActionPerformed(ActionEvent evt) {
			if (tfToan.getText().equals("")||tfMSHS.getText().equals("")||tfAnh.getText().equals("")||tfVan.getText().equals("")||tfSinh.getText().equals("")||tfLi.getText().equals("")||tfHoa.getText().equals("")){
	            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin");
	        }else {
				try {
				QuanLiDiemHS diemHS = new  QuanLiDiemHS();
				diemHS.setToan(Float.parseFloat(tfToan.getText()));
				diemHS.setAnh(Float.parseFloat(tfAnh.getText()));
				diemHS.setVan(Float.parseFloat(tfVan.getText()));
				diemHS.setSinh(Float.parseFloat(tfSinh.getText()));
				diemHS.setLy(Float.parseFloat(tfLi.getText()));
				diemHS.setHoa(Float.parseFloat(tfHoa.getText()));
				diemHS.setMSHS(tfMSHS.getText());
				
				//Tính điểm trung bình 
				float toan = 0, anh = 0, van = 0, sinh = 0, ly = 0, hoa = 0;
				
				toan = Float.parseFloat(tfToan.getText());
				anh = Float.parseFloat(tfAnh.getText());
				van = Float.parseFloat(tfVan.getText());
				sinh = Float.parseFloat(tfSinh.getText());
				hoa = Float.parseFloat(tfHoa.getText());
				ly = Float.parseFloat(tfLi.getText());
				
				if(toan < 0 || toan > 10 || anh < 0 || anh > 10 || van < 0 || van > 10 || sinh < 0 || sinh > 10 || hoa < 0 || hoa > 10 || ly < 0 || ly > 10) {
					JOptionPane.showMessageDialog(this, "Nhập sai dữ liệu! ");
					return;
				}
				
				QuanLiDiemHocSinhBUS diemHocSinhBUS = new QuanLiDiemHocSinhBUS();
				if(diemHocSinhBUS.suaDiemHocSinh(diemHS) != 0) {
					JOptionPane.showMessageDialog(this, "Sửa thành công ! ");
					hienThiDuLieu();
				}else {
					JOptionPane.showMessageDialog(this, "Sửa không thành công ! ");
				}
				
				float trungBinh = diemHocSinhBUS.tinhTrungBinh(toan, anh, van, sinh, ly, hoa);
				//float trungBinh = (float)Math.round(((toan + anh + van + hoa + ly + sinh)/6)*100) / 100;
				KetQuaDTO ketQuaDTO = new KetQuaDTO();
				ketQuaDTO.setMSHS(tfMSHS.getText());
				ketQuaDTO.setDiemTrungBinh(trungBinh);
				if(trungBinh >= 8) {
					ketQuaDTO.setHocLuc("Giỏi");
				}else if(trungBinh >= 7 && trungBinh <= 8) {
					ketQuaDTO.setHocLuc("Khá");
				}else if(trungBinh >= 5 && trungBinh <= 7) {
					ketQuaDTO.setHocLuc("Trung bình");
				} else {
					ketQuaDTO.setHocLuc("Yếu");
				}
				
				KetQuaBUS ketQuaBUS = new KetQuaBUS();
				ketQuaBUS.suaKetQuaHocLuc(ketQuaDTO);
				
				}catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(this,  "Nhập sai dữ liệu");
				}
	        }
		}
		
		private void btnTimKiemActionPerformed(ActionEvent evt) {
			String MAHS = "";
            do {
                MAHS = JOptionPane.showInputDialog(this, "Nhập mã học sinh", "MAHS", JOptionPane.OK_OPTION);
                if (MAHS.equals("")) {
                    int confirm = JOptionPane.showConfirmDialog(this, "Xin hãy nhập mã số học sinh", "Mã số trống", JOptionPane.YES_NO_OPTION);
                    if (confirm != 0) {
                        break;
                    }
                }
            } while (MAHS.equals(""));
            QuanLiDiemHocSinhBUS diemHocSinhBUS = new QuanLiDiemHocSinhBUS();
            ArrayList<String> dsMSHS = new ArrayList<String>();	
			dsMSHS = diemHocSinhBUS.layMaHocSinh();
			int j =0;
			for(String ds: dsMSHS) {
				if(ds.equals(MAHS) ) {
					j = 1;
				}					
			}
			
			if (j == 0) {
				JOptionPane.showMessageDialog(this, "không tồn tại mã học sinh");
			}
			
			
            ArrayList<QuanLiDiemHS> dsDiemHS  = diemHocSinhBUS.timDiemHocSinh(MAHS);
			model = (DefaultTableModel)table.getModel();
			model.setRowCount(0);
			for(int i=0; i<dsDiemHS.size(); i++) {
				String MSHS =dsDiemHS.get(i).getMSHS();
				String HoTen =dsDiemHS.get(i).getHocSinh().getHoTen();
				float Toan = dsDiemHS.get(i).getToan();
				float Van = dsDiemHS.get(i).getVan();
				float Anh = dsDiemHS.get(i).getAnh();
				float Sinh = dsDiemHS.get(i).getSinh();
				float Li = dsDiemHS.get(i).getLy();
				float Hoa = dsDiemHS.get(i).getHoa();
				Object[]  row = new Object[]{MSHS, HoTen, Toan, Van, Anh, Sinh, Li, Hoa};
				model.addRow(row);
			}
		}
	
		private void tableMouseClicked(MouseEvent evt) {
			DefaultTableModel recordTable = (DefaultTableModel) table.getModel();
			int i=table.getSelectedRow();
			if (i>=0){
				tfMSHS.setText(recordTable.getValueAt(i, 0).toString());
				tfToan.setText(recordTable.getValueAt(i, 2).toString());
				tfAnh.setText(recordTable.getValueAt(i, 3).toString());
				tfVan.setText(recordTable.getValueAt(i, 4).toString());
				tfSinh.setText(recordTable.getValueAt(i, 5).toString());
				tfLi.setText(recordTable.getValueAt(i, 6).toString());
				tfHoa.setText(recordTable.getValueAt(i, 7).toString());
			
				
				}
			}
		
		private void btnQuayLaiActionPerformed(ActionEvent evt) {
			FrMainForm mainForm;
            mainForm = new FrMainForm();
            mainForm.setVisible(true);
            mainForm.setLocationRelativeTo(null);
            this.dispose();
		}
		
		
		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						QuanLiDiemHocSinh frame = new QuanLiDiemHocSinh();
						//frame.hienThiDuLieu();
						//frame.doDuLieuComboBox();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
}