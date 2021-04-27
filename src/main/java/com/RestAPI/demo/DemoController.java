package com.RestAPI.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController 
{
	private List<Student> students=new ArrayList<>();
	public DemoController()
	{
		students.add(new Student("234" ,"Aravind"));
		students.add(new Student("324" ,"Anil"));
		students.add(new Student("325" ,"Sandeep"));
	}
	@GetMapping("/students/all")
	Iterable<Student> getStudents()
	{
		return students;
	}
}
