package com.com.verizon;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumTest {
  @Test
  public void f() {
	  Assert.assertEquals(true,true);
	  System.out.println(Thread.currentThread().getId());
  }
}
