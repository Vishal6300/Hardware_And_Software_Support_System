package com.masaiproject.useCases;

import java.util.List;
import com.masaiproject.Exception.EngineerException;
import com.masaiproject.dao.HodDao;
import com.masaiproject.dao.HodDaoImpl;

import com.masaiproject.model.Engineer;

public class HodCheckEngineers {
	public void hodCheckEngineers() {
		HodDao dao = new HodDaoImpl();
		
		try {
			List<Engineer> engs = dao.getEngineers();
			engs.forEach(eng -> System.out.println(eng));
			System.out.println("===============================");
			
		} catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
