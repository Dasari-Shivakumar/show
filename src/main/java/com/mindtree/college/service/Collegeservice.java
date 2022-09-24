package com.mindtree.college.service;

import java.util.List;

import com.mindtree.college.Vo.RequestTemplate;
import com.mindtree.college.entity.College;



public interface Collegeservice {
	public College addColleges(College college);
	public List<College> getColleges();
	public College updateCollege(long id,String name);
	public College searchById(long id);
	public List<RequestTemplate> listwithStu();
	public RequestTemplate specificClgStu(long clg_id);
}
