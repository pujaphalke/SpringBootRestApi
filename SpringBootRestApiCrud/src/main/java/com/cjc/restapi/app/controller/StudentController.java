package com.cjc.restapi.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.restapi.app.model.Student;
import com.cjc.restapi.app.servicei.StudentServiceI;

@RestController
public class StudentController {
	
	@Autowired
	StudentServiceI ssi;
	
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student s)
	{
		Student stu=ssi.saveStudent(s);
		return stu;
	}
	
	@GetMapping("/getstudents")
	public List<Student> getStudent()
	{
		List<Student> list=ssi.getStudent();
		return list;
	}
	
	@DeleteMapping("/deletestudent/{rollno}")
	public void deleteStudent(@PathVariable("rollno")int rollno)
	{
		System.out.println(rollno);
		ssi.deleteStudent(rollno);
	}
	
	@PutMapping("/putstudent/{rollno}")
	public Student updateStudent(@PathVariable("rollno")int rollno,
			                     @RequestBody Student s)
	{
		Student stu=ssi.updateStudent(rollno,s);
		return stu;
	}
	
	@GetMapping("/getstudent/{rollno}")
	public Student getsingleStudent(@PathVariable("rollno")int rollno)
	{
		Student stu=ssi.getsingleStudent(rollno);
		return stu;
	}
}
