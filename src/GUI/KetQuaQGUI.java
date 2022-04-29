package GUI;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

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
import BUS.QuanLiDiemHocSinhBUS;
import DAO.KetQuaDAO;
import DTO.HocSinh;
import DTO.KetQuaDTO;
import DTO.QuanLiDiemHS;
import sql.MyConnection;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;





public class KetQuaQGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	static DefaultTableModel model ;
	public JComboBox<String> comboBox;
	private Connection connection = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    //public String maLop;

	/**
	 * Launch the application.
	 */
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
		//maLop = comboBox.getSelectedItem().toString();
		//System.out.println(maLop);
		//System.out.println(layMaLopTuComboBox() );
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
		
		JLabel lblNewLabel = new JLabel("Ch\u1ECDn T\u00EAn L\u1EDBp: ");
		lblNewLabel.setBounds(10, 69, 120, 35);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(173, 71, 120, 35);
		//comboBox.setActionCommand("Select Table");
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				comboBoxActionPerformed(evt);
			}
			private void comboBoxActionPerformed(ActionEvent evt) {
				//hienThiDuLieu();
			}
		});
		contentPane.add(comboBox);
		
		
		
		
		
		JButton btnNewButton = new JButton("Xuất danh sách");
		btnNewButton.setBounds(358, 69, 165, 35);
		btnNewButton.setActionCommand("Xuất danh sách");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				btnNewButtonActionPerformed(evt);
			}
			private void btnNewButtonActionPerformed(ActionEvent evt) {
				if(evt.getActionCommand().equals("Xuất danh sách")){
					
					hienThiDuLieu();
					
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(176, 224, 230));
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 165, 661, 252);
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
	}	
	
	public void doDuLieuComboBox() {
		KetQuaBUS ketQuaBUS = new KetQuaBUS();
		ArrayList<KetQuaDTO> dsMaLop = ketQuaBUS.doDuLieuComboBox();
		//comboBox.addItem(dsMaLop);
		for(KetQuaDTO ds: dsMaLop) {
			comboBox.addItem(ds.getHocSinh().getLop());
		}
	}
	
	/*private void doDuLieuComboBox() {
		try {
			connection = MyConnection.getConnection();
			String sql = ("select DISTINCT LOP from HOCSINH;  ");
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			comboBox.removeAllItems();//xóa tất cả các mục được hiển thị trong comboBox

			while(resultSet.next())
            {
				//đổ dữ liệu vào conboBox
				comboBox.addItem(resultSet.getString("LOP"));
            }
			resultSet.close();
				preparedStatement.close();
				connection.close();

			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Kết nối thất bại");
			}
	}*/
	
	
	
    public ArrayList<KetQuaDTO> KetQuaHocLuc(){
    	ArrayList<KetQuaDTO> dsKetQuaHocLuc = new ArrayList<KetQuaDTO>();
        try {
        	
			String sql = ("select HS.MAHS, HS.HOTEN, HS.LOP, KQ.DIEMTB, KQ.HOCLUC from HOCSINH HS, KETQUA KQ where HS.MAHS = KQ.MAHS AND  HS.LOP= '" + comboBox.getSelectedItem().toString()+"'");
			connection = MyConnection.getConnection();
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				KetQuaDTO KQ = new KetQuaDTO();
				HocSinh hocSinh = new HocSinh();
				KQ.setMSHS(resultSet.getString(1));
				hocSinh.setHoTen(resultSet.getString(2));
				hocSinh.setLop(resultSet.getString(3));
				KQ.setDiemTrungBinh(resultSet.getFloat(4));
				KQ.setHocLuc(resultSet.getString(5));
				KQ.setHocSinh(hocSinh);
				dsKetQuaHocLuc.add(KQ);
			}
         
        } catch (SQLException ex) {
            System.out.println("error "+ex );
        }
         finally{
            try {
                connection.close();
                preparedStatement.close();
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(KetQuaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return dsKetQuaHocLuc;
    }
}