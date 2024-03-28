package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		User userArray[] = new User[3];
		
		
		userArray[0] = new Customer("jws", "j1234", "정우성", 1000);
		userArray[1] = new Customer("yjs", "y2345", "이효리", 2000);
		userArray[2] = new Employee("master", "m7788", "운영자", 5000000);
		
		for (User user:userArray) {
			user.showInfo();
		}
		System.out.printf("운영자의 월급은 %d원 입니다.\n",
				((Employee)userArray[2]).getSalary());
	}
}
