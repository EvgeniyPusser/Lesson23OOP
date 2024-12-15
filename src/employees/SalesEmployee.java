package employees;

public class SalesEmployee extends Employee {
	
	private double percent;
	private int sales;
	
	public SalesEmployee() {
		super();
	}
	public SalesEmployee(int id, String name, int age, String position, double salary, double percent, int sales) {
		super(id, name, age, position, salary);
		this.percent = percent;
		this.sales = sales;
		this.salary = percent * sales;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		if(percent > 0)
		this.percent = percent;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		if(sales >= 0)
		this.sales = sales;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " Percent: " + percent + " Sales: " + sales;
	}
	
	
	

}
