package com.cjc.restapi.app.servicei;

import java.util.List;

import com.cjc.restapi.app.model.Student;

public interface StudentServiceI {

	public Student saveStudent(Student s);

	public List<Student> getStudent();
	
	public void deleteStudent(int rollno);

	public Student updateStudent(int rollno, Student s);

	public Student getsingleStudent(int rollno);

}
