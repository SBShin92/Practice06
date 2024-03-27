package com.javaex.ex04;

public class Employee extends User {
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String id, String password, String name, int salary) {
		super(id, password, name);
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.printf(", #월급:%d\n", salary);
		System.out.printf("운영자의 월급은 %d원 입니다.\n", salary);
	}
	

	
	

	
}
