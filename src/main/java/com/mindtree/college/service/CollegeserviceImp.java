package com.mindtree.college.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.mindtree.college.Vo.RequestTemplate;
import com.mindtree.college.Vo.Student;
import com.mindtree.college.entity.College;
import com.mindtree.college.repository.CollegeRepo;

@Service
public class CollegeserviceImp implements Collegeservice {
	@Autowired
	private CollegeRepo collegeRepo;
	@Autowired
	private RestTemplate restTemplate;
	@Override
	public College addColleges(College college) {
		
		 
		return collegeRepo.save(college);
		
		
	}

	@Override
	public List<College> getColleges() {
		 
		return collegeRepo.findAll();
	}

	@Override
	public College updateCollege(long id, String name) {
		
		College dept=collegeRepo.findById(id);
			dept.setName(name);
			 return collegeRepo.save(dept);
	}

	@Override
	public College searchById(long id) {
		return collegeRepo.findById(id);
	}

	@Override
	public List<RequestTemplate> listwithStu() {
		List<RequestTemplate> fullList=new ArrayList<RequestTemplate>();
		List<College> allDept=this.getColleges();
		Iterator<College> ir=allDept.iterator();	
	while(ir.hasNext())
	{
		College college=ir.next();
		ResponseEntity<Student[]> response=restTemplate.getForEntity("http://STUDENT-SERVICE/student/student-with-ascname/"+college.getId(),Student[].class);
		Student[] students=response.getBody();
		List<Student> stus=Arrays.asList(students);
		RequestTemplate Rt=new RequestTemplate();
		Rt.setCollege(college);
		Rt.setStudents(stus);
		fullList.add(Rt);		
				
		}
	return fullList;
	}
	

	@Override
	public RequestTemplate specificClgStu(long clg_id) {
		College college=this.searchById(clg_id);
		ResponseEntity<Student[]> response=restTemplate.getForEntity("http://STUDENT-SERVICE/student/student-with-desc-age/"+college.getId(), Student[].class);
		Student[] students=response.getBody();
		List<Student> employee2s=Arrays.asList(students);
		RequestTemplate requestTemplate=new RequestTemplate();

		requestTemplate.setCollege(college);
		requestTemplate.setStudents(employee2s);
			return requestTemplate;
		}


}
