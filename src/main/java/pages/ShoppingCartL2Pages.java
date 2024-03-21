package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartL2Pages extends StartupPage{
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
	By shopOption = By.xpath("//a[.='Shop']"); 

	
	public ShoppingCartL2Pages(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	/* @Test11
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
	
	/**@Test12
	 * about this method seleniumRubyProductIsPresent() 
	 * @param : null
	 * @description : verify Selenium ruby product is present or not
	 * @return : return true if seleniumRuby product is present InsideTheBasketPage, else false
	 * @author : Yaksha
	 */
	public boolean seleniumrubyProductIsPresent() throws Exception {
		Boolean seleniumRubyProductisDisplay = false;
		try {
			    if(commonEvents.isDisplayed(seleniumRubyInsideTheBasketPage))
			    {
			    	seleniumRubyProductisDisplay=true;
			    }
		}catch(Exception e) {
			throw e;
		}
		return seleniumRubyProductisDisplay;
	}
	
	
	/**@Test13
	 * about this method verifyAllFieldsarePresent() 
	 * @param : null
	 * @description : verify seleniumRubyInsideTheBasketPage,couponcodeField,applyCouponcodeButton,priceReadOnlyField,quantityField,totalFields are present or not
	 * @return : return true if totalField  is present InsideTheBasketPage, else false
	 * @author : Yaksha
	 */
	public boolean verifyAllFieldsarePresent() throws Exception {
		Boolean totalFieldisDisplay = false;
		try {
			    commonEvents.isDisplayed(seleniumRubyInsideTheBasketPage);
			    commonEvents.isDisplayed(couponcodeField);
			    commonEvents.isDisplayed(applyCouponcodeButton);
			    commonEvents.isDisplayed(priceReadOnlyField);
			    commonEvents.isDisplayed(quantityField);
			    if(commonEvents.isDisplayed(totalField))
			    {
			    	totalFieldisDisplay=true;
			    }
		}catch(Exception e) {
			throw e;
		}
		return totalFieldisDisplay;
	}
	
	

	/**@Test14
	 * about this method removeIconIsPresentandRemoveTheProductAndValidateTheMessage() 
	 * @param : null
	 * @description : verify removeIcon is present or not then click on remove icon to remove the product and validate the remove message
	 * @return : return string if removeMessage is  matching
	 * @author : Yaksha
	 */
	public String removeIconIsPresentandRemoveTheProductAndValidateTheMessage() throws Exception {
		String messageafterRemoveProductisDisplay = "";
		try {
			commonEvents.isDisplayed(removeIcon);
			commonEvents.click(removeIcon);
			commonEvents.isDisplayed(removeMessage);
			messageafterRemoveProductisDisplay=commonEvents.getText(removeMessage);
			System.out.println("Message is:"+messageafterRemoveProductisDisplay);
		}catch(Exception e) {
			throw e;
		}
		return messageafterRemoveProductisDisplay;
	}
	
	/*@Test15
	 * about this method goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() 
	 * @param : null
	 * @description : go To The Home Icon then click on Seleniumruby Then Click On Add To Basket Then Verify The Item Is Increased
	 * @return : return string if product is increase to one in cart
	 * @author : Yaksha
	 */
	public String goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenVerifyTheItemIsIncreased() throws Exception {
		String increasedProductInCartValue = "";
		try {
			commonEvents.click(automationPracticeSiteLogo);
			commonEvents.click(seleniumRubyProduct);
			commonEvents.click(addToBasketButton);
			increasedProductInCartValue=commonEvents.getText(increasedProductInCart);
			System.out.println(increasedProductInCartValue);

		}catch(Exception e) {
			throw e;
		}
		return increasedProductInCartValue;
	}
	

	/**@Test16
	 * about this method clickOnMyAccountAndVerifyAllTheFieldsArePresent() 
	 * @param : null
	 * @description : click On My Account And Verify All The Fields Are Present
	 * @return : return true if registerButton is  present, else false
	 * @author : Yaksha
	 */
	public boolean clickOnMyAccountAndVerifyAllTheFieldsArePresent() throws Exception {
		Boolean isDisplay = false;
		try {
			commonEvents.click(myAccountIcon);
			commonEvents.isDisplayed(usernameTextField);
			commonEvents.isDisplayed(passwordTextField);
			commonEvents.isDisplayed(loginButton);
			commonEvents.isDisplayed(emailAddressTextField);
			commonEvents.isDisplayed(passwordTextFieldInRegister);
			if(commonEvents.isDisplayed(registerButton)) {
				isDisplay=true;
			}

		}catch(Exception e) {
			throw e;
		}
		return isDisplay;
	}
	
	/**@Test17
	 * about this method clickonTestCasesItsShouldNavigateToTheTestCasesPages() 
	 * @param : null
	 * @description : click on testcases verify it is navigating to the Testcase page.
	 * @return : return String if page title is matching
	 * @author : Yaksha
	 */
	public String clickonTestCasesItsShouldNavigateToTheTestCasesPages() throws Exception {
		String testcasePageTitle = "";
		try {
			commonEvents.click(testCasesIcon);
			testcasePageTitle=commonEvents.getTitle();
			System.out.println("Page title is:"+testcasePageTitle);
		}catch(Exception e) {
			throw e;
		}
		return testcasePageTitle;
	}
	
	
	/**@Test18
	 * about this method verifyTheurlOfTheTestCasesPages() 
	 * @param : null
	 * @description : verify URL of the testcase page
	 * @return : return string if URL is matching
	 * @author : Yaksha
	 */
	public String verifyTheurlOfTheTestCasesPages() throws Exception {
		String testcasePageUrl = "";
		try {
			testcasePageUrl=commonEvents.getCurrentUrl();
			System.out.println("Page URL is:"+testcasePageUrl);
		}catch(Exception e) {
			throw e;
		}
		return testcasePageUrl;
	}
	
	
	/**@Test19
	 * about this method clickOnAtSiteAndVerifyTheSeleniumAndAppiumFieldsArePresent() 
	 * @param : null
	 * @description : click On At Site And Verify Selenium And Appium Fields Are Present
	 * @return : return true if seleniumText is  present, else false
	 * @author : Yaksha
	 */
	public boolean clickOnAtSiteAndVerifyTheSeleniumAndAppiumFieldsArePresent() throws Exception {
		boolean appiumTextIsDisplay=false;
		try {
			commonEvents.click(atSiteIcon);
			commonEvents.isDisplayed(appiumText);
			if(commonEvents.isDisplayed(seleniumText))
			{
				appiumTextIsDisplay=true;
			}

		}catch(Exception e) {
			throw e;
		}
		return appiumTextIsDisplay;
	}
	
	/**@Test20
	 * about this method clickonShopAndVerifyTheRefineByHomeshopAndFilterByPriceFieldsArePresent() 
	 * @param : null
	 * @description : navigate to the previous page and click on shop and verify refineBy field,home shop menu,filterByPriceSlider are present
	 * @return : return true if filterByPriceSlider is  present, else false
	 * @author : Yaksha
	 */
	public boolean clickonShopAndVerifyTheRefineByHomeshopAndFilterByPriceFieldsArePresent() throws Exception {
		Boolean filterByPriceSliderIsDisplay = false;
		try {
			commonEvents.navigateBack();
			commonEvents.click(shopOption);
			commonEvents.isDisplayed(refineByField);
			commonEvents.isDisplayed(homeShopMenu);
			if(commonEvents.isDisplayed(filterByPriceSlider)) {
				filterByPriceSliderIsDisplay=true;
			}

		}catch(Exception e) {
			throw e;
		}
		return filterByPriceSliderIsDisplay;
	}
	

}
