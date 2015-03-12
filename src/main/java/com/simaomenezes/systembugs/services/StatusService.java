package com.simaomenezes.systembugs.services;

import java.util.List;

import com.simaomenezes.systembugs.models.Status;

public interface StatusService {
	
	void save(Status status);
	void edit(Status status);
	void delete(Status status);
	List<Status> listAll();

}
