package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;

public class TimKiemGiaoVien extends JFrame {

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
					TimKiemGiaoVien frame = new TimKiemGiaoVien();
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
	public TimKiemGiaoVien() {
		setTitle("TÌM KIẾM GIÁO VIÊN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(176, 224, 230));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mã Số Giáo Viên", "Tên Giáo Viên"}));
		comboBox.setBounds(29, 58, 160, 34);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(298, 59, 185, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Tìm Kiếm");
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setBounds(614, 58, 128, 33);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"MSGV", "Họ Và Tên", "Ngày sinh", "Giới Tính", "Quê quán", "Giảng Dạy môn"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Object.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(29, 144, 713, 409);
		contentPane.add(table);
	}
}
