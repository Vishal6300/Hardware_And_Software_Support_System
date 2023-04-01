package com.masaiproject.dao;

import java.util.List;

import com.masaiproject.Exception.ComplaintException;
import com.masaiproject.Exception.EngineerException;
import com.masaiproject.model.Complaints;
import com.masaiproject.model.Engineer;

public interface EngineerDao {
public Engineer loginEngineer(String username, String password) throws EngineerException;
	
	public List<Complaints> checkAssignedComplaints(int engId) throws ComplaintException;
	
	public String updateComplaintStatus(int complaintId, String newStatus) throws ComplaintException;
	
	public List<Complaints> checkComplaintsAttended(int engId) throws ComplaintException;
	
	public String changeEngineerPassword(String username, String oldPassword, String newPassword) throws EngineerException;
}
