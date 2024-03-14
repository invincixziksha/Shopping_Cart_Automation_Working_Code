package testcases;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import coreUtilities.testutils.ApiHelper;
import coreUtilities.utils.FileOperations;
import pages.ShoppingCartL1Pages;
import pages.ShoppingCartL2Pages;
import pages.StartupPage;
import testBase.AppTestBase;
import testdata.LocatorsFactory;

public class ShoppingCartAutomationL2TestCases extends AppTestBase
{
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	ShoppingCartL2Pages practiceAutomationInstance;
	LocatorsFactory LocatorsFactoryInstance = new LocatorsFactory(driver);

	@Parameters({"browser", "environment"})
	@BeforeClass(alwaysRun = true)
	public void initBrowser(String browser, String environment) throws Exception {
		configData = new FileOperations().readJson(config_filePath, environment);
		configData.put("url", configData.get("url").replaceAll("[\\\\]", ""));
		configData.put("browser", browser);
		
		boolean isValidUrl = new ApiHelper().isValidUrl(configData.get("url"));
		Assert.assertTrue(isValidUrl, configData.get("url")+" might be Server down at this moment. Please try after sometime.");
		initialize(configData);
		startupPage = new StartupPage(driver);
	}

	@Test(priority = 11,groups = {"sanity"}, description="This test is for make a flow")
	public void  goHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() throws Exception {
		practiceAutomationInstance= new ShoppingCartL2Pages(driver);
		Assert.assertTrue(practiceAutomationInstance.goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket(),"home icon is not present, check manually");
		Assert.assertTrue(LocatorsFactoryInstance.applyCouponcodeButtonIsPresent(driver).isDisplayed(), "ApplyCoupon code is not present in the current page, Please check manually");
}
	
	@Test(priority = 12, groups = {"sanity"}, description="Verify after clicking on View basket the Selenium Ruby  product is present or not.")
	public void  seleniumRubyProductIsPresent() throws Exception {
		practiceAutomationInstance= new ShoppingCartL2Pages(driver);
		Assert.assertTrue(practiceAutomationInstance.seleniumrubyProductIsPresent(),"Selenium Ruby product is not there, check manually");
		Assert.assertTrue(LocatorsFactoryInstance.seleniumRubyInsideTheBasketPageIsPresent(driver).isDisplayed(), "seleniumRuby product is not present in the current page, Please check manually");
}	
	
		@Test(priority = 13, groups = {"sanity"}, description="Verify Coupon code field and Apply Coupon button is present and Check if we have price defined ,quantity defined,total defined fields are present.")
		public void  verifyAllFieldsArePresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartL2Pages(driver);
			Assert.assertTrue(practiceAutomationInstance.verifyAllFieldsarePresent(),"Selenium Ruby product is not there, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.proceedToCheckoutButtonIsPresent(driver).isDisplayed(), "proceed To Checkout Button is not present in the current page, Please check manually");
	}	
	
		@Test(priority = 14, groups = {"sanity"}, description="Validate if we have an option to remove an added product or not and remove the product.")
		public void  removeIconIsPresentAndRemoveTheProduct() throws Exception {
			practiceAutomationInstance= new ShoppingCartL2Pages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "RemoveMessage");
			Assert.assertEquals(practiceAutomationInstance.removeIconIsPresentandRemoveTheProductAndValidateTheMessage(),expectedData.get("Removemessagedetails"));
			Assert.assertTrue(LocatorsFactoryInstance.removeMessageIsPresent(driver).isDisplayed(), "Remove message is not present in the current page, Please check manually");
	}	
	
		@Test(priority = 15, groups = {"sanity"}, description="Go to the Home Icon and click on selenium ruby then click on add to basket and verify the item no is increased to +1 ")
		public void  gotoTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() throws Exception {
			practiceAutomationInstance= new ShoppingCartL2Pages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "AddToCart");
			Assert.assertEquals(practiceAutomationInstance.goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenVerifyTheItemIsIncreased(),expectedData.get("IncreaseItem"));
			Assert.assertTrue(LocatorsFactoryInstance.increasedProductInCartIsPresent(driver).isDisplayed(), "item number is not increase in cart, Please check manually");
	}
		
		@Test(priority = 16, groups = {"sanity"}, description="click on My Account and verify all the fields are present or not")
		public void  clickOnMyAccountAndVerifyAllTheFieldsArePresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartL2Pages(driver);
			Assert.assertTrue(practiceAutomationInstance.clickOnMyAccountAndVerifyAllTheFieldsArePresent(),"User not able to add product, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.loginButtonIsPresent(driver).isDisplayed(), "LogIn Button is not present in the current page, Please check manually");
	}
		@Test(priority = 17, groups = {"sanity"}, description="click on Test Cases its should navigate to the Test Cases pages and verify the url of the Test Cases pages ")
		public void  clickonTestCasesItsShouldNavigateToTheTestCasesPagesVerifyTheUrlOfTheTestCasesPages() throws Exception {
			practiceAutomationInstance= new ShoppingCartL2Pages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "TestcasePage");
			Assert.assertEquals(practiceAutomationInstance.clickonTestCasesItsShouldNavigateToTheTestCasesPages(),expectedData.get("TestCasePageTitle"));
			Assert.assertTrue(LocatorsFactoryInstance.testCasesIconIsPresent(driver).isDisplayed(), "TestCase icon is not present in the current page, Please check manually");
	}
		@Test(priority = 18, groups = {"sanity"}, description="verify the url of the Test Cases pages ")
		public void  clickOnTestCasesVerifyTheUrlOfTheTestCasesPages() throws Exception {
			practiceAutomationInstance= new ShoppingCartL2Pages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "TestcasePageUrl");
			Assert.assertEquals(practiceAutomationInstance.verifyTheurlOfTheTestCasesPages(),expectedData.get("UrlTestCasePageTitle"));
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}
		@Test(priority = 19, groups = {"sanity"}, description="click on AT SITE and verify the Selenium and appium fields are present or not ")
		public void  clickOnATSITEAndVerifyTheSeleniumAndAppiumFieldsArePresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartL2Pages(driver);
			Assert.assertTrue(practiceAutomationInstance.clickOnAtSiteAndVerifyTheSeleniumAndAppiumFieldsArePresent(),"");
			Assert.assertTrue(LocatorsFactoryInstance.toolsIconIsPresent(driver).isDisplayed(), "tools icon is not present in the current page, Please check manually");
	}
		@Test(priority = 20, groups = {"sanity"}, description="click on Shop and verify the Refine By , Home/shop and filter by price  fields are present or not")
		public void  clickOnShopAndVerifyTheRefineByHomeshopAndFilterByPriceFieldsArePresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartL2Pages(driver);
			Assert.assertTrue(practiceAutomationInstance.clickonShopAndVerifyTheRefineByHomeshopAndFilterByPriceFieldsArePresent(),"These fields are not present, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.filterByPriceSliderIsPresent(driver).isDisplayed(), "filterBy Price Slider is not present in the current page, Please check manually");
	}	
		
				
		@AfterClass(alwaysRun = true)
		public void tearDown() {
		System.out.println("before closing the browser");
		browserTearDown();
		}
				
		@AfterMethod
		public void retryIfTestFails() throws Exception {
		startupPage.navigateToUrl(configData.get("url"));
		}
}