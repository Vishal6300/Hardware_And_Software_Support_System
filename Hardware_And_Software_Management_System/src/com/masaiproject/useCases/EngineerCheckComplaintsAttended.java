package com.masaiproject.useCases;

import java.util.List;

import com.masaiproject.Exception.ComplaintException;
import com.masaiproject.dao.EngineerDao;
import com.masaiproject.dao.EngineerDaoImpl;
import com.masaiproject.model.Complaints;

public class EngineerCheckComplaintsAttended {
	public void checkComplaintsAttended(int engId) {
		EngineerDao dao = new EngineerDaoImpl();
		
		try {
			List<Complaints> comps = dao.checkComplaintsAttended(engId);
			if(comps.isEmpty()) {
				System.out.println("No complaints attended.");
			}else {
				comps.forEach(comp -> System.out.println(comp));
			}
		} catch (ComplaintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
