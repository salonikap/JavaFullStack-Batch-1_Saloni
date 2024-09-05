 package com.tms.interfaces;

public class HousingLoan implements Loan,Surity
{
public void applyLoan(String name,double amount)
{
	System.out.println(name +"loan of amount Rs"+amount +"applied");
	}
public void submitDocs()
{
	System.out.println("All required documents");
	
}
public int getEmi()
{
	return 999;
}
public void submitDocs2()
{
	System.out.println("this is from surity");
}

}
