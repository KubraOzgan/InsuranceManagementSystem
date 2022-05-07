package insurance;

public class HomeAddress implements Address{
	
	private String address;
	
	public HomeAddress(String adress) {
		this.address = adress;
	}
	
	@Override
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
}
 
