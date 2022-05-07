package insurance;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class User {

	private String firstName, lastName, email, password, age, job;
	private List<Address> addressList;
	private Date lastLogin;
	
	public User() {
		
	}

	public User(String firstName, String lastName, String email, String password, String age, String job, Date lastLogin) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.age = age;
		this.job = job;
		this.addressList = new ArrayList<Address>();
		this.lastLogin = lastLogin;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public List<Address> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}
	
	public boolean equals(Object o) {
		if(this == o)
			return true;
		
		if(o == null || getClass() != o.getClass())
			return false;
		
		User user = (User) o;
		return Objects.equals(email, user.email);
	}
	
	public int hashCode() {
		return Objects.hash(email);
	}
	
}












