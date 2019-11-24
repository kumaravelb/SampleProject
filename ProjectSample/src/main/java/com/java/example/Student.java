package com.java.example;

public class Student implements Comparable<Student> {
	String name;

	int id;

	String subject;

	double percentage;

	public Student(String name, int id, String subject, double percentage) {
		this.name = name;
		this.id = id;
		this.subject = subject;
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getSubject() {
		return subject;
	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public String toString() {
		return name + "-" + id + "-" + subject + "-" + percentage;
	}

	@Override
	public int compareTo(Student o) {
		//return this.name.compareTo(o.getName());
      return this.id-o.getId();
	}
}
