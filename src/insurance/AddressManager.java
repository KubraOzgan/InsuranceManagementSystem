package insurance;

public class AddressManager {
	
	public static void addAddress(User user, Address address) {
		user.getAddressList().add(address);
	}
	
	public static void deleteAdress(User user, Address address) {
		user.getAddressList().remove(address);
	}
}
