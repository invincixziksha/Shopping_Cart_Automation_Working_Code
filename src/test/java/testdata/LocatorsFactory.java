package testdata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.StartupPage;

public class LocatorsFactory extends StartupPage {
	//please write all the locators for facebook page only 
	//please write all the locators for facebook page only 
	
		By shopIconButton = By.xpath("//a[.='Shop']"); 
		By androidProductCategory = By.xpath("//a[.='Android']"); 
		By newArrivalButton = By.xpath("//h2[.='new arrivals']"); 
		By seleniumRubyProduct = By.xpath("//h3[contains(text(),'Selenium Ruby')]/../../../..//a[@class=\"woocommerce-LoopProduct-link\"]"); 
		By seleniumRubyTitle = By.xpath("//h1[.='Selenium Ruby']"); 
		By viewBasketButton = By.xpath("//a[.='View Basket']"); 

		

		 
		public LocatorsFactory(WebDriver driver) {
			super(driver);
			// TODO Auto-generated constructor stub
		}
		
		//Expected data will be fetch from config.json file,path of the json file is:FaceBook_Automation_Dummy/src/main/resources/config.json


		public WebElement getShopIconOption(WebDriver driver) {
			WebElement shopIconButtonWebElement = driver.findElement(shopIconButton);
	        return shopIconButtonWebElement;
	    }
		
		public WebElement androidProductCategoryIsPresent(WebDriver driver) {
			WebElement androidProductCategoryWebElement = driver.findElement(androidProductCategory);
	        return androidProductCategoryWebElement;
	    }
		public WebElement newArrivalButtonIsPresent(WebDriver driver) {
			WebElement newArrivalButtonWebElement = driver.findElement(newArrivalButton);
	        return newArrivalButtonWebElement;
	    }
		public WebElement seleniumRubyProductIsPresent(WebDriver driver) {
			WebElement seleniumRubyProductWebElement = driver.findElement(seleniumRubyProduct);
	        return seleniumRubyProductWebElement;
	    }
		
		public WebElement seleniumRubyTitleIsPresent(WebDriver driver) {
			WebElement seleniumRubyTitleWebElement = driver.findElement(seleniumRubyTitle);
	        return seleniumRubyTitleWebElement;
	    }
		
		public WebElement viewBasketButtonIsPresent(WebDriver driver) {
			WebElement viewBasketButtonWebElement = driver.findElement(viewBasketButton);
	        return viewBasketButtonWebElement;
	    }
	
}
