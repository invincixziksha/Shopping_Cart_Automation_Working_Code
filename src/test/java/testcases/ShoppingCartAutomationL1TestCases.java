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
import pages.ShoppingCartAutomationPages;
import pages.StartupPage;
import testBase.AppTestBase;
import testdata.LocatorsFactory;

public class ShoppingCartAutomationL1TestCases extends AppTestBase
{
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	ShoppingCartAutomationPages practiceAutomationInstance;
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
		@Test(priority = 1, groups = {"sanity"}, description="Verify navigate to the shopping cart home page")
		public void verifyNavigateTotTheShoppingCartpage() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "homepage");
			Assert.assertEquals(practiceAutomationInstance.verifyNavigateTotTheShoppingCartpage(), expectedData.get("homepageTitle"));
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "shop option menu is not present in the current page, Please check manually");
	}
		@Test(priority = 2, groups = {"sanity"}, description="Check Shop Menu Option is present or not")
		public void checkShopMenuIsPresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.verifyShopOptionIsPresent(), "shop option menu is not present, please check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "shop option menu is not present in the current page, Please check manually");
	}	
		@Test(priority = 3, groups = {"sanity"}, description="Click on “Shop” Menu Option and validate successfully navigate to the shop page or not")
		public void clickOnShopMenuAndValidateTheTitle() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Shop_page");
			Assert.assertEquals(practiceAutomationInstance.clickOnShopMenuandValidateTheTitle(), expectedData.get("Shop_page_title"));
			Assert.assertTrue(LocatorsFactoryInstance.androidProductCategoryIsPresent(driver).isDisplayed(), "Android category menu is not present in the current page, Please check manually");
	}	
	
		@Test(priority = 4, groups = {"sanity"}, description="Click on the Automation practice site logo Verify navigate to the home page by clicking on the Logo")
		public void clickOnLogoAndVerifyItIsNavigateToTheHomePage() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "homepage");
			Assert.assertEquals(practiceAutomationInstance.clickOnLogoandVerifyItIsNavigateToTheHomePage(), expectedData.get("homepageTitle"));
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "shop option menu is not present in the current page, Please check manually");
	}	
		@Test(priority = 5, groups = {"sanity"}, description="Check if Home page has a section of new arrivals")
		public void  checkIfHomePageHasASectionOfNewArrivals() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.checkIfHomePageHasSectionOfNewArrivals(),"new arrival button is not present, please check manually");
			Assert.assertTrue(LocatorsFactoryInstance.newArrivalButtonIsPresent(driver).isDisplayed(), "new arrival button is not present in the current page, Please check manually");
	}	
		@Test(priority = 6, groups = {"sanity"}, description="Check of “Arrivals” section has exactly 3 products enlisted")
		public void  checkArrivalsSectionHasExactly3ProductsEnlisted() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.checkOfArrivalsSectionhasExactly3ProductsEnlisted(),"3 products are not present in the new arrival section, please check manually");
			Assert.assertTrue(LocatorsFactoryInstance.seleniumRubyProductIsPresent(driver).isDisplayed(), "Selenium ruby button is not present in the current page, Please check manually");
	}	
		@Test(priority = 7, groups = {"sanity"}, description="Click on Selenium Ruby Product and validate the title of the page")
		public void  clickOnSeleniumRubyProductAndValidateTheTitleOfThisPage() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Selenium_Ruby");
			Assert.assertEquals(practiceAutomationInstance.clickOnSeleniumRubyProductAndValidatetheTitleOfThisPage(), expectedData.get("Selenium_Ruby_title"));
			Assert.assertTrue(LocatorsFactoryInstance.seleniumRubyTitleIsPresent(driver).isDisplayed(), "Selenium ruby title is not present in the current page, Please check manually");
	}	
		@Test(priority = 8, groups = {"sanity"}, description="Check product details page has an option ADD TO BASKET and Click on ADD TO BASKET")
		public void  verifyAddBasketButtonIsPresentAndClickOnAddBasket() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.verifyAddBasketButtonIsPresentAndClickOnAddBasket(),"Add basket button is not present, please check manually");
			Assert.assertTrue(LocatorsFactoryInstance.viewBasketButtonIsPresent(driver).isDisplayed(), "View basket button is not present in the current page, Please check manually");
	}	
		@Test(priority = 9, groups = {"sanity"}, description="Verify that view basket button is present after click on add to basket and click on View basket")
		public void  viewBasketButtonIsPresentAndClickOnIt() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.viewBasketButtonIsPresentAndClickOnIt(),"view basket button is not present, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon button is not present in the current page, Please check manually");
	}	
		@Test(priority = 10, groups = {"sanity"}, description="Verify that user is navigate to the  Cart or Basket page")
		public void  userIsNavigateToTheBasketPage() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "basket_page");
			Assert.assertEquals(practiceAutomationInstance.userIsNavigateToTheBasketPage(), expectedData.get("basket_page_title"));
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
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