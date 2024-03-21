package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartL1Pages extends StartupPage
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
	By increasedProductInCart= By.xpath("//span[.='1 item']"); 	
	By myAccountIcon= By.xpath("//a[.='My Account']"); 
	By usernameTextField= By.id("username"); 
	By passwordTextField= By.id("password"); 
	By loginButton= By.xpath("//input[@name=\"login\"]"); 
	By emailAddressTextField= By.id("reg_email"); 
	By registerButton= By.xpath("//input[@name=\"register\"]"); 
	By passwordTextFieldInRegister=By.id("reg_password");	
	By testCasesIcon=By.xpath("//a[.='Test Cases']");
	By atSiteIcon=By.xpath("//a[.='AT Site']");
	By seleniumText=By.xpath("//span[.='Selenium']");
	By appiumText=By.xpath("//span[.='//span[.='Appium']']");
	By refineByField=By.xpath("//h4[.='Refine By >']");
	By homeShopMenu=By.xpath("//a[.='Home']");
	By filterByPriceSlider=By.xpath("//h4[.='Filter by price']");
	By seleniumRubyProductPrice=By.xpath("(//span[@class=\"woocommerce-Price-amount amount\"])[1]/..");
	By quantity=By.xpath("//div[@class=\"quantity\"]");
	By productTotalPrice=By.xpath("(//td[@data-title=\"Total\"])[1]");
	By subTotalAmount=By.xpath("//td[@data-title=\"Subtotal\"]");
	By taxAmount=By.xpath("//td[@data-title=\"Tax\"]");	
	By totalAmount=By.xpath("(//td[@data-title=\"Total\"])[2]");
	
			
	public ShoppingCartL1Pages(WebDriver driver) 
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
	
	
	/**@Test11
	 * about this method seleniumrubyIsPresentInsideTheCartPage() 
	 * @param : null
	 * @description :seleniumruby Is PresentInside The CartPage
	 * @return : return true if product seleniumRuby Inside The Basket Page  else false
	 * @author : Yaksha
	 */
	public Boolean seleniumrubyIsPresentInsideTheCartPage() throws Exception {
		Boolean seleniumRubyInsideTheBasketPageIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(seleniumRubyInsideTheBasketPage))
			{
				seleniumRubyInsideTheBasketPageIsDisplayed=true;
			}
			
		}catch(Exception e) {
			throw e;
		}
		return seleniumRubyInsideTheBasketPageIsDisplayed;
	}
	
	/**@Test12
	 * about this method verifythatSeleniumRubyProductPriceIs500() 
	 * @param : null
	 * @description : verify that SeleniumRuby Product Price Is 500
	 * @return : return true if product price is displayed else false
	 * @author : Yaksha
	 */
	public Boolean verifythatSeleniumRubyProductPriceIs500() throws Exception {
		Boolean seleniumRubyProductPriceIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(seleniumRubyProductPrice))
			{
				String seleniumRubyProductAmount=commonEvents.getText(seleniumRubyProductPrice);
				System.out.println("Product price is:"+seleniumRubyProductAmount);
				seleniumRubyProductPriceIsDisplayed=true;
			}
			
		}catch(Exception e) {
			throw e;
		}
		return seleniumRubyProductPriceIsDisplayed;
	}
	
	
	
	/**@Test13
	 * about this method verifythatSeleniumRubyProductQuantityIsOne() 
	 * @param : null
	 * @description : verify that SeleniumRuby Product Quantity Is One
	 * @return : return true if product quantity is displayed else false
	 * @author : Yaksha
	 */
	public Boolean verifythatSeleniumRubyProductQuantityIsOne() throws Exception {
		Boolean quantityIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(quantity))
			{
				quantityIsDisplayed=true;
			}
			
		}catch(Exception e) {
			throw e;
		}
		return quantityIsDisplayed;
	}
	
	
	
	/**@Test14
	 * about this method verifythatSeleniumrubyProductTotalPriceIs500() 
	 * @param : null
	 * @description : verify that Selenium ruby Product Total Price Is 500.
	 * @return : return true if product total price is displayed else false
	 * @author : Yaksha
	 */
	public Boolean verifythatSeleniumrubyProductTotalPriceIs500() throws Exception {
		Boolean productTotalPriceIsDisplayed=false;
		try {
			if(commonEvents.isDisplayed(productTotalPrice))
			{
				String seleniumRubyProductTotalprice=commonEvents.getText(productTotalPrice);
				System.out.println("Product total price is:"+seleniumRubyProductTotalprice);
				productTotalPriceIsDisplayed=true;
			}
			
		}catch(Exception e) {
			throw e;
		}
		return productTotalPriceIsDisplayed;
	}
	
	
	/**@Test15
	 * about this method verifythatSubTotalAndTaxAndTotalFieldHasContainsAmount() 
	 * @param : null
	 * @description : verify that SubTotal And Tax And Total Field Contains Amount
	 * @return : return true if product total amount is displayed else false
	 * @author : Yaksha
	 */
	public Boolean verifythatSubTotalAndTaxAndTotalFieldHasContainsAmount() throws Exception {
		Boolean totalAmountIsDisplayed=false;
		try {
			commonEvents.isDisplayed(subTotalAmount);
			String seleniumRubyProductSubTotal=commonEvents.getText(subTotalAmount);
			System.out.println("Product sub total is:"+seleniumRubyProductSubTotal);
			
			commonEvents.isDisplayed(taxAmount);
			String seleniumRubyProductTax=commonEvents.getText(taxAmount);
			System.out.println("Product sub total is:"+seleniumRubyProductTax);
			
			if(commonEvents.isDisplayed(totalAmount))
			{
				String seleniumRubyProductTotalAmount=commonEvents.getText(totalAmount);
				System.out.println("Product total amount is:"+seleniumRubyProductTotalAmount);
				totalAmountIsDisplayed=true;
			}

			
		}catch(Exception e) {
			throw e;
		}
		return totalAmountIsDisplayed;
	}
	
}
