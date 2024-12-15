package employees;

public class WageEmployee extends Employee {
	private double wage;
	private double hours;

	public WageEmployee() {
		super();
	}

	public WageEmployee(int id, String name, int age, String position, double salary, double wage, double hours) {
		super(id, name, age, position, salary);
		this.salary = wage * hours;
		this.wage = wage;
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage >= 0)
			this.wage = wage;
	}

	public double getHours() {

		return hours;
	}

	public void setHours(double hours) {
		if (hours >= 0)
			this.hours = hours;
	}

	@Override
	public String toString() {
		return super.toString() + " \nWage: " + wage + " \nHours: " + hours;
	}

}
