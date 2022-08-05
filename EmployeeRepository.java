package com.example.EmployeeManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EmployeeManagement.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> // Long is ID which is the type of the primary key
//We can now able to perform CRUD operations for Employee Table(entity) using JPA Repository
{

}
 