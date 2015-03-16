package com.simaomenezes.systembugs.teste;

import com.simaomenezes.systembugs.models.Accounts;
import com.simaomenezes.systembugs.models.Bugs;
import com.simaomenezes.systembugs.models.Products;
import com.simaomenezes.systembugs.models.Status;

public class TestRelation {
	private static Accounts accounts;
	private static Products products;
	private static Status status;
	private static Bugs bugs;
	
	
	public static void main(String[] args) {

		System.out.println("########################################################");
		
		System.out.println(status1().getName());
		
		System.out.println(products1().getName());
		
		System.out.println(accounts1().getName());
		
		System.out.println(bugs1().getDescription());
		System.out.println(bugs1().getAccounts().getName());
		System.out.println(bugs1().getProducts().getName());
		
	}
	
	
	private static Status status1() {
		status = new Status();
		
		status.setId(1);
		status.setName("Criado");
		
		return status;
	}
	
	private static Products products1(){
		products = new Products();
		products.setId(1);
		products.setName("ERP2");
		
		return products;
	}
	
	private static Accounts accounts1(){
		accounts = new Accounts();
		accounts.setId(1);
		accounts.setName("Ana Paula");
		accounts.setPassword("123456");
		return accounts;
		
	}
	
	private static Bugs bugs1(){
		bugs = new Bugs();
		
		bugs.setAccounts(accounts1());
		bugs.setDescription("Sistema falho");
		bugs.setProducts(products1());
		bugs.setId(1);
		bugs.setStatus(status1());
		return bugs;
	}

}
