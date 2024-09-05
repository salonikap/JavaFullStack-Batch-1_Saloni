package com.tms.java8;
@FunctionalInterface
interface Arith1{
	int op(int a,int b);
}

public class FunctionDemo2 {

	public static void main(String[] args) {
		Arith1 arith=(int a,int b)->{int c=a+b;return c;};
		System.out.println(arith.op(5,6));
		Arith1 arith1=(a,b)->a*a-b*b;
		System.out.println(arith1.op(3,4));
		
	}

}
