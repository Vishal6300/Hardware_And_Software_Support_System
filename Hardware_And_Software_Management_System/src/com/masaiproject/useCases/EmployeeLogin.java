package com.masaiproject.useCases;

import com.masaiproject.Exception.EmployeeException;

import java.util.Scanner;
import com.masaiproject.dao.EmployeeDao;
import com.masaiproject.dao.EmployeeDaoImpl;
import com.masaiproject.model.Employee;


public class EmployeeLogin {
	public int loginEmployee() {
		int empId = 0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		System.out.println("==================================");
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			Employee emp = dao.loginEmployee(username, password);
			System.out.println("Welcome "+ emp.getName());
			System.out.println("======================================");
			empId = emp.getEmpId();
			
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("===========================================");
			loginEmployee();
		}
		
		return empId;
	}
}
