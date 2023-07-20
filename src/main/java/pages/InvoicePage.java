package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class InvoicePage extends ProjectSpecificWrappers {

	public InvoicePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		String pagetitle = driver.getTitle();
		if (!verifyTitle(pagetitle)) {
			reportStep("The page is not " + pagetitle, "FAIL");

		}
	}

	public InvoicePage getInvoiceNumber() {
		String invoice = getTextByXpath("//h3[contains(text(),'Invoice')]");
		reportStep("The invoice number is : " + invoice, "INFO");
		System.out.println("The invoice number is : " + invoice);

		return this;
	}

}
