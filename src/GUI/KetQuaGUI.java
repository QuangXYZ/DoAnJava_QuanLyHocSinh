package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import BUS.KetQuaBUS;
import DTO.KetQuaDTO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.ImageIcon;





public class KetQuaGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	static DefaultTableModel model ;
	public JComboBox<String> comboBox;
	private JTextField tfSoLuongHSGioi;
	private JTextField tfSoLuongHSKha;
	private JTextField tfSoLuongHSTrungBinh;
	private JTextField tfSoLuongHSYeu;
	private JTextField tfTongSoHocSinh;
	
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KetQuaGUI frame = new KetQuaGUI();
					
					frame.doDuLieuComboBox();
					//frame.hienThiDuLieu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	 
	
	public void hienThiDuLieu() {
		KetQuaBUS ketQuaBUS = new KetQuaBUS();
		String maLop = comboBox.getSelectedItem().toString();
		
		ArrayList<KetQuaDTO> dsHocLuc = ketQuaBUS.docKetQuaHocLuc(maLop);
		model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for(KetQuaDTO ds: dsHocLuc) {
			Object[] row = new Object[] {ds.getMSHS(), ds.getHocSinh().getHoTen(), ds.getHocSinh().getLop(), ds.getDiemTrungBinh(), ds.getHocLuc()};
			model.addRow(row);
		}
		
		ArrayList<KetQuaDTO> soLuongHSKha = ketQuaBUS.laySoLuongHSKha(maLop);
		for(KetQuaDTO sl: soLuongHSKha) {
			tfSoLuongHSKha.setText(sl.getSlHocSinhKha());
		}
		
		ArrayList<KetQuaDTO> soLuongHSGioi = ketQuaBUS.laySoLuongHSGioi(maLop);
		for(KetQuaDTO sl: soLuongHSGioi) {
			tfSoLuongHSGioi.setText(sl.getSlHocSinhGioi());
		}
		
		ArrayList<KetQuaDTO> soLuongHSTrungBinh = ketQuaBUS.laySoLuongHSTrungBinh(maLop);
		for(KetQuaDTO sl: soLuongHSTrungBinh) {
			tfSoLuongHSTrungBinh.setText(sl.getSlHocSinhTrungBinh());
		}
		
		ArrayList<KetQuaDTO> soLuongHSYeu = ketQuaBUS.laySoLuongHSYeu(maLop);
		for(KetQuaDTO sl: soLuongHSYeu) {
			tfSoLuongHSYeu.setText(sl.getSlHocsinhYeu());
		}
		
		ArrayList<KetQuaDTO> tongSoHocSinh = ketQuaBUS.layTongSoHocSinh(maLop);
		for(KetQuaDTO sl: tongSoHocSinh) {
			tfTongSoHocSinh.setText(sl.getTongSoHocSinh());
		}
	}
	
	
	
	
	public KetQuaGUI() {
		setTitle("THỐNG KÊ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 520);
		contentPane = new JPanel();
		/*
		 * contentPane.setBackground(new Color(224, 255, 255));
		 * contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 */
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		  JLabel background = new JLabel(); background.setBounds(0, 0, 816, 607);
		  background.setIcon(new ImageIcon(new
		  ImageIcon("src//images//brThongKe.jpg").getImage().getScaledInstance(
		  background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH)));
		  contentPane.add(background);
		 
		JLabel lbChonTenLop = new JLabel("Chọn tên lớp: ");
		lbChonTenLop.setBounds(54, 78, 120, 35);
		
		background.add(lbChonTenLop);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(184, 80, 96, 35);
		//comboBox.setActionCommand("Select Table");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				comboBoxActionPerformed(evt);
			}
			private void comboBoxActionPerformed(ActionEvent evt) {
				hienThiDuLieu();
			}
		});
		background.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 330, 661, 143);
		background.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				" MAHS", "HỌ VÀ TÊN", "LỚP", "ĐIỂM TRUNG BÌNH", "HỌC LỰC"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(195);
		table.getColumnModel().getColumn(3).setPreferredWidth(105);
		scrollPane.setViewportView(table);
		
		JLabel lbSoLuongHSGioi = new JLabel("Số lượng học sinh Giỏi");
		lbSoLuongHSGioi.setBounds(54, 143, 151, 38);
		background.add(lbSoLuongHSGioi);
		
		JLabel lbSoLuongHSKha = new JLabel("Số lượng học sinh khá");
		lbSoLuongHSKha.setBounds(54, 205, 151, 35);
		background.add(lbSoLuongHSKha);
		
		tfSoLuongHSGioi = new JTextField();
		tfSoLuongHSGioi.setBounds(229, 145, 51, 35);
		background.add(tfSoLuongHSGioi);
		tfSoLuongHSGioi.setColumns(10);
		tfSoLuongHSGioi.setEditable(false);
		
		tfSoLuongHSKha = new JTextField();
		tfSoLuongHSKha.setBounds(229, 205, 51, 35);
		background.add(tfSoLuongHSKha);
		tfSoLuongHSKha.setColumns(10);
		tfSoLuongHSKha.setEditable(false);
		
		JLabel lbSoLuongHSTrungBinh = new JLabel("Số lượng học sinh trung bình");
		lbSoLuongHSTrungBinh.setBounds(358, 143, 183, 38);
		background.add(lbSoLuongHSTrungBinh);
		
		tfSoLuongHSTrungBinh = new JTextField();
		tfSoLuongHSTrungBinh.setBounds(575, 145, 51, 35);
		background.add(tfSoLuongHSTrungBinh);
		tfSoLuongHSTrungBinh.setColumns(10);
		tfSoLuongHSTrungBinh.setEditable(false);
		
		JLabel lbSoLuongHSYeu = new JLabel("Số lượng học sinh yếu");
		lbSoLuongHSYeu.setBounds(358, 205, 183, 35);
		background.add(lbSoLuongHSYeu);
		
		tfSoLuongHSYeu = new JTextField();
		tfSoLuongHSYeu.setBounds(575, 205, 51, 35);
		tfSoLuongHSYeu.setColumns(10);
		background.add(tfSoLuongHSYeu);
		tfSoLuongHSYeu.setEditable(false);
		
		JLabel lbTongSoHocSinh = new JLabel("Tổng số học sinh");
		lbTongSoHocSinh.setBounds(358, 80, 183, 35);
		background.add(lbTongSoHocSinh);
		
		tfTongSoHocSinh = new JTextField();
		tfTongSoHocSinh.setBounds(575, 80, 50, 35);
		background.add(tfTongSoHocSinh);
		tfTongSoHocSinh.setColumns(10);
		tfTongSoHocSinh.setEditable(false);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 691, 49);
		panel.setBackground(new Color(65, 105, 225));
		background.add(panel);
		
		JLabel lblNewLabel = new JLabel("THỐNG KÊ");
		lblNewLabel.setForeground(new Color(173, 255, 47));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(10, 0, 661, 45);
		panel.add(lblNewLabel);
		
		JButton btQuayLai = new JButton("QUAY lẠI");
		btQuayLai.setBounds(49, 274, 120, 35);
		btQuayLai.setBackground(new Color(176, 224, 230));
		btQuayLai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnQuayLaiActionPerformed( evt);
			}
		});
		btQuayLai.setIcon(new ImageIcon("src\\images\\btQuayLai.png"));
		background.add(btQuayLai);
		
		JButton btnXuatFileExcel = new JButton("XUẤT EXCEL");
		btnXuatFileExcel.setBackground(new Color(176, 224, 230));
		btnXuatFileExcel.setIcon(new ImageIcon("src\\images\\import.png"));
		btnXuatFileExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnXuatFileExcelLaiActionPerformed( evt);
			}
		});
		btnXuatFileExcel.setBounds(210, 274, 131, 35);
		background.add(btnXuatFileExcel);
		
	}	
	
	public void doDuLieuComboBox() {
		KetQuaBUS ketQuaBUS = new KetQuaBUS();
		ArrayList<KetQuaDTO> dsMaLop = ketQuaBUS.doDuLieuComboBox();
		for(KetQuaDTO ds: dsMaLop) {
			comboBox.addItem(ds.getHocSinh().getLop());
		}
	}
	
	private void btnQuayLaiActionPerformed(ActionEvent evt) {
		FrMainForm mainForm;
        mainForm = new FrMainForm();
        mainForm.setVisible(true);
        mainForm.setLocationRelativeTo(null);
        this.dispose();
	}
	
	private void btnXuatFileExcelLaiActionPerformed(ActionEvent evt) {
		KetQuaBUS ketQuaBUS = new KetQuaBUS();
		String maLop = comboBox.getSelectedItem().toString();
		ketQuaBUS.xuatFileExcel(maLop);
	}
}