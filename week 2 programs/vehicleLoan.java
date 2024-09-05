package com.verizon;

public class vehicleLoan extends Loan{
	void applyLoan(String name,double amount) {
		System.out.println(name +"loan of amount Rs"+amount +"applied");
		
	}
	void submitDocs()
	{
		System.out.println("All vehicle required documents");
		
	}
	int getEmi()
	{
		return 899;
	}
	}



