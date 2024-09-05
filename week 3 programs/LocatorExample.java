package com.verizon1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {
    public static void main(String[] args) {
        // Set the path to the chromedriver executable
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Open a webpage
        driver.get("https://example.com");

        // Locate elements using different locators
        WebElement idElement = driver.findElement(By.id("element-id"));
        WebElement nameElement = driver.findElement(By.name("element-name"));
        WebElement classElement = driver.findElement(By.className("element-class"));
        WebElement tagElement = driver.findElement(By.tagName("input"));
        WebElement cssElement = driver.findElement(By.cssSelector("input[type='text']"));
        WebElement xpathElement = driver.findElement(By.xpath("//input[@id='element-id']"));

        // Perform actions on the located elements
        idElement.sendKeys("Test ID");
        nameElement.sendKeys("Test Name");
        classElement.sendKeys("Test Class");
        tagElement.sendKeys("Test Tag");
        cssElement.sendKeys("Test CSS");
        xpathElement.sendKeys("Test XPath");

        // Close the browser
        driver.quit();
    }
}
