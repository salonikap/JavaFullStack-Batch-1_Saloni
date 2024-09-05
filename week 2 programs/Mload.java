package com.verizon.poly;

public class Mload {
	void area(int s) {
		System.out.println("square:"+(s*s));
	}
	void area(int l,int b) {
		System.out.println("rect:"+(l*b));
	}
	void area(double r) {
		System.out.println("circle:"+(3.14*r*r));
	}
	public static void main(String[] args) {
		Mload m=new Mload();
		m.area(4);
		m.area(3,4);
		m.area(4.3);
	}
}
