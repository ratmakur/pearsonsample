package com.pearson.samples;

public class Employee implements Comparable<Employee>{
	private String name;
	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(Employee other) {
		return Integer.compare(getAge(), other.getAge());
	}
	
	@Override
	public String toString() {		
		return name;
	}

}
