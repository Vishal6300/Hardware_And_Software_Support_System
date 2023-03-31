package com.masaiproject.dao;

public interface EmployeeDao {

	public String registerEmployee(int deptid, String name, String username, String password) throws EmployeeException;
	
	public Employee loginEmployee(String username, String password) throws EmployeeException;
	
	public int raiseComplaint(int empId, String compType) throws ComplaintException;
	
	public EngineerComplaintsDTO checkComplaintStatus(int complaintId) throws ComplaintException;
	
	public List<Complaints> checkComplaintHistory(int empId) throws ComplaintException;
	
	public String changeEmployeePassword(String username, String oldPassword, String newPassword) throws EmployeeException;
	
}
