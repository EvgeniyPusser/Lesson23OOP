package product;

public class MeatProd extends Product{
	
	private String type;

	public MeatProd() {
		super();
	}

	public MeatProd(String name, double price, int code, String unit, String type) {
		super(name, price, code, unit);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + " \nType of meat: " + type;
	}
	
	
	
	
	
	

}
