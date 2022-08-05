package com.example.EmployeeManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// Make Java Class as a JPA Entity
@Entity
@Table(name="employees")
public class Employee {
	
	@Id // To provide primary key of our entity
	@GeneratedValue(strategy= GenerationType.IDENTITY) //To provide a primary key generation strategy
	private long id;
	
	@Column(name="first_name")// To map a column name to this field. If annotation is not provided, the column name will be firstName (fieldname) by default.
	private String firstName;
	
	@Column(name="last_name")// To map a column name to this field
	private String lastName;
	
	@Column(name="email")// To map a column name to this field
	private String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
