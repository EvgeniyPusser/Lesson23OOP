package product;

public class AlcoholDrink extends Drink {
	
	private double alcohol;

	public AlcoholDrink() {
		super();
	}

	public AlcoholDrink(String name, double price, int code, String unit, boolean isSparkling, double alcohol) {
		super(name, price, code, unit, isSparkling);
		this.alcohol = alcohol;
	}

	public double getAlcohol() {
		return alcohol;
	}

	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " \nAlcohol: " + alcohol;
	}
	
	
	
	

}
