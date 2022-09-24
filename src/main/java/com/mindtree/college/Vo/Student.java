package com.mindtree.college.Vo;

public class Student {
	private long rollno;
	private String name;
	private String gender;
	private int age;
	private long dept_id;
	public Student(long rollno, String name, String gender, int age, long dept_id) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.dept_id = dept_id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getRollno() {
		return rollno;
	}
	public void setRollno(long rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getDept_id() {
		return dept_id;
	}
	public void setDept_id(long dept_id) {
		this.dept_id = dept_id;
	}
}
