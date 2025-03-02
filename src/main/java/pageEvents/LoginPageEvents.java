package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	
	ElementFetch ele = new ElementFetch();
	public boolean verifyIfLoginPageIsLoaded() {
	    return ele.getWebElements("XPATH", LoginPageElements.loginBtn).size() > 0;
	}

		
		
	
	
	public void performLogin() {
		
		
		ele.getWebElement("XPATH",LoginPageElements.emailAddress).sendKeys("yfddtd");
		ele.getWebElement("XPATH",LoginPageElements.passwordField).sendKeys("123234");
		ele.getWebElement("XPATH",LoginPageElements.loginBtn).click();
		
	
	}
	
	
	

}
