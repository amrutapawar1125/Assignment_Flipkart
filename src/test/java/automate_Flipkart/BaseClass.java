package automate_Flipkart;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pomPack1.Pomclass1;


public class BaseClass {

	 WebDriver driver;
	 Pomclass1 p1;
	 Actions a;
	 SoftAssert s;
	
	 @BeforeTest()
	 @Parameters("Browser")
     public void openBrowser(String BrowserName) throws InterruptedException
     {
		 if(BrowserName.equalsIgnoreCase("Chrome"))
		 {
			 //WebDriverManager.chromedriver().setup();
			 System.setProperty("webdriver.chrome.driver", "D:\\Testing Software\\ChromeDriver\\chromedriver_108\\chromedriver.exe");
			 driver= new ChromeDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(5000);
			 driver.get("https://www.flipkart.com/");
		 }
		 if(BrowserName.equalsIgnoreCase("Edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver=new EdgeDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(5000);
			 driver.get("https://www.flipkart.com/");
		 }
		 if(BrowserName.equalsIgnoreCase("FireFox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			 driver.manage().window().maximize();
			 Thread.sleep(5000);
			 driver.get("https://www.flipkart.com/");
			 Thread.sleep(5000);
		 }
		 
     }
	
	 @BeforeClass
	public void objectCreation()
	{
		p1=new Pomclass1(driver);
		a=new Actions(driver);
		s=new SoftAssert();
		
	}
	 
	 @BeforeMethod
	 public void presteps() throws InterruptedException
	 {
		 System.out.println("Test code");
		    p1.closedialogbox();
		    Thread.sleep(3000);
		    p1.HoverFashion(driver);
		    Thread.sleep(5000);
		    p1.HoverBabynKids(driver);
		    Thread.sleep(5000);
		    p1.HoverKidsClothing(driver);
		    Thread.sleep(5000);
		    p1.clickBoysnGirls(driver);
		    Thread.sleep(5000);
		    p1.clickonBottomwears(driver);
		    Thread.sleep(5000);
		    p1.clickShowmore(driver);
		    Thread.sleep(5000);
		    p1.clickonJeans(driver);
		    Thread.sleep(5000);
		    p1.clickonLowtoHigh(driver);
		    Thread.sleep(5000);
	 }
	 
	@Test
	 public void testcode() throws InterruptedException
	 {
	    p1.clickonProduct(driver);
	    Thread.sleep(5000);
	    p1.moveFocus(driver);
	    Thread.sleep(5000);
	    p1.getProductDetails(driver);
	    Thread.sleep(5000);
	 //   p1.getProductPrice(driver);
	  //  Thread.sleep(5000);
	    p1.selectSize(driver);
	    Thread.sleep(5000);
	    p1.addProduct(driver);
	    Thread.sleep(5000);
	
	    p1.clickRemove(driver);
	    Thread.sleep(5000);
		// p1.verifyRemoveItemPopup();
	    Thread.sleep(5000);
	    p1.clickFinalRemove(driver);
	    
	   
	    }
	
	
	
	
	 
	 
	 
	 

}
