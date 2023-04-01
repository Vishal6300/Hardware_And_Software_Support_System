package com.masaiproject.useCases;

import java.util.Scanner;

import com.masaiproject.Exception.EngineerException;
import com.masaiproject.dao.HodDao;
import com.masaiproject.dao.HodDaoImpl;


public class HodAssignComplaintToEngineer {
	public void assignToEngineer() {
		Scanner sc = new Scanner(System.in);
		HodDao dao = new HodDaoImpl();
		System.out.println("Assign a complaint to an engineer");
		System.out.println("========================================");
		
		System.out.println("Enter complaint id to be assigned.");
		int compId = sc.nextInt();
		System.out.println("Enter engineer id to assign the complaint.");
		int engId = sc.nextInt();
		
		try {
			String res = dao.assignComplaintToEngineer(compId, engId);
			System.out.println(res);
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
