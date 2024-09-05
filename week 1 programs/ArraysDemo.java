package com.tms.java8;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
		int a[]= {8,3,6,5,4};
		for(int x:a)
			System.out.print(x +" ");
		System.out.println();
		Arrays.sort(a);
	for(int x:a)
		System.out.print(x+" ");
	System.out.println();
	int b[]=new int[3];
	Arrays.fill(b,44);
	for(int x:b)
		System.out.print(x+" ");
	System.out.println(Arrays.compare(a, b));
	System.out.println("Location:"+Arrays.binarySearch(a,0));
	List<Integer> list=Arrays.asList(3,4,5,6);
	System.out.println("..........for each with method  lamda.........");
	list.forEach(x->System.out.println(x));
	System.out.println("..........for each with method reference.........");
	list.forEach(System.out::println);
	}
}
