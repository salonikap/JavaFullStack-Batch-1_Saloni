package com.tms.java8;
@FunctionalInterface
interface Arith{
	int getSum(int a,int b);
}

/*public class FunctionDemo1 {
int getSum(int a,int b){
	return a+b;
}*/
public static void main(String[] args) {
	Arith arith=(a,b)->a+b;
	System.out.println(arith.getSum(5, 6));
	System.out.println(arith.getSum(15, 6));
}


