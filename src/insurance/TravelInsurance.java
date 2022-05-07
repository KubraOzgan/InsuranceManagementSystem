package insurance;

public class TravelInsurance extends Insurance{

	@Override
	public void calculate() {

		this.setPrice(getPrice() * 1.5);
		
	}

}
