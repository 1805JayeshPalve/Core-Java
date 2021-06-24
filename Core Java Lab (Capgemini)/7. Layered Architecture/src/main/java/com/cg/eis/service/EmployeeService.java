package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	public abstract void addEmployee(Map<Integer,Employee> empMap );
	public abstract void deleteEmployee(Map<Integer,Employee> empMap , Integer empId);
	public abstract void showEmployeeWithScheme(Map<Integer,Employee> empMap, String scheme);
	public abstract void displayEmployee(Map<Integer,Employee> empMap);
	void showEmployeeWithScheme1(Map<Integer, Employee> empMap, String scheme);
	

}