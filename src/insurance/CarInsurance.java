package insurance;

public class CarInsurance extends Insurance{

	@Override
	public void calculate() {

		this.setPrice(getPrice() * 2);
		
	}

}
