package com.javaex.ex04;

public class Customer extends User{
	private int point;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String id, String password, String name, int point) {
		super(id, password, name);
		this.point = point;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}
	
	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		super.showInfo();
		System.out.printf(", #포인트:%d\n", point);
	}
	

}
