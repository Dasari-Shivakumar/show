package com.mindtree.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.mindtree.college.entity.College;

@Repository
public interface CollegeRepo  extends JpaRepository<College, Long>{
	College findById(long id);
}
