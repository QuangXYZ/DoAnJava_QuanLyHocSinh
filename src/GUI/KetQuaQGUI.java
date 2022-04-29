package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
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





public class KetQuaQGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	static DefaultTableModel model ;
	public JComboBox<String> comboBox;
	private JTextField tfSoLuongHSGioi;
	private JTextField tfSoLuongHSKha;
	private JTextField tfSoLuongHSTrungBinh;
	private JTextField tfSoLuongHSYeu;
	
    
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KetQuaQGUI frame = new KetQuaQGUI();
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
		var maLop = comboBox.getSelectedItem().toString();
		ArrayList<KetQuaDTO> dsHocLuc = ketQuaBUS.docKetQuaHocLuc(maLop);
		model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		for(KetQuaDTO ds: dsHocLuc) {
			Object[] row = new Object[] {ds.getMSHS(), ds.getHocSinh().getHoTen(), ds.getHocSinh().getLop(), ds.getDiemTrungBinh(), ds.getHocLuc()};
			model.addRow(row);
		}
	}
	
	public KetQuaQGUI() {
		setTitle("TH\u1ED0NG K\u00CA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 695, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbChonTenLop = new JLabel("Ch\u1ECDn T\u00EAn L\u1EDBp: ");
		lbChonTenLop.setBounds(10, 69, 120, 35);
		lbChonTenLop.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lbChonTenLop);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(197, 71, 96, 35);
		//comboBox.setActionCommand("Select Table");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				comboBoxActionPerformed(evt);
			}
			private void comboBoxActionPerformed(ActionEvent evt) {
				hienThiDuLieu();
			}
		});
		contentPane.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 285, 661, 188);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				" MAHS", "            H\u1ECC V\u00C0 T\u00CAN", "L\u1EDAP", "\u0110I\u1EC2M TRUNG B\u00CCNH", "H\u1ECCC L\u1EF0C"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(195);
		table.getColumnModel().getColumn(3).setPreferredWidth(105);
		scrollPane.setViewportView(table);
		
		JLabel lbSoLuongHSGioi = new JLabel("Số lượng học sinh Giỏi");
		lbSoLuongHSGioi.setBounds(10, 125, 151, 38);
		contentPane.add(lbSoLuongHSGioi);
		
		JLabel lbSoLuongHSKha = new JLabel("Số lượng học sinh khá");
		lbSoLuongHSKha.setBounds(10, 196, 151, 35);
		contentPane.add(lbSoLuongHSKha);
		
		tfSoLuongHSGioi = new JTextField();
		tfSoLuongHSGioi.setBounds(197, 127, 96, 35);
		contentPane.add(tfSoLuongHSGioi);
		tfSoLuongHSGioi.setColumns(10);
		tfSoLuongHSGioi.setEditable(false);
		
		tfSoLuongHSKha = new JTextField();
		tfSoLuongHSKha.setBounds(197, 196, 96, 35);
		contentPane.add(tfSoLuongHSKha);
		tfSoLuongHSKha.setColumns(10);
		tfSoLuongHSKha.setEditable(false);
		
		JLabel lbSoLuongHSTrungBinh = new JLabel("Số lượng học sinh trung bình");
		lbSoLuongHSTrungBinh.setBounds(358, 125, 183, 38);
		contentPane.add(lbSoLuongHSTrungBinh);
		
		tfSoLuongHSTrungBinh = new JTextField();
		tfSoLuongHSTrungBinh.setBounds(575, 129, 96, 35);
		contentPane.add(tfSoLuongHSTrungBinh);
		tfSoLuongHSTrungBinh.setColumns(10);
		tfSoLuongHSTrungBinh.setEditable(false);
		
		JLabel lbSoLuongHSYeu = new JLabel("Số lượng học sinh yếu");
		lbSoLuongHSYeu.setBounds(358, 196, 183, 35);
		contentPane.add(lbSoLuongHSYeu);
		
		tfSoLuongHSYeu = new JTextField();
		tfSoLuongHSYeu.setColumns(10);
		tfSoLuongHSYeu.setBounds(575, 196, 96, 35);
		contentPane.add(tfSoLuongHSYeu);
		tfSoLuongHSYeu.setEditable(false);
	}	
	
	public void doDuLieuComboBox() {
		KetQuaBUS ketQuaBUS = new KetQuaBUS();
		ArrayList<KetQuaDTO> dsMaLop = ketQuaBUS.doDuLieuComboBox();
		for(KetQuaDTO ds: dsMaLop) {
			comboBox.addItem(ds.getHocSinh().getLop());
		}
	}
}