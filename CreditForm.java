import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import java.sql.*;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;

public class CreditForm extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreditForm frame = new CreditForm();
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
	public CreditForm() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 601, 430);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Credit Card Payment");
		lblNewLabel_3.setForeground(new Color(47, 79, 79));
		lblNewLabel_3.setFont(new Font("Lucida Calligraphy", Font.BOLD, 26));
		lblNewLabel_3.setBounds(20, 11, 323, 43);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(CreditForm.class.getResource("/image/pngwing.com2.png")));
		lblNewLabel_5.setBounds(326, 0, 247, 368);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Startpage().setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(139, 69, 19));
		btnNewButton.setBounds(227, 351, 92, 29);
		contentPane.add(btnNewButton);
		
		JLabel lblEnterYourCard = new JLabel("Insert your Card");
		lblEnterYourCard.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourCard.setFont(new Font("Calibri", Font.ITALIC, 24));
		lblEnterYourCard.setBounds(52, 144, 167, 29);
		contentPane.add(lblEnterYourCard);
		
		JLabel lblCollectYourReceipt = new JLabel("Collect your receipt");
		lblCollectYourReceipt.setHorizontalAlignment(SwingConstants.CENTER);
		lblCollectYourReceipt.setFont(new Font("Calibri", Font.ITALIC, 24));
		lblCollectYourReceipt.setBounds(52, 203, 191, 37);
		contentPane.add(lblCollectYourReceipt);
		
		JLabel lblAndMoveTo = new JLabel("And move to counter");
		lblAndMoveTo.setFont(new Font("Calibri", Font.ITALIC, 24));
		lblAndMoveTo.setBounds(52, 268, 202, 29);
		contentPane.add(lblAndMoveTo);
	}
}
