import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTable;

import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Receipt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	Connection connection = null;
	private JTable table;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Receipt frame = new Receipt();
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
	public Receipt() {
		connection = Database.dbConnector();
		setUndecorated(true);
		setBackground(UIManager.getColor("Button.highlight"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaptionBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JButton btnPrint = new JButton("Done");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new Startpage().setVisible(true);
				dispose();
			 
			
				}
				
				
			
		});
		btnPrint.setFont(new Font("Calibri", Font.PLAIN, 14));
		btnPrint.setBounds(240, 416, 111, 47);
		contentPane.add(btnPrint);
		
		

		JTextPane txtpnGh = new JTextPane();
		txtpnGh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		txtpnGh.setText("============================\r\n\tcoffee shop\r\ncontact No-1234567\r\nAdress-2,Glasgow street\r\n============================\r\n");
		txtpnGh.setBounds(144, 56, 296, 97);
		contentPane.add(txtpnGh);
		
		JLabel lblYourPaymentIs = new JLabel("Receipt");
		lblYourPaymentIs.setHorizontalAlignment(SwingConstants.CENTER);
		lblYourPaymentIs.setForeground(new Color(47, 79, 79));
		lblYourPaymentIs.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 18));
		lblYourPaymentIs.setBounds(156, 13, 276, 38);
		contentPane.add(lblYourPaymentIs);
		
		table = new JTable();
		table.setShowGrid(false);
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setBounds(144, 153, 296, 250);
		contentPane.add(table);
		
		
		DefaultTableModel model =new DefaultTableModel();
		model.addColumn("Name");
		model.addColumn("Price");
		//model.addColumn("Total");
		
		
		String query="SELECT Name,Price FROM transactionperson";
		try {
			PreparedStatement pst1= connection.prepareStatement(query);
			ResultSet rs1 = pst1.executeQuery();
			
		
			
			while(rs1.next()) {

				model.addRow(new Object[] {
				rs1.getString("Name"),
				rs1.getDouble("Price"),
				//rs1.getDouble("total"),
			});
			}
				rs1.close();
				pst1.close();
				//connection.close();
				
				table.setModel(model);
				table.setAutoResizeMode(0);
				table.getColumnModel().getColumn(0).setPreferredWidth(30);
				table.getColumnModel().getColumn(1).setPreferredWidth(30);
				//table.getColumnModel().getColumn(2).setPreferredWidth(30);
				
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		
//		try {
//			String query1="SELECT tot_price FROM totalcost";
//			PreparedStatement pst= connection.prepareStatement(query1);
//			ResultSet rs = pst.executeQuery();
//			table.setModel(DbUtils.resultSetToTableModel(rs));
//		}catch(Exception e)
//		{
//			
//		}
		
//		JButton btnNewButton = new JButton("Print receipt");
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				
//				try {
//
//					String query="SELECT Name,Price,total FROM transactionperson";
//					PreparedStatement pst= connection.prepareStatement(query);
//								
//					ResultSet rs = pst.executeQuery();
//				table.setModel(DbUtils.resultSetToTableModel(rs));
//				//}
//				}catch(Exception ex){
//					ex.printStackTrace();
//				}
//				
//				
//
//			}
//		});
//
//			
//		btnNewButton.setBounds(148, 415, 105, 46);
//		contentPane.add(btnNewButton);
	}
}
