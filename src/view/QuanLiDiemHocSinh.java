package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class QuanLiDiemHocSinh extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuanLiDiemHocSinh frame = new QuanLiDiemHocSinh();
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
	public QuanLiDiemHocSinh() {
		setTitle("QUAN LÍ ĐIỂM HOC SINH");
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
		
		textField = new JTextField();
		textField.setBounds(212, 26, 96, 31);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Điểm Sinh");
		lblNewLabel_3.setBounds(450, 26, 90, 30);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(673, 26, 96, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Điểm Lí");
		lblNewLabel_4.setBounds(450, 98, 90, 30);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(673, 89, 96, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Điểm Hóa");
		lblNewLabel_5.setBounds(450, 152, 90, 30);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(673, 152, 96, 33);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(212, 90, 96, 30);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(212, 155, 96, 30);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("THÊM");
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setBounds(26, 254, 96, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("XÓA");
		btnNewButton_1.setBackground(new Color(176, 224, 230));
		btnNewButton_1.setBounds(194, 254, 96, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("SỬA");
		btnNewButton_2.setBackground(new Color(176, 224, 230));
		btnNewButton_2.setBounds(357, 254, 96, 30);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("LƯU");
		btnNewButton_3.setBackground(new Color(176, 224, 230));
		btnNewButton_3.setBounds(517, 254, 96, 30);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("TÌM KIẾM");
		btnNewButton_4.setBackground(new Color(176, 224, 230));
		btnNewButton_4.setBounds(673, 254, 96, 30);
		contentPane.add(btnNewButton_4);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"MSHS", "H\u1ECC V\u00C0 T\u00CAN", "TO\u00C1N", "ANH", "V\u0102N", "SINH", "L\u00CD", "H\u00D3A"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Double.class, Double.class, Double.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setBounds(26, 339, 743, 243);
		contentPane.add(table);
	}
}
