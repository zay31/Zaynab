import java.sql.Connection;
import java.sql.PreparedStatement;



public class Product {
	public int ID;
	public String Name;
	public double price;
	
	
	
public Product() {
	ID=0;
	Name="";
	price=0.0;
	
}
public Product(int id, String Name,double price) {
	this.ID=id;
	this.Name=Name;
	this.price=price;
	
	
}
	public int getID() {
		return ID;
	}
	public void setID(int id) {
		ID=id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void showOrderStaff() {
		System.out.format("%n"+"   "+"%s"+"      "+"%s"+"       "+"%d"+ "			"+"%n",ID,Name,price);
	}
	
	public void showOrderCust() {
		System.out.format("%s"+"       "+"%d",Name,price);
	}
//
		

}
