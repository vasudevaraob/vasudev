package com.sathya.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sathya.ems.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
