package com.rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.bean.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
 
}

