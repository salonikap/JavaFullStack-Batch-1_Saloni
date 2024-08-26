package com.verizon.DDTestingApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterByDataProvider {
    WebDriver driver;
     @BeforeTest
    public void setup(){
         driver = new FirefoxDriver();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://google.com");
    }
 
    

    @Test(dataProvider="SearchProvider")
    public void testMethod(String author,String searchKey) throws InterruptedException{
    {
        WebElement searchText = driver.findElement(By.name("q"));
        //search value in google searchbox
        searchText.sendKeys(searchKey);
        System.out.println("Welcome ->"+author+" Your search key is->"+searchKey);
        Thread.sleep(3000);
        String testValue = searchText.getAttribute("value");
        System.out.println(testValue +"::::"+searchKey);
        searchText.clear();
        //Verify if the value in google search box is correct
        Assert.assertTrue(testValue.equalsIgnoreCase(searchKey));
    }
    }
   
    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "Verizonuser1", "India" },
            { "Verizonuser2", "UK" },
            { "Verizonuser3", "USA" },
            { "Verizonuser4", "Verizon ,Hyderabad" },
            { "Verizonuser5", " Selenium tutorial" },
            { "Verizonuser6", "Cucumber" }
            
        };

    }

}