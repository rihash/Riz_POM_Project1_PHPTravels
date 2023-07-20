package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class HomePage extends ProjectSpecificWrappers{
	
	public HomePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		if (!verifyTitle("Client Area - PHPTRAVELS")) {
			reportStep("The page is not HomePage", "FAIL");
	
	}}
	
		public HomePage clickOnServiceTab() {
			clickByXpath("(//a[@data-toggle='dropdown'])[1]");
			return this;
		}
		
		public ShoppingPage clickOrderNewService() {
			clickByXpath("//a[contains(text(),'Order New Services')]");
			return new ShoppingPage(driver,test);
			
		}
		
	
	
		

}
