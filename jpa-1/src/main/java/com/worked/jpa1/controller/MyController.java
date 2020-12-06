package com.worked.jpa1.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.worked.jpa1.dao.StudDAO;
import com.worked.jpa1.model.Student;


@RestController
public class MyController {

	@Autowired
	StudDAO dao;

	@RequestMapping(value="/students",method = RequestMethod.POST)
	@ResponseBody
	public Student addStudent(Student stud) {
		dao.save(stud);
		return stud;
	}
	@RequestMapping("/student")
	@ResponseBody
	public  List<Student> addStudent() {

		return  (List<Student>) dao.findAll();
	}
	@RequestMapping("/students/{aid}")
	public Optional<Student> getStudents(@PathVariable("aid") int aid) {
		return dao.findById(aid);
	}
}
