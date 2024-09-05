package com.verizon;

public class Person {
	int id;
	String name;
	Person(){
		System.out.println("in parent");
		
	}
	public Person(int id,String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("parameterised const"+this.id+ " "+this.name);
	}
	

}
