package School.Management.System;

public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int paidFees;
	private int totalFees;
	
	public Student(int id, String name, int grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.paidFees = 0;
		this.totalFees = 20000;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void paysFees(int fees) {
		paidFees+= fees;
		School.updateTotalMoneyEarned(paidFees);
	}
	
	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getGrade() {
		return this.grade;
	}
	public int getPaidFees() {
		return this.paidFees;
	}
	public int getTotalFees() {
		return this.totalFees;
	}
	
	public int getRemaningFees() {
		return totalFees - paidFees;
	}
	
	public String toString() {
		return name + " has paid "+ paidFees;
	}

}
