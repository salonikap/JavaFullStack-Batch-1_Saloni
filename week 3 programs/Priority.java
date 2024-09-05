package com.verizon.test;
import org.testng.annotations.Test;
public class Priority {
	@Test(priority=-8)
		public void sample()
		{
		System.out.println("Testing with priority -8");
		}
	@Test(priority=10)
	public void sample1() {
		System.out.println("Testing with priority 10  AAA");
	}
	@Test(priority=10)
	public void sample3() {
		System.out.println("Testing with priority 10 BBB");
	}
	@Test
	public void sample5() {
		System.out.println("Testing with priority 0");
	}
	@Test(priority=100)
	public void sample4() {
		System.out.println("Testing with priority 100");
	}
}
