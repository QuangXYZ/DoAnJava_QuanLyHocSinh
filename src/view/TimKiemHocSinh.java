package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TimKiemHocSinh extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimKiemHocSinh frame = new TimKiemHocSinh();
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
	public TimKiemHocSinh() {
		setTitle("TÌM KIẾM HỌC SINH");
		setBackground(new Color(240, 240, 240));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 570);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mã Học Sinh", "Tên Học Sinh"}));
		comboBox.setBackground(new Color(176, 224, 230));
		comboBox.setBounds(28, 48, 195, 37);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(318, 48, 169, 37);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setBounds(574, 48, 121, 35);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"MSHS", "Họ Và Tên", "Ngày Sinh", "Giới Tính", "Quê Quán", "Lớp", "Toán", "Văn", "Anh", "Hóa", "Lý", "Sinh"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Object.class, String.class, String.class, String.class, Double.class, Double.class, Object.class, Double.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(25, 138, 670, 365);
		contentPane.add(table);
	}
}
