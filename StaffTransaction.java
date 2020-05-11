
public class StaffTransaction extends Product{
	public double totalPrice=0;

	
	public StaffTransaction(int id, String Name,double price) {
		super(id,Name,price);
		
		
	}
	
	public double calcTotalPrice(double price) {
		
		
			totalPrice=totalPrice+price;
			
		
		return totalPrice;
	}
    public void showOrder() {
    	
    		System.out.format("%s"+"      "+"%d", Name,price);
    	
    	
    }
    public void showTotal() {
    	System.out.format("Total Price :   "+"%d", totalPrice);
    }
}
