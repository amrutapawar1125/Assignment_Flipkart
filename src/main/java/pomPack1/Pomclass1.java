package pomPack1;

import java.util.ArrayList;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomclass1 {
	
	//WebDriver driver;
	private Actions a;
	
	
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closeButton;
	
	@FindBy(xpath="//div[text()='Fashion']")
	private WebElement Wfashion;
	
	@FindBy(xpath="//span[@class='_2I9KP_'][5]")
	private WebElement BabynKids;         
	
	@FindBy(xpath="//a[text()='Kids Clothing']")
	private WebElement Kids;         
	
	@FindBy(xpath="//div[text()='Boys & Girls']")
	private WebElement BoysnGirls;
	
	
	@FindBy(xpath="//a[@title='Bottomwear']")
	private WebElement Bottomwear;
	
	@FindBy(xpath="//span[text()='Show 6 more']")
	private WebElement Showmore;
	
	@FindBy(xpath="//a[@title='Jeans']")
	private WebElement Jeans;
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	private WebElement LowtoHigh;
	
	@FindBy(xpath="//img[@class='_2r_T1I']")
	private WebElement Product;
	
	@FindBy(xpath="//span[@class='B_NuCI']")
	private WebElement ProductName;
	
	@FindBy(xpath="//div[@class='_30jeq3 _16Jk6d']")
	private WebElement ProductPrice;
	
	@FindBy(xpath="//a[text()='6 - 12 Months']")
	private WebElement Size;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")
	private WebElement AddCartButton;
	
	@FindBy(xpath="//a[text()='ICABLE Slim Baby Boys Blue Jeans']")
	private WebElement CheckProductName;
	
	@FindBy(xpath="//a[text()='//span[@class='_2-ut7f _1WpvJ7']']")
	private WebElement CheckProductPrice;
	
	@FindBy(xpath="//div[text()='Remove']")
	private WebElement RemoveButton;
	
	@FindBy(xpath="//div[text()='Remove']")
	private WebElement FinalRemoveButton;
	
	@FindBy(xpath="//div[@class='_2sKwj8']")
	private WebElement Successmsg;
	
	@FindBy(xpath="div[text()='Remove Item']")
	private WebElement Removeitempopup;
	
	public void closedialogbox() 
	{
		closeButton.click();
		
	}
	
	public void HoverFashion(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(Wfashion).click().build().perform();
		System.out.println("Mouse moved to fashion");
		
	}
	
	public void HoverBabynKids(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(BabynKids).click().build().perform();
		System.out.println("Clicked on Baby and Kids");
		
	}
	public void HoverKidsClothing(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(Kids).click().build().perform();
		System.out.println("Clicked on Kids Clothing");
		
	}
	
	public void clickBoysnGirls(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(BoysnGirls).click().build().perform();
		System.out.println("Clicked on Boys and Girls Clothing");
		
	}
	
	public void clickonBottomwears(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(Bottomwear).click().build().perform();
		System.out.println("Clicked on Bottomwears");
		
	}
	
	public void clickShowmore(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(Showmore).click().build().perform();
		System.out.println("Clicked on Showmore");
		
	}
	
	public void clickonJeans(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(Jeans).click().build().perform();
		System.out.println("Clicked on Jeans");
		
	}
	public void clickonLowtoHigh(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(LowtoHigh).click().build().perform();
		System.out.println("Clicked on LowtoHigh");
		
	}
	public void clickonProduct(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(Product).click().build().perform();
		System.out.println("Clicked on Product");
		
	}
	
	public void moveFocus(WebDriver driver)
	{
		ArrayList<String> arr=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(arr.get(1));
		System.out.println("Focus moved to next window");
	}
	
	public String getProductDetails(WebDriver driver)
	{
		String Name=ProductName.getText();
		System.out.println("Expected Product Name is: "+Name);
		return Name;
	}
	
	public int getProductPrice(WebDriver driver)
	{
		String Price=ProductPrice.getText();
		int a=Integer.parseInt(Price);
		System.out.println("Product Price is: "+a);
		return a;
	}
	public String getCheckoutProductName(WebDriver driver)
	{
		String Name1=CheckProductName.getText();
		System.out.println("Actual Product Name is: "+Name1);
		return Name1;
	}
	public int getCheckoutProductPrice(WebDriver driver)
	{
		String Price1=ProductPrice.getText();
		int a1=Integer.parseInt(Price1);
		System.out.println("Product Price is: "+a1);
		return a1;
	}
	public void selectSize(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(Size).click().build().perform();
		System.out.println("Size selected");
	}
	public void addProduct(WebDriver driver)
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(000,3000)");
		a=new Actions(driver);
		a.moveToElement(AddCartButton).click().build().perform();
		
	}
	
	public void clickRemove(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(RemoveButton).click().build().perform();
		System.out.println("Remove Button Clicked");
	}
	
	public void clickFinalRemove(WebDriver driver)
	{
		a=new Actions(driver);
		a.moveToElement(FinalRemoveButton).click().build().perform();
		System.out.println("Final Remove Button Clicked");
	}
	
	public void verifySuccessmsg()
	{
		if(Successmsg.isDisplayed())
		{
		String message=Successmsg.getText();
		System.out.println(message);
		}
		else
		{
			System.out.println("Error");
		}
	}
	
	public void verifyRemoveItemPopup()
	{
		if(FinalRemoveButton.isDisplayed())
		{
			System.out.println("Pop up displayed");
		}
		else
		{
			System.out.println("Pop up not displayed");
		}
	}
	public Pomclass1(WebDriver d1)
	{
	 PageFactory.initElements(d1, this);	
	}

}
