
import java.awt.Color;
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
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;
import javax.swing.ListModel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;

public class Customer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Customer frame = new Customer();
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
	private JTable table_2;

	/**
	 * Create the frame.
	 */
	public Customer() {
		connection = Database.dbConnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1101, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 100, 227, 194);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnLunch = new JButton("Lunch");
		btnLunch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="SELECT ID,Items,Price,Category FROM product WHERE Type = 'lunch'";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs= pst.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
				try {
					String query="SELECT * FROM tab";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs= pst.executeQuery();
					
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnLunch.setBackground(UIManager.getColor("TextField.light"));
		btnLunch.setBounds(0, 147, 239, 48);
		panel.add(btnLunch);
		
		JButton btnColdDrink = new JButton("Cold Drink");
		btnColdDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String query="select ID,Items,Price from product WHERE Type = 'cold_drinks' ";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs= pst.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					String query="SELECT ID,name,price FROM tab";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs= pst.executeQuery();
					
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnColdDrink.setBackground(UIManager.getColor("TextField.highlight"));
		btnColdDrink.setBounds(0, 49, 239, 54);
		panel.add(btnColdDrink);
		
		JButton btnCakes = new JButton("Pastry");
		btnCakes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="select ID,Items,Price from product WHERE Type = 'pastry'";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs= pst.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					String query="SELECT ID,name,price FROM tab";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs= pst.executeQuery();
					
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCakes.setBackground(UIManager.getColor("TextField.highlight"));
		btnCakes.setBounds(0, 101, 239, 48);
		panel.add(btnCakes);
		
		JButton btnHotDrink = new JButton("Hot Drink");
		btnHotDrink.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String query="select ID,Items,Price from product WHERE Type = 'hot_drinks' ";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs= pst.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				try {
					String query="SELECT ID,name,price FROM tab";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs= pst.executeQuery();
					
					table_1.setModel(DbUtils.resultSetToTableModel(rs));
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnHotDrink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		btnHotDrink.setBackground(UIManager.getColor("TextField.highlight"));
		btnHotDrink.setBounds(0, 0, 227, 54);
		panel.add(btnHotDrink);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(20, 648, 1350, 64);
		panel_1.setBackground(SystemColor.scrollbar);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
//		JButton btnNewButton = new JButton("Cancel");
//		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
//		btnNewButton.setBackground(new Color(255, 0, 0));
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			}
//		});
//		btnNewButton.setBounds(33, 11, 603, 39);
//		panel_1.add(btnNewButton);
		
		JButton btnDone = new JButton("Done");
		btnDone.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnDone.setBackground(new Color(0, 128, 0));
		btnDone.setBounds(688, 11, 645, 39);
		panel_1.add(btnDone);
		
		JTextArea txtrMyOrderTotal = new JTextArea();
		txtrMyOrderTotal.setBounds(0, 293, 1191, 29);
		contentPane.add(txtrMyOrderTotal);
		txtrMyOrderTotal.setBackground(new Color(220, 220, 220));
		txtrMyOrderTotal.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtrMyOrderTotal.setText("       MY ORDER -                                                                                                                                      ");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(220, 220, 220));
		panel_4.setBounds(0, 321, 1191, 363);
		contentPane.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnCancelOrder = new JButton("Cancel Order");
		btnCancelOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
					new Main().setVisible(true);
					dispose();
				
			}
		});
		btnCancelOrder.setBounds(539, 203, 145, 25);
		btnCancelOrder.setBackground(new Color(255, 0, 0));
		panel_4.add(btnCancelOrder);
		
		
		 ArrayList<Product> order=new ArrayList<>();
		
		textField = new JTextField();;

				JButton btnAdd = new JButton("Add");
				btnAdd.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						try {

							String query="SELECT ID,Items,Price FROM product WHERE ID=?";
							PreparedStatement pst= connection.prepareStatement(query);

							pst.setString(1, textField.getText());
										
							ResultSet rs = pst.executeQuery();
							while(rs.next()){
								Product product = new Product();
								product.setID(rs.getInt("ID"));
								product.setName(rs.getString("Items"));
								product.setPrice(rs.getInt("Price"));
		///						
							order.add(product);
						}
						}catch(Exception ex){
							ex.printStackTrace();
						}
						ArrayList<Object[]> list =new ArrayList<Object[]>();
						for (int i=0;i<order.size();i++) {
							list.add(new Object[] {
								order.get(i).getName(),
								order.get(i).getPrice()
							});
						}
						table_2.setModel(new DefaultTableModel(list.toArray(new Object[][] {}),
								new String[] {"Name","Price"}));

							
						

					}
				});
			
		//});

				JLabel disptotal = new JLabel("Total Amount");
				disptotal.setForeground(Color.BLACK);
				disptotal.setBackground(new Color(255, 255, 0));
				disptotal.setHorizontalAlignment(SwingConstants.CENTER);
				disptotal.setFont(new Font("Tahoma", Font.BOLD, 17));
				disptotal.setBounds(387, 159, 187, 31);
				panel_4.add(disptotal);
				
				JLabel lblNewLabel = new JLabel("Rs :");
				lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
				lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
				lblNewLabel.setBounds(552, 157, 116, 30);
				panel_4.add(lblNewLabel);
				
				final JLabel lbltotal = new JLabel("");
				lbltotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lbltotal.setHorizontalAlignment(SwingConstants.CENTER);
				lbltotal.setBackground(Color.WHITE);
				lbltotal.setBounds(639, 159, 348, 31);
				panel_4.add(lbltotal);
		textField.setBounds(12, 27, 74, 36);
		panel_4.add(textField);
		textField.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(205, 0, 800, 166);
		panel_4.add(scrollPane);
		
		
		btnAdd.setBounds(92, 13, 103, 60);
		panel_4.add(btnAdd);
		
		table_2 = new JTable();
		table_2.setBounds(205, 0, 800, 166);
		panel_4.add(table_2);
		table_2.setShowVerticalLines(false);
		table_2.setShowHorizontalLines(false);
		table_2.setShowGrid(false);
		table_2.setFillsViewportHeight(true);
		table_2.setColumnSelectionAllowed(true);
		table_2.setCellSelectionEnabled(true);

		
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 204));
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(227, 53, 856, 241);
		contentPane.add(table);
		
		JLabel lblMenu = new JLabel("Menu");
		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblMenu.setBounds(614, 0, 56, 29);
		contentPane.add(lblMenu);
		
		
		JButton btnTotal = new JButton("Calculate Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double total=0;
				//Product price=new Product();
				try {
					
					for (int i=0;i<order.size();i++) {
						
							total+=order.get(i).getPrice();
				
						}
					lbltotal.setText(Double.toString(total));
					
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
				

				try {
									String sql="delete from transactionperson";
									
					PreparedStatement pstmt =connection.prepareStatement(sql);
					
									
					
					pstmt.execute();
					//JOptionPane.showMessageDialog(null, "Deleted");
					}catch(Exception e1) {
						JOptionPane.showMessageDialog(null, e1);
					}
				}



			
			
			
		});
		btnTotal.setBackground(Color.YELLOW);
		btnTotal.setBounds(205, 203, 152, 25);
		panel_4.add(btnTotal);

		
		JButton btnpay = new JButton("Proceed To Payment");
		btnpay.setBackground(Color.BLUE);
		btnpay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
					new payment().setVisible(true);
					dispose();
				
				try {
					
				//connection=Database.dbConnector();
					String sql2="INSERT IGNORE INTO transactionperson VALUES (?,?,?)";
					double total=0;
					PreparedStatement St2=connection.prepareStatement(sql2);
					
				
					for (int i=0;i<order.size();i++) {	
				
					     int id=order.get(i).getID();
					     String name=order.get(i).getName();
					     double price=order.get(i).getPrice();
					     
					
					     St2.setInt(1,id);
					     St2.setString(2, name);
					     St2.setDouble(3, price);
					     
//					     for (int j=0;j<order.size();j++) {
//								
//								total+=order.get(j).getPrice();
//					
//							}
//					     St2.setDouble(4, total);
					     St2.executeUpdate();
							
							
							
							//St3.executeUpdate();				
							
					//connection.close();
					}
					
			     //St3.setDouble(1, total);
					
					
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
					
				}
				try {
					
					String sql="INSERT IGNORE INTO transaction VALUES (?,?,?)";
					
					PreparedStatement St=connection.prepareStatement(sql);
					
					
				
					for (int i=0;i<order.size();i++) {	
				
					     int id=order.get(i).getID();
					     String name=order.get(i).getName();
					     double price=order.get(i).getPrice();
					     
					     St.setInt(1,id);
					     St.setString(2, name);
					     St.setDouble(3, price);
					     
//					     St2.setInt(2,id);
//					     St2.setString(3, name);
//					     St2.setDouble(4, price);
					
							
							St.executeUpdate();
					}
					//connection.close();
			
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					
					
				}
					
				
				
			}
		});
		btnpay.setBounds(852, 203, 153, 25);
		panel_4.add(btnpay);
		
