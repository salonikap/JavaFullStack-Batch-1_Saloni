package com.verizon;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length,breadth of rect");
		int l = sc.nextInt();
		int b = sc.nextInt();
		if(l>0&&b>0)
		{
			int area = l* b;
		
		System.out.println("Area:" + area);
		}else
		{
			System.out.println(" invalid");
		}

	}

}
