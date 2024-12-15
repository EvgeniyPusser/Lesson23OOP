package employees;

public class Manager extends Employee {
	
	private int level;
	private int team;
	public Manager() {
		super();
	}
	public Manager(int id, String name, int age, String position, double salary, int level, int team) {
		super(id, name, age, position, salary);
		this.level = level;
		this.team = team;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getTeam() {
		return team;
	}
	public void setTeam(int team) {
		if(team > 0)
		this.team = team;
	}
	
	@Override
	public String toString() {
		return super.toString()+ " Team" + team + " Level" + level;
	}
	
	

}
