package com.sathya.ems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.ems.entity.Employee;
import com.sathya.ems.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private  EmployeeRepository  repository;

	@Override
	public boolean insertEmployee(Employee e) {
		try {
			boolean flag=repository.existsById(e.getEmpid());
			if(flag==true) {
				throw new Exception();
			}
			else {
				repository.save(e);
			}
		}catch(Exception  ee) {
			return false;
		}
		return true;
	}

	@Override
	public List<Employee> readEmployees() {
		List<Employee>  empsList = repository.findAll();
		return  empsList;
	}

	@Override
	public boolean updateEmployee(Employee e) {
		try {
			repository.saveAndFlush(e);
		}catch(Exception  ee) {
			return false;
		}
		return true;
	}

	@Override
	public boolean removeEmployee(Integer empid) {
		try {
			repository.deleteById(empid);
		}catch(Exception  ee) {
			return false;
		}
		return true;
	}

}
