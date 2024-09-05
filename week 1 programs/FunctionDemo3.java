package com.tms.java8;
@FunctionalInterface
interface Arith2<T>{
	T op(T a,T b);
}


public class FunctionDemo3 {

	public static void main(String[] args) {
		Arith2 <Integer> arith=( a, b)->a+b;
		System.out.println(arith.op(5,6));
		Arith2 <Double>arith1=(a,b)->a*a-b*b;
		System.out.println(arith1.op(3.5,4.4));
		
	}

}
