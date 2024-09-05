package com.verizon;

import java.util.StringTokenizer;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer
		StringBuffer sb=new StringBuffer("java developer");
		sb.append(1999);
		System.out.println(sb);
		System.out.println(sb.delete(3,4));
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		System.out.println(sb.insert(3, "technology"));
	    sb.ensureCapacity(50);
	    String line="verizon,buildno10,rahejamindspace,Hyderabad,India";
	   //StringTokenizer
	    StringTokenizer st=new StringTokenizer(line,",");
	    System.out.println(st.countTokens());
	    while(st.hasMoreTokens())
	    System.out.println(st.nextToken());
	    //String
		String name="verizon developer";//literal
		String name123="verizon developer";//literal
		String name1=new String("java developer");//object
		System.out.println(name.length());
		System.out.println(name==name123);
		System.out.println(name.toLowerCase());
		System.out.println(name.compareTo(name123));
		}

}
