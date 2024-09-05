package com.verizon.test;

import org.testng.annotations.Test;

public class Invoc {
@Test(invocationCount=10)
public void sample1() {
	System.out.println("Testing with 10");
}
@Test()
public void sample() {
	System.out.println("Testing with normal method");
}
}
