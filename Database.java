import java.sql.*;
import javax.swing.*;
public class Database {

	Connection conn=null;
	public static Connection dbConnector()
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/café","root","");
			return conn;
			
		}catch(Exception e)
		{
			
		JOptionPane.showMessageDialog(null, "Connection Successfull");
			return null;
		}
		
	}
}
