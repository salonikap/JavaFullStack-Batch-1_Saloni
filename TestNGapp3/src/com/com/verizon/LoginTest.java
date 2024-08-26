package com.com.verizon;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void f() {
  }
  
  @Test
  @Parameters({ "id","pwd" })
// public void loginTest(@Optional("user1") String id,@Optional("pwd1") String pwd) {
  public void loginTest( String id, String pwd) {
		 System.out.println(id+  "  "+pwd);
		 System.out.println(Thread.currentThread().getId());
  }
}
