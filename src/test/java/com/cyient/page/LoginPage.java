package com.cyient.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cyient.page.DashboardPage;
import com.cyient.page.LoginPage;
import com.cyient.utilities.DataProviderUtils;

public class LoginPage {
	WebDriver driver ;


	@Test
	public void invalidCredentialTest(String username,String password,String languageText,String expectedvalue)
	{
		LoginPage login=new LoginPage(driver);
		login.sendUsername(username);
		login.sendPassword(password);
		login.selectlanguageByText(languageText);
		login.clickOnLogin();
		
		String actualValue= login.getErrorMessage();
                
	}
	
	@Test(dataProvider = "validCredentialExcelData",dataProviderClass = DataProviderUtils.class)
    public void validCredentialTest(String username, String password, String languageText, String expectedValue) {
        LoginPage login = new LoginPage(driver);
        login.sendUsername(username);
        login.sendPassword(password);
        login.selectlanguageByText(languageText);
        login.clickOnLogin();

         DashboardPage dashboard = new DashboardPage(driver);
        String actualValue = dashboard.getDashboardPageTitle();
        Assert.assertEquals(actualValue, expectedValue);
    }

}
