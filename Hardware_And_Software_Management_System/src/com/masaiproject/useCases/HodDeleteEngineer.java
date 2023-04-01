package com.masaiproject.useCases;

import java.util.Scanner;

import com.masaiproject.Exception.EngineerException;
import com.masaiproject.dao.HodDao;
import com.masaiproject.dao.HodDaoImpl;

public class HodDeleteEngineer {
	public void hodDeleteEngineer() {
		System.out.println("Delete Engineer");
		System.out.println("=======================================");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Engineer Id to delete the engineer record.");
		int engId = sc.nextInt();
		System.out.println("=======================================");
		HodDao dao = new HodDaoImpl();
		
		try {
			String res = dao.deleteEngineer(engId);
			System.out.println(res);
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
	}
}
