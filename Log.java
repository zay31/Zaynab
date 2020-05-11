import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;

import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Log extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Log frame = new Log();
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
	Connection connection = null;
	public Log() {
		connection = Database.dbConnector();
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1101, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Product.class.getResource("/image/login6.jpg")));
		lblNewLabel.setBounds(382, 0, 760, 600);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setForeground(new Color(160, 82, 45));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 50));
		lblNewLabel_3.setBounds(95, 27, 150, 55);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(105, 115, 92, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(79, 142, 204, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(105, 199, 92, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(79, 226, 204, 30);
		contentPane.add(passwordField);
		
		JCheckBox chckbxKeepMeLogin = new JCheckBox("keep me login");
		chckbxKeepMeLogin.setBackground(Color.WHITE);
		chckbxKeepMeLogin.setBounds(73, 276, 124, 23);
		contentPane.add(chckbxKeepMeLogin);
		
		JButton btnNewButton = new JButton("Enter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Transaction().setVisible(true);
				dispose();
				String sql = "select * from login where username = ? and password =?";
				
				try {
//					Class.forName("com.mysql.cj.jdbc.Driver");
//					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/coffee ?useTimezone=true&serverTimezone=UTC","root","");
					PreparedStatement pstmt =connection.prepareStatement(sql);
					pstmt.setString(1, textField.getText()) ;
					pstmt.setString(2, new String(passwordField.getPassword())) ;
					
					ResultSet rs = pstmt.executeQuery();
					if(rs.next())
					{
						//JOptionPane.showMessageDialog(null, "Welcome " + textField.getText(), "Successful login", JOptionPane.PLAIN_MESSAGE );
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid Username/Password " + textField.getText(), "Unsuccessful login", JOptionPane.ERROR_MESSAGE );
					}
					connection.close();
				}
				catch(Exception e1)
				{
					 JOptionPane.showMessageDialog(null, e1);
				}
				
			}
			
			
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(160, 82, 45));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(138, 330, 89, 30);
		contentPane.add(btnNewButton);
	}
}
