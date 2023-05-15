package com.hardware_software_support.usecases;

import java.util.List;

import com.hardware_software_support.dao.EngineerDao;
import com.hardware_software_support.dao.EngineerDaoImpl;
import com.hardware_software_support.exceptions.ComplaintException;
import com.hardware_software_support.model.Complaints;

public class EngineerCheckComplaintsAttended {
	// This method is checking, if complaint has been attendted or not.
	public void checkComplaintsAttended(int engId) {
		EngineerDao dao = new EngineerDaoImpl();

		try {
			List<Complaints> comps = dao.checkComplaintsAttended(engId);
			if (comps.isEmpty()) {
				System.out.println("No complaints attended.");
			} else {
				comps.forEach(comp -> System.out.println(comp));
			}
		} catch (ComplaintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
