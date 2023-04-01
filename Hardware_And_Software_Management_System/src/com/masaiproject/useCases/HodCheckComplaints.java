package com.masaiproject.useCases;

import java.util.ArrayList;
import java.util.List;

import com.masaiproject.Exception.ComplaintException;
import com.masaiproject.dao.HodDao;
import com.masaiproject.dao.HodDaoImpl;
import com.masaiproject.model.Complaints;

public class HodCheckComplaints {
public void hodCheckAllComplaints() {
		
		List<Complaints> comps = new ArrayList<>();
		
		HodDao dao = new HodDaoImpl();
		
		try {
			comps = dao.checkComplaints();
			comps.forEach(comp -> System.out.println(comp));
		} catch (ComplaintException e) {
			System.out.println(e.getMessage());
		} 
	}
}
