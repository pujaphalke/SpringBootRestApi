package com.cjc.restapi.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.restapi.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
