package fa.training.entities;


public class Order {
	private String number;
	private String date;
	public Order() {
		super();
	}
	public Order(String number, String date) {
		this.number = number;
		this.date = date;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		if(number.length() == 10) {
			this.number = number;
		}
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
