package com.spring.SpringBootBasic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.SpringBootBasic.entity.Department;
import com.spring.SpringBootBasic.service.DepartmentService;
import com.spring.SpringBootBasic.service.DepartmentServiceImpl;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	
	@PostMapping("/departments")
	public Department saveDepartment(@RequestBody  Department department) {
		 
		return departmentService.saveDepartment(department);
		
	}
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		return departmentService.fetchDepartemntList();
	}
	@GetMapping("/departments/{id}")
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
		return departmentService.fetchDepartemntList(departmentId);
	}
	
	@DeleteMapping("/departments/{id}")
	public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
	 departmentService.deleteDepartmentById(departmentId);
	 return "department deleted sucessfully";
	}
	@PutMapping("/departments/{id}")
	public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department){
		{
			
			return departmentService.upadteDepartment(departmentId , department);
	}
		
	}
}
