package com.simaomenezes.systembugs.teste;

import javax.persistence.EntityManager;

import com.google.common.hash.Hashing;
import com.simaomenezes.systembugs.models.Accounts;
import com.simaomenezes.systembugs.services.AccountsService;
import com.simaomenezes.systembugs.services.impl.AccountsImpl;

public class TestAccounts {

	public static void main(String[] args) {
		EntityManager manager = null;
		Accounts accounts = new Accounts();
		AccountsService accountsService = new AccountsImpl(manager);
		
		
		accounts.setName("Ana");
		accounts.setPassword("123456");
		
		String senha = Hashing.sha512().hashString(accounts.getPassword()).toString();
		
		accountsService.verificaUserPassword(accounts.getName(), senha);

	}

}
