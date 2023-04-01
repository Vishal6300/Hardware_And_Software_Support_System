package com.masaiproject.dao;

import java.util.List;

import com.masaiproject.Exception.ComplaintException;
import com.masaiproject.Exception.EmployeeException;
import com.masaiproject.model.Complaints;
import com.masaiproject.model.Employee;
import com.masaiproject.model.EngineerComplaintsDTO;

public interface EmployeeDao {

	public String registerEmployee(int deptid, String name, String username, String password) throws EmployeeException;
	
	public Employee loginEmployee(String username, String password) throws EmployeeException;
	
	public int raiseComplaint(int empId, String compType) throws ComplaintException;
	
	public EngineerComplaintsDTO checkComplaintStatus(int complaintId) throws ComplaintException;
	
	public List<Complaints> checkComplaintHistory(int empId) throws ComplaintException;
	
	public String changeEmployeePassword(String username, String oldPassword, String newPassword) throws EmployeeException;
	
}
