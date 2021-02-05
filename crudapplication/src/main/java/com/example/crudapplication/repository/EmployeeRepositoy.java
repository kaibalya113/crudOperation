package com.example.crudapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crudapplication.model.Employee;

@Repository
public interface EmployeeRepositoy extends JpaRepository<Employee, Long>{

}
