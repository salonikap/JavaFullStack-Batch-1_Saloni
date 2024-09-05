package com.verizon.poly;

public class Mride extends Ride {
	void sq(int s) {
		System.out.println("perimeter:"+(4*s));
	}

	public static void main(String[] args) {
	Mride m=new Mride();
	m.sq(4);
	Ride r=new Mride();
	r.sq(4);
	r=new Ride();
	r.sq(4);

		

	}

}
