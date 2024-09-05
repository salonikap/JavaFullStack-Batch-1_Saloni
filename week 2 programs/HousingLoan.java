package com.verizon;

public class HousingLoan extends Loan {
	void applyLoan(String name,double amount) {
		System.out.println(name +"loan of amount Rs"+amount +"applied");
		
	}
	void submitDocs()
	{
		System.out.println("All required documents");
		
	}
	int getEmi()
	{
		return 999;
	}

	

	}


