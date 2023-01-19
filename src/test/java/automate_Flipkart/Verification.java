package automate_Flipkart;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomPack1.Pomclass1;
@Test
public class Verification {

	WebDriver driver;
	Pomclass1 p1=new Pomclass1(driver);
	SoftAssert s=new SoftAssert();
	
	public void verifyProductName() throws InterruptedException
	{
		String Expected=p1.getProductDetails(driver);
		String Actual=p1.getCheckoutProductName(driver);
		s.assertEquals(Actual, Expected);
		System.out.println("Verified");
	}
	@Test
	public void verifyProductPrice()
	{
		int a=p1.getProductPrice(driver);
		int b=p1.getCheckoutProductPrice(driver);
		s.assertEquals(a, b);
		s.assertAll("Verified all");
	}
	@Test
	public void verifypopupdisplay()
	{
		p1.verifyRemoveItemPopup();
		s.assertAll();
	}
}
