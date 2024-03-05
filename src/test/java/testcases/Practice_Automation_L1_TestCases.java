package testcases;

import static testutils.TestUtils.businessTestFile;
import static testutils.TestUtils.currentTest;
import static testutils.TestUtils.yakshaAssert;

import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import coreUtilities.testutils.ApiHelper;
import coreUtilities.utils.FileOperations;
import pages.Practice_Automation_L1_Pages;
import pages.StartupPage;
import testBase.AppTestBase;

public class Practice_Automation_L1_TestCases extends AppTestBase
{
	Map<String, String> configData;
	Map<String, String> loginCredentials;
	String expectedDataFilePath = testDataFilePath+"expected_data.json";
	StartupPage startupPage;
	Practice_Automation_L1_Pages L1PageClass;
	
	@Parameters({"browser", "environment"})
	@BeforeClass(alwaysRun = true)
	public void initBrowser(String browser, String environment) throws Exception {
		try{
		configData = new FileOperations().readJson(config_filePath, environment);
		configData.put("url", configData.get("url").replaceAll("[\\\\]", ""));
		configData.put("browser", browser);
		
		boolean isValidUrl = new ApiHelper().isValidUrl(configData.get("url"));
		yakshaAssert(currentTest(), isValidUrl, businessTestFile);
		Assert.assertTrue(isValidUrl, configData.get("url")+" might be Server down at this moment. Please try after sometime.");
		initialize(configData);
		startupPage = new StartupPage(driver);
		}catch(Exception ex){
			Assert.assertTrue(false);
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
		
		@Test(priority = 1, groups = {"sanity"}, description="Check if “Shop” Menu Option is available.")
		public void check_Shop_Menu() throws Exception {
			try
			{
			softAssert = new SoftAssert();
			L1PageClass= new Practice_Automation_L1_Pages(driver);
			
			Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Shop_menu");
			yakshaAssert(currentTest(), L1PageClass.Shop_is_available_or_not().equals( expectedData.get("Shop_menu_title")), businessTestFile);
			softAssert.assertEquals(L1PageClass.Shop_is_available_or_not(), expectedData.get("Shop_menu_title"), "page title is not matching please check manually");
		    }
			catch(Exception ex)
			{
			Assert.assertTrue(false);
			yakshaAssert(currentTest(), false, businessTestFile);
		}
	}
		
			@Test(priority = 2, groups = {"sanity"}, description=" Click on “Shop” Menu Option")
			public void click_Shop_Menu() throws Exception {
				try
				{
				softAssert = new SoftAssert();
				L1PageClass= new Practice_Automation_L1_Pages(driver);
				
				Practice_Automation_L1_Pages page=L1PageClass.ClickOnShop();
				
				Assert.assertNotNull(page);
				
				yakshaAssert(currentTest(), page!=null, businessTestFile);
				}catch(Exception ex){
					Assert.assertTrue(false);
					yakshaAssert(currentTest(), false, businessTestFile);
				}	
			}	
			

			@Test(priority = 3, groups = {"sanity"}, description="Check if the control is successfully navigated to “Shop” page.")
			public void navigate_to_Shop_page() throws Exception {
				try
				{
				softAssert = new SoftAssert();
				L1PageClass= new Practice_Automation_L1_Pages(driver);
				
				Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Shop_page");
				yakshaAssert(currentTest(), L1PageClass.Shop_page_title().equals( expectedData.get("Shop_page_title")), businessTestFile);
				softAssert.assertEquals(L1PageClass.Shop_page_title(), expectedData.get("Shop_page_title"), "page title is not matching please check manually");
			    }
				catch(Exception ex)
				{
				Assert.assertTrue(false);
				yakshaAssert(currentTest(), false, businessTestFile);
			}
		
		}
			@Test(priority = 4, groups = {"sanity"}, description="Go to cart(Click Cart icon)")
			public void click_on_cart() throws Exception {
				try
				{
				softAssert = new SoftAssert();
				L1PageClass= new Practice_Automation_L1_Pages(driver);
				
				Practice_Automation_L1_Pages page=L1PageClass.click_on_cart_icon();
				
				Assert.assertNotNull(page);
				
				yakshaAssert(currentTest(), page!=null, businessTestFile);
				}catch(Exception ex){
					Assert.assertTrue(false);
					yakshaAssert(currentTest(), false, businessTestFile);
				}	
					
			}
			
			@Test(priority = 5, groups = {"sanity"}, description="Check if it is navigated to basket page")
			public void navigateTobasketpage() throws Exception {
				try
				{
				softAssert = new SoftAssert();
				L1PageClass= new Practice_Automation_L1_Pages(driver);
				
				Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "basket_page");
				yakshaAssert(currentTest(), L1PageClass.navigate_to_basket_page().equals( expectedData.get("basket_page_title")), businessTestFile);
				softAssert.assertEquals(L1PageClass.navigate_to_basket_page(), expectedData.get("basket_page_title"), "page title is not matching please check manually");
			    }
				catch(Exception ex)
				{
				Assert.assertTrue(false);
				yakshaAssert(currentTest(), false, businessTestFile);
			}
		}
			
			@Test(priority = 6, groups = {"sanity"}, description="Check if “Home” Menu Option is available on navigated page.")
			public void Home_menu() throws Exception {
				try
				{
					softAssert = new SoftAssert();
					L1PageClass= new Practice_Automation_L1_Pages(driver);
					
					String page=L1PageClass.Home_menu_is_available();
					
					Assert.assertNotNull(page);
					
					yakshaAssert(currentTest(), page!=null, businessTestFile);
					}catch(Exception ex){
						Assert.assertTrue(false);
						yakshaAssert(currentTest(), false, businessTestFile);
					}	
		}
			
			@Test(priority = 7, groups = {"sanity"}, description="Check if “Home” Menu Option is available on navigated page.")
			public void Click_on_Home() throws Exception {
				try
				{
					softAssert = new SoftAssert();
					L1PageClass= new Practice_Automation_L1_Pages(driver);
					
					Practice_Automation_L1_Pages page=L1PageClass.click_on_Home_Menu();
					
					Assert.assertNotNull(page);
					
					yakshaAssert(currentTest(), page!=null, businessTestFile);
					}catch(Exception ex){
						Assert.assertTrue(false);
						yakshaAssert(currentTest(), false, businessTestFile);
					}	
			}
			
			@Test(priority = 8, groups = {"sanity"}, description="Check if the control is successfully navigated to “Home” page.")
			public void navigateToHomePage() throws Exception {
				try
				{
					softAssert = new SoftAssert();
					L1PageClass= new Practice_Automation_L1_Pages(driver);
					
					Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "HomePage_Title");
					yakshaAssert(currentTest(), L1PageClass.navigate_to_Home_page().equals( expectedData.get("HomepageTitle")), businessTestFile);
					softAssert.assertEquals(L1PageClass.navigate_to_Home_page(), expectedData.get("HomepageTitle"), "page title is not matching please check manually");
				    }
					catch(Exception ex)
					{
					Assert.assertTrue(false);
					yakshaAssert(currentTest(), false, businessTestFile);
					}
			}
				
