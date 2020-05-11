import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setUndecorated(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1101, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(222, 184, 135));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("image");
		lblNewLabel.setToolTipText("");
		lblNewLabel.addMouseListener(new MouseAdapter() {
//			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel.setBounds(234, 71, 178, 185);
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/image3/hotdrinks1.jpg")));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("image");
		lblNewLabel_1.setBounds(694, 71, 178, 185);
		lblNewLabel_1.setIcon(new ImageIcon(Main.class.getResource("/image3/pastry1.jpg")));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("image");
		lblNewLabel_2.setBounds(234, 312, 189, 190);
		lblNewLabel_2.setIcon(new ImageIcon(Main.class.getResource("/image3/colddrinks1.jpg")));
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("image");
		lblNewLabel_3.setBounds(694, 312, 178, 190);
		lblNewLabel_3.setIcon(new ImageIcon(Main.class.getResource("/image3/lunch1.jpg")));
		contentPane.add(lblNewLabel_3);
		
		
		JButton btnHotDrinks = new JButton("Hot Drinks");
		btnHotDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Customer().setVisible(true);
				dispose();
			}
		});
		btnHotDrinks.setBounds(270, 256, 108, 25);
		contentPane.add(btnHotDrinks);
		
		JButton btnPastry = new JButton("Pastry");
		btnPastry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Customer().setVisible(true);
				dispose();
			}
		});
		btnPastry.setBounds(744, 256, 108, 25);
		contentPane.add(btnPastry);
		
		JButton btnColdDrinks = new JButton("Cold Drinks");
		btnColdDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Customer().setVisible(true);
				dispose();
			}
		});
		btnColdDrinks.setBounds(270, 515, 108, 25);
		contentPane.add(btnColdDrinks);
		
		JButton btnLunch = new JButton("Lunch");
		btnLunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Customer().setVisible(true);
				dispose();
			}
		});
		btnLunch.setBounds(744, 515, 108, 25);
		contentPane.add(btnLunch);
		
	}
}