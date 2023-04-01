package com.masaiproject.useCases;

import java.util.List;

import com.masaiproject.Exception.ComplaintException;
import com.masaiproject.dao.EngineerDao;
import com.masaiproject.dao.EngineerDaoImpl;
import com.masaiproject.model.Complaints;

public class EngineerCheckComplaintsAssigned {
public void checkComplaintsAssigned(int engId) throws ComplaintException {
		
		EngineerDao dao = new EngineerDaoImpl();
		try {
			List<Complaints> complaintsAssigned = dao.checkAssignedComplaints(engId);
			if(complaintsAssigned.isEmpty()) {
				System.out.println("No new complaints assigned.");
			}else
			complaintsAssigned.forEach(comps -> System.out.println(comps));
		} catch (ComplaintException e) {
			// TODO Auto-generated catch block
			throw new ComplaintException("No complaints assigned.");
		}
		
	}
}
