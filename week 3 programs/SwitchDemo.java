package com.verizon1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SwitchDemo {
	  public static void main(String[] args) {
		  //	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");  
		  	WebDriver driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/selenium/deprecated.html");
	        driver.switchTo().frame("classFrame");
	        driver.findElement(By.linkText("Deprecated")).click();
	        driver.close(); 
	    }
}