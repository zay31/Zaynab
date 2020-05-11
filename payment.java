import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.ListModel;

import java.sql.*;
import javax.swing.JOptionPane;

public class payment extends JFrame {

	Connection connection = null;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					payment frame = new payment();
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
	public payment() {
		connection = Database.dbConnector();
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1101, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 
			
			JTextField textField = new JTextField();
		
		JButton cashbutton = new JButton("Cash");
		cashbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					new Receipt().setVisible(true);
		             dispose();
			}
		});
		
		
	
		cashbutton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		cashbutton.setBounds(261, 296, 156, 75);
		contentPane.add(cashbutton);
		
		JButton btnNewButton_1 = new JButton("Credit Card");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new CreditForm().setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(667, 296, 156, 75);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(payment.class.getResource("/image/pay1.jpg")));
		lblNewLabel.setBounds(0, 0, 1132, 600);
		contentPane.add(lblNewLabel);
		
		//connection.close();
	}
}
