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

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class QuanLiDiemHocSinh extends JFrame {
	private JPanel contentPane;
	private JTextField tfToan;
	private JTextField tfSinh;
	private JTextField tfLi;
	private JTextField tfHoa;
	private JTextField tfAnh;
	private JTextField tfVan;
	private JTable table = new JTable();
	private JComboBox<String> comboBox = new JComboBox<String>();
	String url="jdbc:mysql://Localhost:3306/qlhs";
	String user="root";
	String password="12345678";
	
	Connection connection = null;
	PreparedStatement statement = null;
	ResultSet rs = null;
	int q, i;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLiDiemHocSinh frame = new QuanLiDiemHocSinh();
					frame.loadData();
					frame.doDuLieuComboBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	/**
	 * Create the frame.
	 */
	private void loadData() {
		try {
			connection = (Connection) DriverManager.getConnection(url, user, password);
			String sql = ("SELECT HS.MAHS, HS.HOTEN, DHS.TOAN, DHS.ANH, DHS.VAN, DHS.SINH, DHS.LI, DHS.HOA FROM HOCSINH HS, DIEMHOCSINH DHS WHERE HS.MAHS = DHS.MAHS");
			statement = connection.prepareStatement(sql);
			rs = statement.executeQuery();
			
			ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
			q = stData.getColumnCount();
			
			DefaultTableModel recordTable = (DefaultTableModel)table.getModel();
			recordTable.setRowCount(0);
			
			while(rs.next()) {
				Vector<String> columnData = new Vector<String>();
				for(int i=1; i <= q; i++) {
					columnData.add(rs.getString(1));
					columnData.add(rs.getString(2));
					columnData.add(Float.toString(rs.getFloat(3)));
					columnData.add(Float.toString(rs.getFloat(4)));
					columnData.add(Float.toString(rs.getFloat(5)));
					columnData.add(Float.toString(rs.getFloat(6)));
					columnData.add(Float.toString(rs.getFloat(7)));
					columnData.add(Float.toString(rs.getFloat(8)));
					
				}
				recordTable.addRow(columnData);
				
			}
			System.out.println("kết nối thành công");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public QuanLiDiemHocSinh() {
		
		setTitle("QUAN LÍ ĐIỂM HỌC SINH");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 644);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Điểm Toán");
		lblNewLabel.setBounds(26, 26, 90, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Điểm Anh");
		lblNewLabel_1.setBounds(26, 89, 90, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Điểm Văn");
		lblNewLabel_2.setBounds(26, 160, 90, 30);
		contentPane.add(lblNewLabel_2);
		
		tfToan = new JTextField();
		tfToan.setBounds(212, 26, 96, 31);
		contentPane.add(tfToan);
		tfToan.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Điểm Sinh");
		lblNewLabel_3.setBounds(450, 26, 90, 30);
		contentPane.add(lblNewLabel_3);
		
		tfSinh = new JTextField();
		tfSinh.setBounds(673, 26, 96, 30);
		contentPane.add(tfSinh);
		tfSinh.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Điểm Lí");
		lblNewLabel_4.setBounds(450, 98, 90, 30);
		contentPane.add(lblNewLabel_4);
		
		tfLi = new JTextField();
		tfLi.setBounds(673, 89, 96, 30);
		contentPane.add(tfLi);
		tfLi.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Điểm Hóa");
		lblNewLabel_5.setBounds(450, 152, 90, 30);
		contentPane.add(lblNewLabel_5);
		
		tfHoa = new JTextField();
		tfHoa.setBounds(673, 152, 96, 33);
		contentPane.add(tfHoa);
		tfHoa.setColumns(10);
		
		tfVan = new JTextField();
		tfVan.setBounds(212, 90, 96, 30);
		contentPane.add(tfVan);
		tfVan.setColumns(10);
		
		tfAnh = new JTextField();
		tfAnh.setBounds(212, 155, 96, 30);
		contentPane.add(tfAnh);
		tfAnh.setColumns(10);
		
		JButton btnThem = new JButton("THÊM");
		btnThem.setBackground(new Color(176, 224, 230));
		btnThem.setBounds(26, 295, 96, 30);
		contentPane.add(btnThem);
		
		JButton btXoa = new JButton("XÓA");
		btXoa.setBackground(new Color(176, 224, 230));
		btXoa.setBounds(237, 295, 96, 30);
		contentPane.add(btXoa);
		
		JButton btSua = new JButton("SỬA");
		btSua.setBackground(new Color(176, 224, 230));
		btSua.setBounds(444, 295, 96, 30);
		contentPane.add(btSua);
		
		JButton btnTimKiem = new JButton("TÌM KIẾM");
		btnTimKiem.setBackground(new Color(176, 224, 230));
		btnTimKiem.setBounds(673, 295, 96, 30);
		contentPane.add(btnTimKiem);
		
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
			
			JLabel lblNewLabel_6 = new JLabel("MAHS");
			lblNewLabel_6.setBounds(26, 214, 90, 30);
			contentPane.add(lblNewLabel_6);
			
			
			
			comboBox.setBounds(212, 214, 90, 26);
			contentPane.add(comboBox);		
		
			//xử lí sự kiện Click table
			table.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent evt) {
					tableMouseClicked(evt);
				}
			});
			
			//xử lí sự kiện cho JcomboBox
			comboBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					comboBoxActionPerformed(evt);
				}
				
				public void comboBoxActionPerformed(ActionEvent evt) {
					String MaLoaiSP = (String)comboBox.getSelectedItem().toString();
				}
			});
			
			
			//xử lí sự kiện cho button thêm			
			btnThem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnThemActionPerformed(evt);
				}

				private void btnThemActionPerformed(ActionEvent evt) {
					try {
					connection = (Connection) DriverManager.getConnection(url, user, password);
					String sql = ("insert into DIEMHOCSINH (MAHS, TOAN, ANH, VAN, SINH, LI, HOA) value(?, ?, ?, ?, ?, ?, ?)");
					statement = connection.prepareStatement(sql);
					
					statement.setString(1, comboBox.getSelectedItem().toString());
					statement.setString(2, tfToan.getText());
					statement.setString(3, tfAnh.getText());
					statement.setString(4, tfVan.getText());
					statement.setString(5, tfSinh.getText());
					statement.setString(6, tfLi.getText());
					statement.setString(7, tfHoa.getText());
					
					statement.executeUpdate();
					} catch (Exception e) {
						System.out.println(e);
					}
				loadData();
					
				}
			});
			
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
			
			btnTimKiem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					btnTimKiemActionPerformed(evt);
				}
			});
		
		}
	
		private void btXoaActionPerformed(ActionEvent evt) {
			DefaultTableModel recordTable = (DefaultTableModel) table.getModel();
			int i=table.getSelectedRow();
			try {
				connection = (Connection) DriverManager.getConnection(url, user, password);
				String sql = ("delete from DIEMHOCSINH where MAHS = ?");
				statement = connection.prepareStatement(sql);
				
				statement.setString(1, recordTable.getValueAt(i, 0).toString());
				
					statement.executeUpdate();
				} catch (Exception e) {
					System.out.println(e);
				}
			loadData();
		}
		
		private void btSuaActionPerformed(ActionEvent evt) {
			int i=table.getSelectedRow();
			try {
				connection = (Connection) DriverManager.getConnection(url, user, password);
				String sql = ("update DIEMHOCSINH set TOAN = ?, ANH = ?, VAN = ?, SINH = ?, LI = ?, HOA = ?" + "where MAHS = ?");
				statement = connection.prepareStatement(sql);
				statement.setString(1, tfToan.getText());
				statement.setString(2, tfAnh.getText());
				statement.setString(3, tfVan.getText());
				statement.setString(4, tfSinh.getText());
				statement.setString(5, tfLi.getText());
				statement.setString(6, tfHoa.getText());
				statement.setString(7, comboBox.getSelectedItem().toString());
				
					statement.executeUpdate();
				} catch (Exception e) {
					System.out.println(e);
				}
			loadData();
		}
		
		private void btnTimKiemActionPerformed(ActionEvent evt) {
			String MAHS = JOptionPane.showInputDialog(null,"Nhập mã học sinh");
			try {
				connection = (Connection) DriverManager.getConnection(url, user, password);
				String sql = ("select HS.MAHS, HS.HOTEN, TOAN, ANH, VAN, SINH, LI, HOA FROM HOCSINH HS, DIEMHOCSINH DHS WHERE HS.MAHS = DHS.MAHS AND DHS.MAHS = ?");
				statement = connection.prepareStatement(sql);
				statement.setString(1, MAHS);
				rs = statement.executeQuery();
				
				ResultSetMetaData stData = (ResultSetMetaData) rs.getMetaData();
				q = stData.getColumnCount();
				
				DefaultTableModel recordTable = (DefaultTableModel)table.getModel();
				recordTable.setRowCount(0);
				
				if(rs.next()) {
					//System.out.println("TÊN: " + rs.getString(2));
					Vector<String> columnData = new Vector<String>();
					for(int i=1; i <= q; i++) {
						columnData.add(rs.getString(1));
						columnData.add(rs.getString(2));
						columnData.add(Float.toString(rs.getFloat(3)));
						columnData.add(Float.toString(rs.getFloat(4)));
						columnData.add(Float.toString(rs.getFloat(5)));
						columnData.add(Float.toString(rs.getFloat(6)));
						columnData.add(Float.toString(rs.getFloat(7)));
						columnData.add(Float.toString(rs.getFloat(8)));
						
					}
					recordTable.addRow(columnData);
					
				} else {
					JOptionPane.showMessageDialog(null, "không tồn tại mã học sinh");
				}
				System.out.println("kết nối thành công");
			} catch (Exception e) {
				System.out.println(e);
			}
		
		}
	
		private void tableMouseClicked(MouseEvent evt) {
			DefaultTableModel recordTable = (DefaultTableModel) table.getModel();
			int i=table.getSelectedRow();
			if (i>=0){
				comboBox.setSelectedItem(recordTable.getValueAt(i, 0).toString());
				tfToan.setText(recordTable.getValueAt(i, 2).toString());
				tfAnh.setText(recordTable.getValueAt(i, 3).toString());
				tfVan.setText(recordTable.getValueAt(i, 4).toString());
				tfSinh.setText(recordTable.getValueAt(i, 5).toString());
				tfLi.setText(recordTable.getValueAt(i, 6).toString());
				tfHoa.setText(recordTable.getValueAt(i, 7).toString());
			
				
				}
			}
	
		private void doDuLieuComboBox() {
			try {
				
				String url="jdbc:mysql://Localhost:3306/QLHS";
				String user="root";
				String password="12345678";
				Connection connection=(Connection) DriverManager.getConnection(url, user, password);
				Statement stmt=connection.createStatement();
				ResultSet rs = stmt.executeQuery("select MAHS from HOCSINH  ");
				comboBox.removeAllItems();//xóa tất cả các mục được hiển thị trong comboBox
		
				while(rs.next())
	            {
					//đổ dữ liệu vào conboBox
					comboBox.addItem(rs.getString("MAHS"));
	            }
					rs.close();
					stmt.close();
					connection.close();
					
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Kết nối thất bại");
				}
		}
}
