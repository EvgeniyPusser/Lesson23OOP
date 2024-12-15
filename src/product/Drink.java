package product;

public class Drink extends Product{
	
	private boolean isSparkling;

	public Drink() {
		super();
	}

	public Drink(String name, double price, int code, String unit, boolean isSparkling) {
		super(name, price, code, unit);
		this.isSparkling = isSparkling;
	}

	public boolean isSparkling() {
		return isSparkling;
	}

	public void setSparkling(boolean isSparkling) {
		this.isSparkling = isSparkling;
	}

	@Override
	public String toString() {
		if(isSparkling)
		return super.toString() + 
				" Is sparkling.";
		else {
			return super.toString() + 
					" "
					+ "\nIs not sparkling.";
		}
	}
	
	
	

}
