package insurance;

import java.util.ArrayList;

public class Enterprise extends Account{
	
	public Enterprise() {
		this.setStatus(AuthenticationStatus.FAIL);
		this.setInsurances(new ArrayList<>());
	}

	@Override
	public void addInsurance(Account account, Insurance insurance) {
		insurance.calculate();
		account.getInsurances().add(insurance);
	}
	
	public Enterprise(User user) {
		this.setUser(user);
	}
	
	@Override
	public void addAddress(String address) {
		AddressManager.addAddress(this.getUser(), new BusinessAddress(address));
	}
}