				@Test(priority = 9, groups = {"sanity"}, description="Check if “Home” page has a section of new arrivals.")
				public void new_arrival_is_present() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Practice_Automation_L1_Pages page=L1PageClass.click_on_Home_Menu();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}	
			}
				
				@Test(priority = 10, groups = {"sanity"}, description="Check of “Arrivals” section has selenium ruby is present")
				public void seleniumu_Ruby_is_present() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						String page=L1PageClass.seleniumRuby();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}	
						
			}

				@Test(priority = 11, groups = {"sanity"}, description="check one product is clickable")
				public void one_product_isClickable() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Practice_Automation_L1_Pages page=L1PageClass.click_on_seleniumRuby_Product();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}	
				}
			
				@Test(priority = 12, groups = {"sanity"}, description="Check if the control is successfully navigated to Product Details page.")
				public void navigates_to_Selenium_Ruby() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Selenium_Ruby");
						yakshaAssert(currentTest(), L1PageClass.navigate_to_Home_page().equals( expectedData.get("Selenium_Ruby_title")), businessTestFile);
						softAssert.assertEquals(L1PageClass.navigate_to_Home_page(), expectedData.get("Selenium_Ruby_title"), "page title is not matching please check manually");
					    }
						catch(Exception ex)
						{
						Assert.assertTrue(false);
						yakshaAssert(currentTest(), false, businessTestFile);
						}
				}
				
				@Test(priority = 13, groups = {"sanity"}, description="Check if product details page has an option “ADD TO BASKET”.")
				public void add_to_basket() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Practice_Automation_L1_Pages page=L1PageClass.Add_to_basket_is_present();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}	
				}
				
				@Test(priority = 14, groups = {"sanity"}, description="Click on “ADD TO BASKET” option.")
				public void Click_on_add_to_basket() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Practice_Automation_L1_Pages page=L1PageClass.ClickonAddToBasket();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}	
				}
				
				@Test(priority = 15, groups = {"sanity"}, description="Check if product added message is shown when product is added to basket. Check for message")
				public void verify_message() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Message");
						yakshaAssert(currentTest(), L1PageClass.verifyMessages().equals( expectedData.get("message_details")), businessTestFile);
						softAssert.assertEquals(L1PageClass.verifyMessages(), expectedData.get("message_details"), "page title is not matching please check manually");
					    }
						catch(Exception ex)
						{
						Assert.assertTrue(false);
						yakshaAssert(currentTest(), false, businessTestFile);
						}
				}
				
				
				@Test(priority = 16, groups = {"sanity"}, description="  Go to cart(Click Cart icon)")
				public void GoToCart() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						Practice_Automation_L1_Pages page=L1PageClass.go_to_cart();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}	
						
				}
				

				@Test(priority = 17, groups = {"sanity"}, description="Check how many items are there in cart.")
				public void CheckItem() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						String page=L1PageClass.Check_item_in_cart();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}	
						
				}
				
				@Test(priority = 18, groups = {"sanity"}, description=" Check if we have “APPLY COUPON” button or not.")
				public void Apply_Coupon() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						 Practice_Automation_L1_Pages page=L1PageClass.applyCouponIsPresent();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}	
						
				}
				
				@Test(priority = 19, groups = {"sanity"}, description="Check if we have price defined after product name.")
				public void Price_Defined() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						String page=L1PageClass.PriceDefined();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}	
						
				}
				
				@Test(priority = 20, groups = {"sanity"}, description="Check if we have price defined in correct format or not")
				public void Price_Defined_in_correct_Format() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						String page=L1PageClass.priceIsInCorrectFormat();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}
				

				@Test(priority = 21, groups = {"sanity"}, description="Check if we have quantity defined after product price.")
				public void Quantity_Defined() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						String page=L1PageClass.QuantityDefined();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}
				
				@Test(priority = 22, groups = {"sanity"}, description="Check if we have quantity defined in correct format or not.")
				public void quantity_Defined_in_correct_Format() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						String page=L1PageClass.quantityIsInCorrectFormat();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	
				
				@Test(priority = 23, groups = {"sanity"}, description="Check if we have total defined after quantity.")
				public void Total_Defined() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						String page=L1PageClass.TotalDefined();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	
				
				@Test(priority = 24, groups = {"sanity"}, description="Check if we have total defined in correct format or not.")
				public void Total_Defined_in_Correct_Format() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						String page=L1PageClass.totalDefinedInCorrectFormat();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	
				@Test(priority = 25, groups = {"sanity"}, description="Check if we have Tax defined after product name.")
				public void Tax_Defined() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						String page=L1PageClass.TaxDefined();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	
				
				@Test(priority = 26, groups = {"sanity"}, description="Check if we have Tax defined in correct format or not.")
				public void Tax_Defined_in_correct_Format() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						String page=L1PageClass.taxDefinedInCorrectFormat();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	

				@Test(priority = 27, groups = {"sanity"}, description="Validate if we have an option to remove an added product or not.")
				public void remove_option_is_present() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						Practice_Automation_L1_Pages page=L1PageClass.removeIsPresent();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	
				

				@Test(priority = 28, groups = {"sanity"}, description="Remove a product.")
				public void remove() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						Practice_Automation_L1_Pages page=L1PageClass.removeAproduct();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	
				
				@Test(priority = 29, groups = {"sanity"}, description="Validate if we get a message after removing an item with its name or not.")
				public void ValidateAnRemoveMessage() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Remove_Message");
						yakshaAssert(currentTest(), L1PageClass.verifyRemoveMessages().equals( expectedData.get("Remove_message_details")), businessTestFile);
						softAssert.assertEquals(L1PageClass.verifyRemoveMessages(), expectedData.get("message_details"), "remove message is not matching please check manually");
					    }
						catch(Exception ex)
						{
						Assert.assertTrue(false);
						yakshaAssert(currentTest(), false, businessTestFile);
						}
				}	
				
				
				@Test(priority = 30, groups = {"sanity"}, description="Update the quantity of one of the product. Increase quantity by 1")
				public void updateQuantity() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						String page=L1PageClass.increase_Quantity();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	
				@Test(priority = 31, groups = {"sanity"}, description="Validate if we have active Update Basket button active on updating quantity or not.")
				public void Update_Basket() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Practice_Automation_L1_Pages page=L1PageClass.updateBasketButton();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	
				
				@Test(priority = 32, groups = {"sanity"}, description="Validate if we have a “Proceed to checkout” button or not.")
				public void Proceed_to_checkout() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Practice_Automation_L1_Pages page=L1PageClass.Proceedtocheckout();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	
				
				@Test(priority = 33, groups = {"sanity"}, description="Click on “Proceed to checkout” button.")
				public void Click_Proceed_to_checkout() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Practice_Automation_L1_Pages page=L1PageClass.clickOnProceedtocheckout();
						
						Assert.assertNotNull(page);
						
						yakshaAssert(currentTest(), page!=null, businessTestFile);
						}catch(Exception ex){
							Assert.assertTrue(false);
							yakshaAssert(currentTest(), false, businessTestFile);
						}		
				}	
				
				@Test(priority = 34, groups = {"sanity"}, description="On clicking it, validate do we navigate to Billing Details page having “Billing Details” as heading or not")
				public void navigate_to_Billing_Details_page() throws Exception {
					try
					{
						softAssert = new SoftAssert();
						L1PageClass= new Practice_Automation_L1_Pages(driver);
						
						Map<String, String> expectedData = new FileOperations().readJson(expectedDataFilePath, "Billing_Details");
						yakshaAssert(currentTest(), L1PageClass.Verify_Billing_Details_page().equals( expectedData.get("Billing_Details_title")), businessTestFile);
						softAssert.assertEquals(L1PageClass.Verify_Billing_Details_page(), expectedData.get("Billing_Details_title"), "page title is not matching please check manually");
					    }
						catch(Exception ex)
						{
						Assert.assertTrue(false);
						yakshaAssert(currentTest(), false, businessTestFile);
						}
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

			

