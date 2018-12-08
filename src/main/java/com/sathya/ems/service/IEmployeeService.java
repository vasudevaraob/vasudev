package com.sathya.ems.service;

import java.util.List;

import com.sathya.ems.entity.Employee;

public interface IEmployeeService {
   public boolean insertEmployee(Employee e);
   public List<Employee>  readEmployees();
   public boolean  updateEmployee(Employee e);
   public boolean  removeEmployee(Integer  empid);
}
