package com.verizon;

public class Customer {
private int id;
String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + "]";
}
public static void main(String[] args)
{
	Customer c=new Customer();
c.setId(10);
c.setName("ram");
System.out.println(c);
//System.out.println(c.getId()+ " "+c.getName());
}

}