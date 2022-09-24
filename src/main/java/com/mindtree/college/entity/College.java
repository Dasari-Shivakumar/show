package com.mindtree.college.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private int totalstudent;
	public College(long id, String name, int totalstudent) {
		super();
		this.id = id;
		this.name = name;
		this.totalstudent = totalstudent;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTotalstudent() {
		return totalstudent;
	}
	public void setTotalstudent(int totalstudent) {
		this.totalstudent = totalstudent;
	}
}
