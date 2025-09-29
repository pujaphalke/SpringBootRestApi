package com.cjc.restapi.app.servicei;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.restapi.app.model.Student;
import com.cjc.restapi.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentServiceI{
	
	@Autowired
	StudentRepository sr;

	@Override
	public Student saveStudent(Student s) 
	{
		return sr.save(s);
	}

	@Override
	public List<Student> getStudent() {
		return sr.findAll();
	}

	@Override
	public void deleteStudent(int rollno) {
		sr.deleteById(rollno);
	}

	@Override
	public Student updateStudent(int rollno, Student s) {
		
	Optional<Student> op =sr.findById(rollno);
	   if(op.isPresent())
	   {
		  Student stu =op.get();
		  stu.setName(s.getName());
		  stu.setAddress(s.getAddress());
		  return sr.save(stu);
	   }else {
		return null;
	   }
	}

	@Override
	public Student getsingleStudent(int rollno) {
		
		return sr.findById(rollno).get();
	}

}
