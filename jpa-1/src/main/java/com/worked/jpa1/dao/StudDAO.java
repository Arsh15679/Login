package com.worked.jpa1.dao;

import org.springframework.data.repository.CrudRepository;

import com.worked.jpa1.model.Student;

public interface StudDAO extends CrudRepository<Student, Integer> {

}
