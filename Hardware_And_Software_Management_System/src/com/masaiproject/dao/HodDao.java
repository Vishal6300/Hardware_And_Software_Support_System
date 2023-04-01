package com.masaiproject.dao;

import java.util.List;

import com.masaiproject.Exception.ComplaintException;
import com.masaiproject.Exception.EngineerException;
import com.masaiproject.Exception.HodException;
import com.masaiproject.model.Complaints;
import com.masaiproject.model.Engineer;
import com.masaiproject.model.HOD;

public interface HodDao {
public HOD loginHod(String username, String password) throws HodException;
	
	public String registerEngineer(String name, String username, String password, String type, String location) throws EngineerException;
	
	public List<Engineer> getEngineers() throws EngineerException;
	
	public String deleteEngineer(int engId) throws EngineerException;
	
	public List<Complaints> checkComplaints() throws ComplaintException;
	
	public String assignComplaintToEngineer(int complaintId, int engId) throws EngineerException;
}
