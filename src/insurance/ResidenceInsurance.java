package insurance;

public class ResidenceInsurance extends Insurance{

	@Override
	public void calculate() {

		this.setPrice(getPrice() * 3);
		
	}

}
