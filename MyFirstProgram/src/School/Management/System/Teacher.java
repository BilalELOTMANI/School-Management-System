package School.Management.System;

public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		salaryEarned = 0;
	}
	
	void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return this.name;
	}
	public int getId() {
		return this.id;
	}
	public int getSalary() {
		return this.salary;
	}
	
	public void receiveSalary(int salary) {
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}
	
	public String toString() {
		return name +" has earned as a salary so far :"+ salaryEarned;
	}

}
