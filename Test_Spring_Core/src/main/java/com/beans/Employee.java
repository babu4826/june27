package com.beans;

public class Employee {
	
	private int emplId;
	private String emplName;
	private int salary;
	private int bonus;
	
	public Employee() {
		
	}
	public Employee(int emplId, String emplName, int salary, int bonus) {
		  this.emplId = emplId;
		  this.emplName = emplName;
		  this.salary =  salary;
		  this.bonus = bonus;
	}
	public int getEmplId() {
		return emplId;
	}
	public void setEmplId(int emplId) {
		this.emplId = emplId;
	}
	public String getEmplName() {
		return emplName;
	}
	public void setEmplName(String emplName) {
		this.emplName = emplName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "Employee [emplId=" + emplId + ", emplName=" + emplName + ", salary=" + salary + ", bonus=" + bonus
				+ "]";
	}
	
}
