package com.spring.SpringBootBasic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.SpringBootBasic.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