//		System.out.println(order.size());
//		System.out.println(order.get(1).getName());
//		System.out.println(order.get(1).getPrice());
//		
		table = new JTable();
		table.setBackground(new Color(255, 255, 204));
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);
		table.setFillsViewportHeight(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setBounds(241, 53, 842, 241);
		contentPane.add(table);
		
//		JLabel lblMenu = new JLabel("Menu");
//		lblMenu.setFont(new Font("Tahoma", Font.BOLD, 18));
//		lblMenu.setBounds(614, 0, 56, 29);
//		contentPane.add(lblMenu);
		
		
		table_1 = new JTable();
		table_1.setBackground(new Color(255, 255, 204));
		table_1.setBounds(241, 29, 842, 22);
		contentPane.add(table_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(11, 0, 225, 103);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(new Color(255, 255, 204));
		lblNewLabel_2.setIcon(new ImageIcon(Customer.class.getResource("/images/download.jpg")));
		
		
		
	
	



//		
//		table_1 = new JTable();
//		table_1.setBackground(new Color(255, 255, 204));
//		table_1.setBounds(241, 29, 842, 22);
//		contentPane.add(table_1);
		
//		JLabel lblNewLabel_2 = new JLabel("");
//		lblNewLabel_2.setBounds(0, 0, 236, 103);
//		contentPane.add(lblNewLabel_2);
//		lblNewLabel_2.setBackground(new Color(255, 255, 204));
//		lblNewLabel_2.setIcon(new ImageIcon(Customer.class.getResource("/images/download.jpg")));
//		
		
		
	
	}
}

