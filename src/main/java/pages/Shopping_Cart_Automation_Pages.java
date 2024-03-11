package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Shopping_Cart_Automation_Pages extends StartupPage
{
	By shopOption = By.xpath("//a[.='Shop']"); 
	By cartMenuButton = By.xpath("//a[@title='Start shopping']"); 
	By automationPracticeSiteLogo = By.xpath("//a[@title=\"Automation Practice Site\"]"); 
	By newArrivalButton = By.xpath("//h2[.='new arrivals']"); 
	By seleniumRubyProduct = By.xpath("//h3[contains(text(),'Selenium Ruby')]/../../../..//a[@class=\"woocommerce-LoopProduct-link\"]"); 
	By thinkingInHtmlProduct = By.xpath("//h3[.='Thinking in HTML']"); 
	By masteringJavaScriptProduct = By.xpath("//h3[.='Mastering JavaScript']"); 
	By addToBasketButton = By.xpath("//button[.='Add to basket']"); 
	By productAddedMessage = By.xpath("//div[@class=\"woocommerce-message\"]"); 
	By viewBasketButton = By.xpath("//a[.='View Basket']"); 
	By seleniumRubyInsideTheBasketPage = By.xpath("//a[.='Selenium Ruby']/../..//td[@class=\"product-name\"]"); 
	By couponcodeField = By.xpath("//input[@id=\"coupon_code\"]"); 
	By applyCouponcodeButton = By.xpath("//input[@name=\"apply_coupon\"]"); 
	By priceReadOnyField = By.xpath("(//span[@class=\"woocommerce-Price-amount amount\"])[1]"); 
	By quantityField= By.xpath("//div[@class=\"quantity\"]"); 
	By totalField= By.xpath("//td[@class=\"product-subtotal\"]"); 
	By removeIcon= By.xpath("//a[@title=\"Remove this item\"]"); 
	By removeMessage= By.xpath("//div[@class=\"woocommerce-message\"]"); 
	By proceedToCheckoutButton= By.xpath("//a[contains(text(),'	Proceed to Checkout')]/../..//div[@class=\"wc-proceed-to-checkout\"]"); 

	public Shopping_Cart_Automation_Pages(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	/**@Test1
	 * about this method verifyNavigateTotTheShoppingCartpage() 
	 * @param : null
	 * @description : go to this shopping cart page URL and validate the home page
	 * @return : title of string type
	 * @author : Yaksha
	 */
	public String verifyNavigateTotTheShoppingCartpage() throws Exception {
		try {
			
		String currentPageTitle	=  driver.getTitle();
		System.out.println("Title of the Home Page : " + currentPageTitle );
		return currentPageTitle;
		}catch(Exception e) {
			throw e;
		}
	}
	/**@Test2
	 * about this method verifyShopOptionIsPresent() 
	 * @param : null
	 * @description : Check shop menu option is present or not
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean verifyShopOptionIsPresent() throws Exception {
		try {
		commonEvents.isDisplayed(shopOption);
		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	/**@Test3
	 * about this method clickOnShopMenuandValidateTheTitle() 
	 * @param : null
	 * @description : click on the shop menu and validate the title of this shop page
	 * @return : String
	 * @author : Yaksha
	 */
	public String clickOnShopMenuandValidateTheTitle() throws Exception {
		try {
		commonEvents.click(shopOption);
		String shopPageTitle=driver.getTitle();
		System.out.println("Title of the shop page:"+shopPageTitle);
		return shopPageTitle;
		}catch(Exception e) {
			throw e;
		}
	
	}

	/**@Test4
	 * about this method clickOnLogoandVerifyItIsNavigateToTheHomePage() 
	 * @param : null
	 * @description : validate the logo is present and click on the Automation practice site logo which is present at the left top corner
	 * 				  and verify the page title.
	 * @return : String
	 * @author : Yaksha
	 */
	public String clickOnLogoandVerifyItIsNavigateToTheHomePage() throws Exception {
		try {
			commonEvents.isDisplayed(automationPracticeSiteLogo);
			commonEvents.click(automationPracticeSiteLogo);
			String pageTitle=driver.getTitle();
			System.out.println("Title of the page:"+pageTitle);
			return pageTitle;
		}catch(Exception e) {
			throw e;
		}
	
	}

	/**@Test5
	 * about this method checkIfHomePageHasSectionOfNewArrivals() 
	 * @param : null
	 * @description : check home page has a section of new arrival.
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean checkIfHomePageHasSectionOfNewArrivals() throws Exception {
		try {
			commonEvents.isDisplayed(newArrivalButton);
		}catch(Exception e) {
			throw e;
		}
	return true;
	}
	
	/**@Test6
	 * about this method checkOfArrivalsSectionhasExactly3ProductsEnlisted() 
	 * @param : null
	 * @description : Check of “Arrivals” section has exactly 3 products enlisted
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean checkOfArrivalsSectionhasExactly3ProductsEnlisted() throws Exception {
		try {
			if(commonEvents.isDisplayed(seleniumRubyProduct)&&
					commonEvents.isDisplayed(thinkingInHtmlProduct)&&
					commonEvents.isDisplayed(masteringJavaScriptProduct)) {
				return true;
			}
		}catch(Exception e) {
			throw e;
		}
	return false;
	}
	
	/**@Test7
	 * about this method clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage() 
	 * @param : null
	 * @description : Check of “Arrivals” section has exactly 3 products enlisted
	 * @return : String
	 * @author : Yaksha
	 */
	public String clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage() throws Exception {
		try {
			commonEvents.click(seleniumRubyProduct);
			String seleniumRubyPageTitle=driver.getTitle();
			System.out.println("Selenium Ruby Page Title is :"+seleniumRubyPageTitle);
			return seleniumRubyPageTitle;
		}catch(Exception e) {
			throw e;
		}
	}
	
	/**@Test8
	 * about this method verifyAddBasketButtonIsPresentAndClickOnAddBasket() 
	 * @param : null
	 * @description : verify add basket button is present then click on the Add to basket button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean verifyAddBasketButtonIsPresentAndClickOnAddBasket() throws Exception {
		try {
			commonEvents.isDisplayed(addToBasketButton);
			commonEvents.click(addToBasketButton);
		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	/**@Test9
	 * about this method viewBasketButtonIsPresentAndClickOnIt() 
	 * @param : null
	 * @description : verify view basket button is present then click on the view to basket button
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean viewBasketButtonIsPresentAndClickOnIt() throws Exception {
		try {
			commonEvents.isDisplayed(viewBasketButton);
			commonEvents.click(viewBasketButton);
		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	
	/**@Test10
	 * about this method userIsNavigateToTheBasketPage() 
	 * @param : null
	 * @description : verify the title of the Basket Page
	 * @return : String
	 * @author : Yaksha
	 */
	public String userIsNavigateToTheBasketPage() throws Exception {
		try {
			String BasketPageTitle=driver.getTitle();
			System.out.println(BasketPageTitle);
			return BasketPageTitle;
		}catch(Exception e) {
			throw e;
		}
		
	}
	
	/**@Test11
	 * about this method seleniumRubyProductIsPresent() 
	 * @param : null
	 * @description : verify Selenium ruby product is present or not
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean seleniumRubyProductIsPresent() throws Exception {
		try {
			commonEvents.isDisplayed(seleniumRubyInsideTheBasketPage);
		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	
	/**@Test12
	 * about this method verifyCouponcodeFieldAndApplyCouponButtonIsPresent() 
	 * @param : null
	 * @description : verify coupon code field and apply coupon code button is present
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean verifyCouponcodeFieldAndApplyCouponButtonIsPresent() throws Exception {
		try {
			commonEvents.isDisplayed(couponcodeField);
			commonEvents.isDisplayed(applyCouponcodeButton);

			
		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	
	/**@Test13
	 * about this method pricedefinedAfterProductName() 
	 * @param : null
	 * @description : verify priceReadOnyField is present or not
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean pricedefinedAfterProductName() throws Exception {
		try {
			commonEvents.isDisplayed(priceReadOnyField);
	
		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	
	/**@Test14
	 * about this method quantityDefinedAfterProductPrice() 
	 * @param : null
	 * @description : verify quantityField is present or not
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean quantityDefinedAfterProductPrice() throws Exception {
		try {
			commonEvents.isDisplayed(quantityField);
	
		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	
	/**@Test15
	 * about this method totalDefinedIsPresentAfterQuantity() 
	 * @param : null
	 * @description : verify total field is present or not
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean totalDefinedIsPresentAfterQuantity() throws Exception {
		try {
			commonEvents.isDisplayed(totalField);
	
		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	
	/**@Test16
	 * about this method removeIconIsPresentandRemoveTheProduct() 
	 * @param : null
	 * @description : verify removeIcon is present or not then click on remove icon to remove the product
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean removeIconIsPresentandRemoveTheProduct() throws Exception {
		try {
			commonEvents.isDisplayed(removeIcon);
			commonEvents.click(removeIcon);
			
	
		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	
	/**@Test17
	 * about this method validatetheMessageAfterRemovingAProduct() 
	 * @param : null
	 * @description : check remove message is present and validate the Message After Removing A Product
	 * @return : boolean
	 * @author : Yaksha
	 */
	public String validatetheMessageAfterRemovingAProduct() throws Exception {
		try {
			commonEvents.isDisplayed(removeMessage);
			String messageafterRemoveProduct=commonEvents.getText(removeMessage);
			System.out.println("Message is:"+messageafterRemoveProduct);
			return messageafterRemoveProduct;
		}catch(Exception e) {
			throw e;
		}

	}
	

	/**@Test18
	 * about this method goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() 
	 * @param : null
	 * @description : go To The Home Icon then click on Seleniumruby Then Click On Add To Basket Then Click On View Basket
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() throws Exception {
		try {
			commonEvents.click(automationPracticeSiteLogo);
			commonEvents.click(seleniumRubyProduct);
			commonEvents.click(addToBasketButton);
			commonEvents.click(viewBasketButton);
	
		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	
	/**@Test19
	 * about this method validateIfWeHaveAProceedToCheckoutButtonORNot() 
	 * @param : null
	 * @description : verify proceedToCheckoutButton is present 
	 * @return : boolean
	 * @author : Yaksha
	 */
	public boolean validateIfWeHaveAProceedToCheckoutButtonORNot() throws Exception {
		try {
			commonEvents.isDisplayed(proceedToCheckoutButton);

		}catch(Exception e) {
			throw e;
		}
		return true;
	}
	
	
}
