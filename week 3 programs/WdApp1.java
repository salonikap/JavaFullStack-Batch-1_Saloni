package com.verizon1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

class WdApp1 {
  WebDriver driver;  
	

	@Test
	void test() {
		  driver= new ChromeDriver();

	         driver.get("https://www.browserstack.com/");

	         Assert.assertEquals(driver.getTitle(), " App & Cross Browser Testing Platform | BrowserStack");

	         driver.quit();
	}

}
