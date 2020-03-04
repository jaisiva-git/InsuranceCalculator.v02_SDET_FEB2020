package com.learn;

public class Student {

	public String name = "Unknown";

	public Student() {
		}

	public Student(String name) {
			this.name = name;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Student s1 = new Student();

		Student s2 = new Student("Jayasri");

		System.out.println("S1 name: " + s1.getName());
		System.out.println("S2 name: " + s2.getName());

		
	}
}
