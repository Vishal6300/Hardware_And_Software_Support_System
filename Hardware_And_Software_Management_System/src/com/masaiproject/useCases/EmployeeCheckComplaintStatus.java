package com.masaiproject.useCases;

import java.util.Scanner;

import com.masaiproject.Exception.ComplaintException;
import com.masaiproject.dao.EmployeeDao;
import com.masaiproject.dao.EmployeeDaoImpl;
import com.masaiproject.model.EngineerComplaintsDTO;

public class EmployeeCheckComplaintStatus {
	public void checkCompStatus() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your complaint id to check status");
		int compId = sc.nextInt();
		System.out.println("=======================================");
		System.out.println("Complaint status:- ");
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			EngineerComplaintsDTO dto =  dao.checkComplaintStatus(compId);
			System.out.println("ComplaintId: " + dto.getComplaintId());
			System.out.println("Complaint Type: " + dto.getComplaintType());
			System.out.println("Engineer id: " + dto.getEngId());
			System.out.println("Engineer name: " + dto.getName());
			System.out.println("Status: " + dto.getStatus());
			System.out.println("Date raised: " + dto.getDateRaised());
		} catch (ComplaintException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
