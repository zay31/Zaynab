import java.awt.CardLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import java.awt.Panel;

public class Transaction extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transaction frame = new Transaction();
					frame.setUndecorated(true);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection = null;
	private JTable table;
	private JTable table_1;
	private JTextField textField;
	private static JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_3;
	
	/**
	 * Create the frame.
	 */
	public Transaction() {
		connection = Database.dbConnector();
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1101, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 648, 1350, 64);
		panel_1.setBackground(SystemColor.scrollbar);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(33, 11, 603, 39);
		panel_1.add(btnNewButton);
		
		JButton btnDone = new JButton("Done");
		btnDone.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDone.setBackground(new Color(0, 128, 0));
		btnDone.setBounds(688, 11, 645, 39);
		panel_1.add(btnDone);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 204));
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(227, 70, 856, 191);
		contentPane.add(table);
		
		
		table_1 = new JTable();
		table_1.setBackground(new Color(255, 255, 204));
		table_1.setBounds(227, 44, 856, 22);
		contentPane.add(table_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 236, 191);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(new Color(255, 255, 204));
		lblNewLabel_2.setIcon(new ImageIcon(Transaction.class.getResource("/images/download.jpg")));
		
		JLabel lblTransaction = new JLabel("Transaction");
		lblTransaction.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTransaction.setBounds(553, 13, 98, 32);
		contentPane.add(lblTransaction);
		//////////////////////////
		DefaultTableModel model =new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Price");
		model.addColumn("Total");
		
		try {
			String query1="SELECT ID,name,price FROM tab";
			PreparedStatement pst=connection.prepareStatement(query1);
			ResultSet rs= pst.executeQuery();
			
			table_1.setModel(DbUtils.resultSetToTableModel(rs));
		}catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			String query="select Pid,Name,Price from transactionperson";
			PreparedStatement pst=connection.prepareStatement(query);
			ResultSet rs= pst.executeQuery();
		
			
			while(rs.next()) {

				model.addRow(new Object[] {
						rs.getInt("Pid"),
						rs.getString("Name"),
						rs.getDouble("Price"),
			});
			}
			
//			rs.close();
//			pst.close();
				
				table.setModel(model);
				table.setAutoResizeMode(0);
				table.getColumnModel().getColumn(0).setPreferredWidth(60);
				table.getColumnModel().getColumn(1).setPreferredWidth(60);
				table.getColumnModel().getColumn(2).setPreferredWidth(60);
				//connection.close();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			String query1="SELECT ID,name,price FROM tab";
			PreparedStatement pst1=connection.prepareStatement(query1);
			ResultSet rs1= pst1.executeQuery();
			
			table_1.setModel(DbUtils.resultSetToTableModel(rs1));
		}catch (Exception e1) {
			e1.printStackTrace();
			
		}
		
		
		JLabel lblNewLabel_3 = new JLabel("Delete Menu");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(881, 300, 103, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblId_1 = new JLabel("ID");
		lblId_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblId_1.setBounds(798, 378, 33, 16);
		contentPane.add(lblId_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(859, 375, 116, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = textField_6.getText();
				try {
					String query3="DELETE FROM product WHERE ID= '"+id+"'";
					PreparedStatement pst=connection.prepareStatement(query3);
					pst.execute();
				    JOptionPane.showMessageDialog(null, "Successful update Menu");

				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnDelete.setBounds(887, 479, 97, 25);
		contentPane.add(btnDelete);
		
		JButton btnAdd = new JButton("Add Menu");
		btnAdd.setBounds(85, 503, 151, 25);
		contentPane.add(btnAdd);
		
		JLabel lblItems = new JLabel("Items Name");
		lblItems.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblItems.setBounds(11, 328, 88, 16);
		contentPane.add(lblItems);
		
		textField = new JTextField();
		textField.setBounds(111, 326, 217, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(111, 375, 217, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrice.setBounds(20, 378, 56, 16);
		contentPane.add(lblPrice);
		
		textField_2 = new JTextField();
		textField_2.setBounds(111, 421, 218, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCategory = new JLabel("Category");
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblCategory.setBounds(20, 424, 79, 16);
		contentPane.add(lblCategory);
		
		JLabel lblAddANew = new JLabel("Add a new Menu");
		lblAddANew.setBounds(85, 300, 143, 16);
		contentPane.add(lblAddANew);
		lblAddANew.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnUpdate = new JButton("Update Menu");
		btnUpdate.setBounds(500, 503, 165, 25);
		contentPane.add(btnUpdate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(469, 326, 209, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblId.setBounds(417, 329, 26, 16);
		contentPane.add(lblId);
		
		Choice choice = new Choice();
		choice.setBounds(469, 375, 209, 22);
		contentPane.add(choice);
		
		JLabel lblField = new JLabel("Field");
		lblField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblField.setBounds(417, 381, 56, 16);
		contentPane.add(lblField);
		
		JLabel lblNewLabel = new JLabel("Update Menu");
		lblNewLabel.setBounds(443, 300, 110, 16);
		contentPane.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel lblValue = new JLabel("VALUE");
		lblValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValue.setBounds(417, 427, 56, 16);
		contentPane.add(lblValue);
		
		textField_5 = new JTextField();
		textField_5.setBounds(469, 424, 209, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(111, 468, 217, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblType = new JLabel("Type");
		lblType.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblType.setBounds(20, 471, 56, 16);
		contentPane.add(lblType);
		choice.add("Items");
		choice.add("Price");
		choice.add("Type");
		choice.add("Category");
		choice.add("Quantity");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField_4.getText();
				String field = choice.getItem(choice.getSelectedIndex());
				String value = textField_5.getText();
				
				try {
					String query2="UPDATE product SET "+field+" = '"+value+"' WHERE ID = "+id+"";
					PreparedStatement pst=connection.prepareStatement(query2);
				    pst.executeUpdate();
				    JOptionPane.showMessageDialog(null, "Successful update Menu");

				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item = textField.getText();
				String price = textField_1.getText();
				String category = textField_2.getText();
				String type = textField_3.getText();
				
				try {
					String query1="INSERT INTO product (Items,Price,Category,Type,Quantity) VALUES ('"+item+"' , '"+price+"','"+category+"','"+type+"',300)";
					PreparedStatement pst=connection.prepareStatement(query1);
					int insert= pst.executeUpdate(query1);
				    JOptionPane.showMessageDialog(null, "Successful insert Menu");

				}catch (Exception e1) {
					e1.printStackTrace();
				}
			   
			}
		});
		
		
		
		
	
		
	
	}
}
