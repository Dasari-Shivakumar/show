package com.mindtree.college.Vo;

import java.util.ArrayList;
import java.util.List;

import com.mindtree.college.entity.College;



public class RequestTemplate {
	private College college;
	private List<Student> students=new ArrayList<Student>();
	public RequestTemplate(College college, List<Student> students) {
		super();
		this.college = college;
		this.students = students;
	}
	public RequestTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
