package com.verizon;

public class Account {
	int acNumber;
	String name;
	double balance;
	void deposit(int amt)
	{
		balance+=amt;
	}
	double withdraw(int amt)
	{
		balance-=amt;
		return balance;
	
	}
	double getBalance()
{     return balance;
		}


}
