package com.masaiproject.useCases;

import java.util.List;

import com.masaiproject.Exception.ComplaintException;
import com.masaiproject.dao.EmployeeDao;
import com.masaiproject.dao.EmployeeDaoImpl;
import com.masaiproject.model.Complaints;

public class EmployeeCheckComplaintHistory {
public void checkComplaintHistory(int empId) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			List<Complaints> complaints = dao.checkComplaintHistory(empId);
			complaints.forEach(comp -> System.out.println(comp));
		} catch (ComplaintException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
