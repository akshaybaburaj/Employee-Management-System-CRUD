package com.example.EmployeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeManagement.model.Employee;
import com.example.EmployeeManagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired //Autowiring feature of spring framework enables you to inject the object dependency implicitly.
	
	private EmployeeRepository employeeRepository; //Injecting Employee Repository
	
	@Override
	public List<Employee> getAllEmployees() { 
		return employeeRepository.findAll();  //Simply Returns the list of employees to the controller 
		
	}

	@Override
	public void saveEmployee(Employee employee) {
		this.employeeRepository.save(employee); //To save the newly added employee details
	}

	@Override
	public Employee getEmployeeById(long id) {
		java.util.Optional<Employee> optional = employeeRepository.findById(id);
		Employee employee=null;
		if(optional.isPresent())
		{
			employee=optional.get();
		}
		else
		{
			throw new RuntimeException("Employee Not found for Id : "+ id);			
		}
		return employee;
			
	}

	@Override
	public void deleteEmployeeById(long id) {
		this.employeeRepository.deleteById(id);
		
	}

}
 