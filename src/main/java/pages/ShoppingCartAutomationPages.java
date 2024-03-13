package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartAutomationPages extends StartupPage
{
	By shopOption = By.xpath("//a[.='Shop']"); 
	By cartMenuButton = By.xpath("//a[@title='Start shopping']"); 
	By automationPracticeSiteLogo = By.xpath("//a[@title='Automation Practice Site']"); 
	By newArrivalButton = By.xpath("//h2[.='new arrivals']"); 
	By seleniumRubyProduct = By.xpath("//h3[contains(text(),'Selenium Ruby')]/../../../..//a[@class='woocommerce-LoopProduct-link']"); 
	By thinkingInHtmlProduct = By.xpath("//h3[.='Thinking in HTML']"); 
	By masteringJavaScriptProduct = By.xpath("//h3[.='Mastering JavaScript']"); 
	By addToBasketButton = By.xpath("//button[.='Add to basket']"); 
	By productAddedMessage = By.xpath("//div[@class='woocommerce-message']"); 
	By viewBasketButton = By.xpath("//a[.='View Basket']"); 
	By seleniumRubyInsideTheBasketPage = By.xpath("//a[.='Selenium Ruby']/../..//td[@class='product-name']"); 
	By couponcodeField = By.xpath("//input[@id='coupon_code']"); 
	By applyCouponcodeButton = By.xpath("//input[@name='apply_coupon']"); 
	By priceReadOnlyField = By.xpath("(//span[@class='woocommerce-Price-amount amount'])[1]"); 
	By quantityField= By.xpath("//div[@class='quantity']"); 
	By totalField= By.xpath("//td[@class='product-subtotal']"); 
	By removeIcon= By.xpath("//a[@title='Remove this item']"); 
	By removeMessage= By.xpath("//div[@class='woocommerce-message']"); 
	By proceedToCheckoutButton= By.xpath("//a[contains(text(),'	Proceed to Checkout')]/../..//div[@class='wc-proceed-to-checkout']"); 

	public ShoppingCartAutomationPages(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	/**@Test1
	 * about this method verifyNavigateTotTheShoppingCartpage() 
	 * @param : null
	 * @description : go to this shopping cart page URL and validate the home page
	 * @return : return String if page title is matching
	 * @author : Yaksha
	 */
	public String verifyNavigateTotTheShoppingCartpage() throws Exception {
		String titleOfTheShoppingCartPage = "";
		try {	
			titleOfTheShoppingCartPage	=commonEvents.getTitle();
		System.out.println("Title of the Home Page : " + titleOfTheShoppingCartPage );
		}catch(Exception e) {
			throw e;
		}
		return titleOfTheShoppingCartPage;
	}
	/**@Test2
	 * about this method verifyShopOptionIsPresent() 
	 * @param : null
	 * @description : Check shop menu option is present or not
	 * @return : return true if shopOption is present, else false
	 * @author : Yaksha
	 */
	public boolean verifyShopOptionIsPresent() throws Exception {
		Boolean shopOptionisDisplay = false;
		try {
		if(commonEvents.isDisplayed(shopOption))
		{
			shopOptionisDisplay=true;
		}
		}catch(Exception e) {
			throw e;
		}
		return shopOptionisDisplay;
	}
	/**@Test3
	 * about this method clickOnShopMenuandValidateTheTitle() 
	 * @param : null
	 * @description : click on the shop menu and validate the title of this shop page
	 * @return : return String if page shop page title is matching
	 * @author : Yaksha
	 */
	public String clickOnShopMenuandValidateTheTitle() throws Exception {
		String shopPageTitle="";
		try {
		commonEvents.click(shopOption);
		shopPageTitle=driver.getTitle();
		System.out.println("Title of the shop page:"+shopPageTitle);
		}catch(Exception e) {
			throw e;
		}
		return shopPageTitle;

	}

	/**@Test4
	 * about this method clickOnLogoandVerifyItIsNavigateToTheHomePage() 
	 * @param : null
	 * @description : validate the logo is present and click on the Automation practice site logo which is present at the left top corner
	 * 				  and verify the page title.
	 * @return : return String if page title is matching
	 * @author : Yaksha
	 */
	public String clickOnLogoandVerifyItIsNavigateToTheHomePage() throws Exception {
		String homePageTitle="";
		try {
			commonEvents.isDisplayed(automationPracticeSiteLogo);
			commonEvents.click(automationPracticeSiteLogo);
			homePageTitle=commonEvents.getTitle();
			System.out.println("Title of the page:"+homePageTitle);
		}catch(Exception e) {
			throw e;
		}
		return homePageTitle;

	}

	/**@Test5
	 * about this method checkIfHomePageHasSectionOfNewArrivals() 
	 * @param : null
	 * @description : check home page has a section of new arrival.
	 * @return : return true if newArrival Button is present, else false
	 * @author : Yaksha
	 */
	public boolean checkIfHomePageHasSectionOfNewArrivals() throws Exception {
		Boolean newArrivalButtonIsDisplay = false;
		try {
			if(commonEvents.isDisplayed(newArrivalButton))
			{
				newArrivalButtonIsDisplay=true;
			}
			
		}catch(Exception e) {
			throw e;
		}
		return newArrivalButtonIsDisplay;
	}
	
	/**@Test6
	 * about this method checkOfArrivalsSectionhasExactly3ProductsEnlisted() 
	 * @param : null
	 * @description : Check of “Arrivals” section has exactly 3 products enlisted
	 * @return : return true if all three products are  present, else false
	 * @author : Yaksha
	 */
	public boolean checkOfArrivalsSectionhasExactly3ProductsEnlisted() throws Exception {
		Boolean threeProductsAreDisplay = false;
		try {
			if(commonEvents.isDisplayed(seleniumRubyProduct)&&
					commonEvents.isDisplayed(thinkingInHtmlProduct)&&
					commonEvents.isDisplayed(masteringJavaScriptProduct)) {
				threeProductsAreDisplay=true;
			}
		}catch(Exception e) {
			throw e;
		}
	return threeProductsAreDisplay;
	}
	
	/**@Test7
	 * about this method clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage() 
	 * @param : null
	 * @description : Check of “Arrivals” section has exactly 3 products enlisted
	 * @return : return String if seleniumRuby PageTitle is matching
	 * @author : Yaksha
	 */
	public String clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage() throws Exception {
		String seleniumRubyPageTitle="";
		try {
			commonEvents.click(seleniumRubyProduct);
			seleniumRubyPageTitle=commonEvents.getTitle();
			System.out.println("Selenium Ruby Page Title is :"+seleniumRubyPageTitle);
		}catch(Exception e) {
			throw e;
		}
		return seleniumRubyPageTitle;

	}
	
	/**@Test8
	 * about this method verifyAddBasketButtonIsPresentAndClickOnAddBasket() 
	 * @param : null
	 * @description : verify add basket button is present then click on the Add to basket button
	 * @return : return true if viewBasketButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean verifyAddBasketButtonIsPresentAndClickOnAddBasket() throws Exception {
		Boolean viewBasketButtonIsDisplay = false;
		try {
			commonEvents.isDisplayed(addToBasketButton);
			commonEvents.click(addToBasketButton);
			if(commonEvents.isDisplayed(viewBasketButton))
			{
				viewBasketButtonIsDisplay=true;
			}
		}catch(Exception e) {
			throw e;
		}
		return viewBasketButtonIsDisplay;
	}
	/**@Test9
	 * about this method viewBasketButtonIsPresentAndClickOnIt() 
	 * @param : null
	 * @description : verify view basket button is present then click on the view basket button
	 * @return : return true if seleniumRuby product is present InsideTheBasketPage, else false
	 * @author : Yaksha
	 */
	public boolean viewBasketButtonIsPresentAndClickOnIt() throws Exception {
		Boolean seleniumRubyInsideTheBasketPageisDisplay = false;
		try {
			commonEvents.isDisplayed(viewBasketButton);
			commonEvents.click(viewBasketButton);
			if(commonEvents.isDisplayed(seleniumRubyInsideTheBasketPage)) {
				seleniumRubyInsideTheBasketPageisDisplay=true;
			}
		}catch(Exception e) {
			throw e;
		}
		return seleniumRubyInsideTheBasketPageisDisplay;
	}
	
	/**@Test10
	 * about this method userIsNavigateToTheBasketPage() 
	 * @param : null
	 * @description : verify the title of the Basket Page
	 * @return : return String if  PageTitle is matching
	 * @author : Yaksha
	 */
	public String userIsNavigateToTheBasketPage() throws Exception {
		String basketPageTitle="";
		try {
			 basketPageTitle=commonEvents.getTitle();
			System.out.println(basketPageTitle);
		}catch(Exception e) {
			throw e;
		}
		return basketPageTitle;

	}
	
	/**@Test12
	 * about this method seleniumRubyProductIsPresent() 
	 * @param : null
	 * @description : verify Selenium ruby product is present or not
	 * @return : return true if seleniumRuby product is present InsideTheBasketPage, else false
	 * @author : Yaksha
	 */
	public boolean seleniumRubyProductIsPresent() throws Exception {
		Boolean seleniumRubyInsideTheBasketPageisDisplay = false;
		try {
			if(commonEvents.isDisplayed(seleniumRubyInsideTheBasketPage))
			{
				seleniumRubyInsideTheBasketPageisDisplay=true;
			}
		}catch(Exception e) {
			throw e;
		}
		return seleniumRubyInsideTheBasketPageisDisplay;
	}
	
	/**@Test13
	 * about this method verifyCouponcodeFieldAndApplyCouponButtonIsPresent() 
	 * @param : null
	 * @description : verify coupon code field and apply coupon code button is present
	 * @return : return true if applyCouponcodeButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean verifyCouponcodeFieldAndApplyCouponButtonIsPresent() throws Exception {
		Boolean isDisplay = false;
		try {
			commonEvents.isDisplayed(couponcodeField);
			if(commonEvents.isDisplayed(applyCouponcodeButton)) {
				isDisplay=true;
			}

			
		}catch(Exception e) {
			throw e;
		}
		return isDisplay;
	}
	
	/**@Test14
	 * about this method priceDefinedAfterProductName() 
	 * @param : null
	 * @description : verify price ReadOnlyField is present or not
	 * @return : return true if priceReadOnlyField is  present, else false
	 * @author : Yaksha
	 */
	public boolean priceDefinedAfterProductName() throws Exception {
		Boolean isDisplay = false;
		try {
			if(commonEvents.isDisplayed(priceReadOnlyField))
			{
				isDisplay=true;
			}
	
		}catch(Exception e) {
			throw e;
		}
		return isDisplay;
	}
	
	/**@Test15
	 * about this method quantityDefinedAfterProductPrice() 
	 * @param : null
	 * @description : verify quantity Field is present or not
	 * @return : return true if quantityField is  present, else false
	 * @author : Yaksha
	 */
	public boolean quantityDefinedAfterProductPrice() throws Exception {
		Boolean isDisplay = false;
		try {
			if(commonEvents.isDisplayed(quantityField)) {
				isDisplay=true;
			}
	
		}catch(Exception e) {
			throw e;
		}
		return isDisplay;
	}
	
	/**@Test16
	 * about this method totalDefinedIsPresentAfterQuantity() 
	 * @param : null
	 * @description : verify total field is present or not
	 * @return : return true if totalField is  present, else false
	 * @author : Yaksha
	 */
	public boolean totalDefinedIsPresentAfterQuantity() throws Exception {
		Boolean isDisplay = false;
		try {
			if(commonEvents.isDisplayed(totalField)) {
				isDisplay=true;
			}
	
		}catch(Exception e) {
			throw e;
		}
		return isDisplay;
	}
	
	/**@Test17
	 * about this method removeIconIsPresentandRemoveTheProduct() 
	 * @param : null
	 * @description : verify removeIcon is present or not then click on remove icon to remove the product
	 * @return : return true if removeMessage is  present, else false
	 * @author : Yaksha
	 */
	public boolean removeIconIsPresentandRemoveTheProduct() throws Exception {
		Boolean removeMessageisDisplay = false;
		try {
			commonEvents.isDisplayed(removeIcon);
			commonEvents.click(removeIcon);
			if(commonEvents.isDisplayed(removeMessage)) {
				removeMessageisDisplay=true;
			}
			
	
		}catch(Exception e) {
			throw e;
		}
		return removeMessageisDisplay;
	}
	
	/**@Test18
	 * about this method validatetheMessageAfterRemovingAProduct() 
	 * @param : null
	 * @description : check remove message is present and validate the Message After Removing A Product
	 * @return : return String if page title is matching
	 * @author : Yaksha
	 */
	public String validatetheMessageAfterRemovingAProduct() throws Exception {
		String messageafterRemoveProduct;
		try {
			commonEvents.isDisplayed(removeMessage);
			messageafterRemoveProduct=commonEvents.getText(removeMessage);
			System.out.println("Message is:"+messageafterRemoveProduct);
		}catch(Exception e) {
			throw e;
		}
		return messageafterRemoveProduct;

	}
	

	/**@Test19 same as @Test11
	 * about this method goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() 
	 * @param : null
	 * @description : go To The Home Icon then click on Seleniumruby Then Click On Add To Basket Then Click On View Basket
	 * @return : return true if proceedToCheckoutButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() throws Exception {
		Boolean proceedToCheckoutButtonisDisplay = false;

		try {
			commonEvents.click(automationPracticeSiteLogo);
			commonEvents.click(seleniumRubyProduct);
			commonEvents.click(addToBasketButton);
			commonEvents.click(viewBasketButton);
			if(commonEvents.isDisplayed(proceedToCheckoutButton)) {
				proceedToCheckoutButtonisDisplay=true;
			}
	

		}catch(Exception e) {
			throw e;
		}
		return proceedToCheckoutButtonisDisplay;
	}
	
	/**@Test20
	 * about this method validateIfWeHaveAProceedToCheckoutButtonORNot() 
	 * @param : null
	 * @description : verify proceedToCheckoutButton is present 
	 * @return : return true if proceedToCheckoutButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean validateIfWeHaveAProceedToCheckoutButtonORNot() throws Exception {
		Boolean proceedToCheckoutButtonisDisplay = false;
		try {
			if(commonEvents.isDisplayed(proceedToCheckoutButton)) {
				proceedToCheckoutButtonisDisplay=true;
			}

		}catch(Exception e) {
			throw e;
		}
		return proceedToCheckoutButtonisDisplay;
	}
	
	
}
