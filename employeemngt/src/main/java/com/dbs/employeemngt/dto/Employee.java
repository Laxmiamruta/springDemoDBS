package com.dbs.employeemngt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	private String empId;
	private String empFirstName;
	private String empLastName;
	private String address;
	private float empSalary;
	protected String getEmpId() {
		return empId;
	}
	protected void setEmpId(String empId) {
		this.empId = empId;
	}
	protected String getEmpFirstName() {
		return empFirstName;
	}
	protected void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	protected String getEmpLastName() {
		return empLastName;
	}
	protected void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	protected String getAddress() {
		return address;
	}
	protected void setAddress(String address) {
		this.address = address;
	}
	protected float getEmpSalary() {
		return empSalary;
	}
	protected void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

}
