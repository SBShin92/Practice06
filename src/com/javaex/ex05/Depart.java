package com.javaex.ex05;

public class Depart extends Employee {

	private String departName;
	//코드작성
	public Depart(String name, int salary, String departName) {
		super(name, salary);
		this.departName = departName;
	}

	public String getDepartName() {
		return departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}

	@Override
	public void showInformation() {
        System.out.println("이름:" + getName() + " 연봉:" + getSalary() + " 부서:" + departName);
	}

}
