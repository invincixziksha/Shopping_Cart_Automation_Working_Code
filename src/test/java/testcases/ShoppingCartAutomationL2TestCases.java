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

public class ShoppingCartAutomationL2TestCases extends AppTestBase
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

	@Test(priority = 11,groups = {"sanity"}, description="This test is for make a flow")
	public void  goHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() throws Exception {
		practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
		Assert.assertTrue(practiceAutomationInstance.goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket(),"home icon is not present, check manually");
		Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
}
	
		@Test(priority = 12, groups = {"sanity"}, description="Verify after clicking on View basket the Selenium Ruby  product is present or not.")
		public void  seleniumRubyProductIsPresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.seleniumRubyProductIsPresent(),"Selenium Ruby product is not there, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}	
		@Test(priority = 13, groups = {"sanity"}, description="Verify Coupon code field and Apply Coupon button is present")
		public void  verifyCouponCodeFieldAndApplyCouponButtonIsPresent() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.verifyCouponcodeFieldAndApplyCouponButtonIsPresent(),"Coupon code and apply coupon code buttons are not present, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}	
		@Test(priority = 14, groups = {"sanity"}, description="Check if we have price defined after product name")
		public void  priceDefinedAfterProductName() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.priceDefinedAfterProductName(),"Price Field is not present, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}	
		@Test(priority = 15, groups = {"sanity"}, description="Check if we have quantity defined after product price.")
		public void  quantityDefinedAfterProductPrice() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.quantityDefinedAfterProductPrice(),"Quantity Field is not present, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}	
		@Test(priority = 16, groups = {"sanity"}, description="Check if we have total defined is present after quantity.")
		public void  totalDefinedIsPresentAfterQuantity() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.totalDefinedIsPresentAfterQuantity(),"Total Field is not present, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}	
		@Test(priority = 17, groups = {"sanity"}, description="Validate if we have an option to remove an added product or not and remove the product.")
		public void  removeIconIsPresentAndRemoveTheProduct() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.removeIconIsPresentandRemoveTheProduct(),"Remove failed, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}	

		@Test(priority = 18, groups = {"sanity"}, description="Validate if we get a message after removing an item with its name or not.")
		public void  validateTheMessageAfterRemovingAProduct() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Remove_Message");
			Assert.assertEquals(practiceAutomationInstance.validatetheMessageAfterRemovingAProduct(), expectedData.get("Remove_message_details"));
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}	
		@Test(priority = 19, groups = {"sanity"}, description="Go to the Home Icon and click on selenium ruby then click on add to basket then click on view basket to add the product")
		public void  gotoTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.goToTheHomeIconclickonseleniumrubyThenClickOnAddToBasketThenClickOnViewBasket(),"User not able to add product, check manually");
			Assert.assertTrue(LocatorsFactoryInstance.getShopIconOption(driver).isDisplayed(), "Shop icon is not present in the current page, Please check manually");
	}	
		@Test(priority = 20, groups = {"sanity"}, description="Validate if we have a “Proceed to checkout” button or not.")
		public void  validateIfWeHaveAProceedToCheckoutButtonOrNot() throws Exception {
			practiceAutomationInstance= new ShoppingCartAutomationPages(driver);
			Assert.assertTrue(practiceAutomationInstance.validateIfWeHaveAProceedToCheckoutButtonORNot(),"Proceed to check out button is not present, check manually");
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