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

public class TimKiem extends JFrame {

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
					TimKiem frame = new TimKiem();
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
	public TimKiem() {
		setTitle("T\u00ECm Ki\u1EBFm H\u1ECDc Sinh");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(176, 224, 230));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"M\u00E3 h\u1ECDc sinh", "T\u00EAn h\u1ECDc sinh"}));
		comboBox.setBounds(21, 22, 111, 21);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(162, 23, 129, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("T\u00ECm Ki\u1EBFm");
		btnNewButton.setBackground(new Color(176, 224, 230));
		btnNewButton.setBounds(318, 22, 108, 21);
		contentPane.add(btnNewButton);
		
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"MSHS", "H\u1ECD v\u00E0 t\u00EAn", "Gi\u1EDBi t\u00EDnh", "Qu\u00EA qu\u00E1n", "L\u1EDBp", "\u0110i\u1EC3m to\u00E1n", "\u0110i\u1EC3m v\u0103n", "\u0110i\u1EC3m ti\u1EBFng anh", "\u0110i\u1EC3m l\u00ED", "\u0110i\u1EC3m h\u00F3a"
			}
		) {
			Class[] columnTypes = new Class[] {
				Integer.class, String.class, String.class, String.class, String.class, Double.class, Double.class, Double.class, Double.class, Double.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(65);
		table.setBounds(21, 65, 405, 188);
		contentPane.add(table);
	}
}
