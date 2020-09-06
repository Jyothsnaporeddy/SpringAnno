package com.spring.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("collegeBean")
@Component
public class College {
	
	@Value("${college.name}")
	private String collegeName;
	
	@Autowired
	public Principal principal;


	public void test() {
		principal.prinipalInfo();
		System.out.println("My College Name is:" +collegeName);
		System.out.println("This Test Method is working");
	}

}
