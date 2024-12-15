package product;

public class Product {

	private String name;
	private double price;
	private int code;
	private String unit;

	public Product() {
		super();
	}

	public Product(String name, double price, int code, String unit) {
		super();
		this.name = name;
		this.price = price;
		this.code = code;
		this.unit = unit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	@Override
	public String toString() {
		return "Name:  " + name+
				" ;\nPrice: "+ price+
				" ;\nCode: "+code+
				" ;\nUnit: " + unit;
	}
	
	
	
	

}
