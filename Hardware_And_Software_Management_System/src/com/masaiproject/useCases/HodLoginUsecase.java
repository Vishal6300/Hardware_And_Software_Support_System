package com.masaiproject.useCases;

import java.util.Scanner;

import com.masaiproject.Exception.HodException;
import com.masaiproject.dao.HodDao;
import com.masaiproject.dao.HodDaoImpl;
import com.masaiproject.model.HOD;


public class HodLoginUsecase {
	public void useLoginHod() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Username");
		String username = sc.next();
		System.out.println("Enter Password");
		String password = sc.next();
		System.out.println("==================================");
		
		HodDao dao = new HodDaoImpl();
		
		try {
			HOD hod = dao.loginHod(username, password);
			System.out.println("Welcome "+ hod.getName());
			System.out.println("======================================");
			
		} catch (HodException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("===========================================");
			useLoginHod();
		}
	}
}
