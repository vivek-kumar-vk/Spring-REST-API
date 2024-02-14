package com.spring.SpringBootBasic.service;

import java.util.List;

import com.spring.SpringBootBasic.entity.Department;

public interface DepartmentService {
public Department saveDepartment(Department department);
public List<Department> fetchDepartemntList();
public Department fetchDepartemntList(Long departmentId);
public void deleteDepartmentById(Long departmentId);
public Department upadteDepartment(Long departmentId, Department department);
}
