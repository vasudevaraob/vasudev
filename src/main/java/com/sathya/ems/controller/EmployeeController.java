package com.sathya.ems.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sathya.ems.entity.Employee;
import com.sathya.ems.service.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private  IEmployeeService  service;
	
	@GetMapping("/addEmployee")
	public  String  getEmployeePage()
	{
		return "addEmployee";
	}
	@PostMapping("/save")
	public  ModelAndView  saveEmployee(HttpServletRequest request) {
		Employee  e = new Employee();
		e.setEmpid(Integer.parseInt(request.getParameter("empid")));
		e.setEname(request.getParameter("ename"));
		e.setSalary(Integer.parseInt(request.getParameter("salary")));
		e.setDeptno(Integer.parseInt(request.getParameter("deptno")));
		boolean flag = service.insertEmployee(e);
		if(flag==true) {
			return new  ModelAndView("index","message","Employee added to Database");
		}
		else {
			return  new ModelAndView("index", "message", "Sorry, the Employee already exist!");
		}
	}
	@GetMapping("/listEmployees")
	public  ModelAndView  listEmployees( ) {
		List<Employee>  empsList=service.readEmployees();
		return  new  ModelAndView("employeesList", "employees", empsList);
	}
	
	@GetMapping("/editEmp")
	public  ModelAndView  getEditPage(HttpServletRequest  request) {
		return  new  ModelAndView("editEmployee", "eid", request.getParameter("id"));
	}
	@PostMapping("/edit")
	public  ModelAndView  editEmployee(HttpServletRequest  request) {
		Employee  e = new Employee();
		e.setEmpid(Integer.parseInt(request.getParameter("empid")));
		e.setEname(request.getParameter("ename"));
		e.setSalary(Integer.parseInt(request.getParameter("salary")));
		e.setDeptno(Integer.parseInt(request.getParameter("deptno")));
		service.updateEmployee(e);
		List<Employee>  empsList=service.readEmployees();
		return new ModelAndView("employeesList", "employees", empsList);
	}
	@GetMapping("delete")
	public  ModelAndView  deleteEmployee(HttpServletRequest  request) {
		int empid = Integer.parseInt(request.getParameter("id"));
		service.removeEmployee(empid);
		List<Employee>  empsList=service.readEmployees();
		return new ModelAndView("employeesList", "employees", empsList);
	}

}
