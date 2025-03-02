package qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class Testcase1 extends BaseTest{
	
ElementFetch ele = new ElementFetch();
HomePageEvents homePage = new HomePageEvents();
LoginPageEvents loginPage = new LoginPageEvents();


@Test
public void verifyIfLoginPageIsLoaded() {
	  
	  
	loginPage.verifyIfLoginPageIsLoaded();
	Assert.assertTrue(loginPage.verifyIfLoginPageIsLoaded(), "Login page did not load properly!");
  }



  @Test
  public void verifyValidLgin() {
	  
	  
	
	  loginPage.performLogin("standard_user","secret_sauce");
	  
	  String currentURL = driver.getCurrentUrl();
      System.out.println("Current URL: " + currentURL);

      // Assertion to verify the URL
      Assert.assertEquals(currentURL, "https://www.saucedemo.com/inventory.html", "Login Failed");
	  
  }
}
