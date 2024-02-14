package com.spring.SpringBootBasic.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.SpringBootBasic.entity.Department;
import com.spring.SpringBootBasic.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{
	
	@Autowired
	private DepartmentRepository departmentRepository;
	@PostMapping("/department")
	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

	@Override
	public List<Department> fetchDepartemntList() {
		
		return departmentRepository.findAll();
	}

	@Override
	public Department fetchDepartemntList(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId).get();
	}

	@Override
	public void deleteDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(departmentId);
		
	}

	@Override
	public Department upadteDepartment(Long departmentId, Department department) {
		
		Department depDb = departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(department.getDepartmentName()) && 
				!"".equalsIgnoreCase(department.getDepartmentName())) {
			depDb.setDepartmentName(department.getDepartmentName());
		}
		if(Objects.nonNull(department.getDepartmentAddress()) && 
				!"".equalsIgnoreCase(department.getDepartmentAddress())) {
			depDb.setDepartmentAddress(department.getDepartmentAddress());
		}
		if(Objects.nonNull(department.getDepartmentCode()) && 
				!"".equalsIgnoreCase(department.getDepartmentCode())) {
			depDb.setDepartmentCode(department.getDepartmentCode());
		}
		return departmentRepository.save(depDb);
	}


	
}
