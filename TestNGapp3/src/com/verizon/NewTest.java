package com.verizon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  Assert.assertEquals(10,10);
	  System.out.println(Thread.currentThread().getId());
  }
  @Test
  public void f1() {
	  Assert.assertEquals(10,10);
	  System.out.println(Thread.currentThread().getId());
  }
  @Test
  public void f2() {
	  Assert.assertEquals(10,10);
	  System.out.println(Thread.currentThread().getId());
  }
}
