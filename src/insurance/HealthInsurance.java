package insurance;

public class HealthInsurance extends Insurance{

	@Override
	public void calculate() {

		this.setPrice(getPrice() * 1.7);
		
	}
	
}
