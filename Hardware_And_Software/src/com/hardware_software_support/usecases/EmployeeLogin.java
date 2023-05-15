package com.hardware_software_support.usecases;

import java.util.Base64;
import java.util.Scanner;

import com.hardware_software_support.dao.EmployeeDao;
import com.hardware_software_support.dao.EmployeeDaoImpl;
import com.hardware_software_support.exceptions.EmployeeException;
import com.hardware_software_support.model.Employee;
import com.hardware_software_support.util.ConsoleColors;

public class EmployeeLogin {
	// Employee login method

	public int loginEmployee() {
		int empId = 0;
		// taking input of username and password from user to login
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		System.out.println("==================================");

		EmployeeDao dao = new EmployeeDaoImpl();

		try {
			Employee emp = dao.loginEmployee(username);
			byte[] decodedBytes = Base64.getDecoder().decode(emp.getPassword());
			String decodedString = new String(decodedBytes);
			if (decodedString.equals(password)) {
				System.out.println(
						ConsoleColors.GREEN_BACKGROUND_BRIGHT + "Welcome " + emp.getName() + ConsoleColors.RESET);

				System.out.println("======================================");
				empId = emp.getEmpId();
			} else {
				System.out.println(ConsoleColors.RED);
				System.out.println("Invalid password. Please try again");

				System.out.println("===========================================");
				System.out.println(ConsoleColors.RESET);
				loginEmployee();
			}

		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			System.out.println(ConsoleColors.RED);
			System.out.println(e.getMessage());

			System.out.println("===========================================");
			System.out.println(ConsoleColors.RESET);
			loginEmployee();
		}

		return empId;
	}

}
