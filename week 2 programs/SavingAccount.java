package com.verizon;
//acNumber,name,balance
public class SavingAccount extends Account
{
	String proof;
	String bname;
	void show()
	{
		deposit(3000);
		System.out.println(getBalance());
		System.out.println(acNumber + " " +balance);
		
	}
	public static void main(String[] args)
	{
		SavingAccount sa=new SavingAccount();
		sa.show();
	}
}
