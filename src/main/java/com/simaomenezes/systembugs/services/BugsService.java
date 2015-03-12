package com.simaomenezes.systembugs.services;

import java.util.List;

import com.simaomenezes.systembugs.models.Bugs;

public interface BugsService {
	
	void save(Bugs bugs);
	void edit(Bugs bugs);
	void delete(Bugs bugs);
	List<Bugs> listAll();

}
