package com.mindtree.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.college.Vo.RequestTemplate;
import com.mindtree.college.entity.College;
import com.mindtree.college.service.Collegeservice;

@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	private Collegeservice collegeservice;

@PostMapping
public College addColleges(@RequestBody College college)
{
	return collegeservice.addColleges(college);
}



@GetMapping
public List<College> getColleges()
{
	return collegeservice.getColleges();
}
@GetMapping("/{id}")
public College searchById(@PathVariable long id)
{
	return collegeservice.searchById(id);
}
@GetMapping("/all-college-student")
public List<RequestTemplate> listwithStu()
{
	return collegeservice.listwithStu();
}
@GetMapping("/college-with-student/{dept_id}")
public RequestTemplate specificDeptEmp(@PathVariable long dept_id)
{
return collegeservice.specificClgStu(dept_id);
}


}
