package com.verizon.exceptions;

public class Ex6 {

	public static void main(String[] args)throws DepositException {
		int amt=999;
		
		if(amt<1000)
			throw new DepositException("minimum amount is 1000/-");
		else
			System.out.println("Thank you using service");
			
	}

}
