package grid;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
public class Test1 extends Base {
   public WebDriver driver = null;
   @Test
   public void testOne() {
   
     
	   driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");

    
      System.out.println("Page title is: " + driver.getTitle() + " obtained from testOne");
   }
   @BeforeMethod
   public void setup() throws MalformedURLException {
      driver = setBrowser("chrome");
   }
   @AfterMethod
   public void tearDown() {
   
   
      driver.quit();
   }
}