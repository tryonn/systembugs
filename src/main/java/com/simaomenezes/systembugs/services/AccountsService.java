package com.simaomenezes.systembugs.services;

import java.util.List;

import com.simaomenezes.systembugs.models.Accounts;

public interface AccountsService {
	
	void save(Accounts accounts);
	void edit(Accounts accounts);
	void delete(Accounts accounts);
	List<Accounts> listAll();
	
	Accounts verificaUserPassword(String name, String password);

}
