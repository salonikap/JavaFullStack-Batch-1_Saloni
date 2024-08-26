package com.com.verizon;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
  
  @Parameters({"suite-param"})
  @Test(enabled=false)
  public void prameterTestOne(String param) {
    System.out.println("Test one suite param is: " + param);
  }

  
  @Parameters({"test-two-param"})
  @Test
  public void prameterTestTwo(@Optional("verizonuser1") String param) {
    System.out.println("Test two param is: " + param);
  }

  
  @Parameters({"suite-param", "test-three-param"})
  @Test(enabled=false)
  public void prameterTestThree(String param, String paramTwo) {
    System.out.println("Test three suite param is: " + param);
    System.out.println("Test three param is: " + paramTwo);
  }
}