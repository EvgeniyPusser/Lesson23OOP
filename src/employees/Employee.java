package employees;

public class Employee {
	private int id;
	private String name;
	private int age;
	private String position;
	protected double salary;

	public Employee() {
		super();
	}

	public Employee(int id, String name, int age, String position, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0)
			this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		if (position != null)
			this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary >= 0)
			this.salary = salary;
	}

	@Override
	public String toString() {
		String str = "Name: " + name + " \nID: " + id + " \nAge: " + age + " \nPosition: " + position + " \nSalary: " + salary;
		return str;
	}

}
