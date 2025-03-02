package pageEvents;

import org.testng.Assert;

import pageObjects.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	
	ElementFetch ele = new ElementFetch();
	public boolean verifyIfLoginPageIsLoaded() {
	    return ele.getWebElements("XPATH", LoginPageElements.loginBtn).size() > 0;
	}

		
		
	
	
	public void performLogin(String userName, String password) {
		
		
		ele.getWebElement("XPATH",LoginPageElements.userName).sendKeys(userName);
		ele.getWebElement("XPATH",LoginPageElements.passwordField).sendKeys(password);
		ele.getWebElement("XPATH",LoginPageElements.loginBtn).click();
		
	
	}
	
	
	

}
