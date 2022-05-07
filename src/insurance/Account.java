package insurance;

import java.util.List;
import java.util.Objects;

public abstract class Account implements Comparable<Account>{
	
	private User user;
	private AuthenticationStatus status;
	private List<Insurance> insurances;
	
	enum AuthenticationStatus {
		SUCCESS, FAIL;
	}
	
	public final void showUserInfo() {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "\n" 
	+ user.getAge() + " " + "\n" + user.getEmail() + "\n" + user.getJob());
		
		for(Address address : this.user.getAddressList()) {
			System.out.println(address.getAddress());
		}
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public AuthenticationStatus getStatus() {
		return status;
	}
	
	public void setStatus(AuthenticationStatus status) {
		this.status = status;
	}
	
	public List<Insurance> getInsurances() {
		return insurances;
	}
	
	public void setInsurances(List<Insurance> insurances) {
		this.insurances = insurances;
	}
	
	public void addAddress(String address) {
		
	}
	
    public void deleteAdress(Address address) {
		
	}
    
    /*public void addInsurance(Insurance insurance) {
    	insurance.calculate();
    	this.getInsurances().add(insurance);
    }*/
    
    public void login(String email, String password) throws InvalidAuthenticationException {
    	if(email.equals(this.user.getEmail()) && password.equals(this.user.getPassword())) {
    		this.status = AuthenticationStatus.SUCCESS;
    	}
    	else {
    		throw new InvalidAuthenticationException("Email or password is wrong");
    	}
    }
    
    public abstract void addInsurance(Account account, Insurance insurance);
    
    public int hashCode() {
    	return Objects.hash(user);
    }
    
    public int compareTo(Account a) {
    	return this.hashCode() - a.hashCode();
    }
    
    public boolean equals(Object o) {
    	if(this == o)
    		return true;
    	
    	if(o == null || getClass() != o.getClass())
    		return false;
    	
    	Account account = (Account) o;
    	return Objects.equals(user, account.user);
    }
}






















