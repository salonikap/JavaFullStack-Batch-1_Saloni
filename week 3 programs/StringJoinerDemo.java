package com.verizon;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
	StringJoiner Names=new StringJoiner(" ");
	//adding values to string joiner
	Names.add("Jashwanth");
	Names.add("Anjali");
	Names.add("kavitha");
	System.out.println(Names);
	System.out.println(Names.length());
	StringJoiner s1=new StringJoiner("/");
	s1.add("java");
	s1.add("python");
	System.out.println(Names.merge(s1));

	}

}
